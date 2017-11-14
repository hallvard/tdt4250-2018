/**
 */
package no.hal.pg.runtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Give Task Players Items Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.GiveTaskPlayersItemsAction#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getGiveTaskPlayersItemsAction()
 * @model
 * @generated
 */
public interface GiveTaskPlayersItemsAction extends AbstractGiveItemsAction {

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see no.hal.pg.runtime.RuntimePackage#getGiveTaskPlayersItemsAction_Task()
	 * @model
	 * @generated
	 */
	Task<?> getTask();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.GiveTaskPlayersItemsAction#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task<?> value);
} // GiveTaskPlayersItemsAction
