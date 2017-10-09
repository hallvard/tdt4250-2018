package no.hal.pg.http.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.http.IReferenceResolver;
import no.hal.pg.http.IRequestPathResolver;
import no.hal.pg.http.IRequestQueryExecutor;
import no.hal.pg.http.auth.ISubjectProvider;

@Component(
	service={IRequestPathResolver.class, IRequestQueryExecutor.class}
)
public class RequestHandler implements IRequestPathResolver, IRequestQueryExecutor, IReferenceResolver {

	protected Collection<IReferenceResolver> referenceResolvers;

	@Reference(
		cardinality=ReferenceCardinality.MULTIPLE,
		policy=ReferencePolicy.DYNAMIC,
		unbind="removeReferenceResolver"
	)
	public void addReferenceResolver(IReferenceResolver referenceResolver) {
		if (referenceResolvers == null) {
			referenceResolvers = new ArrayList<IReferenceResolver>();
		}
		referenceResolvers.add(referenceResolver);
	}

	public void removeReferenceResolver(IReferenceResolver referenceResolver) {
		if (referenceResolvers != null) {
			referenceResolvers.remove(referenceResolver);
		}
	}

	@Override
	public EObject resolveReference(String reference, EObject context) {
		for (IReferenceResolver referenceResolver : referenceResolvers) {
			EObject resolved = referenceResolver.resolveReference(reference, context);
			if (resolved != null) {
				return resolved;
			}
		}
		return null;
	}

	private ISubjectProvider<?> subjectProvider;
	
	@Override
	public void setSubjectProvider(ISubjectProvider<?> subjectProvider) {
		this.subjectProvider = subjectProvider;
	}

	@Override
	public Object getObjectForPath(Collection<? extends Object> rootObjects, String... segments) {
		RequestSupport requestSupport = new RequestSupport(rootObjects);
		requestSupport.setReferenceResolver(this);
		requestSupport.setSubjectProvider(subjectProvider);
		for (int i = 0; i < segments.length; i++) {
			String segment = segments[i];
			requestSupport.nextStep(segment, null);
		}
		return requestSupport.getObjects();
	}

	@Override
	public Object getRequestQueryResult(Collection<?> target, String op, Map<String, ?> parameters) {
		RequestSupport requestSupport = new RequestSupport(new BasicEList<Object>(target));
		requestSupport.setReferenceResolver(this);
		requestSupport.setSubjectProvider(subjectProvider);
		return requestSupport.nextStep(op, parameters);
	}
}
