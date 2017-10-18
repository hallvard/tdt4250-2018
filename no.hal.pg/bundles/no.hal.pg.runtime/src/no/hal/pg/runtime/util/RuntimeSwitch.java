/**
 */
package no.hal.pg.runtime.util;

import no.hal.pg.arc.Arc;
import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.runtime.AbstractCondition;
import no.hal.pg.runtime.AcceptTask;
import no.hal.pg.runtime.CompositeCondition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Info;
import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.IsByGeoLocationCondition;
import no.hal.pg.runtime.IsTaskFinishedCondition;
import no.hal.pg.runtime.IsTaskStartedCondition;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.ResettableTask;
import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.Described;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.PLAYER: {
				Player player = (Player)theEObject;
				T1 result = casePlayer(player);
				if (result == null) result = caseGeoLocation(player);
				if (result == null) result = caseGeoLocated(player);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.DESCRIBED: {
				Described described = (Described)theEObject;
				T1 result = caseDescribed(described);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.ITEM: {
				Item item = (Item)theEObject;
				T1 result = caseItem(item);
				if (result == null) result = caseGeoLocated(item);
				if (result == null) result = caseDescribed(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.INFO: {
				Info info = (Info)theEObject;
				T1 result = caseInfo(info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.INFO_ITEM: {
				InfoItem infoItem = (InfoItem)theEObject;
				T1 result = caseInfoItem(infoItem);
				if (result == null) result = caseItem(infoItem);
				if (result == null) result = caseInfo(infoItem);
				if (result == null) result = caseGeoLocated(infoItem);
				if (result == null) result = caseDescribed(infoItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.TASK: {
				Task<?> task = (Task<?>)theEObject;
				T1 result = caseTask(task);
				if (result == null) result = caseDescribed(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RESETTABLE_TASK: {
				ResettableTask<?> resettableTask = (ResettableTask<?>)theEObject;
				T1 result = caseResettableTask(resettableTask);
				if (result == null) result = caseTask(resettableTask);
				if (result == null) result = caseDescribed(resettableTask);
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
			case RuntimePackage.IS_TASK_STARTED_CONDITION: {
				IsTaskStartedCondition isTaskStartedCondition = (IsTaskStartedCondition)theEObject;
				T1 result = caseIsTaskStartedCondition(isTaskStartedCondition);
				if (result == null) result = caseAbstractCondition(isTaskStartedCondition);
				if (result == null) result = caseCondition(isTaskStartedCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.IS_TASK_FINISHED_CONDITION: {
				IsTaskFinishedCondition isTaskFinishedCondition = (IsTaskFinishedCondition)theEObject;
				T1 result = caseIsTaskFinishedCondition(isTaskFinishedCondition);
				if (result == null) result = caseAbstractCondition(isTaskFinishedCondition);
				if (result == null) result = caseCondition(isTaskFinishedCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION: {
				IsByGeoLocationCondition isByGeoLocationCondition = (IsByGeoLocationCondition)theEObject;
				T1 result = caseIsByGeoLocationCondition(isByGeoLocationCondition);
				if (result == null) result = caseAbstractCondition(isByGeoLocationCondition);
				if (result == null) result = caseCondition(isByGeoLocationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.ACCEPT_TASK: {
				AcceptTask acceptTask = (AcceptTask)theEObject;
				T1 result = caseAcceptTask(acceptTask);
				if (result == null) result = caseResettableTask(acceptTask);
				if (result == null) result = caseTask(acceptTask);
				if (result == null) result = caseDescribed(acceptTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RuntimePackage.RUNTIME: {
				no.hal.pg.runtime.Runtime runtime = (no.hal.pg.runtime.Runtime)theEObject;
				T1 result = caseRuntime(runtime);
				if (result == null) result = caseArc(runtime);
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
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInfo(Info object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInfoItem(InfoItem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Resettable Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resettable Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <R> T1 caseResettableTask(ResettableTask<R> object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Is Task Started Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Task Started Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIsTaskStartedCondition(IsTaskStartedCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Task Finished Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Task Finished Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIsTaskFinishedCondition(IsTaskFinishedCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is By Geo Location Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is By Geo Location Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIsByGeoLocationCondition(IsByGeoLocationCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAcceptTask(AcceptTask object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Located</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocated(GeoLocated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGeoLocation(GeoLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArc(Arc object) {
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
