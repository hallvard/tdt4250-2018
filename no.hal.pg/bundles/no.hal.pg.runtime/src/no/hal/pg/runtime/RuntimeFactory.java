/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = no.hal.pg.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	<T extends Task<?>> Game<T> createGame();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item</em>'.
	 * @generated
	 */
	Item createItem();

	/**
	 * Returns a new object of class '<em>Info Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info Item</em>'.
	 * @generated
	 */
	InfoItem createInfoItem();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	<R> Task<R> createTask();

	/**
	 * Returns a new object of class '<em>Resettable Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resettable Task</em>'.
	 * @generated
	 */
	<R> ResettableTask<R> createResettableTask();

	/**
	 * Returns a new object of class '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Condition</em>'.
	 * @generated
	 */
	<E> CompositeCondition<E> createCompositeCondition();

	/**
	 * Returns a new object of class '<em>Is Task Started Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Task Started Condition</em>'.
	 * @generated
	 */
	IsTaskStartedCondition createIsTaskStartedCondition();

	/**
	 * Returns a new object of class '<em>Is Task Finished Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Task Finished Condition</em>'.
	 * @generated
	 */
	IsTaskFinishedCondition createIsTaskFinishedCondition();

	/**
	 * Returns a new object of class '<em>Is By Geo Location Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is By Geo Location Condition</em>'.
	 * @generated
	 */
	IsByGeoLocationCondition createIsByGeoLocationCondition();

	/**
	 * Returns a new object of class '<em>Players Have Items Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Players Have Items Condition</em>'.
	 * @generated
	 */
	PlayersHaveItemsCondition createPlayersHaveItemsCondition();

	/**
	 * Returns a new object of class '<em>Composite Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Action</em>'.
	 * @generated
	 */
	CompositeAction createCompositeAction();

	/**
	 * Returns a new object of class '<em>Give Task Players Items Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Give Task Players Items Action</em>'.
	 * @generated
	 */
	GiveTaskPlayersItemsAction createGiveTaskPlayersItemsAction();

	/**
	 * Returns a new object of class '<em>Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime</em>'.
	 * @generated
	 */
	Runtime createRuntime();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory
