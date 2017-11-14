/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Task#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getResult <em>Result</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getFinishTime <em>Finish Time</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getStartConditions <em>Start Conditions</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getFinishConditions <em>Finish Conditions</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getStartActions <em>Start Actions</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Task#getFinishActions <em>Finish Actions</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PlayerIsContainedInGame IsFinishedImpliesIsStarted FinishTimeGEStartTime'"
 * @generated
 */
public interface Task<R> extends Described {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Game#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see #setGame(Game)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Game()
	 * @see no.hal.pg.runtime.Game#getTasks
	 * @model opposite="tasks" transient="false"
	 * @generated
	 */
	Game<?> getGame();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getGame <em>Game</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' container reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game<?> value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Players()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(Object)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_Result()
	 * @model
	 * @generated
	 */
	R getResult();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(R value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Long)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_StartTime()
	 * @model dataType="no.hal.pg.runtime.Timestamp"
	 * @generated
	 */
	Long getStartTime();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Long value);

	/**
	 * Returns the value of the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Time</em>' attribute.
	 * @see #setFinishTime(Long)
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_FinishTime()
	 * @model dataType="no.hal.pg.runtime.Timestamp"
	 * @generated
	 */
	Long getFinishTime();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Task#getFinishTime <em>Finish Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish Time</em>' attribute.
	 * @see #getFinishTime()
	 * @generated
	 */
	void setFinishTime(Long value);

	/**
	 * Returns the value of the '<em><b>Start Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enablements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Conditions</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_StartConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getStartConditions();

	/**
	 * Returns the value of the '<em><b>Finish Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Conditions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Conditions</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_FinishConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getFinishConditions();

	/**
	 * Returns the value of the '<em><b>Start Actions</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Actions</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_StartActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getStartActions();

	/**
	 * Returns the value of the '<em><b>Finish Actions</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish Actions</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getTask_FinishActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getFinishActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="no.hal.pg.http.impl.JsonSerializer include='true'"
	 * @generated
	 */
	boolean canStart();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void finish(R result);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="no.hal.pg.http.impl.JsonSerializer include='true'"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="no.hal.pg.http.impl.JsonSerializer include='true'"
	 * @generated
	 */
	boolean isFinished();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

} // Task
