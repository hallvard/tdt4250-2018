/**
 */
package no.hal.pg.app;

import no.hal.pg.osm.GeoLocated;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Located View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.GeoLocatedView#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getGeoLocatedView()
 * @model
 * @generated
 */
public interface GeoLocatedView extends AbstractGeoLocationView {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(GeoLocated)
	 * @see no.hal.pg.app.AppPackage#getGeoLocatedView_Location()
	 * @model
	 * @generated
	 */
	GeoLocated getLocation();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.GeoLocatedView#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(GeoLocated value);

} // GeoLocatedView
