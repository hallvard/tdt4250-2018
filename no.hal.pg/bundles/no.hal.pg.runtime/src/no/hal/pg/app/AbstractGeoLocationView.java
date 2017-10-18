/**
 */
package no.hal.pg.app;

import no.hal.pg.osm.GeoLocated;

import no.hal.pg.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Geo Location View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.AbstractGeoLocationView#getLatLong <em>Lat Long</em>}</li>
 *   <li>{@link no.hal.pg.app.AbstractGeoLocationView#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getAbstractGeoLocationView()
 * @model abstract="true"
 * @generated
 */
public interface AbstractGeoLocationView extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Lat Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Long</em>' attribute.
	 * @see no.hal.pg.app.AppPackage#getAbstractGeoLocationView_LatLong()
	 * @model dataType="no.hal.pg.osm.LatLong" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	LatLong getLatLong();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(MapMarkerOptions)
	 * @see no.hal.pg.app.AppPackage#getAbstractGeoLocationView_Options()
	 * @model containment="true"
	 * @generated
	 */
	MapMarkerOptions getOptions();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.AbstractGeoLocationView#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(MapMarkerOptions value);

} // AbstractGeoLocationView
