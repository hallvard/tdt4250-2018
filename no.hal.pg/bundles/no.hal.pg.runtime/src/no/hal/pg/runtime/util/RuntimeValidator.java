/**
 */
package no.hal.pg.runtime.util;

import java.net.URI;
import java.util.Map;
import no.hal.pg.runtime.AbstractCondition;
import no.hal.pg.runtime.AcceptTask;
import no.hal.pg.runtime.CompositeCondition;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Info;
import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.IsTaskFinished;
import no.hal.pg.runtime.IsTaskStarted;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.ResettableTask;
import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.impl.TaskImpl;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.runtime.RuntimePackage
 * @generated
 */
public class RuntimeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RuntimeValidator INSTANCE = new RuntimeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.pg.runtime";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RuntimePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RuntimePackage.GAME:
				return validateGame((Game<?>)value, diagnostics, context);
			case RuntimePackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case RuntimePackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case RuntimePackage.INFO:
				return validateInfo((Info)value, diagnostics, context);
			case RuntimePackage.INFO_ITEM:
				return validateInfoItem((InfoItem)value, diagnostics, context);
			case RuntimePackage.TASK:
				return validateTask((Task<?>)value, diagnostics, context);
			case RuntimePackage.RESETTABLE_TASK:
				return validateResettableTask((ResettableTask<?>)value, diagnostics, context);
			case RuntimePackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case RuntimePackage.ABSTRACT_CONDITION:
				return validateAbstractCondition((AbstractCondition<?>)value, diagnostics, context);
			case RuntimePackage.COMPOSITE_CONDITION:
				return validateCompositeCondition((CompositeCondition<?>)value, diagnostics, context);
			case RuntimePackage.IS_TASK_STARTED:
				return validateIsTaskStarted((IsTaskStarted)value, diagnostics, context);
			case RuntimePackage.IS_TASK_FINISHED:
				return validateIsTaskFinished((IsTaskFinished)value, diagnostics, context);
			case RuntimePackage.ACCEPT_TASK:
				return validateAcceptTask((AcceptTask)value, diagnostics, context);
			case RuntimePackage.RUNTIME:
				return validateRuntime((no.hal.pg.runtime.Runtime)value, diagnostics, context);
			case RuntimePackage.EURI:
				return validateEURI((URI)value, diagnostics, context);
			case RuntimePackage.TIMESTAMP:
				return validateTimestamp((Long)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game<?> game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(game, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(player, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(info, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfoItem(InfoItem infoItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infoItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task<?> task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_PlayerIsContainedInGame(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_IsFinishedImpliesIsStarted(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_FinishTimeGEStartTime(task, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PlayerIsContainedInGame constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_PlayerIsContainedInGame(Task<?> task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (! task.getGame().getPlayers().containsAll(task.getPlayers())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "PlayerIsContainedInGame", getObjectLabel(task, context) },
						 new Object[] { task },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the IsFinishedImpliesIsStarted constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_IsFinishedImpliesIsStarted(Task<?> task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (task.isFinished() && (! task.isStarted())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "IsFinishedImpliesIsStarted", getObjectLabel(task, context) },
						 new Object[] { task },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the FinishTimeGEStartTime constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_FinishTimeGEStartTime(Task<?> task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (TaskImpl.isValidTime(task.getStartTime()) && TaskImpl.isValidTime(task.getFinishTime()) && task.getFinishTime() < task.getStartTime()) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FinishTimeGEStartTime", getObjectLabel(task, context) },
						 new Object[] { task },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResettableTask(ResettableTask<?> resettableTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resettableTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_PlayerIsContainedInGame(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_IsFinishedImpliesIsStarted(resettableTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_FinishTimeGEStartTime(resettableTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCondition(AbstractCondition<?> abstractCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition(CompositeCondition<?> compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsTaskStarted(IsTaskStarted isTaskStarted, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isTaskStarted, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsTaskFinished(IsTaskFinished isTaskFinished, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isTaskFinished, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceptTask(AcceptTask acceptTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acceptTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_PlayerIsContainedInGame(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_IsFinishedImpliesIsStarted(acceptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateTask_FinishTimeGEStartTime(acceptTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntime(no.hal.pg.runtime.Runtime runtime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEURI(URI euri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimestamp(Long timestamp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PgValidator
