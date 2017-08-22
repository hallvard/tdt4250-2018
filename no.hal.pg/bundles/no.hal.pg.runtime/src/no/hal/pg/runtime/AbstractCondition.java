/**
 */
package no.hal.pg.runtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.AbstractCondition#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getAbstractCondition()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCondition<E> extends Condition {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Object)
	 * @see no.hal.pg.runtime.RuntimePackage#getAbstractCondition_Context()
	 * @model kind="reference"
	 * @generated
	 */
	E getContext();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.AbstractCondition#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(E value);

} // AbstractPredicate
