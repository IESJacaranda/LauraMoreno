package Exception;

public class GeneradorNoIncluidoException extends Exception {
	public GeneradorNoIncluidoException() {
		super("El generador que ha introducido no se encuentra registrado");
	}

}
