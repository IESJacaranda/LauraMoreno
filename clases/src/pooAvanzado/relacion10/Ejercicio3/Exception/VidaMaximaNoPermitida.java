package pooAvanzado.relacion10.Ejercicio3.Exception;

public class VidaMaximaNoPermitida extends Exception {
	public VidaMaximaNoPermitida() {
		super("La vida máxima debe estar entre 0 y 100.");
	}

}
