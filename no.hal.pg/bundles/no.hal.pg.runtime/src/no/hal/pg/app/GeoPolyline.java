/**
 */
package no.hal.pg.app;

import no.hal.pg.osm.GeoLocated;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geo Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.GeoPolyline#getLocations <em>Locations</em>}</li>
 *   <li>{@link no.hal.pg.app.GeoPolyline#isClosed <em>Closed</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getGeoPolyline()
 * @model
 * @generated
 */
public interface GeoPolyline extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.osm.GeoLocated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see no.hal.pg.app.AppPackage#getGeoPolyline_Locations()
	 * @model
	 * @generated
	 */
	EList<GeoLocated> getLocations();

	/**
	 * Returns the value of the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' attribute.
	 * @see #setClosed(boolean)
	 * @see no.hal.pg.app.AppPackage#getGeoPolyline_Closed()
	 * @model
	 * @generated
	 */
	boolean isClosed();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.GeoPolyline#isClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #isClosed()
	 * @generated
	 */
	void setClosed(boolean value);

} // GeoPolyline
