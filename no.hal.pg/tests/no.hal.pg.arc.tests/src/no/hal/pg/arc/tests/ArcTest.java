package no.hal.pg.arc.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;
import org.junit.Test;

import no.hal.pg.arc.Arc;
import no.hal.pg.arc.ArcFactory;
import no.hal.pg.arc.ArcPackage;
import no.hal.pg.arc.Group;
import no.hal.pg.arc.Person;
import no.hal.pg.arc.Role;

public class ArcTest {

	@Test
	public void testHasCapability() {
		ArcFactory factory = ArcFactory.eINSTANCE;
		Person person = factory.createPerson();
		Role role1 = factory.createRole();
		role1.getCapabilities().add(SimpleCapabilityTest.createSimpleCapability("a.b.c"));
		person.getRoles().add(role1);
		Assert.assertTrue(person.hasCapability(SimpleCapabilityTest.createSimpleCapability("a.b.c")));
	}
	
	private Resource load(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(null);
			Assert.assertFalse(resourceSet.getResources().isEmpty());
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}
		return resource;
	}

	@Test
	public void testLoad() {
		URI uri = URI.createPlatformPluginURI("/no.hal.pg.arc.tests/src/no/hal/pg/arc/tests/ArcTest.xmi", true);
		load(uri);
	}
	
	@Test
	public void testArcHasCapability() {
		Resource resource = load(URI.createPlatformPluginURI("/no.hal.pg.arc.tests/src/no/hal/pg/arc/tests/ArcTest.xmi", true));
		Arc arc = (Arc) EcoreUtil.getObjectByType(resource.getContents(), ArcPackage.eINSTANCE.getArc());
		Assert.assertFalse(arc.getActors().isEmpty());
		Assert.assertTrue(arc.getActors().get(0) instanceof Group);
		Group group = (Group) arc.getActors().get(0);
		Assert.assertFalse(group.getMembers().isEmpty());
		Person hal = group.getMembers().get(0);
//		Assert.assertEquals("Hallvard Trætteberg", hal.getName());
		Assert.assertTrue(hal.hasCapability(SimpleCapabilityTest.createSimpleCapability("can.code")));
		Assert.assertTrue(hal.hasCapability(SimpleCapabilityTest.createSimpleCapability("a.b.c")));
		Assert.assertTrue(hal.hasCapability(SimpleCapabilityTest.createSimpleCapability("think")));
	}
}
