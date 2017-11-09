/**
 */
package no.hal.pg.config;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.config.ConfigPackage
 * @generated
 */
public interface ConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigFactory eINSTANCE = no.hal.pg.config.impl.ConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game Config</em>'.
	 * @generated
	 */
	GameConfig createGameConfig();

	/**
	 * Returns a new object of class '<em>Info Item Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info Item Config</em>'.
	 * @generated
	 */
	InfoItemConfig createInfoItemConfig();

	/**
	 * Returns a new object of class '<em>Task Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Proxy</em>'.
	 * @generated
	 */
	TaskProxy createTaskProxy();

	/**
	 * Returns a new object of class '<em>Player Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Role</em>'.
	 * @generated
	 */
	PlayerRole createPlayerRole();

	/**
	 * Returns a new object of class '<em>Item Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Proxy</em>'.
	 * @generated
	 */
	ItemProxy createItemProxy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConfigPackage getConfigPackage();

} //ModelFactory
