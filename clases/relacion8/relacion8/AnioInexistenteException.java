package relacion8;

public class AnioInexistenteException extends Exception {
	
	public AnioInexistenteException() {
		super("El año introducido es inexistente");
	}

}
