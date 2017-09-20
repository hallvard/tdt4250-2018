package no.hal.pg.http;

import java.util.Collection;

import javax.servlet.Servlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.log.LogService;

import no.hal.pg.http.auth.AuthenticationHandler;

// OSGi Http Whiteboard, 140.4 in Enterprise R6 specification
@Component(
		property={
				"osgi.http.whiteboard.servlet.name:String=data",
				"osgi.http.whiteboard.servlet.pattern:String=/data/*"
				},
		scope=ServiceScope.PROTOTYPE
		)
@SuppressWarnings("serial")
public class ResourceServlet extends AbstractResourceServlet implements Servlet {

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile Collection<IResourceProvider> resourceProviders;
	
	@Override
	public Iterable<IResourceProvider> getResourceProviders() {
		return resourceProviders;
	}

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile IRequestPathResolver requestPathResolver;

	@Override
	public IRequestPathResolver getRequestPathResolver() {
		return requestPathResolver;
	}
	
	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile IRequestQueryExecutor requestQueryExecutor;
	
	@Override
	public IRequestQueryExecutor getRequestQueryExecutor() {
		return requestQueryExecutor;
	}

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile IResponseSerializer responseSerializer;
	
	@Override
	public IResponseSerializer getResponseSerializer() {
		return responseSerializer;
	}

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile Collection<AuthenticationHandler<?>> authenticationHandlers;
	
	@Override
	public Iterable<AuthenticationHandler<?>> getAuthenticationHandlers() {
		return authenticationHandlers;
	}

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile LogService logger;
	
	@Override
	public LogService getLogger() {
		return logger;
	}
}
