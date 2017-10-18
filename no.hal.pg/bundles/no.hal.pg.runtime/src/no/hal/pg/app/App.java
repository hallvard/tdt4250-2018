/**
 */
package no.hal.pg.app;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.App#getModel <em>Model</em>}</li>
 *   <li>{@link no.hal.pg.app.App#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getApp()
 * @model abstract="true"
 * @generated
 */
public interface App<V extends View1<U, M>, U, M> extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Object)
	 * @see no.hal.pg.app.AppPackage#getApp_Model()
	 * @model kind="reference"
	 * @generated
	 */
	M getModel();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.App#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(M value);

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see no.hal.pg.app.AppPackage#getApp_Views()
	 * @model containment="true"
	 * @generated
	 */
	EList<V> getViews();

} // App
