/**
 */
package no.hal.pg.arc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capable</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.arc.ArcPackage#getCapable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Capable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean hasCapability(Capability capability);

} // Capable
