package com.edu;

public enum MaximoEstancias {
	SIMPLE(1),
	DOBLE(2),
	SUITE(2),
	SREUNIONES(20),
	SCELEBRACION(80);
	
	private int numMaxPersonas;
	
	private MaximoEstancias(int numMaxPersonas) {
		this.numMaxPersonas = numMaxPersonas;
	}

	public int getNumMaxPersonas() {
		return numMaxPersonas;
	}
}
