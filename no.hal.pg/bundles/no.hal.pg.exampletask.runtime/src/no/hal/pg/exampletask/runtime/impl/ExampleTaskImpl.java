/**
 */
package no.hal.pg.exampletask.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import no.hal.pg.exampletask.runtime.ExampleTask;
import no.hal.pg.exampletask.runtime.RuntimePackage;
import no.hal.pg.runtime.impl.ResettableTaskImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskImpl#isCorrectAnswer <em>Correct Answer</em>}</li>
 *   <li>{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskImpl#isAnsweredCorrectly <em>Answered Correctly</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleTaskImpl extends ResettableTaskImpl<Boolean> implements ExampleTask {
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
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected String question = QUESTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCorrectAnswer() <em>Correct Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrectAnswer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CORRECT_ANSWER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCorrectAnswer() <em>Correct Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCorrectAnswer()
	 * @generated
	 * @ordered
	 */
	protected boolean correctAnswer = CORRECT_ANSWER_EDEFAULT;

	/**
	 * The default value of the '{@link #isAnsweredCorrectly() <em>Answered Correctly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnsweredCorrectly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSWERED_CORRECTLY_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.EXAMPLE_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(String newQuestion) {
		String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.EXAMPLE_TASK__QUESTION, oldQuestion, question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCorrectAnswer() {
		return correctAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorrectAnswer(boolean newCorrectAnswer) {
		boolean oldCorrectAnswer = correctAnswer;
		correctAnswer = newCorrectAnswer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.EXAMPLE_TASK__CORRECT_ANSWER, oldCorrectAnswer, correctAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isAnsweredCorrectly() {
		return Boolean.TRUE.equals(getResult());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void answer(boolean proposal) {
		finish(proposal == isCorrectAnswer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.EXAMPLE_TASK__QUESTION:
				return getQuestion();
			case RuntimePackage.EXAMPLE_TASK__CORRECT_ANSWER:
				return isCorrectAnswer();
			case RuntimePackage.EXAMPLE_TASK__ANSWERED_CORRECTLY:
				return isAnsweredCorrectly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.EXAMPLE_TASK__QUESTION:
				setQuestion((String)newValue);
				return;
			case RuntimePackage.EXAMPLE_TASK__CORRECT_ANSWER:
				setCorrectAnswer((Boolean)newValue);
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
			case RuntimePackage.EXAMPLE_TASK__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case RuntimePackage.EXAMPLE_TASK__CORRECT_ANSWER:
				setCorrectAnswer(CORRECT_ANSWER_EDEFAULT);
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
			case RuntimePackage.EXAMPLE_TASK__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case RuntimePackage.EXAMPLE_TASK__CORRECT_ANSWER:
				return correctAnswer != CORRECT_ANSWER_EDEFAULT;
			case RuntimePackage.EXAMPLE_TASK__ANSWERED_CORRECTLY:
				return isAnsweredCorrectly() != ANSWERED_CORRECTLY_EDEFAULT;
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
			case RuntimePackage.EXAMPLE_TASK___ANSWER__BOOLEAN:
				answer((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (question: ");
		result.append(question);
		result.append(", correctAnswer: ");
		result.append(correctAnswer);
		result.append(')');
		return result.toString();
	}

	//

	@Override
	public String getDescription() {
		return "Answer a yes/no question";
	}

} //ExampleTaskImpl
