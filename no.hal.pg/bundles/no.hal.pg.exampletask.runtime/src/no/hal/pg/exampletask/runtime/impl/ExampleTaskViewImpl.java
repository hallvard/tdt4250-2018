/**
 */
package no.hal.pg.exampletask.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import no.hal.pg.app.impl.TaskViewImpl;
import no.hal.pg.exampletask.runtime.ExampleTask;
import no.hal.pg.exampletask.runtime.ExampleTaskView;
import no.hal.pg.exampletask.runtime.RuntimePackage;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Task View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskViewImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleTaskViewImpl extends TaskViewImpl<ExampleTask> implements ExampleTaskView {
	/**
	 * The default value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleTaskViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.EXAMPLE_TASK_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getQuestion() {
		return getModel().getQuestion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean proposeAnswer(boolean proposal) {
		getModel().answer(proposal);
		return getModel().isAnsweredCorrectly();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.EXAMPLE_TASK_VIEW__QUESTION:
				return getQuestion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.EXAMPLE_TASK_VIEW__QUESTION:
				return QUESTION_EDEFAULT == null ? getQuestion() != null : !QUESTION_EDEFAULT.equals(getQuestion());
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
			case RuntimePackage.EXAMPLE_TASK_VIEW___PROPOSE_ANSWER__BOOLEAN:
				return proposeAnswer((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExampleTaskViewImpl
