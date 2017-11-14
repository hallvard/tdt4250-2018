package no.hal.pg.config.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;

import no.hal.pg.config.GameConfig;
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
		for (PlayerRole playerRole : config.getPlayers()) {
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
		for (PlayerRole playerRole : config.getPlayers()) {
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
		// create tasks
		Map<TaskProxy, Task<?>> taskProxies = new HashMap<TaskProxy, Task<?>>();
		for (TaskProxy proxy : config.getTaskProxies()) {
			if (proxy.getRef() != null) {
				Task<?> task = ((TaskConfig<?>) proxy.getRef()).createTask(proxy);
				taskProxies.put(proxy, task);
			}
		}
		// assign players to tasks
		for (TaskProxy proxy : taskProxies.keySet()) {
			Task<?> task = taskProxies.get(proxy);
			if (proxy.getPlayers().isEmpty()) {
				task.getPlayers().addAll(game.getPlayers());
			} else {
				for (PlayerRole playerRole : proxy.getPlayers()) {
					Collection<Player> rolePlayers = roles.get(playerRole);
					task.getPlayers().addAll(rolePlayers);
				}
			}
		}
		// create items
		Map<ItemProxy, Item> itemProxies = new HashMap<ItemProxy, Item>();
		for (ItemProxy proxy : config.getItemProxies()) {
			if (proxy.getRef() != null) {
				Item item = proxy.getRef().createItem(proxy);
				itemProxies.put(proxy, item);
			}
		}
		// add start conditions...
		for (TaskProxy proxy : taskProxies.keySet()) {
			Task<?> task = taskProxies.get(proxy);
			// ... based on task dependencies
			for (TaskProxy dep : proxy.getRequiresFinished()) {
				IsTaskFinishedCondition cond = RuntimeFactory.eINSTANCE.createIsTaskFinishedCondition();
				cond.setContext(taskProxies.get(dep));
				task.getStartConditions().add(cond);
			}
			// ... based on item dependencies
			if (! proxy.getRequiresItems().isEmpty()) {
				PlayersHaveItemsCondition cond = RuntimeFactory.eINSTANCE.createPlayersHaveItemsCondition();
				cond.setContext(task);
				for (ItemProxy dep : proxy.getRequiresItems()) {
					Item item = itemProxies.get(dep);
					if (item != null) {
						cond.getItemClasses().add(item.eClass());
					}
				}
				task.getStartConditions().add(cond);
			}
		}
		// create reward actions
		for (TaskProxy proxy : taskProxies.keySet()) {
			Task<?> task = taskProxies.get(proxy);
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
		return game;
	}
}
