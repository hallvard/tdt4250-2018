/**
 */
package no.hal.pg.config.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.pg.config.ConfigPackage;
import no.hal.pg.config.TaskConfig;
import no.hal.pg.runtime.Task;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TaskConfigImpl<T extends Task<R>, R> extends MinimalEObjectImpl.Container implements TaskConfig<T, R> {
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
	public Task<R> createTask() {
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
			case ConfigPackage.TASK_CONFIG___CREATE_TASK:
				return createTask();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskDefImpl
