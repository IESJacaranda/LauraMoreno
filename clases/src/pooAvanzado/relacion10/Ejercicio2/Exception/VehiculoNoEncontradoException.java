package pooAvanzado.relacion10.Ejercicio2.Exception;

public class VehiculoNoEncontradoException extends Exception {
	public VehiculoNoEncontradoException() {
		super("La matr�cula introducida no se encuentra dentro del sistema.");
	}

}
