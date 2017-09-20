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

} // TaskView
