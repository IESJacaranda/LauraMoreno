package pooAvanzado.relacion10.ejercicio1.exception;

public class DineroInsuficienteException extends Exception {
	public DineroInsuficienteException() {
		super("El saldo y el cr�dito de la cuenta es insuficiente para poder realizar la operaci�n.");
	}

}
