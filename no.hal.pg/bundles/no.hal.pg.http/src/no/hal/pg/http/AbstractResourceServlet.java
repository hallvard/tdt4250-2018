package no.hal.pg.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.LogService;

import no.hal.pg.http.auth.AuthenticationHandler;
import no.hal.pg.http.auth.UnauthorizedException;
import no.hal.pg.http.util.RequestHelper;
import no.hal.pg.http.util.ServletUtil;

@SuppressWarnings("serial")
public abstract class AbstractResourceServlet extends HttpServlet {

	public abstract Iterable<IResourceProvider> getResourceProviders();
	
	protected IResourceProvider getResourceProvider(String name) {
		for (IResourceProvider resourceProvider : getResourceProviders()) {
			if (resourceProvider.getName().equals(name)) {
				return resourceProvider;
			}
		}
		return null;
	}

	public abstract IRequestPathResolver getRequestPathResolver();

	public abstract IRequestQueryExecutor getRequestQueryExecutor();
	
	public abstract IResponseSerializer getResponseSerializer();

	public abstract Iterable<AuthenticationHandler<?>> getAuthenticationHandlers();
	
	protected AuthenticationHandler<?> getAuthenticationHandler(EObject context) {
		for (AuthenticationHandler<?> authenticationHandler : getAuthenticationHandlers()) {
			if (authenticationHandler.acceptsContext(context)) {
				return authenticationHandler;
			}
		}
		return null;
	}

	public abstract LogService getLogger();

	protected void log(int severity, String message) {
		if (getLogger() != null) {
			getLogger().log(severity, message);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> params = ServletUtil.decodeQuery(req, new HashMap<String, Object>());
		doHelper(req, resp, params);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> params = ServletUtil.decodeQuery(req, new HashMap<String, Object>());
		ServletUtil.decodePostBody(req, params);
		doHelper(req, resp, params);
	}
	
	protected void doHelper(HttpServletRequest req, HttpServletResponse resp, Map<String, Object> params) throws ServletException, IOException {
		String path = req.getPathInfo();
		List<String> segments = Arrays.asList(path.substring(1).split("/"));
		if (segments.size() == 0) {
			throw new ServletException("Path must at least have a resource identifier");
		}
		String resourceProviderName = segments.get(0);
		IResourceProvider resourceProvider = getResourceProvider(resourceProviderName);
		if (resourceProvider == null) {
			log(LogService.LOG_INFO, "No resource provider for " + resourceProviderName);				
			throw new ServletException("The resource identifier " + resourceProviderName + " is not recognized");
		}
		List<String> resourcePath = segments.subList(1, segments.size());
		String op = null;
		if (segments.size() > 1 && getRequestQueryExecutor() != null) {
			op = segments.get(segments.size() - 1);
			resourcePath = segments.subList(1, segments.size() - 1);
		}
		log(LogService.LOG_INFO, "Handling " + resourcePath + " + " + op + " with " + resourceProvider);
		Collection<?> objects = resourceProvider.getRootObjects();
		EObject context = (EObject) EcoreUtil.getObjectByType(objects, EcorePackage.eINSTANCE.getEObject());
		AuthenticationHandler<?> authenticationHandler = null;
		try {
			authenticationHandler = getAuthenticationHandler(context);
			if (authenticationHandler != null && (! authenticationHandler.acceptRequest(req, context))) {
				authenticationHandler.forceAuthentication(resp, "Request not accepted", resourceProvider.getName());
			} else {
				doHelper(req, resourceProvider, objects, resourcePath, op, params, authenticationHandler, resp);
			}
		} catch (UnauthorizedException ue) {
			String message = "Unauthorized, " + (authenticationHandler != null ? "forcing authentication" : "but no authentication handler") + ": " + ue.getMessage();
			log(LogService.LOG_INFO, message);
			if (authenticationHandler != null) {
				authenticationHandler.forceAuthentication(resp, ue.getMessage(), resourceProvider.getName());
			}
		} catch (Exception e) {
			String message = "Exception during request handling: " + e.getMessage();
			log(LogService.LOG_WARNING, message);
			throw new ServletException(e);
		}
	}
	
	protected Object getPathObject(IResourceProvider resourceProvider, Collection<?> objects, Collection<String> resourcePath, String op, Map<String, Object> params, AuthenticationHandler<?> authenticationHandler) throws Exception {
		IRequestPathResolver requestPathResolver = RequestHelper.get(resourceProvider.getRequestPathResolver(), getRequestPathResolver());
		requestPathResolver.setSubjectProvider(authenticationHandler);
		Object object = requestPathResolver.getObjectForPath(objects, resourcePath.toArray(new String[0]));
		Object result = object;
		if (op != null) {
			Collection<?> target = (object instanceof Collection<?> ? (Collection<?>) object : Collections.singletonList(object));
			IRequestQueryExecutor requestQueryExecutor = RequestHelper.get(resourceProvider.getRequestQueryExecutor(), getRequestQueryExecutor());
			requestPathResolver.setSubjectProvider(authenticationHandler);
			result = requestQueryExecutor.getRequestQueryResult(target, op, params);
		}
		return result;
	}
	
	protected void doHelper(HttpServletRequest req, IResourceProvider resourceProvider, Collection<?> objects, Collection<String> resourcePath, String op, Map<String, Object> params, AuthenticationHandler<?> authenticationHandler, HttpServletResponse resp) throws Exception {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		Writer writer = new OutputStreamWriter(outputStream);
		doHelper(resourceProvider, objects, resourcePath, op, params, authenticationHandler, writer);
		String responseString = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
		resp.getWriter().write(responseString);
	}

	protected void doHelper(IResourceProvider resourceProvider, Collection<?> objects, Collection<String> resourcePath, String op, Map<String, Object> params, AuthenticationHandler<?> authenticationHandler, Writer responseWriter) throws Exception {
		Object result = getPathObject(resourceProvider, objects, resourcePath, op, params, authenticationHandler);
		IResponseSerializer responseSerializer = RequestHelper.get(resourceProvider.getResponseSerializer(), getResponseSerializer());
		responseSerializer.serialize(result, responseWriter);
	}
}
