package com.edu;

public class NumSuperiorDePersonasException extends Exception {
	public NumSuperiorDePersonasException() {
		super("El número de personas para esa instancia es demasiado elevado.");
	}

}
