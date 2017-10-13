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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.log.LogService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ValueNode;

import no.hal.pg.http.auth.AuthenticationHandler;
import no.hal.pg.http.auth.UnauthorizedException;

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
		Map<String, Object> params = decodeQuery(req, new HashMap<String, Object>());
		doHelper(req, resp, params);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, Object> params = decodeQuery(req, new HashMap<String, Object>());
		handlePostBody(req, params, resp);
	}

	protected void handlePostBody(HttpServletRequest req, Map<String, Object> params, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String body = getPostBody(req, params);
			handlePostBody(body, params);
			doHelper(req, resp, params);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected String getPostBody(HttpServletRequest req, Map<String, Object> params) throws IOException {
		StringBuilder buffer = new StringBuilder();
		Scanner scanner = new Scanner(req.getInputStream());
		try {
			while (scanner.hasNextLine()) {
				buffer.append(scanner.nextLine());
				buffer.append("\n");
			}
		} finally {
			scanner.close();
		}
		return buffer.toString();
	}

	protected void handlePostBody(String body, Map<String, Object> params) {
		params.put("httpPostBody", body);
		decodePostBody(body, params);
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
		IRequestPathResolver requestPathResolver = getRequestPathResolver();
		requestPathResolver.setSubjectProvider(authenticationHandler);
		Object object = requestPathResolver.getObjectForPath(objects, resourcePath.toArray(new String[0]));
		Object result = object;
		if (op != null) {
			Collection<?> target = (object instanceof Collection<?> ? (Collection<?>) object : Collections.singletonList(object));
			IRequestQueryExecutor requestQueryExecutor = getRequestQueryExecutor();
			requestQueryExecutor.setSubjectProvider(authenticationHandler);
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
		IResponseSerializer responseSerializer = getResponseSerializer();
		responseSerializer.serialize(result, responseWriter);
	}
	
	//
	
	protected Map<String, Object> decodeQuery(HttpServletRequest req, Map<String, Object> params) {
		String query = req.getQueryString();
		if (query != null) {
			for (String param : query.split("&")) {
				int pos = param.indexOf('=');
				if (pos > 0) {
					params.put(param.substring(0, pos), param.substring(pos + 1));
				} else {
					params.put(param, true);				
				}
			}
		}
		return params;
	}

	protected Map<String, Object> decodePostBody(String body, Map<String, Object> params) {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonTree = null;
		try {
			jsonTree = mapper.readTree(body);
		} catch (IOException e) {
		}
		if (jsonTree instanceof ObjectNode) {
			ObjectNode objectNode = (ObjectNode) jsonTree;
			Iterator<String> fieldNames = objectNode.fieldNames();
			while (fieldNames.hasNext()) {
				String fieldName = fieldNames.next();
				Object valueNode = objectNode.get(fieldName);
				if (valueNode instanceof ValueNode) {
					valueNode = ((ValueNode) valueNode).asText();
				}
				params.put(fieldName, valueNode);
			}
		}
		return params;
	}
}

/*
 * @startuml
 * interface ILogger {
 * 	void log(int severity, String message)
 * }
 * class SMSLogger {
 * }
 * class FileLogger {
 * }
 * ILogger <|.. SMSLogger 
 * ILogger <|.. FileLogger
 * @enduml

 * @startuml
 * class SMSLogger {
 * }
 * class FileLogger {
 * }
 * SMSLogger -() ILogger
 * FileLogger -() ILogger
 * @enduml

 * @startuml
 * [SMSLogger] -- ILogger
 * [FileLogger] -- ILogger
 * @enduml

 * @startuml
 * class HttpServerImpl {
 * }
 * interface Servlet {
 * }
 * class DataServlet {
 * }
 * class AppServlet {
 * }
 * Servlet <|.. DataServlet 
 * Servlet <|.. AppServlet
 * HttpServerImpl -> Servlet: servlets
 * @enduml

 * @startuml
 * [DataServlet] -- Servlet
 * [AppServlet] -- Servlet
 * Servlet <.. [HttpServerImpl]: use
 * @enduml
 */
