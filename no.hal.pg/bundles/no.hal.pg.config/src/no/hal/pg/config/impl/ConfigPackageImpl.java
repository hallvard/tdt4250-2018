/**
 */
package no.hal.pg.config.impl;

import no.hal.pg.arc.ArcPackage;
import no.hal.pg.config.AbstractConfig;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import no.hal.pg.config.GameConfig;
import no.hal.pg.config.InfoItemConfig;
import no.hal.pg.config.ItemConfig;
import no.hal.pg.config.ItemProxy;
import no.hal.pg.config.PlayerRole;
import no.hal.pg.config.Proxy;
import no.hal.pg.config.TaskConfig;
import no.hal.pg.config.ConfigFactory;
import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.TaskProxy;
import no.hal.pg.osm.OsmPackage;
import no.hal.pg.runtime.RuntimePackage;
import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigPackageImpl extends EPackageImpl implements ConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoItemConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskProxyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemProxyEClass = null;

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
	 * @see no.hal.pg.config.ConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigPackageImpl() {
		super(eNS_URI, ConfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigPackage init() {
		if (isInited) return (ConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigPackage.eNS_URI);

		// Obtain or create and register package
		ConfigPackageImpl theConfigPackage = (ConfigPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArcPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		OsmPackage.eINSTANCE.eClass();
		RuntimePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theConfigPackage.createPackageContents();

		// Initialize created meta-data
		theConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigPackage.eNS_URI, theConfigPackage);
		return theConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGameConfig() {
		return gameConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameConfig_Tasks() {
		return (EReference)gameConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameConfig_Players() {
		return (EReference)gameConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameConfig_Items() {
		return (EReference)gameConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameConfig_TaskProxies() {
		return (EReference)gameConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGameConfig_ItemProxies() {
		return (EReference)gameConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConfig() {
		return abstractConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConfig_Name() {
		return (EAttribute)abstractConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConfig_Description() {
		return (EAttribute)abstractConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskConfig() {
		return taskConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTaskConfig__CreateTask__TaskProxy() {
		return taskConfigEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemConfig() {
		return itemConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemConfig_Location() {
		return (EReference)itemConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemConfig__CreateItem__ItemProxy() {
		return itemConfigEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoItemConfig() {
		return infoItemConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxy() {
		return proxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxy_Name() {
		return (EAttribute)proxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxy_Description() {
		return (EAttribute)proxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProxy_Ref() {
		return (EReference)proxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskProxy() {
		return taskProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskProxy_Players() {
		return (EReference)taskProxyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskProxy_RewardItems() {
		return (EReference)taskProxyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskProxy_RequiresFinished() {
		return (EReference)taskProxyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskProxy_RequiresItems() {
		return (EReference)taskProxyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayerRole() {
		return playerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerRole_Name() {
		return (EAttribute)playerRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayerRole_PlayerCount() {
		return (EAttribute)playerRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemProxy() {
		return itemProxyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFactory getConfigFactory() {
		return (ConfigFactory)getEFactoryInstance();
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
		gameConfigEClass = createEClass(GAME_CONFIG);
		createEReference(gameConfigEClass, GAME_CONFIG__TASKS);
		createEReference(gameConfigEClass, GAME_CONFIG__PLAYERS);
		createEReference(gameConfigEClass, GAME_CONFIG__ITEMS);
		createEReference(gameConfigEClass, GAME_CONFIG__TASK_PROXIES);
		createEReference(gameConfigEClass, GAME_CONFIG__ITEM_PROXIES);

		abstractConfigEClass = createEClass(ABSTRACT_CONFIG);
		createEAttribute(abstractConfigEClass, ABSTRACT_CONFIG__NAME);
		createEAttribute(abstractConfigEClass, ABSTRACT_CONFIG__DESCRIPTION);

		taskConfigEClass = createEClass(TASK_CONFIG);
		createEOperation(taskConfigEClass, TASK_CONFIG___CREATE_TASK__TASKPROXY);

		itemConfigEClass = createEClass(ITEM_CONFIG);
		createEReference(itemConfigEClass, ITEM_CONFIG__LOCATION);
		createEOperation(itemConfigEClass, ITEM_CONFIG___CREATE_ITEM__ITEMPROXY);

		infoItemConfigEClass = createEClass(INFO_ITEM_CONFIG);

		proxyEClass = createEClass(PROXY);
		createEAttribute(proxyEClass, PROXY__NAME);
		createEAttribute(proxyEClass, PROXY__DESCRIPTION);
		createEReference(proxyEClass, PROXY__REF);

		taskProxyEClass = createEClass(TASK_PROXY);
		createEReference(taskProxyEClass, TASK_PROXY__PLAYERS);
		createEReference(taskProxyEClass, TASK_PROXY__REWARD_ITEMS);
		createEReference(taskProxyEClass, TASK_PROXY__REQUIRES_FINISHED);
		createEReference(taskProxyEClass, TASK_PROXY__REQUIRES_ITEMS);

		playerRoleEClass = createEClass(PLAYER_ROLE);
		createEAttribute(playerRoleEClass, PLAYER_ROLE__NAME);
		createEAttribute(playerRoleEClass, PLAYER_ROLE__PLAYER_COUNT);

		itemProxyEClass = createEClass(ITEM_PROXY);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);
		OsmPackage theOsmPackage = (OsmPackage)EPackage.Registry.INSTANCE.getEPackage(OsmPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(abstractConfigEClass, "T");
		ETypeParameter taskConfigEClass_T = addETypeParameter(taskConfigEClass, "T");
		ETypeParameter proxyEClass_T = addETypeParameter(proxyEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(theRuntimePackage.getTask());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		taskConfigEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getAbstractConfig());
		g2 = createEGenericType(taskConfigEClass_T);
		g1.getETypeArguments().add(g2);
		taskConfigEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractConfig());
		g2 = createEGenericType(theRuntimePackage.getItem());
		g1.getETypeArguments().add(g2);
		itemConfigEClass.getEGenericSuperTypes().add(g1);
		infoItemConfigEClass.getESuperTypes().add(this.getItemConfig());
		g1 = createEGenericType(this.getProxy());
		g2 = createEGenericType(this.getTaskConfig());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theRuntimePackage.getTask());
		g2.getETypeArguments().add(g3);
		EGenericType g4 = createEGenericType();
		g3.getETypeArguments().add(g4);
		taskProxyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getProxy());
		g2 = createEGenericType(this.getItemConfig());
		g1.getETypeArguments().add(g2);
		itemProxyEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(gameConfigEClass, GameConfig.class, "GameConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getTaskConfig());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getGameConfig_Tasks(), g1, null, "tasks", null, 0, -1, GameConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameConfig_Players(), this.getPlayerRole(), null, "players", null, 0, -1, GameConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameConfig_Items(), this.getItemConfig(), null, "items", null, 0, -1, GameConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameConfig_TaskProxies(), this.getTaskProxy(), null, "taskProxies", null, 0, -1, GameConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameConfig_ItemProxies(), this.getItemProxy(), null, "itemProxies", null, 0, -1, GameConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConfigEClass, AbstractConfig.class, "AbstractConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractConfig_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AbstractConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConfig_Description(), theEcorePackage.getEString(), "description", null, 0, 1, AbstractConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskConfigEClass, TaskConfig.class, "TaskConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getTaskConfig__CreateTask__TaskProxy(), null, "createTask", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTaskProxy(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(taskConfigEClass_T);
		initEOperation(op, g1);

		initEClass(itemConfigEClass, ItemConfig.class, "ItemConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemConfig_Location(), theOsmPackage.getGeoLocated(), null, "location", null, 0, 1, ItemConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getItemConfig__CreateItem__ItemProxy(), theRuntimePackage.getItem(), "createItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getItemProxy(), "proxy", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(infoItemConfigEClass, InfoItemConfig.class, "InfoItemConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(proxyEClass, Proxy.class, "Proxy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProxy_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxy_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(proxyEClass_T);
		initEReference(getProxy_Ref(), g1, null, "ref", null, 0, 1, Proxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskProxyEClass, TaskProxy.class, "TaskProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskProxy_Players(), this.getPlayerRole(), null, "players", null, 0, -1, TaskProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskProxy_RewardItems(), this.getItemProxy(), null, "rewardItems", null, 0, -1, TaskProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskProxy_RequiresFinished(), this.getTaskProxy(), null, "requiresFinished", null, 0, -1, TaskProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskProxy_RequiresItems(), this.getItemProxy(), null, "requiresItems", null, 0, -1, TaskProxy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerRoleEClass, PlayerRole.class, "PlayerRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerRole_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PlayerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerRole_PlayerCount(), theEcorePackage.getEInt(), "playerCount", null, 0, 1, PlayerRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemProxyEClass, ItemProxy.class, "ItemProxy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
