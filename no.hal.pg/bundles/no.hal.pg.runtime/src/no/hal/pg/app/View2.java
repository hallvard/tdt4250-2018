/**
 */
package no.hal.pg.app;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.View2#getModel1 <em>Model1</em>}</li>
 *   <li>{@link no.hal.pg.app.View2#getModel2 <em>Model2</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getView2()
 * @model abstract="true"
 * @generated
 */
public interface View2<U, M1, M2> extends View<U> {
	/**
	 * Returns the value of the '<em><b>Model1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model1</em>' reference.
	 * @see #setModel1(Object)
	 * @see no.hal.pg.app.AppPackage#getView2_Model1()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	M1 getModel1();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.View2#getModel1 <em>Model1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model1</em>' reference.
	 * @see #getModel1()
	 * @generated
	 */
	void setModel1(M1 value);

	/**
	 * Returns the value of the '<em><b>Model2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model2</em>' reference.
	 * @see #setModel2(Object)
	 * @see no.hal.pg.app.AppPackage#getView2_Model2()
	 * @model kind="reference" required="true"
	 * @generated
	 */
	M2 getModel2();

	/**
	 * Sets the value of the '{@link no.hal.pg.app.View2#getModel2 <em>Model2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model2</em>' reference.
	 * @see #getModel2()
	 * @generated
	 */
	void setModel2(M2 value);

} // View2
