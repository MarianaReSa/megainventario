package com.eam.megainventario.inventario.controller.exception;

public class EntityNotFoundException extends RestBaseException{

	private static final long serialVersionUID = 1L;
	
	public EntityNotFoundException(String message, String errorCode) {
		super(message, errorCode);
		// TODO Auto-generated constructor stub
	}


}
