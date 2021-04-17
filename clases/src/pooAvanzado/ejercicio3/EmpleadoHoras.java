package pooAvanzado.ejercicio3;

public class EmpleadoHoras extends AbstractEmpleado {

	private double precioHora;
	private int numHoras;
	public EmpleadoHoras() {
		super();
	}
	public EmpleadoHoras(String nombre, int edad, String nif, double sueldo, double precioHora, int numHoras) {
		super(nombre, edad, nif, sueldo);
		this.precioHora = precioHora;
		this.numHoras = numHoras;
	}
	@Override
	public double generarSueldo() {
		return 0;
	}
	
}
