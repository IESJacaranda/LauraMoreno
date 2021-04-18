package pooAvanzado.ejercicio3;

import java.time.LocalDate;

public class EmpleadoTemporal extends AbstractEmpleado {

	private LocalDate fechaAlta;
	private LocalDate fechaBaja;

	public EmpleadoTemporal(String nombre, int edad, String nif, double sueldo, LocalDate fechaAlta, LocalDate fechaBaja) {
		super(nombre, edad, nif, sueldo);
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		generarSueldo(sueldo);
	}

	public void generarSueldo(double sueldo) {
		this.setSueldo(sueldo);
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public LocalDate getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(LocalDate fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
}
