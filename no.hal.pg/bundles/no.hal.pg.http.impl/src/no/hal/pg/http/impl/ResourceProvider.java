package no.hal.pg.http.impl;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.pg.http.IResourceProvider;

public class ResourceProvider implements IResourceProvider {

	private URI uri;
	private Resource resource;
	
	public ResourceProvider() {
	}
	
	public ResourceProvider(URI uri) {
		this.uri = uri;
	}
	public void setUri(URI uri) {
		this.uri = uri;
	}

	public ResourceProvider(Resource resource) {
		this.resource = resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public Resource getResource() {
		if (resource == null && uri != null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.createResource(uri);
			try {
				resource.load(null);
				this.resource = resource;
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return this.resource;
	}

	private String name;
	private EClass rootObjectClass;
	
	@Override
	public String getName() {
		if (name != null) {
			return name;
		}
		if (resource != null) {
			return defaultName(resource.getURI());
		} else if (uri != null) {
			return defaultName(uri);			
		}
		return null;
	}
	
	public void setRootObjectClass(EClass rootObjectClass) {
		this.rootObjectClass = rootObjectClass;
	}

	public static String defaultName(URI uri) {
		return uri.trimFileExtension().lastSegment().replace('.', '/');
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Collection<? extends Object> getRootObjects() {
		Collection<? extends Object> objects = getResource().getContents();
		if (rootObjectClass != null) {
			objects = EcoreUtil.getObjectsByType(objects, rootObjectClass);
		}
		return objects;
	}
}
