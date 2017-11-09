/**
 */
package no.hal.pg.config;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.runtime.Item;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.ItemConfig#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.config.ConfigPackage#getItemConfig()
 * @model abstract="true"
 * @generated
 */
public interface ItemConfig extends AbstractConfig<Item> {

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(GeoLocated)
	 * @see no.hal.pg.config.ConfigPackage#getItemConfig_Location()
	 * @model containment="true"
	 * @generated
	 */
	GeoLocated getLocation();

	/**
	 * Sets the value of the '{@link no.hal.pg.config.ItemConfig#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GeoLocated value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Item createItem(ItemProxy proxy);
} // ItemConfig
