/**
 */
package no.hal.pg.runtime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.InfoItem#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getInfoItem()
 * @model
 * @generated
 */
public interface InfoItem extends Item {

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see no.hal.pg.runtime.RuntimePackage#getInfoItem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.InfoItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // InfoItem
