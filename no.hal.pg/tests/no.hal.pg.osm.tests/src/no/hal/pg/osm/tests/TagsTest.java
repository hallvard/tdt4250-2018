package no.hal.pg.osm.tests;

import org.junit.Assert;

import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.Tag;
import no.hal.pg.osm.Tags;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tags</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pgo.osm.Tags#getTagDefaults() <em>Get Tag Defaults</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String) <em>Has Tag</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Tagged#getTag(java.lang.String) <em>Get Tag</em>}</li>
 *   <li>{@link no.hal.pgo.osm.Tagged#hasTag(java.lang.String, java.lang.String) <em>Has Tag</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TagsTest {

	public void testHasTag__String() {
		Tags tags = OsmFactory.eINSTANCE.createTags();
		Assert.assertFalse(tags.hasTag("tag1"));
		Assert.assertFalse(tags.hasTag("tag2"));

		Tag tag1 = OsmFactory.eINSTANCE.createTag(),  tag2 = OsmFactory.eINSTANCE.createTag();
		tags.getTags().add(tag1);
		tags.getTags().add(tag2);

		Assert.assertFalse(tags.hasTag("tag1"));
		Assert.assertFalse(tags.hasTag("tag2"));

		tag1.setKey("tag1");
		Assert.assertTrue(tags.hasTag("tag1"));
		Assert.assertFalse(tags.hasTag("tag2"));

		tag2.setKey("tag2");
		Assert.assertTrue(tags.hasTag("tag1"));
		Assert.assertTrue(tags.hasTag("tag2"));
		
//		Tags defaults = OsmFactory.eINSTANCE.createTags();
//		Tag tag3 = OsmFactory.eINSTANCE.createTag();
//		tag3.setKey("tag3");
//		defaults.getTags().add(tag3);
//		tags.setTagDefaults(defaults);
//		assertTrue(tags.hasTag("tag3"));
	}

	public void testGetTag__String() {
		Tags tags = OsmFactory.eINSTANCE.createTags();
		Assert.assertEquals(null, tags.getTag("tag1"));
		Assert.assertEquals(null, tags.getTag("tag2"));

		Tag tag1 = OsmFactory.eINSTANCE.createTag(),  tag2 = OsmFactory.eINSTANCE.createTag();
		tags.getTags().add(tag1);
		tags.getTags().add(tag2);
		Assert.assertEquals(null, tags.getTag("tag1"));
		Assert.assertEquals(null, tags.getTag("tag2"));

		tag1.setKey("tag1");
		Assert.assertEquals(null, tags.getTag("tag1"));
		Assert.assertEquals(null, tags.getTag("tag2"));

		tag1.setValue("value1");		
		Assert.assertEquals("value1", tags.getTag("tag1"));
		Assert.assertEquals(null, tags.getTag("tag2"));

		tag2.setKey("tag2");
		Assert.assertEquals("value1", tags.getTag("tag1"));
		Assert.assertEquals(null, tags.getTag("tag2"));

		tag2.setValue("value2");		
		Assert.assertEquals("value1", tags.getTag("tag1"));
		Assert.assertEquals("value2", tags.getTag("tag2"));
		
//		Tags defaults = OsmFactory.eINSTANCE.createTags();
//		Tag tag3 = OsmFactory.eINSTANCE.createTag();
//		tag3.setKey("tag3");
//		tag3.setValue("tag3");
//		defaults.getTags().add(tag3);
//		tags.setTagDefaults(defaults);
//		assertEquals("tag3", tags.getTag("tag3"));
	}

	public void testHasTag__String_String() {
		Tags tags = OsmFactory.eINSTANCE.createTags();
		Assert.assertFalse(tags.hasTag("tag1"));
		Assert.assertFalse(tags.hasTag("tag2"));
		Tag tag1 = OsmFactory.eINSTANCE.createTag(),  tag2 = OsmFactory.eINSTANCE.createTag();
		tags.getTags().add(tag1);
		tags.getTags().add(tag2);
		Assert.assertFalse(tags.hasTag("tag1", "value1"));
		Assert.assertFalse(tags.hasTag("tag2", "value2"));

		tag1.setKey("tag1");
		Assert.assertFalse(tags.hasTag("tag1", "value1"));
		Assert.assertFalse(tags.hasTag("tag2", "value2"));

		tag1.setValue("value1");		
		Assert.assertFalse(tags.hasTag("tag1", "value0"));
		Assert.assertTrue(tags.hasTag("tag1", "value1"));
		Assert.assertFalse(tags.hasTag("tag2", "value2"));

		tag2.setKey("tag2");
		Assert.assertFalse(tags.hasTag("tag1", "value0"));
		Assert.assertTrue(tags.hasTag("tag1", "value1"));
		Assert.assertFalse(tags.hasTag("tag2", "value2"));

		tag2.setValue("value2");		
		Assert.assertFalse(tags.hasTag("tag1", "value0"));
		Assert.assertTrue(tags.hasTag("tag1", "value1"));
		Assert.assertFalse(tags.hasTag("tag2", "value0"));
		Assert.assertTrue(tags.hasTag("tag2", "value2"));

//		Tags defaults = OsmFactory.eINSTANCE.createTags();
//		Tag tag3 = OsmFactory.eINSTANCE.createTag();
//		tag3.setKey("tag3");
//		defaults.getTags().add(tag3);
//		tags.setTagDefaults(defaults);
//		assertFalse(tags.hasTag("tag3", "tag3"));
//		tag3.setValue("tag3");
//		assertTrue(tags.hasTag("tag3", "tag3"));
	}

} //TagsTest
