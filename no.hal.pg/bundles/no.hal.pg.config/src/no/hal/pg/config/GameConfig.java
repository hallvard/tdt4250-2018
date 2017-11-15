/**
 */
package no.hal.pg.config;

import no.hal.pg.osm.GeoLocated;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.config.GameConfig#getTasks <em>Tasks</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getItems <em>Items</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getTaskProxies <em>Task Proxies</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getItemProxies <em>Item Proxies</em>}</li>
 *   <li>{@link no.hal.pg.config.GameConfig#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.config.ConfigPackage#getGameConfig()
 * @model
 * @generated
 */
public interface GameConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.TaskConfig}<code>&lt;?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskConfig<?>> getTasks();

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.PlayerRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlayerRole> getPlayers();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.ItemConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemConfig> getItems();

	/**
	 * Returns the value of the '<em><b>Task Proxies</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.config.TaskProxy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Proxies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Proxies</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_TaskProxies()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskProxy> getTaskProxies();

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
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_ItemProxies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemProxy> getItemProxies();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.osm.GeoLocated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see no.hal.pg.config.ConfigPackage#getGameConfig_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeoLocated> getLocations();

} // GameDef
