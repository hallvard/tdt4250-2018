/**
 */
package no.hal.pg.exampletask.runtime;

import no.hal.pg.runtime.ResettableTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.exampletask.runtime.ExampleTask#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.exampletask.runtime.ExampleTask#isCorrectAnswer <em>Correct Answer</em>}</li>
 *   <li>{@link no.hal.pg.exampletask.runtime.ExampleTask#isAnsweredCorrectly <em>Answered Correctly</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.exampletask.runtime.RuntimePackage#getExampleTask()
 * @model superTypes="no.hal.pg.runtime.ResettableTask&lt;org.eclipse.emf.ecore.EBooleanObject&gt;"
 * @generated
 */
public interface ExampleTask extends ResettableTask<Boolean> {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see no.hal.pg.exampletask.runtime.RuntimePackage#getExampleTask_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link no.hal.pg.exampletask.runtime.ExampleTask#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Correct Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correct Answer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct Answer</em>' attribute.
	 * @see #setCorrectAnswer(boolean)
	 * @see no.hal.pg.exampletask.runtime.RuntimePackage#getExampleTask_CorrectAnswer()
	 * @model
	 * @generated
	 */
	boolean isCorrectAnswer();

	/**
	 * Sets the value of the '{@link no.hal.pg.exampletask.runtime.ExampleTask#isCorrectAnswer <em>Correct Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct Answer</em>' attribute.
	 * @see #isCorrectAnswer()
	 * @generated
	 */
	void setCorrectAnswer(boolean value);

	/**
	 * Returns the value of the '<em><b>Answered Correctly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answered Correctly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answered Correctly</em>' attribute.
	 * @see no.hal.pg.exampletask.runtime.RuntimePackage#getExampleTask_AnsweredCorrectly()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isAnsweredCorrectly();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void answer(boolean proposal);

} // ExampleTask
