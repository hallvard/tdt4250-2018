/**
 */
package no.hal.pg.app.impl;

import no.hal.pg.app.AppPackage;
import no.hal.pg.app.View2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.View2Impl#getModel1 <em>Model1</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.View2Impl#getModel2 <em>Model2</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class View2Impl<U, M1, M2> extends ViewImpl<U> implements View2<U, M1, M2> {
	/**
	 * The cached value of the '{@link #getModel1() <em>Model1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel1()
	 * @generated
	 * @ordered
	 */
	protected M1 model1;

	/**
	 * The cached value of the '{@link #getModel2() <em>Model2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel2()
	 * @generated
	 * @ordered
	 */
	protected M2 model2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected View2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.VIEW2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public M1 getModel1() {
		if (model1 != null && ((EObject)model1).eIsProxy()) {
			InternalEObject oldModel1 = (InternalEObject)model1;
			model1 = (M1)eResolveProxy(oldModel1);
			if (model1 != oldModel1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.VIEW2__MODEL1, oldModel1, model1));
			}
		}
		return model1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1 basicGetModel1() {
		return model1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel1(M1 newModel1) {
		M1 oldModel1 = model1;
		model1 = newModel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.VIEW2__MODEL1, oldModel1, model1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public M2 getModel2() {
		if (model2 != null && ((EObject)model2).eIsProxy()) {
			InternalEObject oldModel2 = (InternalEObject)model2;
			model2 = (M2)eResolveProxy(oldModel2);
			if (model2 != oldModel2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AppPackage.VIEW2__MODEL2, oldModel2, model2));
			}
		}
		return model2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2 basicGetModel2() {
		return model2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel2(M2 newModel2) {
		M2 oldModel2 = model2;
		model2 = newModel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.VIEW2__MODEL2, oldModel2, model2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.VIEW2__MODEL1:
				if (resolve) return getModel1();
				return basicGetModel1();
			case AppPackage.VIEW2__MODEL2:
				if (resolve) return getModel2();
				return basicGetModel2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AppPackage.VIEW2__MODEL1:
				setModel1((M1)newValue);
				return;
			case AppPackage.VIEW2__MODEL2:
				setModel2((M2)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AppPackage.VIEW2__MODEL1:
				setModel1((M1)null);
				return;
			case AppPackage.VIEW2__MODEL2:
				setModel2((M2)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AppPackage.VIEW2__MODEL1:
				return model1 != null;
			case AppPackage.VIEW2__MODEL2:
				return model2 != null;
		}
		return super.eIsSet(featureID);
	}

} //View2Impl
