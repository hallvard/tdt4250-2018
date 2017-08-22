/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.CompositeCondition#isLogic <em>Logic</em>}</li>
 *   <li>{@link no.hal.pg.runtime.CompositeCondition#getPredicates <em>Predicates</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition<E> extends Condition {
	/**
	 * Returns the value of the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic</em>' attribute.
	 * @see #setLogic(boolean)
	 * @see no.hal.pg.runtime.RuntimePackage#getCompositeCondition_Logic()
	 * @model
	 * @generated
	 */
	boolean isLogic();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.CompositeCondition#isLogic <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' attribute.
	 * @see #isLogic()
	 * @generated
	 */
	void setLogic(boolean value);

	/**
	 * Returns the value of the '<em><b>Predicates</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicates</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getCompositeCondition_Predicates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getPredicates();

} // CompositePredicate
