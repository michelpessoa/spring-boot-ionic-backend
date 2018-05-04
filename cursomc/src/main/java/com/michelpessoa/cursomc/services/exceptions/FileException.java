package com.michelpessoa.cursomc.services.exceptions;

public class FileException extends RuntimeException {

	private static final long serialVersionUID = -3185451456764378899L;

	public FileException(String msg) {
		super(msg);
	}
	
	public FileException(String msg, Throwable cause) {
		super(msg, cause);
	}

}