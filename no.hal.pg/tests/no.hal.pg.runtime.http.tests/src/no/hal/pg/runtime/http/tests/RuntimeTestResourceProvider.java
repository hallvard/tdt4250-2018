package no.hal.pg.runtime.http.tests;

import org.eclipse.emf.common.util.URI;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.http.IResourceProvider;
import no.hal.pg.http.impl.ResourceProvider;

@Component
public class RuntimeTestResourceProvider extends ResourceProvider implements IResourceProvider {

	public RuntimeTestResourceProvider() {
		super();
		setUri(URI.createURI(getClass().getResource("RuntimeTest.xmi").toString()));
	}
}
