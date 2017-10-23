package no.hal.pg.http.commands;

import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;

import no.hal.pg.http.IResourceProvider;

public class Activator implements BundleActivator {

	private static Activator INSTANCE = null;
	
	public static Activator getINSTANCE() {
		return INSTANCE;
	}
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.INSTANCE = this;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.INSTANCE = null;
	}

	private Map<IResourceProvider, ServiceRegistration<IResourceProvider>> serviceRegistrations = new HashMap<IResourceProvider, ServiceRegistration<IResourceProvider>>();

	public void registerResourceProvider(IResourceProvider resourceProvider) {
		// register IResourceProvider, so it will be served by the ResourceServlet
		ServiceRegistration<IResourceProvider> serviceRegistration = FrameworkUtil.getBundle(getClass()).getBundleContext().registerService(IResourceProvider.class, resourceProvider, null);
		serviceRegistrations.put(resourceProvider, serviceRegistration);
	}
	
	public boolean unregisterResourceProvider(IResourceProvider resourceProvider) {
		if (! serviceRegistrations.containsKey(resourceProvider)) {
			return false;
		}
		ServiceRegistration<IResourceProvider> serviceRegistration = serviceRegistrations.get(resourceProvider);
		// unregister IResourceProvider, so it no longer will be servered by the ResourceServlet
		serviceRegistration.unregister();
		serviceRegistrations.remove(resourceProvider);
		return true;
	}
}
