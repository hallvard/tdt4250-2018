/**
 */
package no.hal.pg.runtime.impl;

import java.net.URI;
import no.hal.pg.runtime.CompositeAction;
import no.hal.pg.runtime.CompositeCondition;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.GiveTaskPlayersItemsAction;
import no.hal.pg.runtime.InfoItem;
import no.hal.pg.runtime.IsByGeoLocationCondition;
import no.hal.pg.runtime.IsTaskFinishedCondition;
import no.hal.pg.runtime.IsTaskStartedCondition;
import no.hal.pg.runtime.Item;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.PlayersHaveItemsCondition;
import no.hal.pg.runtime.ResettableTask;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFactoryImpl extends EFactoryImpl implements RuntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFactory init() {
		try {
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory(RuntimePackage.eNS_URI);
			if (theRuntimeFactory != null) {
				return theRuntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RuntimePackage.GAME: return createGame();
			case RuntimePackage.PLAYER: return createPlayer();
			case RuntimePackage.ITEM: return createItem();
			case RuntimePackage.INFO_ITEM: return createInfoItem();
			case RuntimePackage.TASK: return createTask();
			case RuntimePackage.RESETTABLE_TASK: return createResettableTask();
			case RuntimePackage.COMPOSITE_CONDITION: return createCompositeCondition();
			case RuntimePackage.IS_TASK_STARTED_CONDITION: return createIsTaskStartedCondition();
			case RuntimePackage.IS_TASK_FINISHED_CONDITION: return createIsTaskFinishedCondition();
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION: return createIsByGeoLocationCondition();
			case RuntimePackage.PLAYERS_HAVE_ITEMS_CONDITION: return createPlayersHaveItemsCondition();
			case RuntimePackage.COMPOSITE_ACTION: return createCompositeAction();
			case RuntimePackage.GIVE_TASK_PLAYERS_ITEMS_ACTION: return createGiveTaskPlayersItemsAction();
			case RuntimePackage.RUNTIME: return createRuntime();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RuntimePackage.EURI:
				return createEURIFromString(eDataType, initialValue);
			case RuntimePackage.TIMESTAMP:
				return createTimestampFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RuntimePackage.EURI:
				return convertEURIToString(eDataType, instanceValue);
			case RuntimePackage.TIMESTAMP:
				return convertTimestampToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Task<?>> Game<T> createGame() {
		GameImpl<T> game = new GameImpl<T>();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfoItem createInfoItem() {
		InfoItemImpl infoItem = new InfoItemImpl();
		return infoItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <R> Task<R> createTask() {
		TaskImpl<R> task = new TaskImpl<R>();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <R> ResettableTask<R> createResettableTask() {
		ResettableTaskImpl<R> resettableTask = new ResettableTaskImpl<R>();
		return resettableTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <E> CompositeCondition<E> createCompositeCondition() {
		CompositeConditionImpl<E> compositeCondition = new CompositeConditionImpl<E>();
		return compositeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsTaskStartedCondition createIsTaskStartedCondition() {
		IsTaskStartedConditionImpl isTaskStartedCondition = new IsTaskStartedConditionImpl();
		return isTaskStartedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsTaskFinishedCondition createIsTaskFinishedCondition() {
		IsTaskFinishedConditionImpl isTaskFinishedCondition = new IsTaskFinishedConditionImpl();
		return isTaskFinishedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsByGeoLocationCondition createIsByGeoLocationCondition() {
		IsByGeoLocationConditionImpl isByGeoLocationCondition = new IsByGeoLocationConditionImpl();
		return isByGeoLocationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayersHaveItemsCondition createPlayersHaveItemsCondition() {
		PlayersHaveItemsConditionImpl playersHaveItemsCondition = new PlayersHaveItemsConditionImpl();
		return playersHaveItemsCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeAction createCompositeAction() {
		CompositeActionImpl compositeAction = new CompositeActionImpl();
		return compositeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GiveTaskPlayersItemsAction createGiveTaskPlayersItemsAction() {
		GiveTaskPlayersItemsActionImpl giveTaskPlayersItemsAction = new GiveTaskPlayersItemsActionImpl();
		return giveTaskPlayersItemsAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public no.hal.pg.runtime.Runtime createRuntime() {
		RuntimeImpl runtime = new RuntimeImpl();
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public URI createEURIFromString(EDataType eDataType, String initialValue) {
		return URI.create(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Long createTimestampFromString(EDataType eDataType, String initialValue) {
		return initialValue == null || initialValue.length() == 0 ? null : (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertTimestampToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RuntimePackage getRuntimePackage() {
		return (RuntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimePackage getPackage() {
		return RuntimePackage.eINSTANCE;
	}

} //RuntimeFactoryImpl
