/**
 */
package no.hal.pg.app.impl;

import java.util.Collection;

import no.hal.pg.app.AppPackage;
import no.hal.pg.app.GeoPolyline;

import no.hal.pg.osm.GeoLocated;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geo Polyline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.app.impl.GeoPolylineImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link no.hal.pg.app.impl.GeoPolylineImpl#isClosed <em>Closed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeoPolylineImpl extends MinimalEObjectImpl.Container implements GeoPolyline {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GeoLocated> locations;

	/**
	 * The default value of the '{@link #isClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosed() <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean closed = CLOSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeoPolylineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppPackage.Literals.GEO_POLYLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeoLocated> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<GeoLocated>(GeoLocated.class, this, AppPackage.GEO_POLYLINE__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosed() {
		return closed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosed(boolean newClosed) {
		boolean oldClosed = closed;
		closed = newClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppPackage.GEO_POLYLINE__CLOSED, oldClosed, closed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AppPackage.GEO_POLYLINE__LOCATIONS:
				return getLocations();
			case AppPackage.GEO_POLYLINE__CLOSED:
				return isClosed();
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
			case AppPackage.GEO_POLYLINE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends GeoLocated>)newValue);
				return;
			case AppPackage.GEO_POLYLINE__CLOSED:
				setClosed((Boolean)newValue);
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
			case AppPackage.GEO_POLYLINE__LOCATIONS:
				getLocations().clear();
				return;
			case AppPackage.GEO_POLYLINE__CLOSED:
				setClosed(CLOSED_EDEFAULT);
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
			case AppPackage.GEO_POLYLINE__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case AppPackage.GEO_POLYLINE__CLOSED:
				return closed != CLOSED_EDEFAULT;
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
		result.append(" (closed: ");
		result.append(closed);
		result.append(')');
		return result.toString();
	}

} //GeoPolylineImpl
