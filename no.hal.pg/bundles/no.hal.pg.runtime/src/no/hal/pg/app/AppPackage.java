/**
 */
package no.hal.pg.app;

import no.hal.pg.osm.OsmPackage;
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
 * @see no.hal.pg.app.AppFactory
 * @model kind="package"
 * @generated
 */
public interface AppPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "app";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.runtime/model/app.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppPackage eINSTANCE = no.hal.pg.app.impl.AppPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.ViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__USER = 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.View1Impl <em>View1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.View1Impl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView1()
	 * @generated
	 */
	int VIEW1 = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__USER = VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1__MODEL = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_FEATURE_COUNT = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW1_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.View2Impl <em>View2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.View2Impl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getView2()
	 * @generated
	 */
	int VIEW2 = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__USER = VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__MODEL1 = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2__MODEL2 = VIEW_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_FEATURE_COUNT = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW2_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GameViewImpl <em>Game View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GameViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGameView()
	 * @generated
	 */
	int GAME_VIEW = 3;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__USER = VIEW1__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__MODEL = VIEW1__MODEL;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__PLAYER = VIEW1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW__TASK_VIEWS = VIEW1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_FEATURE_COUNT = VIEW1_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_OPERATION_COUNT = VIEW1_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.AppImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getApp()
	 * @generated
	 */
	int APP = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__VIEWS = 1;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.GameAppImpl <em>Game App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.GameAppImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getGameApp()
	 * @generated
	 */
	int GAME_APP = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP__MODEL = APP__MODEL;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP__VIEWS = APP__VIEWS;

	/**
	 * The number of structural features of the '<em>Game App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP_FEATURE_COUNT = APP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_APP_OPERATION_COUNT = APP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.TaskViewImpl <em>Task View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.TaskViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getTaskView()
	 * @generated
	 */
	int TASK_VIEW = 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__USER = VIEW1__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__MODEL = VIEW1__MODEL;

	/**
	 * The feature id for the '<em><b>Game View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__GAME_VIEW = VIEW1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__DESCRIPTION = VIEW1_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__ENABLED = VIEW1_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__STARTED = VIEW1_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW__FINISHED = VIEW1_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW_FEATURE_COUNT = VIEW1_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW___START = VIEW1_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_VIEW_OPERATION_COUNT = VIEW1_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.AcceptTaskViewImpl <em>Accept Task View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.AcceptTaskViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getAcceptTaskView()
	 * @generated
	 */
	int ACCEPT_TASK_VIEW = 7;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW__USER = TASK_VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW__MODEL = TASK_VIEW__MODEL;

	/**
	 * The feature id for the '<em><b>Game View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW__GAME_VIEW = TASK_VIEW__GAME_VIEW;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW__DESCRIPTION = TASK_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW__ENABLED = TASK_VIEW__ENABLED;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW__STARTED = TASK_VIEW__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW__FINISHED = TASK_VIEW__FINISHED;

	/**
	 * The number of structural features of the '<em>Accept Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW_FEATURE_COUNT = TASK_VIEW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW___START = TASK_VIEW___START;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW___ACCEPT = TASK_VIEW_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accept Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_TASK_VIEW_OPERATION_COUNT = TASK_VIEW_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.MapViewImpl <em>Map View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.MapViewImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getMapView()
	 * @generated
	 */
	int MAP_VIEW = 8;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__LATITUDE = OsmPackage.GEO_LOCATION__LATITUDE;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__LONGITUDE = OsmPackage.GEO_LOCATION__LONGITUDE;

	/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__ZOOM = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW__MARKERS = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Map View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_FEATURE_COUNT = OsmPackage.GEO_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Lat Long</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW___GET_LAT_LONG = OsmPackage.GEO_LOCATION___GET_LAT_LONG;

	/**
	 * The operation id for the '<em>Navigate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW___NAVIGATE__FLOAT_FLOAT_INT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Map View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_VIEW_OPERATION_COUNT = OsmPackage.GEO_LOCATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.app.impl.MapMarkerImpl <em>Map Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.app.impl.MapMarkerImpl
	 * @see no.hal.pg.app.impl.AppPackageImpl#getMapMarker()
	 * @generated
	 */
	int MAP_MARKER = 9;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER__LATITUDE = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER__LONGITUDE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER__RADIUS = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER__COLOR = 4;

	/**
	 * The number of structural features of the '<em>Map Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Map Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_MARKER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see no.hal.pg.app.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see no.hal.pg.app.View#getUser()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_User();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View1 <em>View1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View1</em>'.
	 * @see no.hal.pg.app.View1
	 * @generated
	 */
	EClass getView1();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View1#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see no.hal.pg.app.View1#getModel()
	 * @see #getView1()
	 * @generated
	 */
	EReference getView1_Model();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.View2 <em>View2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View2</em>'.
	 * @see no.hal.pg.app.View2
	 * @generated
	 */
	EClass getView2();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View2#getModel1 <em>Model1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model1</em>'.
	 * @see no.hal.pg.app.View2#getModel1()
	 * @see #getView2()
	 * @generated
	 */
	EReference getView2_Model1();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.View2#getModel2 <em>Model2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model2</em>'.
	 * @see no.hal.pg.app.View2#getModel2()
	 * @see #getView2()
	 * @generated
	 */
	EReference getView2_Model2();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game View</em>'.
	 * @see no.hal.pg.app.GameView
	 * @generated
	 */
	EClass getGameView();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.GameView#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.hal.pg.app.GameView#getPlayer()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_Player();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.GameView#getTaskViews <em>Task Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Views</em>'.
	 * @see no.hal.pg.app.GameView#getTaskViews()
	 * @see #getGameView()
	 * @generated
	 */
	EReference getGameView_TaskViews();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see no.hal.pg.app.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.app.App#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see no.hal.pg.app.App#getModel()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.App#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see no.hal.pg.app.App#getViews()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Views();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.GameApp <em>Game App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game App</em>'.
	 * @see no.hal.pg.app.GameApp
	 * @generated
	 */
	EClass getGameApp();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.TaskView <em>Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task View</em>'.
	 * @see no.hal.pg.app.TaskView
	 * @generated
	 */
	EClass getTaskView();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.app.TaskView#getGameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game View</em>'.
	 * @see no.hal.pg.app.TaskView#getGameView()
	 * @see #getTaskView()
	 * @generated
	 */
	EReference getTaskView_GameView();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.hal.pg.app.TaskView#getDescription()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Description();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see no.hal.pg.app.TaskView#isEnabled()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see no.hal.pg.app.TaskView#isStarted()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Started();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.TaskView#isFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see no.hal.pg.app.TaskView#isFinished()
	 * @see #getTaskView()
	 * @generated
	 */
	EAttribute getTaskView_Finished();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.app.TaskView#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see no.hal.pg.app.TaskView#start()
	 * @generated
	 */
	EOperation getTaskView__Start();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.AcceptTaskView <em>Accept Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Task View</em>'.
	 * @see no.hal.pg.app.AcceptTaskView
	 * @generated
	 */
	EClass getAcceptTaskView();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.app.AcceptTaskView#accept() <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.pg.app.AcceptTaskView#accept()
	 * @generated
	 */
	EOperation getAcceptTaskView__Accept();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.MapView <em>Map View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map View</em>'.
	 * @see no.hal.pg.app.MapView
	 * @generated
	 */
	EClass getMapView();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapView#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom</em>'.
	 * @see no.hal.pg.app.MapView#getZoom()
	 * @see #getMapView()
	 * @generated
	 */
	EAttribute getMapView_Zoom();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.app.MapView#getMarkers <em>Markers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Markers</em>'.
	 * @see no.hal.pg.app.MapView#getMarkers()
	 * @see #getMapView()
	 * @generated
	 */
	EReference getMapView_Markers();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.app.MapView#navigate(float, float, int) <em>Navigate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Navigate</em>' operation.
	 * @see no.hal.pg.app.MapView#navigate(float, float, int)
	 * @generated
	 */
	EOperation getMapView__Navigate__float_float_int();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.app.MapMarker <em>Map Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Marker</em>'.
	 * @see no.hal.pg.app.MapMarker
	 * @generated
	 */
	EClass getMapMarker();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarker#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see no.hal.pg.app.MapMarker#getLatitude()
	 * @see #getMapMarker()
	 * @generated
	 */
	EAttribute getMapMarker_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarker#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see no.hal.pg.app.MapMarker#getLongitude()
	 * @see #getMapMarker()
	 * @generated
	 */
	EAttribute getMapMarker_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarker#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see no.hal.pg.app.MapMarker#getText()
	 * @see #getMapMarker()
	 * @generated
	 */
	EAttribute getMapMarker_Text();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarker#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see no.hal.pg.app.MapMarker#getRadius()
	 * @see #getMapMarker()
	 * @generated
	 */
	EAttribute getMapMarker_Radius();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.app.MapMarker#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see no.hal.pg.app.MapMarker#getColor()
	 * @see #getMapMarker()
	 * @generated
	 */
	EAttribute getMapMarker_Color();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppFactory getAppFactory();

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
		 * The meta object literal for the '{@link no.hal.pg.app.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.ViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__USER = eINSTANCE.getView_User();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.View1Impl <em>View1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.View1Impl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView1()
		 * @generated
		 */
		EClass VIEW1 = eINSTANCE.getView1();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW1__MODEL = eINSTANCE.getView1_Model();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.View2Impl <em>View2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.View2Impl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getView2()
		 * @generated
		 */
		EClass VIEW2 = eINSTANCE.getView2();

		/**
		 * The meta object literal for the '<em><b>Model1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW2__MODEL1 = eINSTANCE.getView2_Model1();

		/**
		 * The meta object literal for the '<em><b>Model2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW2__MODEL2 = eINSTANCE.getView2_Model2();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GameViewImpl <em>Game View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GameViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGameView()
		 * @generated
		 */
		EClass GAME_VIEW = eINSTANCE.getGameView();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__PLAYER = eINSTANCE.getGameView_Player();

		/**
		 * The meta object literal for the '<em><b>Task Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_VIEW__TASK_VIEWS = eINSTANCE.getGameView_TaskViews();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.AppImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__MODEL = eINSTANCE.getApp_Model();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__VIEWS = eINSTANCE.getApp_Views();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.GameAppImpl <em>Game App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.GameAppImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getGameApp()
		 * @generated
		 */
		EClass GAME_APP = eINSTANCE.getGameApp();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.TaskViewImpl <em>Task View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.TaskViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getTaskView()
		 * @generated
		 */
		EClass TASK_VIEW = eINSTANCE.getTaskView();

		/**
		 * The meta object literal for the '<em><b>Game View</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_VIEW__GAME_VIEW = eINSTANCE.getTaskView_GameView();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__DESCRIPTION = eINSTANCE.getTaskView_Description();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__ENABLED = eINSTANCE.getTaskView_Enabled();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__STARTED = eINSTANCE.getTaskView_Started();

		/**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_VIEW__FINISHED = eINSTANCE.getTaskView_Finished();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TASK_VIEW___START = eINSTANCE.getTaskView__Start();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.AcceptTaskViewImpl <em>Accept Task View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.AcceptTaskViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getAcceptTaskView()
		 * @generated
		 */
		EClass ACCEPT_TASK_VIEW = eINSTANCE.getAcceptTaskView();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCEPT_TASK_VIEW___ACCEPT = eINSTANCE.getAcceptTaskView__Accept();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.MapViewImpl <em>Map View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.MapViewImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getMapView()
		 * @generated
		 */
		EClass MAP_VIEW = eINSTANCE.getMapView();

		/**
		 * The meta object literal for the '<em><b>Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_VIEW__ZOOM = eINSTANCE.getMapView_Zoom();

		/**
		 * The meta object literal for the '<em><b>Markers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_VIEW__MARKERS = eINSTANCE.getMapView_Markers();

		/**
		 * The meta object literal for the '<em><b>Navigate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAP_VIEW___NAVIGATE__FLOAT_FLOAT_INT = eINSTANCE.getMapView__Navigate__float_float_int();

		/**
		 * The meta object literal for the '{@link no.hal.pg.app.impl.MapMarkerImpl <em>Map Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.app.impl.MapMarkerImpl
		 * @see no.hal.pg.app.impl.AppPackageImpl#getMapMarker()
		 * @generated
		 */
		EClass MAP_MARKER = eINSTANCE.getMapMarker();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER__LATITUDE = eINSTANCE.getMapMarker_Latitude();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER__LONGITUDE = eINSTANCE.getMapMarker_Longitude();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER__TEXT = eINSTANCE.getMapMarker_Text();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER__RADIUS = eINSTANCE.getMapMarker_Radius();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP_MARKER__COLOR = eINSTANCE.getMapMarker_Color();

	}

} //AppPackage
