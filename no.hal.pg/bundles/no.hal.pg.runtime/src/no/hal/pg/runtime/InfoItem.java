/**
 */
package no.hal.pg.runtime;

import java.net.URI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.InfoItem#getText <em>Text</em>}</li>
 *   <li>{@link no.hal.pg.runtime.InfoItem#getUrl <em>Url</em>}</li>
 *   <li>{@link no.hal.pg.runtime.InfoItem#getImageUrl <em>Image Url</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getInfoItem()
 * @model
 * @generated
 */
public interface InfoItem extends Item {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see no.hal.pg.runtime.RuntimePackage#getInfoItem_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.InfoItem#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(URI)
	 * @see no.hal.pg.runtime.RuntimePackage#getInfoItem_Url()
	 * @model dataType="no.hal.pg.runtime.EURI"
	 * @generated
	 */
	URI getUrl();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.InfoItem#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(URI value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(URI)
	 * @see no.hal.pg.runtime.RuntimePackage#getInfoItem_ImageUrl()
	 * @model dataType="no.hal.pg.runtime.EURI"
	 * @generated
	 */
	URI getImageUrl();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.InfoItem#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(URI value);

} // InfoItem
