package no.hal.pg.http.commands;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.http.IRequestPathResolver;
import no.hal.pg.http.IResourceProvider;
import no.hal.pg.http.IResponseSerializer;

@Component(
	service=ResourceRequestCommand.class,
	property={
		"osgi.command.scope:String=pg",
		"osgi.command.function:String=rr"
	}
)
public class ResourceRequestCommand {

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile Collection<IResourceProvider> resourceProviders;
	
	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile IRequestPathResolver requestPathResolver;
		
	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile IResponseSerializer responseSerializer;

	public String rr(String requestPath) {
		List<String> segments = new ArrayList<String>(Arrays.asList(requestPath.split("/")));
		while (segments.remove(""));
		if (segments.isEmpty()) {
			return "No resource provider name in " + requestPath;
		}
		if (requestPathResolver != null) {
			String resourceProviderName = segments.get(0);
			IResourceProvider resourceProvider = getResourceProvider(resourceProviderName); 
			if (resourceProvider == null) {
				return "No resource provider named " + resourceProviderName;
			}
			segments.remove(0);
			String[] segmentsArray = segments.toArray(new String[segments.size()]);
			Collection<?> rootObjects = resourceProvider.getRootObjects();
			Object objects = requestPathResolver.getObjectForPath(rootObjects, segmentsArray);
			if (responseSerializer != null) {
				StringWriter stringWriter = new StringWriter();
				try {
					responseSerializer.serialize(objects, stringWriter);
					return stringWriter.toString();
				} catch (Exception e) {
					return e.getMessage();
				}
			}
		}
		return null;
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
