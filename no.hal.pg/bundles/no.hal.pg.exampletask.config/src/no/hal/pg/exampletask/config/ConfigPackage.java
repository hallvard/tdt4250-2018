/**
 */
package no.hal.pg.exampletask.config;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see no.hal.pg.exampletask.config.ConfigFactory
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
	String eNS_URI = "platform:/plugin/no.hal.pg.exampletask.config/model/exampletask-config.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exampletask-config";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigPackage eINSTANCE = no.hal.pg.exampletask.config.impl.ConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.exampletask.config.impl.ExampleTaskConfigImpl <em>Example Task Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.exampletask.config.impl.ExampleTaskConfigImpl
	 * @see no.hal.pg.exampletask.config.impl.ConfigPackageImpl#getExampleTaskConfig()
	 * @generated
	 */
	int EXAMPLE_TASK_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_CONFIG__NAME = no.hal.pg.config.ConfigPackage.TASK_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_CONFIG__DESCRIPTION = no.hal.pg.config.ConfigPackage.TASK_CONFIG__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_CONFIG__QUESTION = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correct Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_CONFIG__CORRECT_ANSWER = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Example Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_CONFIG_FEATURE_COUNT = no.hal.pg.config.ConfigPackage.TASK_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Task</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_CONFIG___CREATE_TASK__TASKPROXY = no.hal.pg.config.ConfigPackage.TASK_CONFIG___CREATE_TASK__TASKPROXY;

	/**
	 * The number of operations of the '<em>Example Task Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_CONFIG_OPERATION_COUNT = no.hal.pg.config.ConfigPackage.TASK_CONFIG_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.exampletask.config.ExampleTaskConfig <em>Example Task Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Task Config</em>'.
	 * @see no.hal.pg.exampletask.config.ExampleTaskConfig
	 * @generated
	 */
	EClass getExampleTaskConfig();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.exampletask.config.ExampleTaskConfig#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.pg.exampletask.config.ExampleTaskConfig#getQuestion()
	 * @see #getExampleTaskConfig()
	 * @generated
	 */
	EAttribute getExampleTaskConfig_Question();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.exampletask.config.ExampleTaskConfig#isCorrectAnswer <em>Correct Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct Answer</em>'.
	 * @see no.hal.pg.exampletask.config.ExampleTaskConfig#isCorrectAnswer()
	 * @see #getExampleTaskConfig()
	 * @generated
	 */
	EAttribute getExampleTaskConfig_CorrectAnswer();

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
		 * The meta object literal for the '{@link no.hal.pg.exampletask.config.impl.ExampleTaskConfigImpl <em>Example Task Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.exampletask.config.impl.ExampleTaskConfigImpl
		 * @see no.hal.pg.exampletask.config.impl.ConfigPackageImpl#getExampleTaskConfig()
		 * @generated
		 */
		EClass EXAMPLE_TASK_CONFIG = eINSTANCE.getExampleTaskConfig();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TASK_CONFIG__QUESTION = eINSTANCE.getExampleTaskConfig_Question();

		/**
		 * The meta object literal for the '<em><b>Correct Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TASK_CONFIG__CORRECT_ANSWER = eINSTANCE.getExampleTaskConfig_CorrectAnswer();

	}

} //ConfigPackage
