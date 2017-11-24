package no.hal.pg.config.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;

import no.hal.pg.config.ConfigFactory;
import no.hal.pg.config.GameConfig;
import no.hal.pg.config.ItemConfig;
import no.hal.pg.config.ItemProxy;
import no.hal.pg.config.PlayerRole;
import no.hal.pg.config.TaskConfig;
import no.hal.pg.config.TaskProxy;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.GiveTaskPlayersItemsAction;
import no.hal.pg.runtime.IsTaskFinishedCondition;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.PlayersHaveItemsCondition;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.Task;

public class ConfigUtil {

	public static int indexOf(EObject child) {
		try {
			return ((EList<?>) child.eContainer().eGet(child.eContainingFeature())).indexOf(child);
		} catch (Exception e) {
			return -1;
		}
	}

	public static <T> EList<T> createUmodifiableList(InternalEObject owner, EStructuralFeature feature, EList<T> list) {
		return new EcoreEList.UnmodifiableEList<T>(owner, feature, list.size(), list.toArray());
	}

	public static <T> EList<T> createUmodifiableList(InternalEObject owner, EStructuralFeature feature, EList<T>... lists) {
		Collection<T> all = new ArrayList<T>();
		for (EList<T> taskList : lists) {
			all.addAll(taskList);
		}
		return new EcoreEList.UnmodifiableEList<T>(owner, feature, all.size(), all.toArray());
	}
	
	public static Game<Task<?>> createGame(GameConfig config, Collection<Player> players) {
		Game<Task<?>> game = RuntimeFactory.eINSTANCE.createGame();
		// assign players to roles
		int playerCountSum = 0, restPlayerCount = 0;
		Collection<PlayerRole> playerRoles = config.getPlayers();
		if (playerRoles.isEmpty()) {
			PlayerRole playerRole = ConfigFactory.eINSTANCE.createPlayerRole();
			playerRoles = Collections.singletonList(playerRole);
		}
		for (PlayerRole playerRole : playerRoles) {
			int playerCount = playerRole.getPlayerCount();
			if (playerCount >= 1) {
				playerCountSum += playerCount;
			} else {
				restPlayerCount++;
			}
		}
		Map<PlayerRole, Collection<Player>> roles = new HashMap<PlayerRole, Collection<Player>>();
		List<Player> remainingPlayers = new ArrayList<Player>(players);
		Collection<Player> restPlayers = null;
		for (PlayerRole playerRole : playerRoles) {
			int playerCount = playerRole.getPlayerCount();
			int actualPlayerCount = 0;
			if (playerCount >= 1) {
				actualPlayerCount = (restPlayerCount > 0 ? playerCount : players.size() * playerCount / playerCountSum);
			} else {
				actualPlayerCount = (players.size() - playerCountSum) / restPlayerCount;
			}
			Collection<Player> rolePlayers = new ArrayList<Player>(actualPlayerCount);
			while (actualPlayerCount-- > 0) {
				rolePlayers.add(remainingPlayers.remove(0));
			}
			roles.put(playerRole, rolePlayers);
			if (restPlayerCount == 0 || playerCount < 1) {
				restPlayers = rolePlayers;
			}
		}
		if (restPlayers != null) {
			restPlayers.addAll(remainingPlayers);
		}
		game.getPlayers().addAll(players);

		// create game items
		Map<ItemProxy, Item> itemProxiesMap = createItems(config.getItems(), config.getItemProxies());
		game.getItems().addAll(itemProxiesMap.values());

		// create player items
		for (PlayerRole playerRole : playerRoles) {
			for (Player player : roles.get(playerRole)) {
				Map<ItemProxy, Item> playerItemProxiesMap = createItems(playerRole.getItems(), playerRole.getItemProxies());
				player.getItems().addAll(playerItemProxiesMap.values());
				itemProxiesMap.putAll(playerItemProxiesMap);
			}
		}
		
		// create game tasks
		Map<TaskProxy, Task<?>> taskProxiesMap = createTasks(config.getTasks(), config.getTaskProxies());
		game.getTasks().addAll(taskProxiesMap.values());

		// assign players to tasks
		for (TaskProxy proxy : taskProxiesMap.keySet()) {
			Task<?> task = taskProxiesMap.get(proxy);
			if (task != null) {
				if (proxy.getPlayers().isEmpty()) {
					task.getPlayers().addAll(game.getPlayers());
				} else {
					for (PlayerRole playerRole : proxy.getPlayers()) {
						Collection<Player> rolePlayers = roles.get(playerRole);
						task.getPlayers().addAll(rolePlayers);
					}
				}
			}
		}
		// add start conditions...
		for (TaskProxy proxy : taskProxiesMap.keySet()) {
			Task<?> task = taskProxiesMap.get(proxy);
			if (task != null) {
				// ... based on task dependencies
				for (TaskProxy dep : proxy.getRequiresFinished()) {
					IsTaskFinishedCondition cond = RuntimeFactory.eINSTANCE.createIsTaskFinishedCondition();
					cond.setContext(taskProxiesMap.get(dep));
					task.getStartConditions().add(cond);
				}
				// ... based on item dependencies
				if (! proxy.getRequiresItems().isEmpty()) {
					PlayersHaveItemsCondition cond = RuntimeFactory.eINSTANCE.createPlayersHaveItemsCondition();
					cond.setContext(task);
					for (ItemProxy dep : proxy.getRequiresItems()) {
						Item item = itemProxiesMap.get(dep);
						if (item != null) {
							cond.getItemClasses().add(item.eClass());
						}
					}
					task.getStartConditions().add(cond);
				}
			}
		}
		// create reward actions
		for (TaskProxy proxy : taskProxiesMap.keySet()) {
			Task<?> task = taskProxiesMap.get(proxy);
			if (task != null && (! proxy.getRewardItems().isEmpty())) {
				Collection<Item> items = new ArrayList<Item>();
				for (ItemProxy itemProxy : proxy.getRewardItems()) {
					if (itemProxy.getRef() != null) {
						Item item = itemProxy.getRef().createItem(itemProxy);
						items.add(item);
					}
				}
				GiveTaskPlayersItemsAction action = RuntimeFactory.eINSTANCE.createGiveTaskPlayersItemsAction();
				action.getItems().addAll(items);
				action.setCopy(true);
				task.getFinishActions().add(action);
			}
		}
		return game;
	}
	
