package com.jacaranda.tamano;

public class noComunidadException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public noComunidadException() {
		super("La comunidad que desea insertar no existe");
	}

}
