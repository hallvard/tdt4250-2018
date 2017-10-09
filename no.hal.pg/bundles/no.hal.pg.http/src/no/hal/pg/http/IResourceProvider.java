package no.hal.pg.http;

import java.util.Collection;

public interface IResourceProvider {
	public String getName();
	public Collection<? extends Object> getRootObjects();
}
