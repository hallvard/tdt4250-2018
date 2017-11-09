/**
 */
package no.hal.pg.osm.util;

import java.util.Map;

import no.hal.pg.osm.*;

import no.hal.pg.osm.geoutil.LatLong;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.osm.OsmPackage
 * @generated
 */
public class OsmValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final OsmValidator INSTANCE = new OsmValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.pg.osm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsmValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return OsmPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case OsmPackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case OsmPackage.GEO_LOCATION:
				return validateGeoLocation((GeoLocation)value, diagnostics, context);
			case OsmPackage.GEO_LAT_LONG:
				return validateGeoLatLong((GeoLatLong)value, diagnostics, context);
			case OsmPackage.GEO_LOCATED:
				return validateGeoLocated((GeoLocated)value, diagnostics, context);
			case OsmPackage.WAY:
				return validateWay((Way)value, diagnostics, context);
			case OsmPackage.NODE_REF:
				return validateNodeRef((NodeRef)value, diagnostics, context);
			case OsmPackage.OSM_ELEMENT:
				return validateOSMElement((OSMElement)value, diagnostics, context);
			case OsmPackage.TAGGED:
				return validateTagged((Tagged)value, diagnostics, context);
			case OsmPackage.TAGS:
				return validateTags((Tags)value, diagnostics, context);
			case OsmPackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case OsmPackage.RELATION:
				return validateRelation((Relation)value, diagnostics, context);
			case OsmPackage.MEMBER:
				return validateMember((Member)value, diagnostics, context);
			case OsmPackage.BOUNDS:
				return validateBounds((Bounds)value, diagnostics, context);
			case OsmPackage.OSM:
				return validateOSM((OSM)value, diagnostics, context);
			case OsmPackage.NOTE:
				return validateNote((Note)value, diagnostics, context);
			case OsmPackage.META_DATA:
				return validateMetaData((MetaData)value, diagnostics, context);
			case OsmPackage.LAT_LONG:
				return validateLatLong((LatLong)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(node, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(node, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeoLocated_validCoordinates(node, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoLocation(GeoLocation geoLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(geoLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(geoLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeoLocated_validCoordinates(geoLocation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoLatLong(GeoLatLong geoLatLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(geoLatLong, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(geoLatLong, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeoLocated_validCoordinates(geoLatLong, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeoLocated(GeoLocated geoLocated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(geoLocated, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(geoLocated, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeoLocated_validCoordinates(geoLocated, diagnostics, context);
		return result;
	}

	public boolean isValidCoordinate(double coordinate) {
		return coordinate >= -90.0 && coordinate <= 90.0;
	}
	
	/**
	 * Validates the validCoordinates constraint of '<em>Geo Located</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGeoLocated_validCoordinates(GeoLocated geoLocated, DiagnosticChain diagnostics, Map<Object, Object> context) {
		LatLong latLong = geoLocated.getLatLong();
		if (! (isValidCoordinate(latLong.latitude) && isValidCoordinate(latLong.longitude))) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validCoordinates", getObjectLabel(geoLocated, context) },
						 new Object[] { geoLocated },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWay(Way way, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(way, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeRef(NodeRef nodeRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nodeRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nodeRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeoLocated_validCoordinates(nodeRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSMElement(OSMElement osmElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osmElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagged(Tagged tagged, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagged, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTags(Tags tags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tags, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(member, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBounds(Bounds bounds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bounds, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOSM(OSM osm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(osm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNote(Note note, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(note, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaData(MetaData metaData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatLong(LatLong latLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //OsmValidator
