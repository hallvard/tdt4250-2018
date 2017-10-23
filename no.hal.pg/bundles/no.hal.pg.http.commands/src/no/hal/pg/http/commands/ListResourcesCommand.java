package no.hal.pg.http.commands;

import java.util.ArrayList;
import java.util.Collection;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.http.IResourceProvider;

@Component(
	service=ListResourcesCommand.class,
	property={
		"osgi.command.scope:String=pg",
		"osgi.command.function:String=lr"
	}
)
public class ListResourcesCommand {

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile Collection<IResourceProvider> resourceProviders;
	
	
	public Collection<String> lr() {
		Collection<String> resourceNames = new ArrayList<String>();
		for (IResourceProvider resourceProvider : resourceProviders) {
			resourceNames.add(resourceProvider.getName());
		}
		return resourceNames;
	}
}
