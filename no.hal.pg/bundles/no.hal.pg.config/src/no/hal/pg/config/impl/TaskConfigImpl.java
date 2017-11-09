/**
 */
package no.hal.pg.config.impl;

import java.lang.reflect.InvocationTargetException;
import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.TaskConfig;

import no.hal.pg.config.TaskProxy;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TaskConfigImpl<T extends Task<?>> extends AbstractConfigImpl<T> implements TaskConfig<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigPackage.Literals.TASK_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T createTask(TaskProxy proxy) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConfigPackage.TASK_CONFIG___CREATE_TASK__TASKPROXY:
				return createTask((TaskProxy)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskConfigImpl
