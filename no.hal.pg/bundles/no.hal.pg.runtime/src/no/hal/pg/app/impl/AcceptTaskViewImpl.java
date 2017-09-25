/**
 */
package no.hal.pg.app.impl;

import java.lang.reflect.InvocationTargetException;

import no.hal.pg.app.AcceptTaskView;
import no.hal.pg.app.AppPackage;

import no.hal.pg.runtime.AcceptTask;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Task View</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceptTaskViewImpl extends TaskViewImpl<AcceptTask> implements AcceptTaskView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptTaskViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ACCEPT_TASK_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void accept() {
		getModel().accept();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AppPackage.ACCEPT_TASK_VIEW___ACCEPT:
				accept();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AcceptTaskViewImpl
