/**
 */
package no.hal.pg.exampletask.runtime;

import no.hal.pg.app.AppPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see no.hal.pg.exampletask.runtime.RuntimeFactory
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
	String eNS_URI = "platform:/plugin/no.hal.pg.exampletask.runtime/model/exampletask.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exampletask-runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = no.hal.pg.exampletask.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskImpl <em>Example Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.exampletask.runtime.impl.ExampleTaskImpl
	 * @see no.hal.pg.exampletask.runtime.impl.RuntimePackageImpl#getExampleTask()
	 * @generated
	 */
	int EXAMPLE_TASK = 0;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__GAME = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__GAME;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__PLAYERS = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__PLAYERS;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__RESULT = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__RESULT;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__START_TIME = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__START_TIME;

	/**
	 * The feature id for the '<em><b>Finish Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__FINISH_TIME = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__FINISH_TIME;

	/**
	 * The feature id for the '<em><b>Start Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__START_CONDITIONS = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__START_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Finish Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__FINISH_CONDITIONS = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__FINISH_CONDITIONS;

	/**
	 * The feature id for the '<em><b>Start Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__START_ACTIONS = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__START_ACTIONS;

	/**
	 * The feature id for the '<em><b>Finish Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__FINISH_ACTIONS = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK__FINISH_ACTIONS;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__QUESTION = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correct Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__CORRECT_ANSWER = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Answered Correctly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK__ANSWERED_CORRECTLY = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Example Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___GET_DESCRIPTION = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK___GET_DESCRIPTION;

	/**
	 * The operation id for the '<em>Can Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___CAN_START = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK___CAN_START;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___IS_STARTED = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK___IS_STARTED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___IS_FINISHED = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK___IS_FINISHED;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___START = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK___START;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___FINISH__OBJECT = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK___FINISH__OBJECT;

	/**
	 * The operation id for the '<em>Reset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___RESET = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK___RESET;

	/**
	 * The operation id for the '<em>Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK___ANSWER__BOOLEAN = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Example Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.RESETTABLE_TASK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskViewImpl <em>Example Task View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.exampletask.runtime.impl.ExampleTaskViewImpl
	 * @see no.hal.pg.exampletask.runtime.impl.RuntimePackageImpl#getExampleTaskView()
	 * @generated
	 */
	int EXAMPLE_TASK_VIEW = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__USER = AppPackage.TASK_VIEW__USER;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__MODEL = AppPackage.TASK_VIEW__MODEL;

	/**
	 * The feature id for the '<em><b>Game View</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__GAME_VIEW = AppPackage.TASK_VIEW__GAME_VIEW;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__DESCRIPTION = AppPackage.TASK_VIEW__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__ENABLED = AppPackage.TASK_VIEW__ENABLED;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__STARTED = AppPackage.TASK_VIEW__STARTED;

	/**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__FINISHED = AppPackage.TASK_VIEW__FINISHED;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW__QUESTION = AppPackage.TASK_VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Example Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW_FEATURE_COUNT = AppPackage.TASK_VIEW_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW___START = AppPackage.TASK_VIEW___START;

	/**
	 * The operation id for the '<em>Propose Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW___PROPOSE_ANSWER__BOOLEAN = AppPackage.TASK_VIEW_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Example Task View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TASK_VIEW_OPERATION_COUNT = AppPackage.TASK_VIEW_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link no.hal.pg.exampletask.runtime.ExampleTask <em>Example Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Task</em>'.
	 * @see no.hal.pg.exampletask.runtime.ExampleTask
	 * @generated
	 */
	EClass getExampleTask();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.exampletask.runtime.ExampleTask#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.pg.exampletask.runtime.ExampleTask#getQuestion()
	 * @see #getExampleTask()
	 * @generated
	 */
	EAttribute getExampleTask_Question();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.exampletask.runtime.ExampleTask#isCorrectAnswer <em>Correct Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct Answer</em>'.
	 * @see no.hal.pg.exampletask.runtime.ExampleTask#isCorrectAnswer()
	 * @see #getExampleTask()
	 * @generated
	 */
	EAttribute getExampleTask_CorrectAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.exampletask.runtime.ExampleTask#isAnsweredCorrectly <em>Answered Correctly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answered Correctly</em>'.
	 * @see no.hal.pg.exampletask.runtime.ExampleTask#isAnsweredCorrectly()
	 * @see #getExampleTask()
	 * @generated
	 */
	EAttribute getExampleTask_AnsweredCorrectly();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.exampletask.runtime.ExampleTask#answer(boolean) <em>Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Answer</em>' operation.
	 * @see no.hal.pg.exampletask.runtime.ExampleTask#answer(boolean)
	 * @generated
	 */
	EOperation getExampleTask__Answer__boolean();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.exampletask.runtime.ExampleTaskView <em>Example Task View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Task View</em>'.
	 * @see no.hal.pg.exampletask.runtime.ExampleTaskView
	 * @generated
	 */
	EClass getExampleTaskView();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.exampletask.runtime.ExampleTaskView#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.pg.exampletask.runtime.ExampleTaskView#getQuestion()
	 * @see #getExampleTaskView()
	 * @generated
	 */
	EAttribute getExampleTaskView_Question();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.exampletask.runtime.ExampleTaskView#proposeAnswer(boolean) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Answer</em>' operation.
	 * @see no.hal.pg.exampletask.runtime.ExampleTaskView#proposeAnswer(boolean)
	 * @generated
	 */
	EOperation getExampleTaskView__ProposeAnswer__boolean();

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
		 * The meta object literal for the '{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskImpl <em>Example Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.exampletask.runtime.impl.ExampleTaskImpl
		 * @see no.hal.pg.exampletask.runtime.impl.RuntimePackageImpl#getExampleTask()
		 * @generated
		 */
		EClass EXAMPLE_TASK = eINSTANCE.getExampleTask();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TASK__QUESTION = eINSTANCE.getExampleTask_Question();

		/**
		 * The meta object literal for the '<em><b>Correct Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TASK__CORRECT_ANSWER = eINSTANCE.getExampleTask_CorrectAnswer();

		/**
		 * The meta object literal for the '<em><b>Answered Correctly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TASK__ANSWERED_CORRECTLY = eINSTANCE.getExampleTask_AnsweredCorrectly();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAMPLE_TASK___ANSWER__BOOLEAN = eINSTANCE.getExampleTask__Answer__boolean();

		/**
		 * The meta object literal for the '{@link no.hal.pg.exampletask.runtime.impl.ExampleTaskViewImpl <em>Example Task View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.exampletask.runtime.impl.ExampleTaskViewImpl
		 * @see no.hal.pg.exampletask.runtime.impl.RuntimePackageImpl#getExampleTaskView()
		 * @generated
		 */
		EClass EXAMPLE_TASK_VIEW = eINSTANCE.getExampleTaskView();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TASK_VIEW__QUESTION = eINSTANCE.getExampleTaskView_Question();

		/**
		 * The meta object literal for the '<em><b>Propose Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXAMPLE_TASK_VIEW___PROPOSE_ANSWER__BOOLEAN = eINSTANCE.getExampleTaskView__ProposeAnswer__boolean();

	}

} //RuntimePackage
