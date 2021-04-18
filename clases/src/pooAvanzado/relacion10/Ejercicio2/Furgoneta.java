package pooAvanzado.relacion10.Ejercicio2;

import pooAvanzado.relacion10.Ejercicio2.Exception.PMDInvalidoException;

public class Furgoneta extends AbstractVehiculo {

	public Furgoneta(String matricula, double precio) {
		super(matricula, precio);
	}

	@Override
	public double calcularPrecio(int dias, double PMA) throws PMDInvalidoException {
		if(PMA<0) {
			throw new PMDInvalidoException();
		}
		setPrecio((this.precio*dias)+(PMA*0.5));
		return getPrecio();
	}

}
