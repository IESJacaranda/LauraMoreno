package com.edu;

public class NumSuperiorDePersonasException extends Exception {
	public NumSuperiorDePersonasException() {
		super("El n�mero de personas para esa instancia es demasiado elevado.");
	}

}
