/**
 */
package no.hal.pg.arc.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import no.hal.pg.arc.ArcPackage;
import no.hal.pg.arc.Capability;
import no.hal.pg.arc.ScopeCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.arc.impl.ScopeCapabilityImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeCapabilityImpl extends CapabilityImpl implements ScopeCapability {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> elements;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArcPackage.Literals.SCOPE_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<EObject>(EObject.class, this, ArcPackage.SCOPE_CAPABILITY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArcPackage.SCOPE_CAPABILITY__ELEMENTS:
				return getElements();
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
			case ArcPackage.SCOPE_CAPABILITY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends EObject>)newValue);
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
			case ArcPackage.SCOPE_CAPABILITY__ELEMENTS:
				getElements().clear();
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
			case ArcPackage.SCOPE_CAPABILITY__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//

	protected boolean hasCapability(EObject scope, EObject other) {
		while (other != null) {
			if (other == scope) {
				return true;
			}
			other = other.eContainer();
		}
		return false;
	}
	
	protected boolean hasCapability(EObject element) {
		for (EObject scope : getElements()) {
			if (hasCapability(scope, element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean hasCapability(Capability capability) {
		if (! (capability instanceof ScopeCapability)) {
			return false;
		}
		ScopeCapability scopeCapability = (ScopeCapability) capability;
		for (EObject element : scopeCapability.getElements()) {
			if (! hasCapability(element)) {
				return false;
			}
		}
		return true;
	}

} //ScopeCapabilityImpl
