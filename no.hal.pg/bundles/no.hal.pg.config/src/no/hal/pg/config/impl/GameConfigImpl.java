/**
 */
package no.hal.pg.config.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import no.hal.pg.arc.Person;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.GameConfig;
import no.hal.pg.config.TaskConfig;
import no.hal.pg.config.util.Util;
import no.hal.pg.runtime.Game;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getTaskRefs <em>Task Refs</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getAllTasks <em>All Tasks</em>}</li>
 *   <li>{@link no.hal.pg.config.impl.GameConfigImpl#getPlayers <em>Players</em>}</li>
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
	protected EList<TaskConfig<?, ?>> tasks;

	/**
	 * The cached value of the '{@link #getTaskRefs() <em>Task Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskConfig<?, ?>> taskRefs;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> players;

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
	public EList<TaskConfig<?, ?>> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<TaskConfig<?, ?>>(TaskConfig.class, this, ConfigPackage.GAME_CONFIG__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskConfig<?, ?>> getTaskRefs() {
		if (taskRefs == null) {
			taskRefs = new EObjectResolvingEList<TaskConfig<?, ?>>(TaskConfig.class, this, ConfigPackage.GAME_CONFIG__TASK_REFS);
		}
		return taskRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TaskConfig<?, ?>> getAllTasks() {
		return Util.createUmodifiableList(this, ConfigPackage.eINSTANCE.getGameConfig_AllTasks(), getTasks(), getTaskRefs());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPlayers() {
		if (players == null) {
			players = new EObjectResolvingEList<Person>(Person.class, this, ConfigPackage.GAME_CONFIG__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ConfigPackage.GAME_CONFIG__TASK_REFS:
				return getTaskRefs();
			case ConfigPackage.GAME_CONFIG__ALL_TASKS:
				return getAllTasks();
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				return getPlayers();
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
				getTasks().addAll((Collection<? extends TaskConfig<?, ?>>)newValue);
				return;
			case ConfigPackage.GAME_CONFIG__TASK_REFS:
				getTaskRefs().clear();
				getTaskRefs().addAll((Collection<? extends TaskConfig<?, ?>>)newValue);
				return;
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Person>)newValue);
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
			case ConfigPackage.GAME_CONFIG__TASK_REFS:
				getTaskRefs().clear();
				return;
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				getPlayers().clear();
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
			case ConfigPackage.GAME_CONFIG__TASK_REFS:
				return taskRefs != null && !taskRefs.isEmpty();
			case ConfigPackage.GAME_CONFIG__ALL_TASKS:
				return !getAllTasks().isEmpty();
			case ConfigPackage.GAME_CONFIG__PLAYERS:
				return players != null && !players.isEmpty();
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
			case ConfigPackage.GAME_CONFIG___CREATE_GAME:
				return createGame();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GameDefImpl
