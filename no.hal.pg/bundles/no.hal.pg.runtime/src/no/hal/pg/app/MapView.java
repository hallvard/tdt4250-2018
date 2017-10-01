/**
 */
package no.hal.pg.app;

import no.hal.pg.osm.GeoLocation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.MapView#getZoom <em>Zoom</em>}</li>
 *   <li>{@link no.hal.pg.app.MapView#getMarkers <em>Markers</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getMapView()
 * @model
 * @generated
 */
public interface MapView extends GeoLocation {
	/**
	 * Returns the value of the '<em><b>Zoom</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom</em>' attribute.
	 * @see #setZoom(int)
	 * @see no.hal.pg.app.AppPackage#getMapView_Zoom()
	 * @model default="10"
	 * @generated
	 */
	int getZoom();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.MapView#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom</em>' attribute.
	 * @see #getZoom()
	 * @generated
	 */
	void setZoom(int value);

	/**
	 * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.app.MapMarker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markers</em>' containment reference list.
	 * @see no.hal.pg.app.AppPackage#getMapView_Markers()
	 * @model containment="true"
	 * @generated
	 */
	EList<MapMarker> getMarkers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void navigate(float latitude, float longitude, int zoom);

} // MapView
