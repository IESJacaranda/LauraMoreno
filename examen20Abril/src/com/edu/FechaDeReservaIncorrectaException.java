package com.edu;

public class FechaDeReservaIncorrectaException extends Exception {
	public FechaDeReservaIncorrectaException() {
		super("La fecha de reserva debe ser igual o posterior a la fecha actual.");
	}

}
