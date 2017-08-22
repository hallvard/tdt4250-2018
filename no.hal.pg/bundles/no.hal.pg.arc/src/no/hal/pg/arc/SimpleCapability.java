/**
 */
package no.hal.pg.arc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.arc.SimpleCapability#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link no.hal.pg.arc.SimpleCapability#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.arc.ArcPackage#getSimpleCapability()
 * @model
 * @generated
 */
public interface SimpleCapability extends Capability {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see no.hal.pg.arc.ArcPackage#getSimpleCapability_QualifiedName()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link no.hal.pg.arc.SimpleCapability#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' attribute list.
	 * @see no.hal.pg.arc.ArcPackage#getSimpleCapability_Segments()
	 * @model
	 * @generated
	 */
	EList<String> getSegments();

} // SimpleCapability
