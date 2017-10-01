/**
 */
package no.hal.pg.osm;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Located</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.osm.OsmPackage#getGeoLocated()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GeoLocated extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="no.hal.pg.osm.LatLong"
	 * @generated
	 */
	LatLong getLatLong();

} // GeoLocated
