/**
 */
package no.hal.pg.runtime;

import no.hal.pg.arc.Person;
import no.hal.pg.osm.GeoLocation;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Player#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Player#getNickname <em>Nickname</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Player#getPerson <em>Person</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Player#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Player#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getPlayer()
 * @model
 * @generated
 */
public interface Player extends GeoLocation {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Game</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayer_Game()
	 * @see no.hal.pg.runtime.Game#getPlayers
	 * @model opposite="players" transient="false" changeable="false"
	 * @generated
	 */
	Game<?> getGame();

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nickname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayer_Nickname()
	 * @model
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Player#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Item}.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Item#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayer_Items()
	 * @see no.hal.pg.runtime.Item#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Item> getItems();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayer_Person()
	 * @model annotation="no.hal.pg.http.impl.JsonSerializer include='true'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Player#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayer_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // Player
