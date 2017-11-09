/**
 */
package no.hal.pg.config.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import no.hal.pg.config.*;
import no.hal.pg.runtime.Task;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.pg.config.ConfigPackage
 * @generated
 */
public class ConfigSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConfigPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigSwitch() {
		if (modelPackage == null) {
			modelPackage = ConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConfigPackage.GAME_CONFIG: {
				GameConfig gameConfig = (GameConfig)theEObject;
				T1 result = caseGameConfig(gameConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.ABSTRACT_CONFIG: {
				AbstractConfig<?> abstractConfig = (AbstractConfig<?>)theEObject;
				T1 result = caseAbstractConfig(abstractConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.TASK_CONFIG: {
				TaskConfig<?> taskConfig = (TaskConfig<?>)theEObject;
				T1 result = caseTaskConfig(taskConfig);
				if (result == null) result = caseAbstractConfig(taskConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.ITEM_CONFIG: {
				ItemConfig itemConfig = (ItemConfig)theEObject;
				T1 result = caseItemConfig(itemConfig);
				if (result == null) result = caseAbstractConfig(itemConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.INFO_ITEM_CONFIG: {
				InfoItemConfig infoItemConfig = (InfoItemConfig)theEObject;
				T1 result = caseInfoItemConfig(infoItemConfig);
				if (result == null) result = caseItemConfig(infoItemConfig);
				if (result == null) result = caseAbstractConfig(infoItemConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.PROXY: {
				Proxy<?> proxy = (Proxy<?>)theEObject;
				T1 result = caseProxy(proxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.TASK_PROXY: {
				TaskProxy taskProxy = (TaskProxy)theEObject;
				T1 result = caseTaskProxy(taskProxy);
				if (result == null) result = caseProxy(taskProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.PLAYER_ROLE: {
				PlayerRole playerRole = (PlayerRole)theEObject;
				T1 result = casePlayerRole(playerRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConfigPackage.ITEM_PROXY: {
				ItemProxy itemProxy = (ItemProxy)theEObject;
				T1 result = caseItemProxy(itemProxy);
				if (result == null) result = caseProxy(itemProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGameConfig(GameConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseAbstractConfig(AbstractConfig<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends Task<?>> T1 caseTaskConfig(TaskConfig<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseItemConfig(ItemConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Item Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Item Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInfoItemConfig(InfoItemConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseProxy(Proxy<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskProxy(TaskProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlayerRole(PlayerRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseItemProxy(ItemProxy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
