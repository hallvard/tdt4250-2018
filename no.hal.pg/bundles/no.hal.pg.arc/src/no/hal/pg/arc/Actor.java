/**
 */
package no.hal.pg.arc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.arc.Actor#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.arc.ArcPackage#getActor()
 * @model abstract="true"
 * @generated
 */
public interface Actor extends Capabilities, Named {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.arc.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see no.hal.pg.arc.ArcPackage#getActor_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

} // Actor
