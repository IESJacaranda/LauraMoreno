package pooAvanzado.ejercicio3;

public class EmpleadoHoras extends AbstractEmpleado {

	private double precioHora;
	private int numHoras;
	
	public EmpleadoHoras(String nombre, int edad, String nif, double sueldo, double precioHora, int numHoras) {
		super(nombre, edad, nif, sueldo);
		this.precioHora = precioHora;
		this.numHoras = numHoras;
		generarSueldo(sueldo);
	}
	
	public double getPrecioHora() {
		return precioHora;
	}
	public void setPrecioHora(double precioHora) {
		this.precioHora = precioHora;
	}
	public int getNumHoras() {
		return numHoras;
	}
	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	
	@Override
	public void generarSueldo(double sueldo) {
		setSueldo(precioHora*numHoras);
		
	}
	
}
