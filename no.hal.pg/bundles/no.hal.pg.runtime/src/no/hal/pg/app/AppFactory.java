/**
 */
package no.hal.pg.app;

import no.hal.pg.runtime.Task;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.app.AppPackage
 * @generated
 */
public interface AppFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppFactory eINSTANCE = no.hal.pg.app.impl.AppFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game View</em>'.
	 * @generated
	 */
	<T extends Task<?>> GameView<T> createGameView();

	/**
	 * Returns a new object of class '<em>Game App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game App</em>'.
	 * @generated
	 */
	<T extends Task<?>> GameApp<T> createGameApp();

	/**
	 * Returns a new object of class '<em>Task View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task View</em>'.
	 * @generated
	 */
	<T extends Task<?>> TaskView<T> createTaskView();

	/**
	 * Returns a new object of class '<em>Accept Task View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Task View</em>'.
	 * @generated
	 */
	AcceptTaskView createAcceptTaskView();

	/**
	 * Returns a new object of class '<em>Map View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map View</em>'.
	 * @generated
	 */
	MapView createMapView();

	/**
	 * Returns a new object of class '<em>Map Marker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Marker</em>'.
	 * @generated
	 */
	MapMarker createMapMarker();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppPackage getAppPackage();

} //AppFactory
