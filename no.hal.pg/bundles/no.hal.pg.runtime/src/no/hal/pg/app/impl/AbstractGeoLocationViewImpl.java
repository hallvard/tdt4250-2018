/**
 */
package no.hal.pg.app.impl;

import no.hal.pg.app.AbstractGeoLocationView;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.MapMarkerOptions;

import no.hal.pg.osm.geoutil.LatLong;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Geo Location View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.AbstractGeoLocationViewImpl#getLatLong <em>Lat Long</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.AbstractGeoLocationViewImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractGeoLocationViewImpl extends MinimalEObjectImpl.Container implements AbstractGeoLocationView {
	/**
	 * The default value of the '{@link #getLatLong() <em>Lat Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLong()
	 * @generated
	 * @ordered
	 */
	protected static final LatLong LAT_LONG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected MapMarkerOptions options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractGeoLocationViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.ABSTRACT_GEO_LOCATION_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapMarkerOptions getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(MapMarkerOptions newOptions, NotificationChain msgs) {
		MapMarkerOptions oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptions(MapMarkerOptions newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatLong getLatLong() {
		// TODO: implement this method to return the 'Lat Long' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS:
				return basicSetOptions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW__LAT_LONG:
				return getLatLong();
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS:
				return getOptions();
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
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS:
				setOptions((MapMarkerOptions)newValue);
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
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS:
				setOptions((MapMarkerOptions)null);
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
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW__LAT_LONG:
				return LAT_LONG_EDEFAULT == null ? getLatLong() != null : !LAT_LONG_EDEFAULT.equals(getLatLong());
			case AppPackage.ABSTRACT_GEO_LOCATION_VIEW__OPTIONS:
				return options != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractGeoLocationViewImpl
