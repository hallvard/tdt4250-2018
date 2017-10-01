package no.hal.pg.osm.tests;

import org.junit.Assert;
import org.junit.Test;

import no.hal.pg.osm.GeoLatLong;
import no.hal.pg.osm.GeoLocation;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.geoutil.LatLong;

public class GeoLocationTest {

	@Test
	public void testGetLocationLatLong() {
		GeoLocation location = OsmFactory.eINSTANCE.createGeoLocation();
		location.setLatitude(62);
		location.setLongitude(12);
		Assert.assertEquals(new LatLong(62, 12), location.getLatLong());
	}
	
	@Test
	public void testGetLatLongLatLong() {
		GeoLatLong location = OsmFactory.eINSTANCE.createGeoLatLong();
		location.setLocation(new LatLong(62, 12));
		Assert.assertEquals(new LatLong(62, 12), location.getLatLong());
	}
}
