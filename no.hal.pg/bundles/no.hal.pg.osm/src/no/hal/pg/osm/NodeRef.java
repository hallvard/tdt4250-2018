/**
 */
package no.hal.pg.osm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.osm.NodeRef#getRef <em>Ref</em>}</li>
 *   <li>{@link no.hal.pg.osm.NodeRef#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pg.osm.NodeRef#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.osm.OsmPackage#getNodeRef()
 * @model
 * @generated
 */
public interface NodeRef extends GeoLocated {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Node)
	 * @see no.hal.pg.osm.OsmPackage#getNodeRef_Ref()
	 * @model extendedMetaData="kind='attribute'"
	 * @generated
	 */
	Node getRef();

	/**
	 * Sets the value of the '{@link no.hal.pg.osm.NodeRef#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Node value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.hal.pg.osm.OsmPackage#getNodeRef_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see no.hal.pg.osm.OsmPackage#getNodeRef_Kind()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.openstreetmap.org/v06/osm.ecore tag='amenity'"
	 * @generated
	 */
	String getKind();

} // NodeRef
