package pooAvanzado.relacion10.Ejercicio2.Exception;

public class TipoIncorrectoException extends Exception {
	public TipoIncorrectoException() {
		super("El tipo de veh�culo introducido es incorrecto(coche, furgoneta o microbus)");
	}

}
