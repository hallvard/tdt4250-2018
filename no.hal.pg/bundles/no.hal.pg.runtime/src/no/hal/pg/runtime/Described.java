/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Described</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.runtime.RuntimePackage#getDescribed()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Described extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="no.hal.pg.http.impl.JsonSerializer include='true'"
	 * @generated
	 */
	String getDescription();

} // Described
