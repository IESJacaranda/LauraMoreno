package pooAvanzado.relacion10.Ejercicio3.Exception;

public class RazaNoPermitidaException extends Exception {
	public RazaNoPermitidaException() {
		super("La raza introducida no est� recogida en el programa (humano, elfo, orco o enano.)");
	}

}
