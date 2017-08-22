package no.hal.pg.http;

import java.util.Collection;

import no.hal.pg.http.auth.ISubjectProvider;

public interface IRequestPathResolver {
	public void setSubjectProvider(ISubjectProvider<?> subjectProvider);
	public Object getObjectForPath(Collection<? extends Object> rootObjects, String... segments);
}
