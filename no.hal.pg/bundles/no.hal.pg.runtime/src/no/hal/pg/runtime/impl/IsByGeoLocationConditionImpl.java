/**
 */
package no.hal.pg.runtime.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.osm.GeoLocated;
import no.hal.pg.osm.geoutil.LatLong;
import no.hal.pg.runtime.IsByGeoLocationCondition;
import no.hal.pg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Is By Geo Location Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl#getContainedLocations <em>Contained Locations</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl#getLowerTargetDistanceBound <em>Lower Target Distance Bound</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl#getUpperTargetDistanceBound <em>Upper Target Distance Bound</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.IsByGeoLocationConditionImpl#isLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IsByGeoLocationConditionImpl extends AbstractConditionImpl<GeoLocated> implements IsByGeoLocationCondition {
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
	 * The cached value of the '{@link #getContainedLocations() <em>Contained Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<GeoLocated> containedLocations;

	/**
	 * The default value of the '{@link #getLowerTargetDistanceBound() <em>Lower Target Distance Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerTargetDistanceBound()
	 * @generated
	 * @ordered
	 */
	protected static final double LOWER_TARGET_DISTANCE_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLowerTargetDistanceBound() <em>Lower Target Distance Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerTargetDistanceBound()
	 * @generated
	 * @ordered
	 */
	protected double lowerTargetDistanceBound = LOWER_TARGET_DISTANCE_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpperTargetDistanceBound() <em>Upper Target Distance Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperTargetDistanceBound()
	 * @generated
	 * @ordered
	 */
	protected static final double UPPER_TARGET_DISTANCE_BOUND_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUpperTargetDistanceBound() <em>Upper Target Distance Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperTargetDistanceBound()
	 * @generated
	 * @ordered
	 */
	protected double upperTargetDistanceBound = UPPER_TARGET_DISTANCE_BOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOGIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogic() <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogic()
	 * @generated
	 * @ordered
	 */
	protected boolean logic = LOGIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IsByGeoLocationConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.IS_BY_GEO_LOCATION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setContext(GeoLocated newContext) {
		super.setContext(newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeoLocated> getLocations() {
		if (locations == null) {
			locations = new EObjectResolvingEList<GeoLocated>(GeoLocated.class, this, RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GeoLocated> getContainedLocations() {
		if (containedLocations == null) {
			containedLocations = new EObjectContainmentEList<GeoLocated>(GeoLocated.class, this, RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS);
		}
		return containedLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLowerTargetDistanceBound() {
		return lowerTargetDistanceBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLowerTargetDistanceBound(double newLowerTargetDistanceBound) {
		double oldLowerTargetDistanceBound = lowerTargetDistanceBound;
		lowerTargetDistanceBound = newLowerTargetDistanceBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOWER_TARGET_DISTANCE_BOUND, oldLowerTargetDistanceBound, lowerTargetDistanceBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUpperTargetDistanceBound() {
		return upperTargetDistanceBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpperTargetDistanceBound(double newUpperTargetDistanceBound) {
		double oldUpperTargetDistanceBound = upperTargetDistanceBound;
		upperTargetDistanceBound = newUpperTargetDistanceBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__UPPER_TARGET_DISTANCE_BOUND, oldUpperTargetDistanceBound, upperTargetDistanceBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLogic() {
		return logic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogic(boolean newLogic) {
		boolean oldLogic = logic;
		logic = newLogic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOGIC, oldLogic, logic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean test(GeoLocated context) {
		LatLong latLong = context.getLatLong();
		for (GeoLocated located : getLocations()) {
			LatLong latLong2 = located.getLatLong();
			double distance = LatLong.distance(latLong, latLong2);
			boolean by = getLowerTargetDistanceBound() <= distance && (getUpperTargetDistanceBound() < 0.0 || getUpperTargetDistanceBound() >= distance);
			// short-circuit when the test value becomes logic
			// use logic == true for || and logic == false for &&
			Boolean result = CompositeConditionImpl.result(by, isLogic());
			if (result != null) {
				return result;
			}
		}
		return CompositeConditionImpl.result(isLogic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS:
				return ((InternalEList<?>)getContainedLocations()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOCATIONS:
				return getLocations();
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS:
				return getContainedLocations();
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOWER_TARGET_DISTANCE_BOUND:
				return getLowerTargetDistanceBound();
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__UPPER_TARGET_DISTANCE_BOUND:
				return getUpperTargetDistanceBound();
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOGIC:
				return isLogic();
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
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends GeoLocated>)newValue);
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS:
				getContainedLocations().clear();
				getContainedLocations().addAll((Collection<? extends GeoLocated>)newValue);
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOWER_TARGET_DISTANCE_BOUND:
				setLowerTargetDistanceBound((Double)newValue);
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__UPPER_TARGET_DISTANCE_BOUND:
				setUpperTargetDistanceBound((Double)newValue);
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOGIC:
				setLogic((Boolean)newValue);
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
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOCATIONS:
				getLocations().clear();
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS:
				getContainedLocations().clear();
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOWER_TARGET_DISTANCE_BOUND:
				setLowerTargetDistanceBound(LOWER_TARGET_DISTANCE_BOUND_EDEFAULT);
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__UPPER_TARGET_DISTANCE_BOUND:
				setUpperTargetDistanceBound(UPPER_TARGET_DISTANCE_BOUND_EDEFAULT);
				return;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOGIC:
				setLogic(LOGIC_EDEFAULT);
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
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__CONTAINED_LOCATIONS:
				return containedLocations != null && !containedLocations.isEmpty();
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOWER_TARGET_DISTANCE_BOUND:
				return lowerTargetDistanceBound != LOWER_TARGET_DISTANCE_BOUND_EDEFAULT;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__UPPER_TARGET_DISTANCE_BOUND:
				return upperTargetDistanceBound != UPPER_TARGET_DISTANCE_BOUND_EDEFAULT;
			case RuntimePackage.IS_BY_GEO_LOCATION_CONDITION__LOGIC:
				return logic != LOGIC_EDEFAULT;
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
		result.append(" (lowerTargetDistanceBound: ");
		result.append(lowerTargetDistanceBound);
		result.append(", upperTargetDistanceBound: ");
		result.append(upperTargetDistanceBound);
		result.append(", logic: ");
		result.append(logic);
		result.append(')');
		return result.toString();
	}

} //IsByGeoLocationConditionImpl
