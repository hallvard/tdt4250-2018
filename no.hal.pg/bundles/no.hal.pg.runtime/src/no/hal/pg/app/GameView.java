/**
 */
package no.hal.pg.app;

import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.GameView#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.hal.pg.app.GameView#getTaskViews <em>Task Views</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getGameView()
 * @model
 * @generated
 */
public interface GameView<T extends Task<?>> extends View1<Player, Game<T>> {
	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(Player)
	 * @see no.hal.pg.app.AppPackage#getGameView_Player()
	 * @model
	 * @generated
	 */
	Player getPlayer();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.GameView#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(Player value);

	/**
	 * Returns the value of the '<em><b>Task Views</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.app.TaskView}<code>&lt;T&gt;</code>.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.app.TaskView#getGameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Views</em>' containment reference list.
	 * @see no.hal.pg.app.AppPackage#getGameView_TaskViews()
	 * @see no.hal.pg.app.TaskView#getGameView
	 * @model opposite="gameView" containment="true"
	 * @generated
	 */
	EList<TaskView<T>> getTaskViews();

} // GameView
