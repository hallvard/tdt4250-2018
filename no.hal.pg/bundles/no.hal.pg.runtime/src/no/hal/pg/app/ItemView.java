/**
 */
package no.hal.pg.app;

import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.ItemView#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.app.AppPackage#getItemView()
 * @model
 * @generated
 */
public interface ItemView extends View1<Player, Item> {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see no.hal.pg.app.AppPackage#getItemView_Description()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDescription();

} // ItemView
