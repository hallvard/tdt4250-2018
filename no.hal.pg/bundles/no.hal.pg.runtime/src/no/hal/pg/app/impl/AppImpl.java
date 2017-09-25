/**
 */
package no.hal.pg.app.impl;

import java.util.Collection;

import no.hal.pg.app.App;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameView;

import no.hal.pg.runtime.Game;

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
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.AppImpl#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.AppImpl#getGameViews <em>Game Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends MinimalEObjectImpl.Container implements App {
	/**
	 * The cached value of the '{@link #getGame() <em>Game</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGame()
	 * @generated
	 * @ordered
	 */
	protected Game<?> game;

	/**
	 * The cached value of the '{@link #getGameViews() <em>Game Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameViews()
	 * @generated
	 * @ordered
	 */
	protected EList<GameView<?>> gameViews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game<?> getGame() {
		if (game != null && game.eIsProxy()) {
			InternalEObject oldGame = (InternalEObject)game;
			game = (Game<?>)eResolveProxy(oldGame);
			if (game != oldGame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.APP__GAME, oldGame, game));
			}
		}
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game<?> basicGetGame() {
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGame(Game<?> newGame) {
		Game<?> oldGame = game;
		game = newGame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.APP__GAME, oldGame, game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GameView<?>> getGameViews() {
		if (gameViews == null) {
			gameViews = new EObjectContainmentEList<GameView<?>>(GameView.class, this, AppPackage.APP__GAME_VIEWS);
		}
		return gameViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.APP__GAME_VIEWS:
				return ((InternalEList<?>)getGameViews()).basicRemove(otherEnd, msgs);
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
			case AppPackage.APP__GAME:
				if (resolve) return getGame();
				return basicGetGame();
			case AppPackage.APP__GAME_VIEWS:
				return getGameViews();
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
			case AppPackage.APP__GAME:
				setGame((Game<?>)newValue);
				return;
			case AppPackage.APP__GAME_VIEWS:
				getGameViews().clear();
				getGameViews().addAll((Collection<? extends GameView<?>>)newValue);
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
			case AppPackage.APP__GAME:
				setGame((Game<?>)null);
				return;
			case AppPackage.APP__GAME_VIEWS:
				getGameViews().clear();
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
			case AppPackage.APP__GAME:
				return game != null;
			case AppPackage.APP__GAME_VIEWS:
				return gameViews != null && !gameViews.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AppImpl
