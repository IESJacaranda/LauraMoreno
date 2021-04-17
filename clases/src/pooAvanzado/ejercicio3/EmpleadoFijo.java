package pooAvanzado.ejercicio3;

public class EmpleadoFijo extends AbstractEmpleado {

	private int anyoAlta;
	private final int BASE = 20;
	
	public EmpleadoFijo() {
		super();
	}

	public EmpleadoFijo(String nombre, int edad, String nif, double sueldo, int anyoAlta) {
		super(nombre, edad, nif, sueldo);
		this.anyoAlta = anyoAlta;
	}

	@Override
	public double generarSueldo() {//base
		return 0;
	}

}
