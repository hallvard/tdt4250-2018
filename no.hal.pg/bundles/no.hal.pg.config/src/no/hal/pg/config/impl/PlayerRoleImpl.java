/**
 */
package no.hal.pg.config.impl;

import java.util.Collection;
import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.ItemConfig;
import no.hal.pg.config.ItemProxy;
import no.hal.pg.config.PlayerRole;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.impl.PlayerRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.PlayerRoleImpl#getPlayerCount <em>Player Count</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.PlayerRoleImpl#getItems <em>Items</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.PlayerRoleImpl#getItemProxies <em>Item Proxies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerRoleImpl extends MinimalEObjectImpl.Container implements PlayerRole {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayerCount() <em>Player Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPlayerCount() <em>Player Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerCount()
	 * @generated
	 * @ordered
	 */
	protected int playerCount = PLAYER_COUNT_EDEFAULT;

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
	 * The cached value of the '{@link #getItemProxies() <em>Item Proxies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemProxies()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemProxy> itemProxies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.PLAYER_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PLAYER_ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPlayerCount() {
		return playerCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayerCount(int newPlayerCount) {
		int oldPlayerCount = playerCount;
		playerCount = newPlayerCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.PLAYER_ROLE__PLAYER_COUNT, oldPlayerCount, playerCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemConfig> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<ItemConfig>(ItemConfig.class, this, ConfigPackage.PLAYER_ROLE__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemProxy> getItemProxies() {
		if (itemProxies == null) {
			itemProxies = new EObjectContainmentEList<ItemProxy>(ItemProxy.class, this, ConfigPackage.PLAYER_ROLE__ITEM_PROXIES);
		}
		return itemProxies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.PLAYER_ROLE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ConfigPackage.PLAYER_ROLE__ITEM_PROXIES:
				return ((InternalEList<?>)getItemProxies()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.PLAYER_ROLE__NAME:
				return getName();
			case ConfigPackage.PLAYER_ROLE__PLAYER_COUNT:
				return getPlayerCount();
			case ConfigPackage.PLAYER_ROLE__ITEMS:
				return getItems();
			case ConfigPackage.PLAYER_ROLE__ITEM_PROXIES:
				return getItemProxies();
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
			case ConfigPackage.PLAYER_ROLE__NAME:
				setName((String)newValue);
				return;
			case ConfigPackage.PLAYER_ROLE__PLAYER_COUNT:
				setPlayerCount((Integer)newValue);
				return;
			case ConfigPackage.PLAYER_ROLE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends ItemConfig>)newValue);
				return;
			case ConfigPackage.PLAYER_ROLE__ITEM_PROXIES:
				getItemProxies().clear();
				getItemProxies().addAll((Collection<? extends ItemProxy>)newValue);
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
			case ConfigPackage.PLAYER_ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConfigPackage.PLAYER_ROLE__PLAYER_COUNT:
				setPlayerCount(PLAYER_COUNT_EDEFAULT);
				return;
			case ConfigPackage.PLAYER_ROLE__ITEMS:
				getItems().clear();
				return;
			case ConfigPackage.PLAYER_ROLE__ITEM_PROXIES:
				getItemProxies().clear();
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
			case ConfigPackage.PLAYER_ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConfigPackage.PLAYER_ROLE__PLAYER_COUNT:
				return playerCount != PLAYER_COUNT_EDEFAULT;
			case ConfigPackage.PLAYER_ROLE__ITEMS:
				return items != null && !items.isEmpty();
			case ConfigPackage.PLAYER_ROLE__ITEM_PROXIES:
				return itemProxies != null && !itemProxies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", playerCount: ");
		result.append(playerCount);
		result.append(')');
		return result.toString();
	}

} //PlayerRoleImpl
