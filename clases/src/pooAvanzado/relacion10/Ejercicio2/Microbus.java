package pooAvanzado.relacion10.Ejercicio2;

import pooAvanzado.relacion10.Ejercicio2.Exception.NumPlazasInvalidoException;

public class Microbus extends AbstractVehiculo {

	public Microbus(String matricula, double precio) {
		super(matricula, precio);
	}

	@Override
	public double calcularPrecio(int dias, double plazas) throws NumPlazasInvalidoException {
		if(plazas<0) {
			throw new NumPlazasInvalidoException();
		}
		setPrecio((this.precio*dias)+(5*plazas));	
		return getPrecio();
	}

}
