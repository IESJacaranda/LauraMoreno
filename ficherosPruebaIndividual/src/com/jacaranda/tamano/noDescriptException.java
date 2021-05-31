package com.jacaranda.tamano;

public class noDescriptException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public noDescriptException() {
		super("El municipio que ha insertado no existe");
	}

}
