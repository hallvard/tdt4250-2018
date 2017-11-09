/**
 */
package no.hal.pg.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pg.config.ConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.config/model/config.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = no.hal.pg.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.GameConfigImpl <em>Game Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.GameConfigImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getGameConfig()
	 * @generated
	 */
	int GAME_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__PLAYERS = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__ITEMS = 2;

	/**
	 * The feature id for the '<em><b>Task Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__TASK_PROXIES = 3;

	/**
	 * The feature id for the '<em><b>Item Proxies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__ITEM_PROXIES = 4;

	/**
	 * The number of structural features of the '<em>Game Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Game Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.AbstractConfigImpl <em>Abstract Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.AbstractConfigImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getAbstractConfig()
	 * @generated
	 */
	int ABSTRACT_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONFIG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONFIG__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Abstract Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONFIG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.TaskConfigImpl <em>Task Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.TaskConfigImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getTaskConfig()
	 * @generated
	 */
	int TASK_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__NAME = ABSTRACT_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG__DESCRIPTION = ABSTRACT_CONFIG__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG_FEATURE_COUNT = ABSTRACT_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG___CREATE_TASK__TASKPROXY = ABSTRACT_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG_OPERATION_COUNT = ABSTRACT_CONFIG_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.ItemConfigImpl <em>Item Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.ItemConfigImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getItemConfig()
	 * @generated
	 */
	int ITEM_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONFIG__NAME = ABSTRACT_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONFIG__DESCRIPTION = ABSTRACT_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONFIG__LOCATION = ABSTRACT_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONFIG_FEATURE_COUNT = ABSTRACT_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONFIG___CREATE_ITEM__ITEMPROXY = ABSTRACT_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_CONFIG_OPERATION_COUNT = ABSTRACT_CONFIG_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.InfoItemConfigImpl <em>Info Item Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.InfoItemConfigImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getInfoItemConfig()
	 * @generated
	 */
	int INFO_ITEM_CONFIG = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_CONFIG__NAME = ITEM_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_CONFIG__DESCRIPTION = ITEM_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_CONFIG__LOCATION = ITEM_CONFIG__LOCATION;

	/**
	 * The number of structural features of the '<em>Info Item Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_CONFIG_FEATURE_COUNT = ITEM_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_CONFIG___CREATE_ITEM__ITEMPROXY = ITEM_CONFIG___CREATE_ITEM__ITEMPROXY;

	/**
	 * The number of operations of the '<em>Info Item Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_CONFIG_OPERATION_COUNT = ITEM_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.ProxyImpl <em>Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.ProxyImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getProxy()
	 * @generated
	 */
	int PROXY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY__REF = 2;

	/**
	 * The number of structural features of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.TaskProxyImpl <em>Task Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.TaskProxyImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getTaskProxy()
	 * @generated
	 */
	int TASK_PROXY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY__NAME = PROXY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY__DESCRIPTION = PROXY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY__REF = PROXY__REF;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY__PLAYERS = PROXY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reward Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY__REWARD_ITEMS = PROXY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requires Finished</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY__REQUIRES_FINISHED = PROXY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requires Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY__REQUIRES_ITEMS = PROXY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY_FEATURE_COUNT = PROXY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROXY_OPERATION_COUNT = PROXY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.PlayerRoleImpl <em>Player Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.PlayerRoleImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getPlayerRole()
	 * @generated
	 */
	int PLAYER_ROLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Player Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ROLE__PLAYER_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Player Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ROLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.ItemProxyImpl <em>Item Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.ItemProxyImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getItemProxy()
	 * @generated
	 */
	int ITEM_PROXY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROXY__NAME = PROXY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROXY__DESCRIPTION = PROXY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROXY__REF = PROXY__REF;

	/**
	 * The number of structural features of the '<em>Item Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROXY_FEATURE_COUNT = PROXY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_PROXY_OPERATION_COUNT = PROXY_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.GameConfig <em>Game Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Config</em>'.
	 * @see no.hal.pg.config.GameConfig
	 * @generated
	 */
	EClass getGameConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.config.GameConfig#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see no.hal.pg.config.GameConfig#getTasks()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.config.GameConfig#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.hal.pg.config.GameConfig#getPlayers()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_Players();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.config.GameConfig#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see no.hal.pg.config.GameConfig#getItems()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.config.GameConfig#getTaskProxies <em>Task Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Proxies</em>'.
	 * @see no.hal.pg.config.GameConfig#getTaskProxies()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_TaskProxies();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.config.GameConfig#getItemProxies <em>Item Proxies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Proxies</em>'.
	 * @see no.hal.pg.config.GameConfig#getItemProxies()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_ItemProxies();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.AbstractConfig <em>Abstract Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Config</em>'.
	 * @see no.hal.pg.config.AbstractConfig
	 * @generated
	 */
	EClass getAbstractConfig();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.config.AbstractConfig#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.config.AbstractConfig#getName()
	 * @see #getAbstractConfig()
	 * @generated
	 */
	EAttribute getAbstractConfig_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.config.AbstractConfig#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.hal.pg.config.AbstractConfig#getDescription()
	 * @see #getAbstractConfig()
	 * @generated
	 */
	EAttribute getAbstractConfig_Description();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.TaskConfig <em>Task Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Config</em>'.
	 * @see no.hal.pg.config.TaskConfig
	 * @generated
	 */
	EClass getTaskConfig();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.config.TaskConfig#createTask(no.hal.pg.config.TaskProxy) <em>Create Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Task</em>' operation.
	 * @see no.hal.pg.config.TaskConfig#createTask(no.hal.pg.config.TaskProxy)
	 * @generated
	 */
	EOperation getTaskConfig__CreateTask__TaskProxy();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.ItemConfig <em>Item Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Config</em>'.
	 * @see no.hal.pg.config.ItemConfig
	 * @generated
	 */
	EClass getItemConfig();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.config.ItemConfig#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see no.hal.pg.config.ItemConfig#getLocation()
	 * @see #getItemConfig()
	 * @generated
	 */
	EReference getItemConfig_Location();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.config.ItemConfig#createItem(no.hal.pg.config.ItemProxy) <em>Create Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Item</em>' operation.
	 * @see no.hal.pg.config.ItemConfig#createItem(no.hal.pg.config.ItemProxy)
	 * @generated
	 */
	EOperation getItemConfig__CreateItem__ItemProxy();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.InfoItemConfig <em>Info Item Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Item Config</em>'.
	 * @see no.hal.pg.config.InfoItemConfig
	 * @generated
	 */
	EClass getInfoItemConfig();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.Proxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy</em>'.
	 * @see no.hal.pg.config.Proxy
	 * @generated
	 */
	EClass getProxy();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.config.Proxy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.config.Proxy#getName()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.config.Proxy#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.hal.pg.config.Proxy#getDescription()
	 * @see #getProxy()
	 * @generated
	 */
	EAttribute getProxy_Description();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.config.Proxy#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see no.hal.pg.config.Proxy#getRef()
	 * @see #getProxy()
	 * @generated
	 */
	EReference getProxy_Ref();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.TaskProxy <em>Task Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Proxy</em>'.
	 * @see no.hal.pg.config.TaskProxy
	 * @generated
	 */
	EClass getTaskProxy();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.config.TaskProxy#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.pg.config.TaskProxy#getPlayers()
	 * @see #getTaskProxy()
	 * @generated
	 */
	EReference getTaskProxy_Players();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.config.TaskProxy#getRewardItems <em>Reward Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reward Items</em>'.
	 * @see no.hal.pg.config.TaskProxy#getRewardItems()
	 * @see #getTaskProxy()
	 * @generated
	 */
	EReference getTaskProxy_RewardItems();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.config.TaskProxy#getRequiresFinished <em>Requires Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires Finished</em>'.
	 * @see no.hal.pg.config.TaskProxy#getRequiresFinished()
	 * @see #getTaskProxy()
	 * @generated
	 */
	EReference getTaskProxy_RequiresFinished();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.config.TaskProxy#getRequiresItems <em>Requires Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requires Items</em>'.
	 * @see no.hal.pg.config.TaskProxy#getRequiresItems()
	 * @see #getTaskProxy()
	 * @generated
	 */
	EReference getTaskProxy_RequiresItems();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.PlayerRole <em>Player Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Role</em>'.
	 * @see no.hal.pg.config.PlayerRole
	 * @generated
	 */
	EClass getPlayerRole();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.config.PlayerRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.config.PlayerRole#getName()
	 * @see #getPlayerRole()
	 * @generated
	 */
	EAttribute getPlayerRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.config.PlayerRole#getPlayerCount <em>Player Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player Count</em>'.
	 * @see no.hal.pg.config.PlayerRole#getPlayerCount()
	 * @see #getPlayerRole()
	 * @generated
	 */
	EAttribute getPlayerRole_PlayerCount();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.ItemProxy <em>Item Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Proxy</em>'.
	 * @see no.hal.pg.config.ItemProxy
	 * @generated
	 */
	EClass getItemProxy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigFactory getConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.GameConfigImpl <em>Game Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.GameConfigImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getGameConfig()
		 * @generated
		 */
		EClass GAME_CONFIG = eINSTANCE.getGameConfig();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__TASKS = eINSTANCE.getGameConfig_Tasks();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__PLAYERS = eINSTANCE.getGameConfig_Players();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__ITEMS = eINSTANCE.getGameConfig_Items();

		/**
		 * The meta object literal for the '<em><b>Task Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__TASK_PROXIES = eINSTANCE.getGameConfig_TaskProxies();

		/**
		 * The meta object literal for the '<em><b>Item Proxies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__ITEM_PROXIES = eINSTANCE.getGameConfig_ItemProxies();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.AbstractConfigImpl <em>Abstract Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.AbstractConfigImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getAbstractConfig()
		 * @generated
		 */
		EClass ABSTRACT_CONFIG = eINSTANCE.getAbstractConfig();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONFIG__NAME = eINSTANCE.getAbstractConfig_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONFIG__DESCRIPTION = eINSTANCE.getAbstractConfig_Description();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.TaskConfigImpl <em>Task Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.TaskConfigImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getTaskConfig()
		 * @generated
		 */
		EClass TASK_CONFIG = eINSTANCE.getTaskConfig();

		/**
		 * The meta object literal for the '<em><b>Create Task</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_CONFIG___CREATE_TASK__TASKPROXY = eINSTANCE.getTaskConfig__CreateTask__TaskProxy();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.ItemConfigImpl <em>Item Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.ItemConfigImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getItemConfig()
		 * @generated
		 */
		EClass ITEM_CONFIG = eINSTANCE.getItemConfig();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_CONFIG__LOCATION = eINSTANCE.getItemConfig_Location();

		/**
		 * The meta object literal for the '<em><b>Create Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_CONFIG___CREATE_ITEM__ITEMPROXY = eINSTANCE.getItemConfig__CreateItem__ItemProxy();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.InfoItemConfigImpl <em>Info Item Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.InfoItemConfigImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getInfoItemConfig()
		 * @generated
		 */
		EClass INFO_ITEM_CONFIG = eINSTANCE.getInfoItemConfig();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.ProxyImpl <em>Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.ProxyImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getProxy()
		 * @generated
		 */
		EClass PROXY = eINSTANCE.getProxy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__NAME = eINSTANCE.getProxy_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY__DESCRIPTION = eINSTANCE.getProxy_Description();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROXY__REF = eINSTANCE.getProxy_Ref();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.TaskProxyImpl <em>Task Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.TaskProxyImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getTaskProxy()
		 * @generated
		 */
		EClass TASK_PROXY = eINSTANCE.getTaskProxy();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROXY__PLAYERS = eINSTANCE.getTaskProxy_Players();

		/**
		 * The meta object literal for the '<em><b>Reward Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROXY__REWARD_ITEMS = eINSTANCE.getTaskProxy_RewardItems();

		/**
		 * The meta object literal for the '<em><b>Requires Finished</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROXY__REQUIRES_FINISHED = eINSTANCE.getTaskProxy_RequiresFinished();

		/**
		 * The meta object literal for the '<em><b>Requires Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_PROXY__REQUIRES_ITEMS = eINSTANCE.getTaskProxy_RequiresItems();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.PlayerRoleImpl <em>Player Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.PlayerRoleImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getPlayerRole()
		 * @generated
		 */
		EClass PLAYER_ROLE = eINSTANCE.getPlayerRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_ROLE__NAME = eINSTANCE.getPlayerRole_Name();

		/**
		 * The meta object literal for the '<em><b>Player Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_ROLE__PLAYER_COUNT = eINSTANCE.getPlayerRole_PlayerCount();

		/**
		 * The meta object literal for the '{@link no.hal.pg.config.impl.ItemProxyImpl <em>Item Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.ItemProxyImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getItemProxy()
		 * @generated
		 */
		EClass ITEM_PROXY = eINSTANCE.getItemProxy();

	}

} //ModelPackage
