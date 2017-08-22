/**
 */
package no.hal.pg.runtime.util;

import no.hal.pg.runtime.AbstractCondition;
import no.hal.pg.runtime.CompositeCondition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.IsTaskFinished;
import no.hal.pg.runtime.IsTaskStarted;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Players;
import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.Team;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.pg.runtime.RuntimePackage
 * @generated
 */
public class RuntimeSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeSwitch() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RuntimePackage.GAME: {
				Game<?> game = (Game<?>)theEObject;
				T1 result = caseGame(game);
				if (result == null) result = casePlayers(game);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.TEAM: {
				Team team = (Team)theEObject;
				T1 result = caseTeam(team);
				if (result == null) result = casePlayers(team);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PLAYER: {
				Player player = (Player)theEObject;
				T1 result = casePlayer(player);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PLAYERS: {
				Players players = (Players)theEObject;
				T1 result = casePlayers(players);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.TASK: {
				Task<?> task = (Task<?>)theEObject;
				T1 result = caseTask(task);
				if (result == null) result = casePlayers(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T1 result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.ABSTRACT_CONDITION: {
				AbstractCondition<?> abstractCondition = (AbstractCondition<?>)theEObject;
				T1 result = caseAbstractCondition(abstractCondition);
				if (result == null) result = caseCondition(abstractCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.COMPOSITE_CONDITION: {
				CompositeCondition<?> compositeCondition = (CompositeCondition<?>)theEObject;
				T1 result = caseCompositeCondition(compositeCondition);
				if (result == null) result = caseCondition(compositeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.IS_TASK_STARTED: {
				IsTaskStarted isTaskStarted = (IsTaskStarted)theEObject;
				T1 result = caseIsTaskStarted(isTaskStarted);
				if (result == null) result = caseAbstractCondition(isTaskStarted);
				if (result == null) result = caseCondition(isTaskStarted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.IS_TASK_FINISHED: {
				IsTaskFinished isTaskFinished = (IsTaskFinished)theEObject;
				T1 result = caseIsTaskFinished(isTaskFinished);
				if (result == null) result = caseAbstractCondition(isTaskFinished);
				if (result == null) result = caseCondition(isTaskFinished);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME: {
				no.hal.pg.runtime.Runtime runtime = (no.hal.pg.runtime.Runtime)theEObject;
				T1 result = caseRuntime(runtime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseGame(Game<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTeam(Team object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Players</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Players</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayers(Players object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R> T1 caseTask(Task<R> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E> T1 caseAbstractCondition(AbstractCondition<E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <E> T1 caseCompositeCondition(CompositeCondition<E> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Task Started</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Task Started</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIsTaskStarted(IsTaskStarted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Task Finished</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Task Finished</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIsTaskFinished(IsTaskFinished object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Runtime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRuntime(no.hal.pg.runtime.Runtime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //PgSwitch
