package no.hal.pg.arc.tests;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import no.hal.pg.arc.ArcFactory;
import no.hal.pg.arc.SimpleCapability;

public class SimpleCapabilityTest {

	@Test
	public void testGetQualifiedName() {
		SimpleCapability cap = ArcFactory.eINSTANCE.createSimpleCapability();
		cap.getSegments().addAll(Arrays.asList("a", "b", "c"));
		Assert.assertEquals("a.b.c", cap.getQualifiedName());
	}

	@Test
	public void testSetQualifiedName() {
		SimpleCapability cap = ArcFactory.eINSTANCE.createSimpleCapability();
		cap.setQualifiedName("a.b.c");
		Assert.assertEquals(Arrays.asList("a", "b", "c"), cap.getSegments());		
	}

	static SimpleCapability createSimpleCapability(String qName) {
		SimpleCapability cap = ArcFactory.eINSTANCE.createSimpleCapability();
		cap.setQualifiedName(qName);
		return cap;
	}
	
	@Test
	public void testHasCapability() {
		Assert.assertTrue(createSimpleCapability("a.b.c").hasCapability(createSimpleCapability("a.b.c")));
	}
}
