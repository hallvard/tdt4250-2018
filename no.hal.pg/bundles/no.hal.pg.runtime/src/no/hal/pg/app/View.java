/**
 */
package no.hal.pg.app;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.View#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getView()
 * @model abstract="true"
 * @generated
 */
public interface View<U> extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see no.hal.pg.app.AppPackage#getView_User()
	 * @model kind="reference" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	U getUser();

} // View
