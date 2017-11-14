/**
 */
package no.hal.pg.runtime;

import no.hal.pg.arc.ArcPackage;
import no.hal.pg.osm.OsmPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see no.hal.pg.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.runtime/model/runtime.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = no.hal.pg.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.GameImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TASKS = 2;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.PlayerImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.ItemImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 3;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.InfoItemImpl <em>Info Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.InfoItemImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getInfoItem()
	 * @generated
	 */
	int INFO_ITEM = 4;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LATITUDE = OsmPackage.GEO_LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__LONGITUDE = OsmPackage.GEO_LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GAME = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NICKNAME = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PERSON = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ITEMS = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___GET_LAT_LONG = OsmPackage.GEO_LOCATION___GET_LAT_LONG;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.Described <em>Described</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Described
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getDescribed()
	 * @generated
	 */
	int DESCRIBED = 2;

	/**
	 * The number of structural features of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED___GET_DESCRIPTION = 0;

	/**
	 * The number of operations of the '<em>Described</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OWNER = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Own Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__OWN_LOCATION = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = OsmPackage.GEO_LOCATED_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_LAT_LONG = OsmPackage.GEO_LOCATED___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___GET_DESCRIPTION = OsmPackage.GEO_LOCATED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = OsmPackage.GEO_LOCATED_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM__OWNER = ITEM__OWNER;

	/**
	 * The feature id for the '<em><b>Own Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM__OWN_LOCATION = ITEM__OWN_LOCATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM__DESCRIPTION = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Info Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM___GET_LAT_LONG = ITEM___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM___GET_DESCRIPTION = ITEM___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Info Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TaskImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 5;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GAME = DESCRIBED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PLAYERS = DESCRIBED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESULT = DESCRIBED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_TIME = DESCRIBED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FINISH_TIME = DESCRIBED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Start Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_CONDITIONS = DESCRIBED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Finish Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FINISH_CONDITIONS = DESCRIBED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Start Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_ACTIONS = DESCRIBED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Finish Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FINISH_ACTIONS = DESCRIBED_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = DESCRIBED_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_DESCRIPTION = DESCRIBED___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_START = DESCRIBED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_STARTED = DESCRIBED_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_FINISHED = DESCRIBED_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___START = DESCRIBED_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___FINISH__OBJECT = DESCRIBED_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = DESCRIBED_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.ResettableTaskImpl <em>Resettable Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.ResettableTaskImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getResettableTask()
	 * @generated
	 */
	int RESETTABLE_TASK = 6;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__GAME = TASK__GAME;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__PLAYERS = TASK__PLAYERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__RESULT = TASK__RESULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__START_TIME = TASK__START_TIME;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__FINISH_TIME = TASK__FINISH_TIME;

	/**
	 * The feature id for the '<em><b>Start Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__START_CONDITIONS = TASK__START_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Finish Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__FINISH_CONDITIONS = TASK__FINISH_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Start Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__START_ACTIONS = TASK__START_ACTIONS;

	/**
	 * The feature id for the '<em><b>Finish Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK__FINISH_ACTIONS = TASK__FINISH_ACTIONS;

	/**
	 * The number of structural features of the '<em>Resettable Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK___GET_DESCRIPTION = TASK___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK___CAN_START = TASK___CAN_START;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK___IS_STARTED = TASK___IS_STARTED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK___IS_FINISHED = TASK___IS_FINISHED;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK___START = TASK___START;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK___FINISH__OBJECT = TASK___FINISH__OBJECT;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK___RESET = TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resettable Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESETTABLE_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.Condition <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Condition
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___TEST = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.AbstractConditionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getAbstractCondition()
	 * @generated
	 */
	int ABSTRACT_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION__CONTEXT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION___TEST = CONDITION___TEST;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION___TEST__OBJECT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.CompositeConditionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 9;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__LOGIC = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITIONS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION___TEST = CONDITION___TEST;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.IsTaskStartedConditionImpl <em>Is Task Started Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.IsTaskStartedConditionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskStartedCondition()
	 * @generated
	 */
	int IS_TASK_STARTED_CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED_CONDITION__CONTEXT = ABSTRACT_CONDITION__CONTEXT;

	/**
	 * The number of structural features of the '<em>Is Task Started Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED_CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED_CONDITION___TEST = ABSTRACT_CONDITION___TEST;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED_CONDITION___TEST__OBJECT = ABSTRACT_CONDITION___TEST__OBJECT;

	/**
	 * The number of operations of the '<em>Is Task Started Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED_CONDITION_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.IsTaskFinishedConditionImpl <em>Is Task Finished Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.IsTaskFinishedConditionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskFinishedCondition()
	 * @generated
	 */
	int IS_TASK_FINISHED_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED_CONDITION__CONTEXT = ABSTRACT_CONDITION__CONTEXT;

	/**
	 * The number of structural features of the '<em>Is Task Finished Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED_CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED_CONDITION___TEST = ABSTRACT_CONDITION___TEST;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED_CONDITION___TEST__OBJECT = ABSTRACT_CONDITION___TEST__OBJECT;

	/**
	 * The number of operations of the '<em>Is Task Finished Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED_CONDITION_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl <em>Is By Geo Location Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsByGeoLocationCondition()
	 * @generated
	 */
	int IS_BY_GEO_LOCATION_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION__CONTEXT = ABSTRACT_CONDITION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION__LOCATIONS = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contained Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS = ABSTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Target Distance Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION__LOWER_TARGET_DISTANCE_BOUND = ABSTRACT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Target Distance Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION__UPPER_TARGET_DISTANCE_BOUND = ABSTRACT_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION__LOGIC = ABSTRACT_CONDITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Is By Geo Location Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION___TEST = ABSTRACT_CONDITION___TEST;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION___TEST__OBJECT = ABSTRACT_CONDITION___TEST__OBJECT;

	/**
	 * The number of operations of the '<em>Is By Geo Location Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BY_GEO_LOCATION_CONDITION_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.PlayersHaveItemsConditionImpl <em>Players Have Items Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.PlayersHaveItemsConditionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayersHaveItemsCondition()
	 * @generated
	 */
	int PLAYERS_HAVE_ITEMS_CONDITION = 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_HAVE_ITEMS_CONDITION__CONTEXT = ABSTRACT_CONDITION__CONTEXT;

	/**
	 * The feature id for the '<em><b>Item Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_HAVE_ITEMS_CONDITION__ITEM_CLASSES = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Players Have Items Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_HAVE_ITEMS_CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_HAVE_ITEMS_CONDITION___TEST = ABSTRACT_CONDITION___TEST;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_HAVE_ITEMS_CONDITION___TEST__OBJECT = ABSTRACT_CONDITION___TEST__OBJECT;

	/**
	 * The number of operations of the '<em>Players Have Items Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_HAVE_ITEMS_CONDITION_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Action
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 14;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___PERFORM = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.CompositeActionImpl <em>Composite Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.CompositeActionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCompositeAction()
	 * @generated
	 */
	int COMPOSITE_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__ACTIONS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION___PERFORM = ACTION___PERFORM;

	/**
	 * The number of operations of the '<em>Composite Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.AbstractGiveItemsActionImpl <em>Abstract Give Items Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.AbstractGiveItemsActionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getAbstractGiveItemsAction()
	 * @generated
	 */
	int ABSTRACT_GIVE_ITEMS_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GIVE_ITEMS_ACTION__ITEMS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GIVE_ITEMS_ACTION__COPY = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Give Items Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GIVE_ITEMS_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GIVE_ITEMS_ACTION___PERFORM = ACTION___PERFORM;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GIVE_ITEMS_ACTION___PERFORM__PLAYER = ACTION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Give Items Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GIVE_ITEMS_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.GiveTaskPlayersItemsActionImpl <em>Give Task Players Items Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.GiveTaskPlayersItemsActionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getGiveTaskPlayersItemsAction()
	 * @generated
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION__ITEMS = ABSTRACT_GIVE_ITEMS_ACTION__ITEMS;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION__COPY = ABSTRACT_GIVE_ITEMS_ACTION__COPY;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION__TASK = ABSTRACT_GIVE_ITEMS_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Give Task Players Items Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION_FEATURE_COUNT = ABSTRACT_GIVE_ITEMS_ACTION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION___PERFORM = ABSTRACT_GIVE_ITEMS_ACTION___PERFORM;

	/**
	 * The operation id for the '<em>Perform</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION___PERFORM__PLAYER = ABSTRACT_GIVE_ITEMS_ACTION___PERFORM__PLAYER;

	/**
	 * The number of operations of the '<em>Give Task Players Items Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIVE_TASK_PLAYERS_ITEMS_ACTION_OPERATION_COUNT = ABSTRACT_GIVE_ITEMS_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.RuntimeImpl <em>Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.RuntimeImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getRuntime()
	 * @generated
	 */
	int RUNTIME = 18;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__ACTORS = ArcPackage.ARC__ACTORS;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__ROLES = ArcPackage.ARC__ROLES;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__GAMES = ArcPackage.ARC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FEATURE_COUNT = ArcPackage.ARC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OPERATION_COUNT = ArcPackage.ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>EURI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URI
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getEURI()
	 * @generated
	 */
	int EURI = 19;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 20;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.hal.pg.runtime.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Game#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see no.hal.pg.runtime.Game#getItems()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Items();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Game#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see no.hal.pg.runtime.Game#getTasks()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Tasks();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.hal.pg.runtime.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.Player#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Player#getGame()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Game();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.Player#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see no.hal.pg.runtime.Player#getNickname()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Nickname();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Player#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see no.hal.pg.runtime.Player#getItems()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Items();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described</em>'.
	 * @see no.hal.pg.runtime.Described
	 * @generated
	 */
	EClass getDescribed();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Described#getDescription() <em>Get Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Description</em>' operation.
	 * @see no.hal.pg.runtime.Described#getDescription()
	 * @generated
	 */
	EOperation getDescribed__GetDescription();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see no.hal.pg.runtime.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.Item#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see no.hal.pg.runtime.Item#getOwner()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Owner();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.runtime.Item#getOwnLocation <em>Own Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Own Location</em>'.
	 * @see no.hal.pg.runtime.Item#getOwnLocation()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_OwnLocation();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.InfoItem <em>Info Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Item</em>'.
	 * @see no.hal.pg.runtime.InfoItem
	 * @generated
	 */
	EClass getInfoItem();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.InfoItem#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.hal.pg.runtime.InfoItem#getDescription()
	 * @see #getInfoItem()
	 * @generated
	 */
	EAttribute getInfoItem_Description();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.Player#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see no.hal.pg.runtime.Player#getPerson()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Person();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.runtime.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see no.hal.pg.runtime.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.Task#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Task#getGame()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Game();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.Task#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.pg.runtime.Task#getPlayers()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Players();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.Task#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see no.hal.pg.runtime.Task#getResult()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Result();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.Task#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see no.hal.pg.runtime.Task#getStartTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.Task#getFinishTime <em>Finish Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish Time</em>'.
	 * @see no.hal.pg.runtime.Task#getFinishTime()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_FinishTime();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Task#getStartConditions <em>Start Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start Conditions</em>'.
	 * @see no.hal.pg.runtime.Task#getStartConditions()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_StartConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Task#getFinishConditions <em>Finish Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finish Conditions</em>'.
	 * @see no.hal.pg.runtime.Task#getFinishConditions()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_FinishConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Task#getStartActions <em>Start Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start Actions</em>'.
	 * @see no.hal.pg.runtime.Task#getStartActions()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_StartActions();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Task#getFinishActions <em>Finish Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finish Actions</em>'.
	 * @see no.hal.pg.runtime.Task#getFinishActions()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_FinishActions();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Task#canStart() <em>Can Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Start</em>' operation.
	 * @see no.hal.pg.runtime.Task#canStart()
	 * @generated
	 */
	EOperation getTask__CanStart();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Task#finish(java.lang.Object) <em>Finish</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Finish</em>' operation.
	 * @see no.hal.pg.runtime.Task#finish(java.lang.Object)
	 * @generated
	 */
	EOperation getTask__Finish__Object();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.ResettableTask <em>Resettable Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resettable Task</em>'.
	 * @see no.hal.pg.runtime.ResettableTask
	 * @generated
	 */
	EClass getResettableTask();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.ResettableTask#reset() <em>Reset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reset</em>' operation.
	 * @see no.hal.pg.runtime.ResettableTask#reset()
	 * @generated
	 */
	EOperation getResettableTask__Reset();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see no.hal.pg.runtime.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Condition#test() <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test</em>' operation.
	 * @see no.hal.pg.runtime.Condition#test()
	 * @generated
	 */
	EOperation getCondition__Test();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.AbstractCondition <em>Abstract Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Condition</em>'.
	 * @see no.hal.pg.runtime.AbstractCondition
	 * @generated
	 */
	EClass getAbstractCondition();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.AbstractCondition#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see no.hal.pg.runtime.AbstractCondition#getContext()
	 * @see #getAbstractCondition()
	 * @generated
	 */
	EReference getAbstractCondition_Context();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.AbstractCondition#test(java.lang.Object) <em>Test</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test</em>' operation.
	 * @see no.hal.pg.runtime.AbstractCondition#test(java.lang.Object)
	 * @generated
	 */
	EOperation getAbstractCondition__Test__Object();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see no.hal.pg.runtime.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.CompositeCondition#isLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic</em>'.
	 * @see no.hal.pg.runtime.CompositeCondition#isLogic()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_Logic();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.CompositeCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see no.hal.pg.runtime.CompositeCondition#getConditions()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Conditions();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.IsTaskStartedCondition <em>Is Task Started Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Task Started Condition</em>'.
	 * @see no.hal.pg.runtime.IsTaskStartedCondition
	 * @generated
	 */
	EClass getIsTaskStartedCondition();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.IsTaskFinishedCondition <em>Is Task Finished Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Task Finished Condition</em>'.
	 * @see no.hal.pg.runtime.IsTaskFinishedCondition
	 * @generated
	 */
	EClass getIsTaskFinishedCondition();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.IsByGeoLocationCondition <em>Is By Geo Location Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is By Geo Location Condition</em>'.
	 * @see no.hal.pg.runtime.IsByGeoLocationCondition
	 * @generated
	 */
	EClass getIsByGeoLocationCondition();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.IsByGeoLocationCondition#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Locations</em>'.
	 * @see no.hal.pg.runtime.IsByGeoLocationCondition#getLocations()
	 * @see #getIsByGeoLocationCondition()
	 * @generated
	 */
	EReference getIsByGeoLocationCondition_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.IsByGeoLocationCondition#getContainedLocations <em>Contained Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Locations</em>'.
	 * @see no.hal.pg.runtime.IsByGeoLocationCondition#getContainedLocations()
	 * @see #getIsByGeoLocationCondition()
	 * @generated
	 */
	EReference getIsByGeoLocationCondition_ContainedLocations();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.IsByGeoLocationCondition#getLowerTargetDistanceBound <em>Lower Target Distance Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Target Distance Bound</em>'.
	 * @see no.hal.pg.runtime.IsByGeoLocationCondition#getLowerTargetDistanceBound()
	 * @see #getIsByGeoLocationCondition()
	 * @generated
	 */
	EAttribute getIsByGeoLocationCondition_LowerTargetDistanceBound();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.IsByGeoLocationCondition#getUpperTargetDistanceBound <em>Upper Target Distance Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Target Distance Bound</em>'.
	 * @see no.hal.pg.runtime.IsByGeoLocationCondition#getUpperTargetDistanceBound()
	 * @see #getIsByGeoLocationCondition()
	 * @generated
	 */
	EAttribute getIsByGeoLocationCondition_UpperTargetDistanceBound();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.IsByGeoLocationCondition#isLogic <em>Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logic</em>'.
	 * @see no.hal.pg.runtime.IsByGeoLocationCondition#isLogic()
	 * @see #getIsByGeoLocationCondition()
	 * @generated
	 */
	EAttribute getIsByGeoLocationCondition_Logic();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.PlayersHaveItemsCondition <em>Players Have Items Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Players Have Items Condition</em>'.
	 * @see no.hal.pg.runtime.PlayersHaveItemsCondition
	 * @generated
	 */
	EClass getPlayersHaveItemsCondition();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.runtime.PlayersHaveItemsCondition#getItemClasses <em>Item Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item Classes</em>'.
	 * @see no.hal.pg.runtime.PlayersHaveItemsCondition#getItemClasses()
	 * @see #getPlayersHaveItemsCondition()
	 * @generated
	 */
	EReference getPlayersHaveItemsCondition_ItemClasses();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see no.hal.pg.runtime.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Action#perform() <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see no.hal.pg.runtime.Action#perform()
	 * @generated
	 */
	EOperation getAction__Perform();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.CompositeAction <em>Composite Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Action</em>'.
	 * @see no.hal.pg.runtime.CompositeAction
	 * @generated
	 */
	EClass getCompositeAction();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.CompositeAction#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see no.hal.pg.runtime.CompositeAction#getActions()
	 * @see #getCompositeAction()
	 * @generated
	 */
	EReference getCompositeAction_Actions();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.AbstractGiveItemsAction <em>Abstract Give Items Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Give Items Action</em>'.
	 * @see no.hal.pg.runtime.AbstractGiveItemsAction
	 * @generated
	 */
	EClass getAbstractGiveItemsAction();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.AbstractGiveItemsAction#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see no.hal.pg.runtime.AbstractGiveItemsAction#getItems()
	 * @see #getAbstractGiveItemsAction()
	 * @generated
	 */
	EReference getAbstractGiveItemsAction_Items();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.runtime.AbstractGiveItemsAction#isCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see no.hal.pg.runtime.AbstractGiveItemsAction#isCopy()
	 * @see #getAbstractGiveItemsAction()
	 * @generated
	 */
	EAttribute getAbstractGiveItemsAction_Copy();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.AbstractGiveItemsAction#perform(no.hal.pg.runtime.Player) <em>Perform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform</em>' operation.
	 * @see no.hal.pg.runtime.AbstractGiveItemsAction#perform(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getAbstractGiveItemsAction__Perform__Player();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.GiveTaskPlayersItemsAction <em>Give Task Players Items Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Give Task Players Items Action</em>'.
	 * @see no.hal.pg.runtime.GiveTaskPlayersItemsAction
	 * @generated
	 */
	EClass getGiveTaskPlayersItemsAction();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.GiveTaskPlayersItemsAction#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see no.hal.pg.runtime.GiveTaskPlayersItemsAction#getTask()
	 * @see #getGiveTaskPlayersItemsAction()
	 * @generated
	 */
	EReference getGiveTaskPlayersItemsAction_Task();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Runtime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runtime</em>'.
	 * @see no.hal.pg.runtime.Runtime
	 * @generated
	 */
	EClass getRuntime();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Runtime#getGames <em>Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Games</em>'.
	 * @see no.hal.pg.runtime.Runtime#getGames()
	 * @see #getRuntime()
	 * @generated
	 */
	EReference getRuntime_Games();

	/**
	 * Returns the meta object for data type '{@link java.net.URI <em>EURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EURI</em>'.
	 * @see java.net.URI
	 * @model instanceClass="java.net.URI"
	 * @generated
	 */
	EDataType getEURI();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Task#isStarted() <em>Is Started</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Started</em>' operation.
	 * @see no.hal.pg.runtime.Task#isStarted()
	 * @generated
	 */
	EOperation getTask__IsStarted();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Task#isFinished() <em>Is Finished</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Finished</em>' operation.
	 * @see no.hal.pg.runtime.Task#isFinished()
	 * @generated
	 */
	EOperation getTask__IsFinished();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Task#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see no.hal.pg.runtime.Task#start()
	 * @generated
	 */
	EOperation getTask__Start();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

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
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.GameImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__ITEMS = eINSTANCE.getGame_Items();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TASKS = eINSTANCE.getGame_Tasks();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.PlayerImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__GAME = eINSTANCE.getPlayer_Game();

		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NICKNAME = eINSTANCE.getPlayer_Nickname();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__ITEMS = eINSTANCE.getPlayer_Items();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.Described <em>Described</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.Described
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getDescribed()
		 * @generated
		 */
		EClass DESCRIBED = eINSTANCE.getDescribed();

		/**
		 * The meta object literal for the '<em><b>Get Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCRIBED___GET_DESCRIPTION = eINSTANCE.getDescribed__GetDescription();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.ItemImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__OWNER = eINSTANCE.getItem_Owner();

		/**
		 * The meta object literal for the '<em><b>Own Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__OWN_LOCATION = eINSTANCE.getItem_OwnLocation();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.InfoItemImpl <em>Info Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.InfoItemImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getInfoItem()
		 * @generated
		 */
		EClass INFO_ITEM = eINSTANCE.getInfoItem();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_ITEM__DESCRIPTION = eINSTANCE.getInfoItem_Description();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PERSON = eINSTANCE.getPlayer_Person();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.TaskImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__GAME = eINSTANCE.getTask_Game();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PLAYERS = eINSTANCE.getTask_Players();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RESULT = eINSTANCE.getTask_Result();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__START_TIME = eINSTANCE.getTask_StartTime();

		/**
		 * The meta object literal for the '<em><b>Finish Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__FINISH_TIME = eINSTANCE.getTask_FinishTime();

		/**
		 * The meta object literal for the '<em><b>Start Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__START_CONDITIONS = eINSTANCE.getTask_StartConditions();

		/**
		 * The meta object literal for the '<em><b>Finish Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FINISH_CONDITIONS = eINSTANCE.getTask_FinishConditions();

		/**
		 * The meta object literal for the '<em><b>Start Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__START_ACTIONS = eINSTANCE.getTask_StartActions();

		/**
		 * The meta object literal for the '<em><b>Finish Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FINISH_ACTIONS = eINSTANCE.getTask_FinishActions();

		/**
		 * The meta object literal for the '<em><b>Can Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___CAN_START = eINSTANCE.getTask__CanStart();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___FINISH__OBJECT = eINSTANCE.getTask__Finish__Object();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.ResettableTaskImpl <em>Resettable Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.ResettableTaskImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getResettableTask()
		 * @generated
		 */
		EClass RESETTABLE_TASK = eINSTANCE.getResettableTask();

		/**
		 * The meta object literal for the '<em><b>Reset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESETTABLE_TASK___RESET = eINSTANCE.getResettableTask__Reset();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.Condition <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.Condition
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___TEST = eINSTANCE.getCondition__Test();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.AbstractConditionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getAbstractCondition()
		 * @generated
		 */
		EClass ABSTRACT_CONDITION = eINSTANCE.getAbstractCondition();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONDITION__CONTEXT = eINSTANCE.getAbstractCondition_Context();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONDITION___TEST__OBJECT = eINSTANCE.getAbstractCondition__Test__Object();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.CompositeConditionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__LOGIC = eINSTANCE.getCompositeCondition_Logic();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__CONDITIONS = eINSTANCE.getCompositeCondition_Conditions();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.IsTaskStartedConditionImpl <em>Is Task Started Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.IsTaskStartedConditionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskStartedCondition()
		 * @generated
		 */
		EClass IS_TASK_STARTED_CONDITION = eINSTANCE.getIsTaskStartedCondition();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.IsTaskFinishedConditionImpl <em>Is Task Finished Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.IsTaskFinishedConditionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskFinishedCondition()
		 * @generated
		 */
		EClass IS_TASK_FINISHED_CONDITION = eINSTANCE.getIsTaskFinishedCondition();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl <em>Is By Geo Location Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsByGeoLocationCondition()
		 * @generated
		 */
		EClass IS_BY_GEO_LOCATION_CONDITION = eINSTANCE.getIsByGeoLocationCondition();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BY_GEO_LOCATION_CONDITION__LOCATIONS = eINSTANCE.getIsByGeoLocationCondition_Locations();

		/**
		 * The meta object literal for the '<em><b>Contained Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS = eINSTANCE.getIsByGeoLocationCondition_ContainedLocations();

		/**
		 * The meta object literal for the '<em><b>Lower Target Distance Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_BY_GEO_LOCATION_CONDITION__LOWER_TARGET_DISTANCE_BOUND = eINSTANCE.getIsByGeoLocationCondition_LowerTargetDistanceBound();

		/**
		 * The meta object literal for the '<em><b>Upper Target Distance Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_BY_GEO_LOCATION_CONDITION__UPPER_TARGET_DISTANCE_BOUND = eINSTANCE.getIsByGeoLocationCondition_UpperTargetDistanceBound();

		/**
		 * The meta object literal for the '<em><b>Logic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_BY_GEO_LOCATION_CONDITION__LOGIC = eINSTANCE.getIsByGeoLocationCondition_Logic();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.PlayersHaveItemsConditionImpl <em>Players Have Items Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.PlayersHaveItemsConditionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayersHaveItemsCondition()
		 * @generated
		 */
		EClass PLAYERS_HAVE_ITEMS_CONDITION = eINSTANCE.getPlayersHaveItemsCondition();

		/**
		 * The meta object literal for the '<em><b>Item Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYERS_HAVE_ITEMS_CONDITION__ITEM_CLASSES = eINSTANCE.getPlayersHaveItemsCondition_ItemClasses();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.Action
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___PERFORM = eINSTANCE.getAction__Perform();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.CompositeActionImpl <em>Composite Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.CompositeActionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCompositeAction()
		 * @generated
		 */
		EClass COMPOSITE_ACTION = eINSTANCE.getCompositeAction();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ACTION__ACTIONS = eINSTANCE.getCompositeAction_Actions();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.AbstractGiveItemsActionImpl <em>Abstract Give Items Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.AbstractGiveItemsActionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getAbstractGiveItemsAction()
		 * @generated
		 */
		EClass ABSTRACT_GIVE_ITEMS_ACTION = eINSTANCE.getAbstractGiveItemsAction();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_GIVE_ITEMS_ACTION__ITEMS = eINSTANCE.getAbstractGiveItemsAction_Items();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GIVE_ITEMS_ACTION__COPY = eINSTANCE.getAbstractGiveItemsAction_Copy();

		/**
		 * The meta object literal for the '<em><b>Perform</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_GIVE_ITEMS_ACTION___PERFORM__PLAYER = eINSTANCE.getAbstractGiveItemsAction__Perform__Player();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.GiveTaskPlayersItemsActionImpl <em>Give Task Players Items Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.GiveTaskPlayersItemsActionImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getGiveTaskPlayersItemsAction()
		 * @generated
		 */
		EClass GIVE_TASK_PLAYERS_ITEMS_ACTION = eINSTANCE.getGiveTaskPlayersItemsAction();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIVE_TASK_PLAYERS_ITEMS_ACTION__TASK = eINSTANCE.getGiveTaskPlayersItemsAction_Task();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.RuntimeImpl <em>Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.RuntimeImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getRuntime()
		 * @generated
		 */
		EClass RUNTIME = eINSTANCE.getRuntime();

		/**
		 * The meta object literal for the '<em><b>Games</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RUNTIME__GAMES = eINSTANCE.getRuntime_Games();

		/**
		 * The meta object literal for the '<em>EURI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URI
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getEURI()
		 * @generated
		 */
		EDataType EURI = eINSTANCE.getEURI();

		/**
		 * The meta object literal for the '<em><b>Is Started</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_STARTED = eINSTANCE.getTask__IsStarted();

		/**
		 * The meta object literal for the '<em><b>Is Finished</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___IS_FINISHED = eINSTANCE.getTask__IsFinished();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK___START = eINSTANCE.getTask__Start();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //RuntimePackage
