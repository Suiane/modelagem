package com.ifpi.ted2019.services.exceptions;

public class ObjectNotFoundExcepition extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectNotFoundExcepition(String message, Throwable cause) {
		super(message, cause);

	}

	public ObjectNotFoundExcepition(String message) {
		super(message);

	}

}