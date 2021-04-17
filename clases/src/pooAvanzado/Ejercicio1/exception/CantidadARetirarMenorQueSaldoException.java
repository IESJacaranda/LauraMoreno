package pooAvanzado.Ejercicio1.exception;

public class CantidadARetirarMenorQueSaldoException extends Exception {
	public CantidadARetirarMenorQueSaldoException() {
		super("La cantidad que desea retirar es menor que el sando contenido en la cuenta.");
	}

}
