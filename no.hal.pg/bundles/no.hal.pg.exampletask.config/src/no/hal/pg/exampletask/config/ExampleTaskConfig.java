/**
 */
package no.hal.pg.exampletask.config;

import no.hal.pg.config.TaskConfig;

import no.hal.pg.exampletask.runtime.ExampleTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Task Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.exampletask.config.ExampleTaskConfig#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.exampletask.config.ExampleTaskConfig#isCorrectAnswer <em>Correct Answer</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.exampletask.config.ConfigPackage#getExampleTaskConfig()
 * @model
 * @generated
 */
public interface ExampleTaskConfig extends TaskConfig<ExampleTask> {
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
	 * @see no.hal.pg.exampletask.config.ConfigPackage#getExampleTaskConfig_Question()
	 * @model
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link no.hal.pg.exampletask.config.ExampleTaskConfig#getQuestion <em>Question</em>}' attribute.
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
	 * @see no.hal.pg.exampletask.config.ConfigPackage#getExampleTaskConfig_CorrectAnswer()
	 * @model
	 * @generated
	 */
	boolean isCorrectAnswer();

	/**
	 * Sets the value of the '{@link no.hal.pg.exampletask.config.ExampleTaskConfig#isCorrectAnswer <em>Correct Answer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct Answer</em>' attribute.
	 * @see #isCorrectAnswer()
	 * @generated
	 */
	void setCorrectAnswer(boolean value);

} // ExampleTaskConfig
