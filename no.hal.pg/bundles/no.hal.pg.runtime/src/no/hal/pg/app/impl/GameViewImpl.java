/**
 */
package no.hal.pg.app.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameView;
import no.hal.pg.app.ItemView;
import no.hal.pg.app.TaskView;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.GameViewImpl#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.GameViewImpl#getTaskViews <em>Task Views</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.GameViewImpl#getAllItemViews <em>All Item Views</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.GameViewImpl#getItemViews <em>Item Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameViewImpl<T extends Task<?>> extends View1Impl<Player, Game<T>> implements GameView<T> {
	/**
	 * The cached value of the '{@link #getPlayer() <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player player;

	/**
	 * The cached value of the '{@link #getTaskViews() <em>Task Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskViews()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskView<T>> taskViews;

	/**
	 * The cached value of the '{@link #getAllItemViews() <em>All Item Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllItemViews()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemView> allItemViews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.GAME_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setModel(Game<T> newModel) {
		super.setModel(newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getPlayer() {
		if (player != null && player.eIsProxy()) {
			InternalEObject oldPlayer = (InternalEObject)player;
			player = (Player)eResolveProxy(oldPlayer);
			if (player != oldPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.GAME_VIEW__PLAYER, oldPlayer, player));
			}
		}
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetPlayer() {
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayer(Player newPlayer) {
		Player oldPlayer = player;
		player = newPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.GAME_VIEW__PLAYER, oldPlayer, player));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskView<T>> getTaskViews() {
		if (taskViews == null) {
			taskViews = new EObjectContainmentEList<TaskView<T>>(TaskView.class, this, AppPackage.GAME_VIEW__TASK_VIEWS);
		}
		return taskViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ItemView> getAllItemViews() {
		if (allItemViews == null) {
			allItemViews = new EObjectContainmentEList<ItemView>(ItemView.class, this, AppPackage.GAME_VIEW__ALL_ITEM_VIEWS);
		}
		return allItemViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ItemView> getItemViews() {
		List<ItemView> itemViews = new ArrayList<ItemView>();
		for (ItemView itemView : getAllItemViews()) {
			if (itemView.getModel().getOwner() == getUser()) {
				itemViews.add(itemView);
			}
		}
		return ECollections.unmodifiableEList(itemViews);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.GAME_VIEW__TASK_VIEWS:
				return ((InternalEList<?>)getTaskViews()).basicRemove(otherEnd, msgs);
			case AppPackage.GAME_VIEW__ALL_ITEM_VIEWS:
				return ((InternalEList<?>)getAllItemViews()).basicRemove(otherEnd, msgs);
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
			case AppPackage.GAME_VIEW__PLAYER:
				if (resolve) return getPlayer();
				return basicGetPlayer();
			case AppPackage.GAME_VIEW__TASK_VIEWS:
				return getTaskViews();
			case AppPackage.GAME_VIEW__ALL_ITEM_VIEWS:
				return getAllItemViews();
			case AppPackage.GAME_VIEW__ITEM_VIEWS:
				return getItemViews();
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
			case AppPackage.GAME_VIEW__PLAYER:
				setPlayer((Player)newValue);
				return;
			case AppPackage.GAME_VIEW__TASK_VIEWS:
				getTaskViews().clear();
				getTaskViews().addAll((Collection<? extends TaskView<T>>)newValue);
				return;
			case AppPackage.GAME_VIEW__ALL_ITEM_VIEWS:
				getAllItemViews().clear();
				getAllItemViews().addAll((Collection<? extends ItemView>)newValue);
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
			case AppPackage.GAME_VIEW__PLAYER:
				setPlayer((Player)null);
				return;
			case AppPackage.GAME_VIEW__TASK_VIEWS:
				getTaskViews().clear();
				return;
			case AppPackage.GAME_VIEW__ALL_ITEM_VIEWS:
				getAllItemViews().clear();
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
			case AppPackage.GAME_VIEW__PLAYER:
				return player != null;
			case AppPackage.GAME_VIEW__TASK_VIEWS:
				return taskViews != null && !taskViews.isEmpty();
			case AppPackage.GAME_VIEW__ALL_ITEM_VIEWS:
				return allItemViews != null && !allItemViews.isEmpty();
			case AppPackage.GAME_VIEW__ITEM_VIEWS:
				return !getItemViews().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public Player basicGetUser() {
		return getPlayer();
	}

} //GameViewImpl
