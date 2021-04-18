package pooAvanzado.relacion10.Ejercicio2.Exception;

public class TipoIncorrectoException extends Exception {
	public TipoIncorrectoException() {
		super("El tipo de vehículo introducido es incorrecto(coche, furgoneta o microbus)");
	}

}
