/**
 */
package no.hal.pg.arc;

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
 * @see no.hal.pg.arc.ArcFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface ArcPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.arc/model/arc.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArcPackage eINSTANCE = no.hal.pg.arc.impl.ArcPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.ArcImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ACTORS = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__ROLES = 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.NamedImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.Capable <em>Capable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.Capable
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getCapable()
	 * @generated
	 */
	int CAPABLE = 2;

	/**
	 * The number of structural features of the '<em>Capable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABLE___HAS_CAPABILITY__CAPABILITY = 0;

	/**
	 * The number of operations of the '<em>Capable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.CapabilitiesImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getCapabilities()
	 * @generated
	 */
	int CAPABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES__CAPABILITIES = CAPABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_FEATURE_COUNT = CAPABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES___HAS_CAPABILITY__CAPABILITY = CAPABLE___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Capabilities</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_OPERATION_COUNT = CAPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.ActorImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CAPABILITIES = CAPABILITIES__CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = CAPABILITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROLES = CAPABILITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = CAPABILITIES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR___HAS_CAPABILITY__CAPABILITY = CAPABILITIES___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = CAPABILITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.PersonImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 5;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CAPABILITIES = ACTOR__CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = ACTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__GROUP = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDS = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON___HAS_CAPABILITY__CAPABILITY = ACTOR___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.GroupImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 6;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CAPABILITIES = ACTOR__CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ROLES = ACTOR__ROLES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBERS = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARENT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUPS = ACTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___HAS_CAPABILITY__CAPABILITY = ACTOR___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = ACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.RoleImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CAPABILITIES = CAPABILITIES__CAPABILITIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = CAPABILITIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inherits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INHERITS = CAPABILITIES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = CAPABILITIES_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___HAS_CAPABILITY__CAPABILITY = CAPABILITIES___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = CAPABILITIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.CapabilityImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 8;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = CAPABLE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY___HAS_CAPABILITY__CAPABILITY = CAPABLE___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = CAPABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.SimpleCapabilityImpl <em>Simple Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.SimpleCapabilityImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getSimpleCapability()
	 * @generated
	 */
	int SIMPLE_CAPABILITY = 9;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CAPABILITY__QUALIFIED_NAME = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CAPABILITY__SEGMENTS = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CAPABILITY___HAS_CAPABILITY__CAPABILITY = CAPABILITY___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Simple Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.arc.impl.ScopeCapabilityImpl <em>Scope Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.arc.impl.ScopeCapabilityImpl
	 * @see no.hal.pg.arc.impl.ArcPackageImpl#getScopeCapability()
	 * @generated
	 */
	int SCOPE_CAPABILITY = 10;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CAPABILITY__ELEMENTS = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scope Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CAPABILITY_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Has Capability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CAPABILITY___HAS_CAPABILITY__CAPABILITY = CAPABILITY___HAS_CAPABILITY__CAPABILITY;

	/**
	 * The number of operations of the '<em>Scope Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CAPABILITY_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see no.hal.pg.arc.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.arc.Arc#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see no.hal.pg.arc.Arc#getActors()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Actors();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.arc.Arc#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see no.hal.pg.arc.Arc#getRoles()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_Roles();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see no.hal.pg.arc.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.arc.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.arc.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Capable <em>Capable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capable</em>'.
	 * @see no.hal.pg.arc.Capable
	 * @generated
	 */
	EClass getCapable();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.arc.Capable#hasCapability(no.hal.pg.arc.Capability) <em>Has Capability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Capability</em>' operation.
	 * @see no.hal.pg.arc.Capable#hasCapability(no.hal.pg.arc.Capability)
	 * @generated
	 */
	EOperation getCapable__HasCapability__Capability();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Capabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities</em>'.
	 * @see no.hal.pg.arc.Capabilities
	 * @generated
	 */
	EClass getCapabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.arc.Capabilities#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see no.hal.pg.arc.Capabilities#getCapabilities()
	 * @see #getCapabilities()
	 * @generated
	 */
	EReference getCapabilities_Capabilities();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see no.hal.pg.arc.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.arc.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see no.hal.pg.arc.Actor#getRoles()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Roles();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see no.hal.pg.arc.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.arc.Person#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see no.hal.pg.arc.Person#getGroup()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Group();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.pg.arc.Person#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see no.hal.pg.arc.Person#getIds()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Ids();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see no.hal.pg.arc.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.arc.Group#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see no.hal.pg.arc.Group#getMembers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Members();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pg.arc.Group#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see no.hal.pg.arc.Group#getParent()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.arc.Group#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see no.hal.pg.arc.Group#getGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Groups();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see no.hal.pg.arc.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.arc.Role#getInherits <em>Inherits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherits</em>'.
	 * @see no.hal.pg.arc.Role#getInherits()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Inherits();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.arc.Role#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capabilities</em>'.
	 * @see no.hal.pg.arc.Role#getCapabilities()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Capabilities();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see no.hal.pg.arc.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.SimpleCapability <em>Simple Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Capability</em>'.
	 * @see no.hal.pg.arc.SimpleCapability
	 * @generated
	 */
	EClass getSimpleCapability();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.arc.SimpleCapability#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see no.hal.pg.arc.SimpleCapability#getQualifiedName()
	 * @see #getSimpleCapability()
	 * @generated
	 */
	EAttribute getSimpleCapability_QualifiedName();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.pg.arc.SimpleCapability#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segments</em>'.
	 * @see no.hal.pg.arc.SimpleCapability#getSegments()
	 * @see #getSimpleCapability()
	 * @generated
	 */
	EAttribute getSimpleCapability_Segments();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.arc.ScopeCapability <em>Scope Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Capability</em>'.
	 * @see no.hal.pg.arc.ScopeCapability
	 * @generated
	 */
	EClass getScopeCapability();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.arc.ScopeCapability#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see no.hal.pg.arc.ScopeCapability#getElements()
	 * @see #getScopeCapability()
	 * @generated
	 */
	EReference getScopeCapability_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArcFactory getArcFactory();

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
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.ArcImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__ACTORS = eINSTANCE.getArc_Actors();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__ROLES = eINSTANCE.getArc_Roles();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.NamedImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.Capable <em>Capable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.Capable
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getCapable()
		 * @generated
		 */
		EClass CAPABLE = eINSTANCE.getCapable();

		/**
		 * The meta object literal for the '<em><b>Has Capability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CAPABLE___HAS_CAPABILITY__CAPABILITY = eINSTANCE.getCapable__HasCapability__Capability();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.CapabilitiesImpl <em>Capabilities</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.CapabilitiesImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getCapabilities()
		 * @generated
		 */
		EClass CAPABILITIES = eINSTANCE.getCapabilities();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES__CAPABILITIES = eINSTANCE.getCapabilities_Capabilities();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.ActorImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ROLES = eINSTANCE.getActor_Roles();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.PersonImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__GROUP = eINSTANCE.getPerson_Group();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__IDS = eINSTANCE.getPerson_Ids();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.GroupImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MEMBERS = eINSTANCE.getGroup_Members();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PARENT = eINSTANCE.getGroup_Parent();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__GROUPS = eINSTANCE.getGroup_Groups();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.RoleImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Inherits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INHERITS = eINSTANCE.getRole_Inherits();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CAPABILITIES = eINSTANCE.getRole_Capabilities();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.CapabilityImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.SimpleCapabilityImpl <em>Simple Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.SimpleCapabilityImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getSimpleCapability()
		 * @generated
		 */
		EClass SIMPLE_CAPABILITY = eINSTANCE.getSimpleCapability();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CAPABILITY__QUALIFIED_NAME = eINSTANCE.getSimpleCapability_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CAPABILITY__SEGMENTS = eINSTANCE.getSimpleCapability_Segments();

		/**
		 * The meta object literal for the '{@link no.hal.pg.arc.impl.ScopeCapabilityImpl <em>Scope Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.arc.impl.ScopeCapabilityImpl
		 * @see no.hal.pg.arc.impl.ArcPackageImpl#getScopeCapability()
		 * @generated
		 */
		EClass SCOPE_CAPABILITY = eINSTANCE.getScopeCapability();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CAPABILITY__ELEMENTS = eINSTANCE.getScopeCapability_Elements();

	}

} //ArcPackage
