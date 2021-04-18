package pooAvanzado.relacion10.Ejercicio3.Exception;

public class ClerigoIteligenciaNoPermitida extends Exception {
	public ClerigoIteligenciaNoPermitida() {
		super("La inteligencia del clérigo no debe ser menor de 12 ni mayor de 16");
	}

}
