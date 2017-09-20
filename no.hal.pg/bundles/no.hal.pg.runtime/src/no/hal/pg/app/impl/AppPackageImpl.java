/**
 */
package no.hal.pg.app.impl;

import no.hal.pg.app.AppFactory;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GameView;
import no.hal.pg.app.TaskView;
import no.hal.pg.app.View;
import no.hal.pg.app.View1;
import no.hal.pg.app.View2;

import no.hal.pg.arc.ArcPackage;

import no.hal.pg.osm.OsmPackage;

import no.hal.pg.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppPackageImpl extends EPackageImpl implements AppPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass view1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass view2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskViewEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.pg.app.AppPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AppPackageImpl() {
		super(eNS_URI, AppFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AppPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AppPackage init() {
		if (isInited) return (AppPackage)EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Obtain or create and register package
		AppPackageImpl theAppPackage = (AppPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AppPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AppPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArcPackage.eINSTANCE.eClass();
		OsmPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAppPackage.createPackageContents();

		// Initialize created meta-data
		theAppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAppPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AppPackage.eNS_URI, theAppPackage);
		return theAppPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView() {
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_User() {
		return (EReference)viewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView1() {
		return view1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView1_Model() {
		return (EReference)view1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView2() {
		return view2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView2_Model1() {
		return (EReference)view2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView2_Model2() {
		return (EReference)view2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameView() {
		return gameViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameView_Player() {
		return (EReference)gameViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameView_TaskViews() {
		return (EReference)gameViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGameView__CreateTaskView__Task() {
		return gameViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskView() {
		return taskViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskView_GameView() {
		return (EReference)taskViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppFactory getAppFactory() {
		return (AppFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		viewEClass = createEClass(VIEW);
		createEReference(viewEClass, VIEW__USER);

		view1EClass = createEClass(VIEW1);
		createEReference(view1EClass, VIEW1__MODEL);

		view2EClass = createEClass(VIEW2);
		createEReference(view2EClass, VIEW2__MODEL1);
		createEReference(view2EClass, VIEW2__MODEL2);

		gameViewEClass = createEClass(GAME_VIEW);
		createEReference(gameViewEClass, GAME_VIEW__PLAYER);
		createEReference(gameViewEClass, GAME_VIEW__TASK_VIEWS);
		createEOperation(gameViewEClass, GAME_VIEW___CREATE_TASK_VIEW__TASK);

		taskViewEClass = createEClass(TASK_VIEW);
		createEReference(taskViewEClass, TASK_VIEW__GAME_VIEW);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters
		ETypeParameter viewEClass_U = addETypeParameter(viewEClass, "U");
		ETypeParameter view1EClass_U = addETypeParameter(view1EClass, "U");
		ETypeParameter view1EClass_M = addETypeParameter(view1EClass, "M");
		ETypeParameter view2EClass_U = addETypeParameter(view2EClass, "U");
		ETypeParameter view2EClass_M1 = addETypeParameter(view2EClass, "M1");
		ETypeParameter view2EClass_M2 = addETypeParameter(view2EClass, "M2");
		ETypeParameter gameViewEClass_T = addETypeParameter(gameViewEClass, "T");
		ETypeParameter taskViewEClass_T = addETypeParameter(taskViewEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theRuntimePackage.getTask());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		gameViewEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(theRuntimePackage.getTask());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		taskViewEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(view1EClass_U);
		g1.getETypeArguments().add(g2);
		view1EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView());
		g2 = createEGenericType(view2EClass_U);
		g1.getETypeArguments().add(g2);
		view2EClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView1());
		g2 = createEGenericType(theRuntimePackage.getPlayer());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theRuntimePackage.getGame());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(gameViewEClass_T);
		g2.getETypeArguments().add(g3);
		gameViewEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getView1());
		g2 = createEGenericType(theRuntimePackage.getPlayer());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(taskViewEClass_T);
		g1.getETypeArguments().add(g2);
		taskViewEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(viewEClass, View.class, "View", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(viewEClass_U);
		initEReference(getView_User(), g1, null, "user", null, 1, 1, View.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(view1EClass, View1.class, "View1", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(view1EClass_M);
		initEReference(getView1_Model(), g1, null, "model", null, 1, 1, View1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(view2EClass, View2.class, "View2", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(view2EClass_M1);
		initEReference(getView2_Model1(), g1, null, "model1", null, 1, 1, View2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(view2EClass_M2);
		initEReference(getView2_Model2(), g1, null, "model2", null, 1, 1, View2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameViewEClass, GameView.class, "GameView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGameView_Player(), theRuntimePackage.getPlayer(), null, "player", null, 0, 1, GameView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getTaskView());
		g2 = createEGenericType(gameViewEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getGameView_TaskViews(), g1, this.getTaskView_GameView(), "taskViews", null, 0, -1, GameView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGameView__CreateTaskView__Task(), null, "createTaskView", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(gameViewEClass_T);
		addEParameter(op, g1, "task", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getTaskView());
		g2 = createEGenericType(gameViewEClass_T);
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(taskViewEClass, TaskView.class, "TaskView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getGameView());
		g2 = createEGenericType(taskViewEClass_T);
		g1.getETypeArguments().add(g2);
		initEReference(getTaskView_GameView(), g1, this.getGameView_TaskViews(), "gameView", null, 0, 1, TaskView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AppPackageImpl
