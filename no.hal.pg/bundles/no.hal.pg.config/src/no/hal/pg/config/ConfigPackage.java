/**
 */
package no.hal.pg.config;

import no.hal.pg.arc.ArcPackage;
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
	 * The meta object id for the '{@link no.hal.pg.config.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.ConfigImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ACTORS = ArcPackage.ARC__ACTORS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ROLES = ArcPackage.ARC__ROLES;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__GAMES = ArcPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = ArcPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = ArcPackage.ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.config.impl.GameConfigImpl <em>Game Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.config.impl.GameConfigImpl
	 * @see no.hal.pg.config.impl.ConfigPackageImpl#getGameConfig()
	 * @generated
	 */
	int GAME_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Task Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__TASK_REFS = 1;

	/**
	 * The feature id for the '<em><b>All Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__ALL_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG__PLAYERS = 3;

	/**
	 * The number of structural features of the '<em>Game Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Create Game</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG___CREATE_GAME = 0;

	/**
	 * The number of operations of the '<em>Game Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_CONFIG_OPERATION_COUNT = 1;

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
	 * The number of structural features of the '<em>Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG___CREATE_TASK = 0;

	/**
	 * The number of operations of the '<em>Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_CONFIG_OPERATION_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.config.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see no.hal.pg.config.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.config.Config#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see no.hal.pg.config.Config#getGames()
	 * @see #getConfig()
	 * @generated
	 */
	EReference getConfig_Games();

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
	 * Returns the meta object for the reference list '{@link no.hal.pg.config.GameConfig#getTaskRefs <em>Task Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Task Refs</em>'.
	 * @see no.hal.pg.config.GameConfig#getTaskRefs()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_TaskRefs();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.config.GameConfig#getAllTasks <em>All Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Tasks</em>'.
	 * @see no.hal.pg.config.GameConfig#getAllTasks()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_AllTasks();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.config.GameConfig#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.pg.config.GameConfig#getPlayers()
	 * @see #getGameConfig()
	 * @generated
	 */
	EReference getGameConfig_Players();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.config.GameConfig#createGame() <em>Create Game</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Game</em>' operation.
	 * @see no.hal.pg.config.GameConfig#createGame()
	 * @generated
	 */
	EOperation getGameConfig__CreateGame();

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
	 * Returns the meta object for the '{@link no.hal.pg.config.TaskConfig#createTask() <em>Create Task</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Task</em>' operation.
	 * @see no.hal.pg.config.TaskConfig#createTask()
	 * @generated
	 */
	EOperation getTaskConfig__CreateTask();

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
		 * The meta object literal for the '{@link no.hal.pg.config.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.config.impl.ConfigImpl
		 * @see no.hal.pg.config.impl.ConfigPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIG__GAMES = eINSTANCE.getConfig_Games();

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
		 * The meta object literal for the '<em><b>Task Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__TASK_REFS = eINSTANCE.getGameConfig_TaskRefs();

		/**
		 * The meta object literal for the '<em><b>All Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__ALL_TASKS = eINSTANCE.getGameConfig_AllTasks();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_CONFIG__PLAYERS = eINSTANCE.getGameConfig_Players();

		/**
		 * The meta object literal for the '<em><b>Create Game</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAME_CONFIG___CREATE_GAME = eINSTANCE.getGameConfig__CreateGame();

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
		EOperation TASK_CONFIG___CREATE_TASK = eINSTANCE.getTaskConfig__CreateTask();

	}

} //ModelPackage
