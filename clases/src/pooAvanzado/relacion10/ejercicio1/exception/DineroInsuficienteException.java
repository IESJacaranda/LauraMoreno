package pooAvanzado.relacion10.ejercicio1.exception;

public class DineroInsuficienteException extends Exception {
	public DineroInsuficienteException() {
		super("El saldo y el crédito de la cuenta es insuficiente para poder realizar la operación.");
	}

}
