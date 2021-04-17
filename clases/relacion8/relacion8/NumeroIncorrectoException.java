package relacion8;

public class NumeroIncorrectoException extends Exception {
	public NumeroIncorrectoException() {
		super("El número introducido debe estar entre 0 y 1000 inclusives.");
	}

}
