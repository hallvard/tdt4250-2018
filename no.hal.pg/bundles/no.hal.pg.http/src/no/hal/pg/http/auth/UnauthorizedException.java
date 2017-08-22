package no.hal.pg.http.auth;

@SuppressWarnings("serial")
public class UnauthorizedException extends RuntimeException {

	public UnauthorizedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnauthorizedException(String user) {
		super(user + " is not authorized for this operation", null);
	}
}
