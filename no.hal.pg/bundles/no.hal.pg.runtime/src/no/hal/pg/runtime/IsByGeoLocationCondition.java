/**
 */
package no.hal.pg.runtime;

import no.hal.pg.osm.GeoLocated;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is By Geo Location Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.IsByGeoLocationCondition#getLocations <em>Locations</em>}</li>
 *   <li>{@link no.hal.pg.runtime.IsByGeoLocationCondition#getContainedLocations <em>Contained Locations</em>}</li>
 *   <li>{@link no.hal.pg.runtime.IsByGeoLocationCondition#getLowerTargetDistanceBound <em>Lower Target Distance Bound</em>}</li>
 *   <li>{@link no.hal.pg.runtime.IsByGeoLocationCondition#getUpperTargetDistanceBound <em>Upper Target Distance Bound</em>}</li>
 *   <li>{@link no.hal.pg.runtime.IsByGeoLocationCondition#isLogic <em>Logic</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getIsByGeoLocationCondition()
 * @model
 * @generated
 */
public interface IsByGeoLocationCondition extends AbstractCondition<GeoLocated> {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.osm.GeoLocated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getIsByGeoLocationCondition_Locations()
	 * @model
	 * @generated
	 */
	EList<GeoLocated> getLocations();

	/**
	 * Returns the value of the '<em><b>Contained Locations</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.osm.GeoLocated}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Locations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Locations</em>' containment reference list.
	 * @see no.hal.pg.runtime.RuntimePackage#getIsByGeoLocationCondition_ContainedLocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeoLocated> getContainedLocations();

	/**
	 * Returns the value of the '<em><b>Lower Target Distance Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Target Distance Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Target Distance Bound</em>' attribute.
	 * @see #setLowerTargetDistanceBound(double)
	 * @see no.hal.pg.runtime.RuntimePackage#getIsByGeoLocationCondition_LowerTargetDistanceBound()
	 * @model
	 * @generated
	 */
	double getLowerTargetDistanceBound();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.IsByGeoLocationCondition#getLowerTargetDistanceBound <em>Lower Target Distance Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Target Distance Bound</em>' attribute.
	 * @see #getLowerTargetDistanceBound()
	 * @generated
	 */
	void setLowerTargetDistanceBound(double value);

	/**
	 * Returns the value of the '<em><b>Upper Target Distance Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Target Distance Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Target Distance Bound</em>' attribute.
	 * @see #setUpperTargetDistanceBound(double)
	 * @see no.hal.pg.runtime.RuntimePackage#getIsByGeoLocationCondition_UpperTargetDistanceBound()
	 * @model
	 * @generated
	 */
	double getUpperTargetDistanceBound();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.IsByGeoLocationCondition#getUpperTargetDistanceBound <em>Upper Target Distance Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Target Distance Bound</em>' attribute.
	 * @see #getUpperTargetDistanceBound()
	 * @generated
	 */
	void setUpperTargetDistanceBound(double value);

	/**
	 * Returns the value of the '<em><b>Logic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logic</em>' attribute.
	 * @see #setLogic(boolean)
	 * @see no.hal.pg.runtime.RuntimePackage#getIsByGeoLocationCondition_Logic()
	 * @model
	 * @generated
	 */
	boolean isLogic();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.IsByGeoLocationCondition#isLogic <em>Logic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logic</em>' attribute.
	 * @see #isLogic()
	 * @generated
	 */
	void setLogic(boolean value);

} // IsByGeoLocationCondition
