package pooAvanzado.relacion10.Ejercicio3.Exception;

public class FuerzaMagoNoPermitidaException extends Exception {
	public FuerzaMagoNoPermitidaException() {
		super("Fuerza demasiado alta, m�ximo 15");
	}
}
