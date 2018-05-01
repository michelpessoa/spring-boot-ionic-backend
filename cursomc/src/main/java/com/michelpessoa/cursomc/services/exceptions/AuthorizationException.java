package com.michelpessoa.cursomc.services.exceptions;

public class AuthorizationException extends RuntimeException{

	private static final long serialVersionUID = 8367164691736228508L;

	public AuthorizationException(String msg) {
		super(msg);
	}
	
	public AuthorizationException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
