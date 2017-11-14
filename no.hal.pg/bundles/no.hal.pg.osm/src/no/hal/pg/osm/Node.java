/**
 */
package no.hal.pg.osm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.osm.Node#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.osm.OsmPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends OSMElement, GeoLocation {

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see no.hal.pg.osm.OsmPackage#getNode_Kind()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.openstreetmap.org/v06/osm.ecore tag='amenity'"
	 * @generated
	 */
	String getKind();
} // Node
