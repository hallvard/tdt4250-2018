/**
 */
package no.hal.pg.runtime.util;

import java.net.URI;
import java.util.Map;
import no.hal.pg.osm.util.OsmValidator;
import no.hal.pg.runtime.AbstractCondition;
import no.hal.pg.runtime.CompositeCondition;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.IsByGeoLocationCondition;
import no.hal.pg.runtime.IsTaskFinishedCondition;
import no.hal.pg.runtime.IsTaskStartedCondition;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.PlayersHaveItemsCondition;
import no.hal.pg.runtime.ResettableTask;
import no.hal.pg.runtime.Condition;
import no.hal.pg.runtime.Described;
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
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsmValidator osmValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeValidator() {
		super();
		osmValidator = OsmValidator.INSTANCE;
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
			case RuntimePackage.DESCRIBED:
				return validateDescribed((Described)value, diagnostics, context);
			case RuntimePackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
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
			case RuntimePackage.IS_TASK_STARTED_CONDITION:
				return validateIsTaskStartedCondition((IsTaskStartedCondition)value, diagnostics, context);
			case RuntimePackage.IS_TASK_FINISHED_CONDITION:
				return validateIsTaskFinishedCondition((IsTaskFinishedCondition)value, diagnostics, context);
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION:
				return validateIsByGeoLocationCondition((IsByGeoLocationCondition)value, diagnostics, context);
			case RuntimePackage.PLAYERS_HAVE_ITEMS_CONDITION:
				return validatePlayersHaveItemsCondition((PlayersHaveItemsCondition)value, diagnostics, context);
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
		if (!validate_NoCircularContainment(player, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= osmValidator.validateGeoLocated_validCoordinates(player, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribed(Described described, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(described, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(item, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(item, diagnostics, context);
		if (result || diagnostics != null) result &= osmValidator.validateGeoLocated_validCoordinates(item, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfoItem(InfoItem infoItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(infoItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(infoItem, diagnostics, context);
		if (result || diagnostics != null) result &= osmValidator.validateGeoLocated_validCoordinates(infoItem, diagnostics, context);
		return result;
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
	public boolean validateIsTaskStartedCondition(IsTaskStartedCondition isTaskStartedCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isTaskStartedCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsTaskFinishedCondition(IsTaskFinishedCondition isTaskFinishedCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isTaskFinishedCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsByGeoLocationCondition(IsByGeoLocationCondition isByGeoLocationCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isByGeoLocationCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayersHaveItemsCondition(PlayersHaveItemsCondition playersHaveItemsCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playersHaveItemsCondition, diagnostics, context);
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
