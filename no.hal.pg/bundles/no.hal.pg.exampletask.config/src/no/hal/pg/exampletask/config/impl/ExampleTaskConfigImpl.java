/**
 */
package no.hal.pg.exampletask.config.impl;

import no.hal.pg.config.TaskProxy;
import no.hal.pg.config.impl.TaskConfigImpl;

import no.hal.pg.exampletask.config.ConfigPackage;
import no.hal.pg.exampletask.config.ExampleTaskConfig;

import no.hal.pg.exampletask.runtime.ExampleTask;
import no.hal.pg.exampletask.runtime.RuntimeFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Task Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.exampletask.config.impl.ExampleTaskConfigImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.exampletask.config.impl.ExampleTaskConfigImpl#isCorrectAnswer <em>Correct Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleTaskConfigImpl extends TaskConfigImpl<ExampleTask> implements ExampleTaskConfig {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleTaskConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.EXAMPLE_TASK_CONFIG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXAMPLE_TASK_CONFIG__QUESTION, oldQuestion, question));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigPackage.EXAMPLE_TASK_CONFIG__CORRECT_ANSWER, oldCorrectAnswer, correctAnswer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigPackage.EXAMPLE_TASK_CONFIG__QUESTION:
				return getQuestion();
			case ConfigPackage.EXAMPLE_TASK_CONFIG__CORRECT_ANSWER:
				return isCorrectAnswer();
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
			case ConfigPackage.EXAMPLE_TASK_CONFIG__QUESTION:
				setQuestion((String)newValue);
				return;
			case ConfigPackage.EXAMPLE_TASK_CONFIG__CORRECT_ANSWER:
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
			case ConfigPackage.EXAMPLE_TASK_CONFIG__QUESTION:
				setQuestion(QUESTION_EDEFAULT);
				return;
			case ConfigPackage.EXAMPLE_TASK_CONFIG__CORRECT_ANSWER:
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
			case ConfigPackage.EXAMPLE_TASK_CONFIG__QUESTION:
				return QUESTION_EDEFAULT == null ? question != null : !QUESTION_EDEFAULT.equals(question);
			case ConfigPackage.EXAMPLE_TASK_CONFIG__CORRECT_ANSWER:
				return correctAnswer != CORRECT_ANSWER_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
	public ExampleTask createTask(TaskProxy proxy) {
		ExampleTask task = RuntimeFactory.eINSTANCE.createExampleTask();
		task.setQuestion(getQuestion());
		task.setCorrectAnswer(isCorrectAnswer());
		return task;
	}

} //ExampleTaskConfigImpl
