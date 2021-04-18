package pooAvanzado.relacion10.Ejercicio2.Exception;

public class CombustibleNoValidoException extends Exception {
	public CombustibleNoValidoException() {
		super("El combustible introducido no es correcto (diesel o gasolina).");
	}

}
