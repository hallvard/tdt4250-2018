package no.hal.pg.osm.tests;

import org.junit.Assert;
import org.junit.Test;

import no.hal.pg.osm.Node;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.Tag;
import no.hal.pg.osm.geoutil.LatLong;

public class NodeTest {

	@Test
	public void testGetLatLong() {
		Node node = OsmFactory.eINSTANCE.createNode();
		node.setLatitude(62);
		node.setLongitude(12);
		Assert.assertEquals(new LatLong(62, 12), node.getLatLong());
	}
	
	static void addTag(Node node, String key, String value) {
		Tag tag = OsmFactory.eINSTANCE.createTag();
		tag.setKey(key);
		tag.setValue(value);
		node.getTags().add(tag);
	}

	@Test
	public void testGetName() {
		Node node = OsmFactory.eINSTANCE.createNode();
		Assert.assertNull(node.getName());
		addTag(node, "name", "theName");
		Assert.assertEquals("theName", node.getName());
	}
	
	@Test
	public void testGetKind() {
		Node node = OsmFactory.eINSTANCE.createNode();
		Assert.assertNull(node.getKind());
		addTag(node, "amenity", "theKind");
		Assert.assertEquals("theKind", node.getKind());
	}	
}
