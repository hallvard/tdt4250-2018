package no.hal.pg.http;

import java.io.Writer;
import java.util.Collection;
import java.util.Collections;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;
import org.osgi.service.log.LoggerFactory;

import no.hal.pg.http.auth.AuthenticationHandler;

// OSGi Http Whiteboard, 140.4 in Enterprise R6 specification
@Component(
		property={
				HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_NAME + ":String=data",
				HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_PATTERN + ":String=/data/*"
				},
		scope=ServiceScope.PROTOTYPE
		)
@SuppressWarnings("serial")
public class DataServlet extends AbstractResourceServlet implements Servlet {

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
	private volatile LoggerFactory loggerFactory;
	
	@Override
	protected LoggerFactory getLoggerFactory() {
		return loggerFactory;
	}

	@Override
	protected void doHelper(HttpServletRequest req, RequestData requestData, Writer responseWriter) throws Exception {
		Object result = getPathObject(requestData);
		Object postBody = requestData.params.get("httpPostBody");
		if (postBody != null) {
			String contentType = req.getHeader("Content-Type");
			if (contentType == null) {
				throw new ServletException("No Content-Type header");
			}
			int pos = contentType.indexOf(';');
			if (pos > 0) {
				contentType = contentType.substring(0, pos);
			}
			IPostHandler postHandler = getPostHandler(contentType);
			if (postHandler == null) {
				throw new ServletException("No handler for " + contentType);
			}
			try {
				result = postHandler.handlePostBody(result, String.valueOf(postBody), requestData.params);
			} catch (Exception e) {
				throw new ServletException("Exception when handling post body for " + contentType);
			}
		}
		IResponseSerializer responseSerializer = getResponseSerializer();
		responseSerializer.serialize(result, responseWriter);
	}
	
	protected IPostHandler getPostHandler(String contentType) {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		Collection<ServiceReference<IPostHandler>> serviceReferences = Collections.emptyList();
		try {
			serviceReferences = bundleContext.getServiceReferences(IPostHandler.class, "(postHandlerMimeType=" + contentType + ")");
		} catch (InvalidSyntaxException e) {
		}
		for (ServiceReference<IPostHandler> serviceReference : serviceReferences) {
			IPostHandler postHandler = bundleContext.getService(serviceReference);
			if (postHandler != null) {
				return postHandler;
			}
		}
		return null;
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
 * HttpServerImpl -> "*" Servlet: servlets
 * @enduml

 * @startuml
 * [DataServlet] -- Servlet
 * [AppServlet] -- Servlet
 * Servlet "*" <.. [HttpServerImpl]: use
 * @enduml

 * @startuml
 * [DataServlet] ..> "*" IResourceProvider
 * [DataServlet] ..> IRequestPathResolver
 * [DataServlet] ..> IResponseSerializer
 * [ResourceProvider] -u- IResourceProvider
 * [RequestHandler] -u- IRequestPathResolver
 * [JsonSerializer] -u- IResponseSerializer
 * [JsonSerializer] ..> "*" JsonEObjectSerializer
 * [JsonSerializer] ..> "*" JsonEAttributeSerializer
 * [OsmJsonSerializer] -u- JsonEObjectSerializer
 * [OsmJsonSerializer] -u- JsonEAttributeSerializer
 * @enduml
 */
