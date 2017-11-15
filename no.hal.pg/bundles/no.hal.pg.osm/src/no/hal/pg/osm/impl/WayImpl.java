/**
 */
package no.hal.pg.osm.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.NodeRef;
import no.hal.pg.osm.OsmPackage;
import no.hal.pg.osm.Way;
import no.hal.pg.osm.geoutil.LatLong;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.osm.impl.WayImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WayImpl extends OSMElementImpl implements Way {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeRef> nodes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsmPackage.Literals.WAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NodeRef> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<NodeRef>(NodeRef.class, this, OsmPackage.WAY__NODES);
		}
		return nodes;
	}

	static LatLong getLatLong(Iterable<? extends EObject> elements) {
		double lat = 0.0, lon = 0.0;
		int count = 0;
		for (EObject element : elements) {
			if (element instanceof GeoLocated) {
				LatLong latLong = ((GeoLocated) element).getLatLong();
				if (latLong != null) {
					lat += latLong.latitude;
					lon += latLong.longitude;
					count++;
				}
			}
		}
		return (count > 0 ? new LatLong(lat / count, lon / count) : null); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public LatLong getLatLong() {
		return getLatLong(getNodes()); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OsmPackage.WAY__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
			case OsmPackage.WAY__NODES:
				return getNodes();
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
			case OsmPackage.WAY__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends NodeRef>)newValue);
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
			case OsmPackage.WAY__NODES:
				getNodes().clear();
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
			case OsmPackage.WAY__NODES:
				return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
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
				case OsmPackage.GEO_LOCATED___GET_LAT_LONG: return OsmPackage.WAY___GET_LAT_LONG;
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
			case OsmPackage.WAY___GET_LAT_LONG:
				return getLatLong();
		}
		return super.eInvoke(operationID, arguments);
	}

} //WayImpl
