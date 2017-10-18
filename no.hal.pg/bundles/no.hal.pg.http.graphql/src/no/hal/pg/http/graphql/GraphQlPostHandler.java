package no.hal.pg.http.graphql;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.component.annotations.Component;

import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import no.hal.graphql.emf.SchemaGenerator;
import no.hal.pg.http.IPostHandler;

@Component(property="postHandlerMimeType:String=application/graphql")
public class GraphQlPostHandler implements IPostHandler {

	@Override
	public Object handlePostBody(Object root, String postBody, Map<String, Object> params) {
		EObject context = null;
		if (root instanceof EObject) {
			context = (EObject) root;
		} else if (root instanceof Collection<?>) {
			Collection<?> col = (Collection<?>) root;
			if (col.size() > 0) {
				Object first = col.iterator().next();
				if (first instanceof EObject) {
					context = (EObject) first;
				}
			}
		}
		System.out.println("handlePostBody: " + root + " POST " + postBody);
		if (context != null) {
			return doGraphQl(String.valueOf(postBody), context, params);
		}
		return root;
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
