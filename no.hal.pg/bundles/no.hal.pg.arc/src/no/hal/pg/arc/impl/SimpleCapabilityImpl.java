/**
 */
package no.hal.pg.arc.impl;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import no.hal.pg.arc.ArcPackage;
import no.hal.pg.arc.Capability;
import no.hal.pg.arc.SimpleCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.arc.impl.SimpleCapabilityImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link no.hal.pg.arc.impl.SimpleCapabilityImpl#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleCapabilityImpl extends CapabilityImpl implements SimpleCapability {
	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArcPackage.Literals.SIMPLE_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
		StringBuilder buffer = new StringBuilder();
		for (String segment : getSegments()) {
			if (buffer.length() > 0) {
				buffer.append(".");
			}
			buffer.append(segment);
		}
		return buffer.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setQualifiedName(String qualifiedName) {
		String segments[] = qualifiedName.split("\\.");
		ECollections.setEList(getSegments(), Arrays.asList(segments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSegments() {
		if (segments == null) {
			segments = new EDataTypeUniqueEList<String>(String.class, this, ArcPackage.SIMPLE_CAPABILITY__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArcPackage.SIMPLE_CAPABILITY__QUALIFIED_NAME:
				return getQualifiedName();
			case ArcPackage.SIMPLE_CAPABILITY__SEGMENTS:
				return getSegments();
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
			case ArcPackage.SIMPLE_CAPABILITY__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case ArcPackage.SIMPLE_CAPABILITY__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends String>)newValue);
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
			case ArcPackage.SIMPLE_CAPABILITY__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case ArcPackage.SIMPLE_CAPABILITY__SEGMENTS:
				getSegments().clear();
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
			case ArcPackage.SIMPLE_CAPABILITY__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case ArcPackage.SIMPLE_CAPABILITY__SEGMENTS:
				return segments != null && !segments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (segments: ");
		result.append(segments);
		result.append(')');
		return result.toString();
	}
	
	//

	@Override
	public boolean hasCapability(Capability capability) {
		if (! (capability instanceof SimpleCapability)) {
			return false;
		}
		SimpleCapability simpleCapability = (SimpleCapability) capability;
		String qName = getQualifiedName(), qName2 = simpleCapability.getQualifiedName();
		if (qName.equals(qName2)) {
			return true;
		}
		EList<String> segments = this.getSegments();
		if (segments.size() > 0 && segments.get(getSegments().size() - 1).equals("*") && qName2.startsWith(qName.substring(0, qName.length() - 1))) {
			return true;
		}
		return false;
	}

} //SimpleCapabilityImpl
