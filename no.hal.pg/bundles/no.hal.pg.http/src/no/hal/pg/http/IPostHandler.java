package no.hal.pg.http;

import java.util.Map;

import javax.servlet.ServletException;

public interface IPostHandler {
	public Object handlePostBody(Object root, String postBody, Map<String, Object> params) throws ServletException;
}