	private static Map<ItemProxy, Item> createItems(Collection<ItemConfig> itemConfigs, Collection<ItemProxy> itemProxies) {
		// add item proxies for each item (config) without one
		Collection<ItemProxy> allItemProxies = new ArrayList<ItemProxy>(itemProxies);
		itemOuter: for (ItemConfig item : itemConfigs) {
			for (ItemProxy proxy : itemProxies) {
				if (proxy.getRef() == item) {
					continue itemOuter;
				}
			}
			ItemProxy proxy = ConfigFactory.eINSTANCE.createItemProxy();
			proxy.setRef(item);
			allItemProxies.add(proxy);
		}
		// create items first, so tasks may be able to pick them up
		Map<ItemProxy, Item> itemProxiesMap = new HashMap<ItemProxy, Item>();
		for (ItemProxy proxy : allItemProxies) {
			if (proxy.getRef() != null) {
				Item item = proxy.getRef().createItem(proxy);
				if (item != null) {
					itemProxiesMap.put(proxy, item);
				}
			}
		}
		return itemProxiesMap;
	}
	
	private static Map<TaskProxy, Task<?>> createTasks(Collection<TaskConfig<?>> taskConfigs, Collection<TaskProxy> taskProxies) {
		// add task proxies for each task (config) without one
		Collection<TaskProxy> allTaskProxies = new ArrayList<TaskProxy>(taskProxies);
		taskOuter: for (TaskConfig task : taskConfigs) {
			for (TaskProxy proxy : taskProxies) {
				if (proxy.getRef() == task) {
					continue taskOuter;
				}
			}
			TaskProxy proxy = ConfigFactory.eINSTANCE.createTaskProxy();
			proxy.setRef(task);
			allTaskProxies.add(proxy);
		}
		// create tasks
		Map<TaskProxy, Task<?>> taskProxiesMap = new HashMap<TaskProxy, Task<?>>();
		for (TaskProxy proxy : allTaskProxies) {
			if (proxy.getRef() != null) {
				Task<?> task = ((TaskConfig<?>) proxy.getRef()).createTask(proxy);
				if (task != null) {
					taskProxiesMap.put(proxy, task);
				}
			}
		}
		return taskProxiesMap;
	}
}
