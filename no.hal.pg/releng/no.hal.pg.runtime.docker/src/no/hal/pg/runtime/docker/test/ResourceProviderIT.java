package no.hal.pg.runtime.docker.test;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import no.hal.pg.runtime.http.tests.ResourceProviderTest;

public class ResourceProviderIT extends ResourceProviderTest {

	@Before
	public void setUp() throws Exception {
		setUp(null, "runtime.port", true);
		System.out.println("Base URL: " + urlString);
	}

	@Test
	public void testRequests() throws IOException {
		super.testRequests();
	}
}
