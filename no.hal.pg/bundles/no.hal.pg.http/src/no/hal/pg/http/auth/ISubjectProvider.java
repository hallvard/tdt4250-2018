package no.hal.pg.http.auth;

public interface ISubjectProvider<P> {
	public P getSubject();
}
