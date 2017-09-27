/**
 */
package no.hal.pg.arc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.arc.Role#getInherits <em>Inherits</em>}</li>
 *   <li>{@link no.hal.pg.arc.Role#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.arc.ArcPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends Capabilities, Named {
	/**
	 * Returns the value of the '<em><b>Inherits</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.arc.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits</em>' reference list.
	 * @see no.hal.pg.arc.ArcPackage#getRole_Inherits()
	 * @model
	 * @generated
	 */
	EList<Role> getInherits();

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.arc.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference list.
	 * @see no.hal.pg.arc.ArcPackage#getRole_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Capability> getCapabilities();

} // Role
