package no.hal.pg.runtime.http.tests;

import java.io.StringWriter;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

import no.hal.pg.http.IResponseSerializer;
import no.hal.pg.http.impl.JsonSerializer;
import no.hal.pg.osm.GeoLatLong;
import no.hal.pg.osm.OsmFactory;
import no.hal.pg.osm.geoutil.LatLong;

public class OsmJsonSerializerTest {

	private JsonSerializer jsonSerializer;

	@Before
	public void setUp() {
		try {
			BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
			Collection<ServiceReference<IResponseSerializer>> serviceReferences = bundleContext.getServiceReferences(IResponseSerializer.class, null);
			for (ServiceReference<IResponseSerializer> serviceReference : serviceReferences) {
				IResponseSerializer serializer = bundleContext.getService(serviceReference);
				if (serializer instanceof JsonSerializer) {
					jsonSerializer = (JsonSerializer) serializer;
				}
			}
		} catch (InvalidSyntaxException e) {
		}
		Assert.assertNotNull(jsonSerializer);
	}

	@Test
	public void testOsmSerializer() {
		GeoLatLong geoLatLong = OsmFactory.eINSTANCE.createGeoLatLong();
		geoLatLong.setLocation(new LatLong(62, 12));
		StringWriter writer = new StringWriter();
		try {
			jsonSerializer.serialize(geoLatLong, writer);
		} catch (Exception e) {
			Assert.fail();
		}
		Assert.assertEquals("{\"locationLatitude\":62.0,\"locationLongitude\":12.0}", writer.getBuffer().toString().replaceAll("\\s+", ""));
	}
}
