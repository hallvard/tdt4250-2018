/**
 */
package no.hal.pg.runtime;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.Item#getOwner <em>Owner</em>}</li>
 *   <li>{@link no.hal.pg.runtime.Item#getOwnLocation <em>Own Location</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getItem()
 * @model
 * @generated
 */
public interface Item extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Player#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Player)
	 * @see no.hal.pg.runtime.RuntimePackage#getItem_Owner()
	 * @see no.hal.pg.runtime.Player#getItems
	 * @model opposite="items" transient="false"
	 * @generated
	 */
	Player getOwner();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Item#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Player value);

	/**
	 * Returns the value of the '<em><b>Own Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own Location</em>' containment reference.
	 * @see #setOwnLocation(GeoLocation)
	 * @see no.hal.pg.runtime.RuntimePackage#getItem_OwnLocation()
	 * @model containment="true"
	 * @generated
	 */
	GeoLocation getOwnLocation();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.Item#getOwnLocation <em>Own Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Own Location</em>' containment reference.
	 * @see #getOwnLocation()
	 * @generated
	 */
	void setOwnLocation(GeoLocation value);

} // Item
