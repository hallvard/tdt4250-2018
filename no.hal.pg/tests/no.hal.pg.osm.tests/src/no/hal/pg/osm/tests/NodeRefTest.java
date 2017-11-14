package no.hal.pg.osm.tests;

import no.hal.pg.osm.Node;
import no.hal.pg.osm.NodeRef;
import no.hal.pg.osm.OsmFactory;

import org.junit.Assert;
import org.junit.Test;

public class NodeRefTest {

	@Test
	public void testGetLatLong() {
		Node node = OsmFactory.eINSTANCE.createNode();
		node.setLatitude(62);
		node.setLongitude(12);
		NodeRef nodeRef = OsmFactory.eINSTANCE.createNodeRef();
		nodeRef.setRef(node);
		Assert.assertEquals(node.getLatLong(), nodeRef.getLatLong());
	}

	@Test
	public void testGetName() {
		Node node = OsmFactory.eINSTANCE.createNode();
		NodeTest.addTag(node, "name", "theName");
		NodeRef nodeRef = OsmFactory.eINSTANCE.createNodeRef();
		Assert.assertNull(nodeRef.getName());
		nodeRef.setRef(node);
		Assert.assertEquals("theName", nodeRef.getName());
	}
	
	@Test
	public void testGetKind() {
		Node node = OsmFactory.eINSTANCE.createNode();
		NodeTest.addTag(node, "amenity", "theKind");
		NodeRef nodeRef = OsmFactory.eINSTANCE.createNodeRef();
		Assert.assertNull(nodeRef.getKind());
		nodeRef.setRef(node);
		Assert.assertEquals("theKind", node.getKind());
	}	
}
