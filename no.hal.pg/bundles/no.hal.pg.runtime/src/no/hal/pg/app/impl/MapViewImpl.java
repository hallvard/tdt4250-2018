/**
 */
package no.hal.pg.app.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import no.hal.pg.app.AbstractGeoLocationView;
import no.hal.pg.app.AppPackage;
import no.hal.pg.app.MapView;

import no.hal.pg.osm.impl.GeoLocationImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.MapViewImpl#getZoom <em>Zoom</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.MapViewImpl#getGeoLocationViews <em>Geo Location Views</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.MapViewImpl#getGeoPolylines <em>Geo Polylines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapViewImpl extends GeoLocationImpl implements MapView {
	/**
	 * The default value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected static final int ZOOM_EDEFAULT = 10;

	/**
	 * The cached value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected int zoom = ZOOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGeoLocationViews() <em>Geo Location Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoLocationViews()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractGeoLocationView> geoLocationViews;

	/**
	 * The cached value of the '{@link #getGeoPolylines() <em>Geo Polylines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeoPolylines()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractGeoLocationView> geoPolylines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.MAP_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getZoom() {
		return zoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZoom(int newZoom) {
		int oldZoom = zoom;
		zoom = newZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.MAP_VIEW__ZOOM, oldZoom, zoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractGeoLocationView> getGeoLocationViews() {
		if (geoLocationViews == null) {
			geoLocationViews = new EObjectContainmentEList<AbstractGeoLocationView>(AbstractGeoLocationView.class, this, AppPackage.MAP_VIEW__GEO_LOCATION_VIEWS);
		}
		return geoLocationViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractGeoLocationView> getGeoPolylines() {
		if (geoPolylines == null) {
			geoPolylines = new EObjectContainmentEList<AbstractGeoLocationView>(AbstractGeoLocationView.class, this, AppPackage.MAP_VIEW__GEO_POLYLINES);
		}
		return geoPolylines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void navigate(float latitude, float longitude, int zoom) {
		if (latitude >= 0) {
			setLatitude(latitude);
		}
		if (longitude >= 0) {
			setLongitude(longitude);
		}
		if (zoom >= 0) {
			setZoom(zoom);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AppPackage.MAP_VIEW__GEO_LOCATION_VIEWS:
				return ((InternalEList<?>)getGeoLocationViews()).basicRemove(otherEnd, msgs);
			case AppPackage.MAP_VIEW__GEO_POLYLINES:
				return ((InternalEList<?>)getGeoPolylines()).basicRemove(otherEnd, msgs);
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
			case AppPackage.MAP_VIEW__ZOOM:
				return getZoom();
			case AppPackage.MAP_VIEW__GEO_LOCATION_VIEWS:
				return getGeoLocationViews();
			case AppPackage.MAP_VIEW__GEO_POLYLINES:
				return getGeoPolylines();
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
			case AppPackage.MAP_VIEW__ZOOM:
				setZoom((Integer)newValue);
				return;
			case AppPackage.MAP_VIEW__GEO_LOCATION_VIEWS:
				getGeoLocationViews().clear();
				getGeoLocationViews().addAll((Collection<? extends AbstractGeoLocationView>)newValue);
				return;
			case AppPackage.MAP_VIEW__GEO_POLYLINES:
				getGeoPolylines().clear();
				getGeoPolylines().addAll((Collection<? extends AbstractGeoLocationView>)newValue);
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
			case AppPackage.MAP_VIEW__ZOOM:
				setZoom(ZOOM_EDEFAULT);
				return;
			case AppPackage.MAP_VIEW__GEO_LOCATION_VIEWS:
				getGeoLocationViews().clear();
				return;
			case AppPackage.MAP_VIEW__GEO_POLYLINES:
				getGeoPolylines().clear();
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
			case AppPackage.MAP_VIEW__ZOOM:
				return zoom != ZOOM_EDEFAULT;
			case AppPackage.MAP_VIEW__GEO_LOCATION_VIEWS:
				return geoLocationViews != null && !geoLocationViews.isEmpty();
			case AppPackage.MAP_VIEW__GEO_POLYLINES:
				return geoPolylines != null && !geoPolylines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AppPackage.MAP_VIEW___NAVIGATE__FLOAT_FLOAT_INT:
				navigate((Float)arguments.get(0), (Float)arguments.get(1), (Integer)arguments.get(2));
				return null;
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
		result.append(" (zoom: ");
		result.append(zoom);
		result.append(')');
		return result.toString();
	}

} //MapViewImpl
