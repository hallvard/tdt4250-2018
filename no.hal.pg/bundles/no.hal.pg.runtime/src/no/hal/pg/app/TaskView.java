/**
 */
package no.hal.pg.app;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.TaskView#getGameView <em>Game View</em>}</li>
 *   <li>{@link no.hal.pg.app.TaskView#getDescription <em>Description</em>}</li>
 *   <li>{@link no.hal.pg.app.TaskView#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link no.hal.pg.app.TaskView#isStarted <em>Started</em>}</li>
 *   <li>{@link no.hal.pg.app.TaskView#isFinished <em>Finished</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getTaskView()
 * @model
 * @generated
 */
public interface TaskView<T extends Task<?>> extends View1<Player, T> {
	/**
	 * Returns the value of the '<em><b>Game View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.app.GameView#getTaskViews <em>Task Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game View</em>' container reference.
	 * @see #setGameView(GameView)
	 * @see no.hal.pg.app.AppPackage#getTaskView_GameView()
	 * @see no.hal.pg.app.GameView#getTaskViews
	 * @model opposite="taskViews" transient="false"
	 * @generated
	 */
	GameView<T> getGameView();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.TaskView#getGameView <em>Game View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game View</em>' container reference.
	 * @see #getGameView()
	 * @generated
	 */
	void setGameView(GameView<T> value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see no.hal.pg.app.AppPackage#getTaskView_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see no.hal.pg.app.AppPackage#getTaskView_Enabled()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see no.hal.pg.app.AppPackage#getTaskView_Started()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see no.hal.pg.app.AppPackage#getTaskView_Finished()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isFinished();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TaskView<?> start();

} // TaskView
