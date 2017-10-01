package no.hal.pg.http;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.log.LogService;

import no.hal.pg.http.auth.AuthenticationHandler;

// OSGi Http Whiteboard, 140.4 in Enterprise R6 specification
@Component(
		property={
				"osgi.http.whiteboard.servlet.name:String=app",
				"osgi.http.whiteboard.servlet.pattern:String=/app/*",
				},
		scope=ServiceScope.PROTOTYPE
		)
@SuppressWarnings("serial")
public class AppServlet extends AbstractResourceServlet implements Servlet {

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
	
	@Override
	public IRequestQueryExecutor getRequestQueryExecutor() {
		return null;
	}

	@Override
	public IResponseSerializer getResponseSerializer() {
		return null;
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

	@Reference(policy=ReferencePolicy.DYNAMIC)
	protected volatile Collection<AppConfig> configs;
	
	public String getMainLocationFor(Object object) {
		for (AppConfig config : configs) {
			String ePackageUri = config.getEPackageUri();
			EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageUri);
			EClassifier eClassifier = ePackage.getEClassifier(config.getEClassName());
			if (eClassifier.isInstance(object)) {
				return config.getMainLocation();
			}
		}
		return null;
	}

	@Override
	protected void doHelper(HttpServletRequest req, IResourceProvider resourceProvider, Collection<?> objects, Collection<String> resourcePath, String op, Map<String, Object> params, AuthenticationHandler<?> authenticationHandler, HttpServletResponse resp) throws Exception {
		Object object = getPathObject(resourceProvider, objects, resourcePath, op, params, authenticationHandler);
		if (object == null) {
			throw new ServletException("No app Servlet for " + resourcePath);
		}
		if (object instanceof Iterable<?>) {
			Iterator<?> it = ((Iterable<?>) object).iterator();
			object = (it.hasNext() ? it.next() : null);
		}
		String mainLocation = getMainLocationFor(object);
		if (mainLocation == null) {
			throw new ServletException("No main location for " + object);
		}
		String location = req.getServletContext().getContextPath();
		location = location + mainLocation + "?dataUrl=";
		location = location + "/data/" + resourceProvider.getName();
		for (String segment : resourcePath) {
			location = location + "/" + segment;
		}
		resp.sendRedirect(location);
	}
}
