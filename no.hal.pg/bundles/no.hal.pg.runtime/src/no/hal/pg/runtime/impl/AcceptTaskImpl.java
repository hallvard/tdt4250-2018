/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import no.hal.pg.runtime.AcceptTask;
import no.hal.pg.runtime.RuntimePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceptTaskImpl extends TaskImpl<Boolean> implements AcceptTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.ACCEPT_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setResult(Boolean newResult) {
		super.setResult(newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void accept() {
		finish(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.ACCEPT_TASK___ACCEPT:
				accept();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	//
	
	@Override
	public String getDescription() {
		return "Just **accept** the task";
	}

} //AcceptTaskImpl
