package no.hal.pg.http;

public interface IRequestHelper {
	public IRequestPathResolver getRequestPathResolver();
	public IRequestQueryExecutor getRequestQueryExecutor();
	public IResponseSerializer getResponseSerializer();
}
