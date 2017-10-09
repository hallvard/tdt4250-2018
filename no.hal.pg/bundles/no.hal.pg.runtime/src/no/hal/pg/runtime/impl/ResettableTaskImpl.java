/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import no.hal.pg.runtime.ResettableTask;
import no.hal.pg.runtime.RuntimePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resettable Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResettableTaskImpl<R> extends TaskImpl<R> implements ResettableTask<R> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResettableTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.RESETTABLE_TASK;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void reset() {
		setStartTime(null);
		setFinishTime(null);
		setResult(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.RESETTABLE_TASK___RESET:
				reset();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ResettableTaskImpl
