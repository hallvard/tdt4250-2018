package no.hal.pg.http.commands;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.http.IResourceProvider;
import no.hal.pg.http.impl.ResourceProvider;

@Component(
	service=ToggleResourceCommand.class,
	property={
		"osgi.command.scope:String=pg",
		"osgi.command.function:String=tr"
	}
)
public class ToggleResourceCommand {

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile Collection<IResourceProvider> resourceProviders;
	
	public String tr(String resourceName) {
		IResourceProvider resourceProvider = getResourceProvider(resourceName);
		if (resourceProvider == null) {
			URI uri = URI.createURI(resourceName);
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(uri, true);
			try {
				resource.getContents();
			} catch (Exception e) {
				return "Exception when loading " + uri + ": " + e.getMessage();
			}
			ResourceProvider newResourceProvider = new ResourceProvider(resource);
			newResourceProvider.setName(uri.trimFileExtension().lastSegment());
			Activator.getINSTANCE().registerResourceProvider(newResourceProvider);
			return newResourceProvider.getName() + " @ " + uri + " added";
		} else {
			if (Activator.getINSTANCE().unregisterResourceProvider(resourceProvider)) {
				return resourceProvider.getName() + " removed";
			} else {
				return "Unknown resource provider";				
			}
		}
	}

	private IResourceProvider getResourceProvider(String name) {
		for (IResourceProvider resourceProvider : resourceProviders) {
			if (name.equals(resourceProvider.getName())) {
				return resourceProvider;
			}
		}
		return null;
	}
}
