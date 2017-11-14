/**
 */
package no.hal.pg.osm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.Node;
import no.hal.pg.osm.OsmPackage;
import no.hal.pg.osm.Tagged;
import no.hal.pg.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.osm.impl.NodeImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link no.hal.pg.osm.impl.NodeImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link no.hal.pg.osm.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pg.osm.impl.NodeImpl#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends OSMElementImpl implements Node {
	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LATITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected float latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final float LONGITUDE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected float longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(float newLatitude) {
		float oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.NODE__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(float newLongitude) {
		float oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OsmPackage.NODE__LONGITUDE, oldLongitude, longitude));
	}

	static String getTag(Tagged tagged, ENamedElement... nameds) {
		String tagName = null;
		for (ENamedElement named : nameds) {
			if (tagName == null) {
				tagName = named.getName();
			}
			EAnnotation annotation = named.getEAnnotation(OsmPackage.eNS_URI);
			if (annotation != null) {
				String value = annotation.getDetails().get("tag");
				if (value != null) {
					tagName = value;
					break;
				}
			}
		}
		return (tagged != null && tagName !=  null ? tagged.getTag(tagName) : null);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		return getTag(this, OsmPackage.eINSTANCE.getNode_Name());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getKind() {
		return getTag(this, OsmPackage.eINSTANCE.getNode_Kind());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public LatLong getLatLong() {
		return new LatLong(getLatitude(), getLongitude());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OsmPackage.NODE__LATITUDE:
				return getLatitude();
			case OsmPackage.NODE__LONGITUDE:
				return getLongitude();
			case OsmPackage.NODE__NAME:
				return getName();
			case OsmPackage.NODE__KIND:
				return getKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OsmPackage.NODE__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case OsmPackage.NODE__LONGITUDE:
				setLongitude((Float)newValue);
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
			case OsmPackage.NODE__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case OsmPackage.NODE__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
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
			case OsmPackage.NODE__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case OsmPackage.NODE__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case OsmPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case OsmPackage.NODE__KIND:
				return KIND_EDEFAULT == null ? getKind() != null : !KIND_EDEFAULT.equals(getKind());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (derivedFeatureID) {
				case OsmPackage.NODE__LATITUDE: return OsmPackage.GEO_LOCATION__LATITUDE;
				case OsmPackage.NODE__LONGITUDE: return OsmPackage.GEO_LOCATION__LONGITUDE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (baseFeatureID) {
				case OsmPackage.GEO_LOCATION__LATITUDE: return OsmPackage.NODE__LATITUDE;
				case OsmPackage.GEO_LOCATION__LONGITUDE: return OsmPackage.NODE__LONGITUDE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GeoLocated.class) {
			switch (baseOperationID) {
				case OsmPackage.GEO_LOCATED___GET_LAT_LONG: return OsmPackage.NODE___GET_LAT_LONG;
				default: return -1;
			}
		}
		if (baseClass == GeoLocation.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OsmPackage.NODE___GET_LAT_LONG:
				return getLatLong();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
