package pooAvanzado.ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EmpleadoFijo extends AbstractEmpleado {

	private int anyoAlta;
	private final int COMPLEMENTO = 20;
	
	public EmpleadoFijo(String nombre, int edad, String nif, double sueldo, int anyoAlta) {
		super(nombre, edad, nif, sueldo);
		this.anyoAlta = anyoAlta;
		generarSueldo(sueldo);
	}

	public int getAnyoAlta() {
		return anyoAlta;
	}

	public void setAnyoAlta(int anyoAlta) {
		this.anyoAlta = anyoAlta;
	}

	public int getCOMPLEMENTO() {
		return COMPLEMENTO;
	}

	@Override
	public void generarSueldo(double sueldo) {
		int anyo = LocalDate.now().getYear();
		
		setSueldo(sueldo + (COMPLEMENTO*(anyo - this.anyoAlta)));
		
	}

}
