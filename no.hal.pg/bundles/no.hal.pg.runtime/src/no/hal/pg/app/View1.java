/**
 */
package no.hal.pg.app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.View1#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getView1()
 * @model abstract="true"
 * @generated
 */
public interface View1<U, M> extends View<U> {
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
	 * @see no.hal.pg.app.AppPackage#getView1_Model()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	M getModel();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.View1#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(M value);

} // View1
