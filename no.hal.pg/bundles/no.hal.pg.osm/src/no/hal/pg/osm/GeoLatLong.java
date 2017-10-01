/**
 */
package no.hal.pg.osm;

import no.hal.pg.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Lat Long</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.osm.GeoLatLong#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.osm.OsmPackage#getGeoLatLong()
 * @model
 * @generated
 */
public interface GeoLatLong extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(LatLong)
	 * @see no.hal.pg.osm.OsmPackage#getGeoLatLong_Location()
	 * @model dataType="no.hal.pg.osm.LatLong"
	 *        extendedMetaData="name='lat' kind='attribute'"
	 * @generated
	 */
	LatLong getLocation();

	/**
	 * Sets the value of the '{@link no.hal.pg.osm.GeoLatLong#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LatLong value);

} // GeoLatLong
