package no.hal.pg.osm.tests;

import org.junit.Assert;

import no.hal.pg.osm.Node;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.geoutil.LatLong;

public class NodeTest {

	public void testGetLatLong() {
		Node node = OsmFactory.eINSTANCE.createNode();
		node.setLatitude(62);
		node.setLongitude(12);
		Assert.assertEquals(new LatLong(62, 12), node.getLatLong());
	}

}
