package no.hal.pg.osm.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import no.hal.pg.osm.GeoLatLong;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.geoutil.LatLong;
import no.hal.pg.osm.util.OsmValidator;

public class OsmValidatorTest {

	private OsmValidator osmValidator;
	
	@Before
	public void setUp() {
		osmValidator = new OsmValidator();
	}
	
	@Test
	public void testValidateLatLong() {
		GeoLatLong location = OsmFactory.eINSTANCE.createGeoLatLong();
		location.setLocation(new LatLong(62, 12));
		Assert.assertTrue(osmValidator.validateGeoLocated(location, null, null));
		location.setLocation(new LatLong(91, 12));
		Assert.assertFalse(osmValidator.validateGeoLocated(location, null, null));
		location.setLocation(new LatLong(62, -112));
		Assert.assertFalse(osmValidator.validateGeoLocated(location, null, null));
	}
}
