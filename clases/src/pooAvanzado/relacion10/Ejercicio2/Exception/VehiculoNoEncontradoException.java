package pooAvanzado.relacion10.Ejercicio2.Exception;

public class VehiculoNoEncontradoException extends Exception {
	public VehiculoNoEncontradoException() {
		super("La matrícula introducida no se encuentra dentro del sistema.");
	}

}
