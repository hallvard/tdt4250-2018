/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Players Have Items Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.PlayersHaveItemsCondition#getItemClasses <em>Item Classes</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getPlayersHaveItemsCondition()
 * @model
 * @generated
 */
public interface PlayersHaveItemsCondition extends AbstractCondition<Task<?>> {
	/**
	 * Returns the value of the '<em><b>Item Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Classes</em>' reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getPlayersHaveItemsCondition_ItemClasses()
	 * @model
	 * @generated
	 */
	EList<EClass> getItemClasses();

} // PlayersHaveItemsCondition
