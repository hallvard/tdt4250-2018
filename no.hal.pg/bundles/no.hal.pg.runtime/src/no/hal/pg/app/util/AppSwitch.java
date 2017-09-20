/**
 */
package no.hal.pg.app.util;

import no.hal.pg.app.*;

import no.hal.pg.runtime.Task;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see no.hal.pg.app.AppPackage
 * @generated
 */
public class AppSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSwitch() {
		if (modelPackage == null) {
			modelPackage = AppPackage.eINSTANCE;
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
			case AppPackage.VIEW: {
				View<?> view = (View<?>)theEObject;
				T1 result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.VIEW1: {
				View1<?, ?> view1 = (View1<?, ?>)theEObject;
				T1 result = caseView1(view1);
				if (result == null) result = caseView(view1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.VIEW2: {
				View2<?, ?, ?> view2 = (View2<?, ?, ?>)theEObject;
				T1 result = caseView2(view2);
				if (result == null) result = caseView(view2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.GAME_VIEW: {
				GameView<?> gameView = (GameView<?>)theEObject;
				T1 result = caseGameView(gameView);
				if (result == null) result = caseView1(gameView);
				if (result == null) result = caseView(gameView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AppPackage.TASK_VIEW: {
				TaskView<?> taskView = (TaskView<?>)theEObject;
				T1 result = caseTaskView(taskView);
				if (result == null) result = caseView1(taskView);
				if (result == null) result = caseView(taskView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U> T1 caseView(View<U> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U, M> T1 caseView1(View1<U, M> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <U, M1, M2> T1 caseView2(View2<U, M1, M2> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseGameView(GameView<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseTaskView(TaskView<T> object) {
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

} //AppSwitch
