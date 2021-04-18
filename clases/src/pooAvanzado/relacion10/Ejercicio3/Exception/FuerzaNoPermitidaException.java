package pooAvanzado.relacion10.Ejercicio3.Exception;

public class FuerzaNoPermitidaException extends Exception {
	public FuerzaNoPermitidaException() {
		super("La fuerza debe ser entre 0 y 20.");
	}

}
