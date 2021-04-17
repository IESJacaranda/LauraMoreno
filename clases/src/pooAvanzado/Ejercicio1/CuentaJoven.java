package pooAvanzado.Ejercicio1;

import pooAvanzado.Ejercicio1.bonificacion.Bonificacion;
import pooAvanzado.Ejercicio1.exception.CantidadARetirarMenorQueSaldoException;
import pooAvanzado.Ejercicio1.exception.TitularNoValidoException;

public class CuentaJoven extends Cuenta {

	private Bonificacion bonificacion;
	
	public CuentaJoven(Titular titular, double saldo) throws TitularNoValidoException {
		super(titular, saldo);
		if(esTitutlarValido()) {
			this.bonificacion = Bonificacion.CUENTA_JOVEN;
		}else {
			throw new TitularNoValidoException();
		}
	}

	public boolean esTitutlarValido() {
		return this.getTitular().getEdad() >= 18 && this.getTitular().getEdad() < 25;
	}

	@Override
	public void retirarDinero(double cantidadARetirar) throws Exception {
		if(this.esTitutlarValido()) {
			super.retirarDinero(cantidadARetirar);
		}else {
			throw new TitularNoValidoException();
		}
	}

	public Bonificacion getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(Bonificacion bonificacion) {
		this.bonificacion = bonificacion;
	}

	public String mostrar() {
		return toString();
	}

	public String toString() {
		return "CuentaJoven " + this.bonificacion;
	}
}
