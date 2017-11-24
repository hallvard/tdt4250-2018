/**
 */
package no.hal.pg.config;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.PlayerRole#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pg.config.PlayerRole#getPlayerCount <em>Player Count</em>}</li>
 *   <li>{@link no.hal.pg.config.PlayerRole#getItems <em>Items</em>}</li>
 *   <li>{@link no.hal.pg.config.PlayerRole#getItemProxies <em>Item Proxies</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.config.ConfigPackage#getPlayerRole()
 * @model
 * @generated
 */
public interface PlayerRole extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.pg.config.ConfigPackage#getPlayerRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.pg.config.PlayerRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Count</em>' attribute.
	 * @see #setPlayerCount(int)
	 * @see no.hal.pg.config.ConfigPackage#getPlayerRole_PlayerCount()
	 * @model
	 * @generated
	 */
	int getPlayerCount();

	/**
	 * Sets the value of the '{@link no.hal.pg.config.PlayerRole#getPlayerCount <em>Player Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Count</em>' attribute.
	 * @see #getPlayerCount()
	 * @generated
	 */
	void setPlayerCount(int value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.ItemConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getPlayerRole_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemConfig> getItems();

	/**
	 * Returns the value of the '<em><b>Item Proxies</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.ItemProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Proxies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Proxies</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getPlayerRole_ItemProxies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemProxy> getItemProxies();

} // PlayerRole
