package com.eam.megainventario.inventario.controller.exception;

public class RestBaseException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	protected final String errorCode;

	public RestBaseException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
