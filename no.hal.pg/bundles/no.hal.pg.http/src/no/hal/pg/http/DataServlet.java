package no.hal.pg.http;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.log.LogService;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import no.hal.graphql.emf.SchemaGenerator;
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
	protected volatile LogService logger;
	
	@Override
	public LogService getLogger() {
		return logger;
	}
	
	@Override
	protected void doHelper(IResourceProvider resourceProvider, Collection<?> objects, Collection<String> resourcePath, String op, Map<String, Object> params, AuthenticationHandler<?> authenticationHandler, Writer responseWriter) throws Exception {
		Object result = getPathObject(resourceProvider, objects, resourcePath, op, params, authenticationHandler);
		Object postBody = params.get("httpPostBody");
		if (postBody != null) {
			EObject root = null;
			if (result instanceof EObject) {
				root = (EObject) result;
			} else if (result instanceof Collection<?>) {
				Collection<?> col = (Collection<?>) result;
				if (col.size() > 0) {
					Object first = col.iterator().next();
					if (first instanceof EObject) {
						root = (EObject) first;
					}
				}
			}
			if (root != null) {
				result = doGraphQl(String.valueOf(postBody), root, params);
			}
		}
		IResponseSerializer responseSerializer = getResponseSerializer();
		responseSerializer.serialize(result, responseWriter);
	}

	protected Object doGraphQl(String body, EObject root, Map<String, Object> params) {
		GraphQLSchema schema = getGraphQLSchema(root);
	    	GraphQL graphQl = new GraphQL.Builder(schema).build();
	    	ExecutionInput executionInput = new ExecutionInput.Builder().query(body).root(root).build();
		try {
			ExecutionResult result = graphQl.execute(executionInput);
			if (! result.getErrors().isEmpty()) {
				throw new RuntimeException(result.getErrors().toString());
			}
			return result.getData();
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}

	private Map<Collection<EPackage>, GraphQLSchema> schemas = new HashMap<Collection<EPackage>, GraphQLSchema>();

	protected GraphQLSchema getGraphQLSchema(EObject root) {
		List<EPackage> packages = new ArrayList<EPackage>();
		collectEPackages(root, packages);
		Collections.sort(packages, new Comparator<EPackage>() {
			@Override
			public int compare(EPackage p1, EPackage p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
		GraphQLSchema schema = schemas.get(packages);
		if (schema == null) {
			SchemaGenerator schemaGenerator = new SchemaGenerator(packages.toArray(new EPackage[packages.size()]));
			schema = schemaGenerator.generate(root.eClass());
			schemas.put(packages, schema);
		}
		return schema;
	}

	protected void collectEPackages(EObject root, Collection<EPackage> packages) {
		collectEPackages(root.eClass(), packages);
		TreeIterator<EObject> it = root.eAllContents();
		while (it.hasNext()) {
			collectEPackages(it.next().eClass(), packages);
		}
	}

	protected void collectEPackages(EClass eClass, Collection<EPackage> packages) {
		EPackage pack = eClass.getEPackage();
		if (! packages.contains(pack)) {
			packages.add(pack);
		}
		for (EClass superClass : eClass.getEAllSuperTypes()) {
			pack = superClass.getEPackage();
			if (! packages.contains(pack)) {
				packages.add(pack);
			}
		}
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
