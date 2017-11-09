/**
 */
package no.hal.pg.config.impl;

import java.util.Collection;

import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.ItemProxy;
import no.hal.pg.config.PlayerRole;
import no.hal.pg.config.TaskConfig;
import no.hal.pg.config.TaskProxy;

import no.hal.pg.runtime.Task;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.impl.TaskProxyImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.TaskProxyImpl#getRewardItems <em>Reward Items</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.TaskProxyImpl#getRequiresFinished <em>Requires Finished</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.TaskProxyImpl#getRequiresItems <em>Requires Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskProxyImpl extends ProxyImpl<TaskConfig<Task<?>>> implements TaskProxy {
	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<PlayerRole> players;

	/**
	 * The cached value of the '{@link #getRewardItems() <em>Reward Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewardItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemProxy> rewardItems;

	/**
	 * The cached value of the '{@link #getRequiresFinished() <em>Requires Finished</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresFinished()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskProxy> requiresFinished;

	/**
	 * The cached value of the '{@link #getRequiresItems() <em>Requires Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemProxy> requiresItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.TASK_PROXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setRef(TaskConfig<Task<?>> newRef) {
		super.setRef(newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlayerRole> getPlayers() {
		if (players == null) {
			players = new EObjectResolvingEList<PlayerRole>(PlayerRole.class, this, ConfigPackage.TASK_PROXY__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemProxy> getRewardItems() {
		if (rewardItems == null) {
			rewardItems = new EObjectContainmentEList<ItemProxy>(ItemProxy.class, this, ConfigPackage.TASK_PROXY__REWARD_ITEMS);
		}
		return rewardItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskProxy> getRequiresFinished() {
		if (requiresFinished == null) {
			requiresFinished = new EObjectResolvingEList<TaskProxy>(TaskProxy.class, this, ConfigPackage.TASK_PROXY__REQUIRES_FINISHED);
		}
		return requiresFinished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemProxy> getRequiresItems() {
		if (requiresItems == null) {
			requiresItems = new EObjectResolvingEList<ItemProxy>(ItemProxy.class, this, ConfigPackage.TASK_PROXY__REQUIRES_ITEMS);
		}
		return requiresItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigPackage.TASK_PROXY__REWARD_ITEMS:
				return ((InternalEList<?>)getRewardItems()).basicRemove(otherEnd, msgs);
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
			case ConfigPackage.TASK_PROXY__PLAYERS:
				return getPlayers();
			case ConfigPackage.TASK_PROXY__REWARD_ITEMS:
				return getRewardItems();
			case ConfigPackage.TASK_PROXY__REQUIRES_FINISHED:
				return getRequiresFinished();
			case ConfigPackage.TASK_PROXY__REQUIRES_ITEMS:
				return getRequiresItems();
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
			case ConfigPackage.TASK_PROXY__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends PlayerRole>)newValue);
				return;
			case ConfigPackage.TASK_PROXY__REWARD_ITEMS:
				getRewardItems().clear();
				getRewardItems().addAll((Collection<? extends ItemProxy>)newValue);
				return;
			case ConfigPackage.TASK_PROXY__REQUIRES_FINISHED:
				getRequiresFinished().clear();
				getRequiresFinished().addAll((Collection<? extends TaskProxy>)newValue);
				return;
			case ConfigPackage.TASK_PROXY__REQUIRES_ITEMS:
				getRequiresItems().clear();
				getRequiresItems().addAll((Collection<? extends ItemProxy>)newValue);
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
			case ConfigPackage.TASK_PROXY__PLAYERS:
				getPlayers().clear();
				return;
			case ConfigPackage.TASK_PROXY__REWARD_ITEMS:
				getRewardItems().clear();
				return;
			case ConfigPackage.TASK_PROXY__REQUIRES_FINISHED:
				getRequiresFinished().clear();
				return;
			case ConfigPackage.TASK_PROXY__REQUIRES_ITEMS:
				getRequiresItems().clear();
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
			case ConfigPackage.TASK_PROXY__PLAYERS:
				return players != null && !players.isEmpty();
			case ConfigPackage.TASK_PROXY__REWARD_ITEMS:
				return rewardItems != null && !rewardItems.isEmpty();
			case ConfigPackage.TASK_PROXY__REQUIRES_FINISHED:
				return requiresFinished != null && !requiresFinished.isEmpty();
			case ConfigPackage.TASK_PROXY__REQUIRES_ITEMS:
				return requiresItems != null && !requiresItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskProxyImpl
