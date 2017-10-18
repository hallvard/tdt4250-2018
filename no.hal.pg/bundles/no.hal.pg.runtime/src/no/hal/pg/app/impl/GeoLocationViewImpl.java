/**
 */
package no.hal.pg.app.impl;

import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GeoLocationView;

import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.OsmPackage;
import no.hal.pg.osm.geoutil.LatLong;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Location View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.GeoLocationViewImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.GeoLocationViewImpl#getLongitude <em>Longitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoLocationViewImpl extends AbstractGeoLocationViewImpl implements GeoLocationView {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoLocationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.GEO_LOCATION_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.GEO_LOCATION_VIEW__LATITUDE, oldLatitude, latitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.GEO_LOCATION_VIEW__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.GEO_LOCATION_VIEW__LATITUDE:
				return getLatitude();
			case AppPackage.GEO_LOCATION_VIEW__LONGITUDE:
				return getLongitude();
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
			case AppPackage.GEO_LOCATION_VIEW__LATITUDE:
				setLatitude((Float)newValue);
				return;
			case AppPackage.GEO_LOCATION_VIEW__LONGITUDE:
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
			case AppPackage.GEO_LOCATION_VIEW__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case AppPackage.GEO_LOCATION_VIEW__LONGITUDE:
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
			case AppPackage.GEO_LOCATION_VIEW__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case AppPackage.GEO_LOCATION_VIEW__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
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
		if (baseClass == GeoLocation.class) {
			switch (derivedFeatureID) {
				case AppPackage.GEO_LOCATION_VIEW__LATITUDE: return OsmPackage.GEO_LOCATION__LATITUDE;
				case AppPackage.GEO_LOCATION_VIEW__LONGITUDE: return OsmPackage.GEO_LOCATION__LONGITUDE;
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
		if (baseClass == GeoLocation.class) {
			switch (baseFeatureID) {
				case OsmPackage.GEO_LOCATION__LATITUDE: return AppPackage.GEO_LOCATION_VIEW__LATITUDE;
				case OsmPackage.GEO_LOCATION__LONGITUDE: return AppPackage.GEO_LOCATION_VIEW__LONGITUDE;
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
	
	//
	
	@Override
	public LatLong getLatLong() {
		return new LatLong(getLatitude(), getLongitude());
	}

} //GeoLocationViewImpl
