/**
 */
package no.hal.pg.config.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.GameConfig;
import no.hal.pg.config.ItemConfig;
import no.hal.pg.config.ItemProxy;
import no.hal.pg.config.PlayerRole;
import no.hal.pg.config.TaskConfig;
import no.hal.pg.config.TaskProxy;
import no.hal.pg.osm.GeoLocated;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getItems <em>Items</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getTaskProxies <em>Task Proxies</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getItemProxies <em>Item Proxies</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameConfigImpl extends MinimalEObjectImpl.Container implements GameConfig {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskConfig<?>> tasks;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerRole> players;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemConfig> items;

	/**
	 * The cached value of the '{@link #getTaskProxies() <em>Task Proxies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskProxies()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskProxy> taskProxies;

	/**
	 * The cached value of the '{@link #getItemProxies() <em>Item Proxies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemProxies()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemProxy> itemProxies;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GeoLocated> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.GAME_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskConfig<?>> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<TaskConfig<?>>(TaskConfig.class, this, ConfigPackage.GAME_CONFIG__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlayerRole> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<PlayerRole>(PlayerRole.class, this, ConfigPackage.GAME_CONFIG__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemConfig> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ItemConfig>(ItemConfig.class, this, ConfigPackage.GAME_CONFIG__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskProxy> getTaskProxies() {
		if (taskProxies == null) {
			taskProxies = new EObjectContainmentEList<TaskProxy>(TaskProxy.class, this, ConfigPackage.GAME_CONFIG__TASK_PROXIES);
		}
		return taskProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemProxy> getItemProxies() {
		if (itemProxies == null) {
			itemProxies = new EObjectContainmentEList<ItemProxy>(ItemProxy.class, this, ConfigPackage.GAME_CONFIG__ITEM_PROXIES);
		}
		return itemProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeoLocated> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<GeoLocated>(GeoLocated.class, this, ConfigPackage.GAME_CONFIG__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.GAME_CONFIG__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case ConfigPackage.GAME_CONFIG__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ConfigPackage.GAME_CONFIG__TASK_PROXIES:
				return ((InternalEList<?>)getTaskProxies()).basicRemove(otherEnd, msgs);
			case ConfigPackage.GAME_CONFIG__ITEM_PROXIES:
				return ((InternalEList<?>)getItemProxies()).basicRemove(otherEnd, msgs);
			case ConfigPackage.GAME_CONFIG__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.GAME_CONFIG__TASKS:
				return getTasks();
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				return getPlayers();
			case ConfigPackage.GAME_CONFIG__ITEMS:
				return getItems();
			case ConfigPackage.GAME_CONFIG__TASK_PROXIES:
				return getTaskProxies();
			case ConfigPackage.GAME_CONFIG__ITEM_PROXIES:
				return getItemProxies();
			case ConfigPackage.GAME_CONFIG__LOCATIONS:
				return getLocations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigPackage.GAME_CONFIG__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends TaskConfig<?>>)newValue);
				return;
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends PlayerRole>)newValue);
				return;
			case ConfigPackage.GAME_CONFIG__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ItemConfig>)newValue);
				return;
			case ConfigPackage.GAME_CONFIG__TASK_PROXIES:
				getTaskProxies().clear();
				getTaskProxies().addAll((Collection<? extends TaskProxy>)newValue);
				return;
			case ConfigPackage.GAME_CONFIG__ITEM_PROXIES:
				getItemProxies().clear();
				getItemProxies().addAll((Collection<? extends ItemProxy>)newValue);
				return;
			case ConfigPackage.GAME_CONFIG__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends GeoLocated>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigPackage.GAME_CONFIG__TASKS:
				getTasks().clear();
				return;
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				getPlayers().clear();
				return;
			case ConfigPackage.GAME_CONFIG__ITEMS:
				getItems().clear();
				return;
			case ConfigPackage.GAME_CONFIG__TASK_PROXIES:
				getTaskProxies().clear();
				return;
			case ConfigPackage.GAME_CONFIG__ITEM_PROXIES:
				getItemProxies().clear();
				return;
			case ConfigPackage.GAME_CONFIG__LOCATIONS:
				getLocations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigPackage.GAME_CONFIG__TASKS:
				return tasks != null && !tasks.isEmpty();
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				return players != null && !players.isEmpty();
			case ConfigPackage.GAME_CONFIG__ITEMS:
				return items != null && !items.isEmpty();
			case ConfigPackage.GAME_CONFIG__TASK_PROXIES:
				return taskProxies != null && !taskProxies.isEmpty();
			case ConfigPackage.GAME_CONFIG__ITEM_PROXIES:
				return itemProxies != null && !itemProxies.isEmpty();
			case ConfigPackage.GAME_CONFIG__LOCATIONS:
				return locations != null && !locations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameDefImpl
