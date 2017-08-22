/**
 */
package no.hal.pg.runtime;

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
	 * The meta object id for the '{@link no.hal.pg.runtime.Players <em>Players</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Players
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayers()
	 * @generated
	 */
	int PLAYERS = 3;

	/**
	 * The number of structural features of the '<em>Players</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS___GET_ALL_PLAYERS = 0;

	/**
	 * The number of operations of the '<em>Players</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYERS_OPERATION_COUNT = 1;

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
	int GAME__PLAYERS = PLAYERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TEAMS = PLAYERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TASKS = PLAYERS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = PLAYERS_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME___GET_ALL_PLAYERS = PLAYERS___GET_ALL_PLAYERS;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = PLAYERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TeamImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 1;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GAME = PLAYERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = PLAYERS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = PLAYERS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM___GET_ALL_PLAYERS = PLAYERS___GET_ALL_PLAYERS;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = PLAYERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.PlayerImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Game</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GAME = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PERSON = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.TaskImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GAME = PLAYERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TEAM = PLAYERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PLAYERS = PLAYERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RESULT = PLAYERS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_TIME = PLAYERS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FINISH_TIME = PLAYERS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_CONDITIONS = PLAYERS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Finish Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FINISH_CONDITIONS = PLAYERS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = PLAYERS_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get All Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_ALL_PLAYERS = PLAYERS___GET_ALL_PLAYERS;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_START = PLAYERS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_STARTED = PLAYERS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___IS_FINISHED = PLAYERS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___START = PLAYERS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___FINISH__OBJECT = PLAYERS_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = PLAYERS_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.Condition <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.Condition
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 5;

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
	int ABSTRACT_CONDITION = 6;

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
	 * The number of operations of the '<em>Abstract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.CompositeConditionImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__LOGIC = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__PREDICATES = CONDITION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.IsTaskStartedImpl <em>Is Task Started</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.IsTaskStartedImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskStarted()
	 * @generated
	 */
	int IS_TASK_STARTED = 8;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED__CONTEXT = ABSTRACT_CONDITION__CONTEXT;

	/**
	 * The number of structural features of the '<em>Is Task Started</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED___TEST = ABSTRACT_CONDITION___TEST;

	/**
	 * The number of operations of the '<em>Is Task Started</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_STARTED_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.IsTaskFinishedImpl <em>Is Task Finished</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.IsTaskFinishedImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskFinished()
	 * @generated
	 */
	int IS_TASK_FINISHED = 9;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED__CONTEXT = ABSTRACT_CONDITION__CONTEXT;

	/**
	 * The number of structural features of the '<em>Is Task Finished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Test</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED___TEST = ABSTRACT_CONDITION___TEST;

	/**
	 * The number of operations of the '<em>Is Task Finished</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TASK_FINISHED_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.runtime.impl.RuntimeImpl <em>Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.runtime.impl.RuntimeImpl
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getRuntime()
	 * @generated
	 */
	int RUNTIME = 10;

	/**
	 * The feature id for the '<em><b>Games</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME__GAMES = 0;

	/**
	 * The number of structural features of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNTIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 11;


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
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Game#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see no.hal.pg.runtime.Game#getTeams()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Teams();

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
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see no.hal.pg.runtime.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.runtime.Team#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Team#getGame()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Game();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.hal.pg.runtime.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

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
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.Player#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Game</em>'.
	 * @see no.hal.pg.runtime.Player#getGame()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Game();

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
	 * Returns the meta object for class '{@link no.hal.pg.runtime.Players <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Players</em>'.
	 * @see no.hal.pg.runtime.Players
	 * @generated
	 */
	EClass getPlayers();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.runtime.Players#getAllPlayers() <em>Get All Players</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Players</em>' operation.
	 * @see no.hal.pg.runtime.Players#getAllPlayers()
	 * @generated
	 */
	EOperation getPlayers__GetAllPlayers();

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
	 * Returns the meta object for the reference '{@link no.hal.pg.runtime.Task#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see no.hal.pg.runtime.Task#getTeam()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Team();

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
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.runtime.CompositeCondition#getPredicates <em>Predicates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicates</em>'.
	 * @see no.hal.pg.runtime.CompositeCondition#getPredicates()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Predicates();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.IsTaskStarted <em>Is Task Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Task Started</em>'.
	 * @see no.hal.pg.runtime.IsTaskStarted
	 * @generated
	 */
	EClass getIsTaskStarted();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.runtime.IsTaskFinished <em>Is Task Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Task Finished</em>'.
	 * @see no.hal.pg.runtime.IsTaskFinished
	 * @generated
	 */
	EClass getIsTaskFinished();

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
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TEAMS = eINSTANCE.getGame_Teams();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TASKS = eINSTANCE.getGame_Tasks();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.TeamImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__GAME = eINSTANCE.getTeam_Game();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

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
		 * The meta object literal for the '<em><b>Game</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__GAME = eINSTANCE.getPlayer_Game();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__PERSON = eINSTANCE.getPlayer_Person();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.Players <em>Players</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.Players
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getPlayers()
		 * @generated
		 */
		EClass PLAYERS = eINSTANCE.getPlayers();

		/**
		 * The meta object literal for the '<em><b>Get All Players</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYERS___GET_ALL_PLAYERS = eINSTANCE.getPlayers__GetAllPlayers();

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
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TEAM = eINSTANCE.getTask_Team();

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
		 * The meta object literal for the '<em><b>Predicates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__PREDICATES = eINSTANCE.getCompositeCondition_Predicates();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.IsTaskStartedImpl <em>Is Task Started</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.IsTaskStartedImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskStarted()
		 * @generated
		 */
		EClass IS_TASK_STARTED = eINSTANCE.getIsTaskStarted();

		/**
		 * The meta object literal for the '{@link no.hal.pg.runtime.impl.IsTaskFinishedImpl <em>Is Task Finished</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.runtime.impl.IsTaskFinishedImpl
		 * @see no.hal.pg.runtime.impl.RuntimePackageImpl#getIsTaskFinished()
		 * @generated
		 */
		EClass IS_TASK_FINISHED = eINSTANCE.getIsTaskFinished();

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
