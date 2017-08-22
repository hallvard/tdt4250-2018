/**
 */
package no.hal.pg.arc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.arc.ScopeCapability#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.arc.ArcPackage#getScopeCapability()
 * @model
 * @generated
 */
public interface ScopeCapability extends Capability {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see no.hal.pg.arc.ArcPackage#getScopeCapability_Elements()
	 * @model
	 * @generated
	 */
	EList<EObject> getElements();

} // ScopeCapability
