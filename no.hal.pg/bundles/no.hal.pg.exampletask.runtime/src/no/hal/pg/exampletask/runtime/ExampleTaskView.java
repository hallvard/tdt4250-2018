/**
 */
package no.hal.pg.exampletask.runtime;

import no.hal.pg.app.TaskView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Task View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.exampletask.runtime.ExampleTaskView#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.exampletask.runtime.RuntimePackage#getExampleTaskView()
 * @model
 * @generated
 */
public interface ExampleTaskView extends TaskView<ExampleTask> {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see no.hal.pg.exampletask.runtime.RuntimePackage#getExampleTaskView_Question()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean proposeAnswer(boolean proposal);

} // ExampleTaskView
