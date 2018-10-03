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
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ValueNode;

import no.hal.pg.http.auth.AuthenticationHandler;
import no.hal.pg.http.auth.UnauthorizedException;

@SuppressWarnings("serial")
public abstract class AbstractResourceServlet extends HttpServlet { // WebSocketServlet implements WebSocketCreator {

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

	protected abstract LoggerFactory getLoggerFactory();
	
	protected Logger logger;
	
	public Logger getLogger() {
		LoggerFactory loggerFactory = getLoggerFactory();
		if (logger == null && loggerFactory != null) {
			logger = loggerFactory.getLogger(this.getClass());
		} else if (loggerFactory == null) {
			logger = null;
		}
		return logger;
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

	protected void handlePostBody(String body, Map<String, Object> params) {
		params.put("httpPostBody", body);
		decodePostBody(body, params);
	}

	protected static class RequestData {
		IResourceProvider resourceProvider;
		List<String> resourcePath;
		String op;
		Map<String, Object> params;
		AuthenticationHandler<?> authenticationHandler;
	}

	protected RequestData getRequestData(HttpServletRequest req, HttpServletResponse resp, Map<String, Object> params) throws ServletException, IOException {
		String path = req.getPathInfo();
		List<String> segments = (path != null && path.length() > 0 ? Arrays.asList(path.substring(1).split("/")) : null);
		if (segments == null || segments.isEmpty()) {
			throw new ServletException("Path must at least have a resource identifier");
		}
		String resourceProviderName = segments.get(0);
		IResourceProvider resourceProvider = getResourceProvider(resourceProviderName);
		if (resourceProvider == null && getLogger() != null) {
			getLogger().info("No resource provider for " + resourceProviderName);				
			throw new ServletException("The resource identifier " + resourceProviderName + " is not recognized");
		}
		List<String> resourcePath = segments.subList(1, segments.size());
		String op = null;
		if (segments.size() > 1 && getRequestQueryExecutor() != null) {
			op = segments.get(segments.size() - 1);
			resourcePath = segments.subList(1, segments.size() - 1);
		}
		if (getLogger() != null) {
			getLogger().info("Handling " + resourcePath + " + " + op + " with " + resourceProvider);
		}
		EObject context = (EObject) EcoreUtil.getObjectByType(resourceProvider.getRootObjects(), EcorePackage.eINSTANCE.getEObject());
		AuthenticationHandler<?> authenticationHandler = null;
		try {
			authenticationHandler = getAuthenticationHandler(context);
			if (authenticationHandler != null && (! authenticationHandler.acceptRequest(req, context))) {
				authenticationHandler.forceAuthentication(resp, "Request not accepted", resourceProvider.getName());
			} else {
				RequestData requestData = new RequestData();
				requestData.resourceProvider = resourceProvider;
				requestData.resourcePath = resourcePath;
				requestData.op = op;
				requestData.params = params;
				requestData.authenticationHandler = authenticationHandler;
				return requestData;
			}
		} catch (UnauthorizedException ue) {
			String message = "Unauthorized, " + (authenticationHandler != null ? "forcing authentication" : "but no authentication handler") + ": " + ue.getMessage();
			if (getLogger() != null) {
				getLogger().info(message);
			}
			if (authenticationHandler != null) {
				authenticationHandler.forceAuthentication(resp, ue.getMessage(), resourceProvider.getName());
			}
		} catch (Exception e) {
			String message = "Exception during request handling: " + e.getMessage();
			if (getLogger() != null) {
				getLogger().warn(message);
			}
			throw new ServletException(e);
		}
		return null;
	}

	protected void doHelper(HttpServletRequest req, HttpServletResponse resp, Map<String, Object> params) throws ServletException, IOException {
		RequestData requestData = getRequestData(req, resp, params);
		if (requestData != null) {
			try {
				doHelper(req, requestData, resp);
			} catch (ServletException e) {
				throw e;
			} catch (Exception e) {
				throw new ServletException(e);
			}
		}
	}

	protected Object getPathObject(RequestData requestData) throws Exception {
		return getPathObject(requestData.resourceProvider, requestData.resourcePath, requestData.op, requestData.params, requestData.authenticationHandler);
	}

	protected Object getPathObject(IResourceProvider resourceProvider, Collection<String> resourcePath, String op, Map<String, Object> params, AuthenticationHandler<?> authenticationHandler) throws Exception {
		IRequestPathResolver requestPathResolver = getRequestPathResolver();
		requestPathResolver.setSubjectProvider(authenticationHandler);
		Object object = requestPathResolver.getObjectForPath(resourceProvider.getRootObjects(), resourcePath.toArray(new String[0]));
		Object result = object;
		if (op != null) {
			Collection<?> target = (object instanceof Collection<?> ? (Collection<?>) object : Collections.singletonList(object));
			IRequestQueryExecutor requestQueryExecutor = getRequestQueryExecutor();
			requestQueryExecutor.setSubjectProvider(authenticationHandler);
			result = requestQueryExecutor.getRequestQueryResult(target, op, params);
		}
		return result;
	}
	
	protected void doHelper(HttpServletRequest req, RequestData requestData, HttpServletResponse resp) throws Exception {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		Writer writer = new OutputStreamWriter(outputStream);
		doHelper(req, requestData, writer);
		String responseString = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
		resp.getWriter().write(responseString);
	}

	protected void doHelper(HttpServletRequest req, RequestData requestData, Writer responseWriter) throws Exception {
		Object result = getPathObject(requestData);
		IResponseSerializer responseSerializer = getResponseSerializer();
		responseSerializer.serialize(result, responseWriter);
	}
	
	//
	
	public static String getPostBody(HttpServletRequest req, Map<String, Object> params) throws IOException {
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

	public static Map<String, Object> decodeQuery(HttpServletRequest req, Map<String, Object> params) {
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

	public static Map<String, Object> decodePostBody(String body, Map<String, Object> params) {
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

	// websocket support

// Commented out, due to
//	I was missing the following three additional bundles:
//		org.objectweb.asm.all.debug_5.0.2
//		org.apache.aries.util_1.1.1
//		org.apache.aries.spifly.dynamic.bundle_1.0.2

//	@Override
//	public void configure(WebSocketServletFactory webSocketServletFactory) {
//		webSocketServletFactory.setCreator(this);
//	}
//
//	@Override
//	public Object createWebSocket(ServletUpgradeRequest upgradeRequest, ServletUpgradeResponse upgradeResponse) {
//		return new WebSocketAdapter() {
//		    @Override
//		    public void onWebSocketText(String message) {
//		        if (isConnected()) {
//		            getRemote().sendString(message,null);
//		        }
//		    }
//		};
//	}
	

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
