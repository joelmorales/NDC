package org.iata.crosscutting.exception;

public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplicationException() {
		super();
	}

	public ApplicationException(String message) {
		super(message);
	}

}
