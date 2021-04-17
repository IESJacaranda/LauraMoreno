package relacion8;

public class MesesInexistentesException extends Exception {

	public MesesInexistentesException() {
		super("El mes introducido es inexistente.");
	}
}
