package pooAvanzado.relacion10.Ejercicio2;

public class Coche extends AbstractVehiculo {

	public Coche(String matricula, double precio) {
		super(matricula, precio);
	}

	@Override
	public double calcularPrecio(int dias, double combustible) {
		setPrecio((this.precio+combustible)*dias);
		return getPrecio();
	}

}
