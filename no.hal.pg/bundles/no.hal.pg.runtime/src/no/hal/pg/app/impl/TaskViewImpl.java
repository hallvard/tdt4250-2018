/**
 */
package no.hal.pg.app.impl;

import java.lang.reflect.InvocationTargetException;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameView;
import no.hal.pg.app.TaskView;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.TaskViewImpl#getGameView <em>Game View</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.TaskViewImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.TaskViewImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.TaskViewImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.TaskViewImpl#isFinished <em>Finished</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskViewImpl<T extends Task<?>> extends View1Impl<Player, T> implements TaskView<T> {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.TASK_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setModel(T newModel) {
		super.setModel(newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public GameView<T> getGameView() {
		if (eContainerFeatureID() != AppPackage.TASK_VIEW__GAME_VIEW) return null;
		return (GameView<T>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGameView(GameView<T> newGameView, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGameView, AppPackage.TASK_VIEW__GAME_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameView(GameView<T> newGameView) {
		if (newGameView != eInternalContainer() || (eContainerFeatureID() != AppPackage.TASK_VIEW__GAME_VIEW && newGameView != null)) {
			if (EcoreUtil.isAncestor(this, newGameView))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGameView != null)
				msgs = ((InternalEObject)newGameView).eInverseAdd(this, AppPackage.GAME_VIEW__TASK_VIEWS, GameView.class, msgs);
			msgs = basicSetGameView(newGameView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.TASK_VIEW__GAME_VIEW, newGameView, newGameView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getDescription() {
		return getModel().getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isEnabled() {
		return getModel().canStart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isStarted() {
		return getModel().isStarted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isFinished() {
		return getModel().isFinished();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TaskView<?> start() {
		getModel().start();
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.TASK_VIEW__GAME_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGameView((GameView<T>)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.TASK_VIEW__GAME_VIEW:
				return basicSetGameView(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case AppPackage.TASK_VIEW__GAME_VIEW:
				return eInternalContainer().eInverseRemove(this, AppPackage.GAME_VIEW__TASK_VIEWS, GameView.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.TASK_VIEW__GAME_VIEW:
				return getGameView();
			case AppPackage.TASK_VIEW__DESCRIPTION:
				return getDescription();
			case AppPackage.TASK_VIEW__ENABLED:
				return isEnabled();
			case AppPackage.TASK_VIEW__STARTED:
				return isStarted();
			case AppPackage.TASK_VIEW__FINISHED:
				return isFinished();
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
			case AppPackage.TASK_VIEW__GAME_VIEW:
				setGameView((GameView<T>)newValue);
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
			case AppPackage.TASK_VIEW__GAME_VIEW:
				setGameView((GameView<T>)null);
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
			case AppPackage.TASK_VIEW__GAME_VIEW:
				return getGameView() != null;
			case AppPackage.TASK_VIEW__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case AppPackage.TASK_VIEW__ENABLED:
				return isEnabled() != ENABLED_EDEFAULT;
			case AppPackage.TASK_VIEW__STARTED:
				return isStarted() != STARTED_EDEFAULT;
			case AppPackage.TASK_VIEW__FINISHED:
				return isFinished() != FINISHED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AppPackage.TASK_VIEW___START:
				return start();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskViewImpl
