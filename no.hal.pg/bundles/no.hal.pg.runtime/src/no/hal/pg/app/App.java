/**
 */
package no.hal.pg.app;

import no.hal.pg.runtime.Game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.App#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.app.App#getGameViews <em>Game Views</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' reference.
	 * @see #setGame(Game)
	 * @see no.hal.pg.app.AppPackage#getApp_Game()
	 * @model
	 * @generated
	 */
	Game<?> getGame();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.App#getGame <em>Game</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game</em>' reference.
	 * @see #getGame()
	 * @generated
	 */
	void setGame(Game<?> value);

	/**
	 * Returns the value of the '<em><b>Game Views</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.app.GameView}<code>&lt;?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Views</em>' containment reference list.
	 * @see no.hal.pg.app.AppPackage#getApp_GameViews()
	 * @model containment="true"
	 * @generated
	 */
	EList<GameView<?>> getGameViews();

} // App
