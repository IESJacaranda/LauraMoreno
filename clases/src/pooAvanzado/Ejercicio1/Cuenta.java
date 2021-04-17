package pooAvanzado.Ejercicio1;

import pooAvanzado.Ejercicio1.bonificacion.Bonificacion;
import pooAvanzado.Ejercicio1.exception.CantidadARetirarMenorQueSaldoException;
import pooAvanzado.Ejercicio1.exception.TitularNoValidoException;

public class Cuenta {
	
	protected Titular titular;
	private double saldo;
	private Bonificacion bonificacion;
	
	public Cuenta(Titular titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.bonificacion = Bonificacion.CUENTA_NORMAL;
	}
	
	public Cuenta() {}
	
	public void retirarDinero(double cantidadARetirar) throws CantidadARetirarMenorQueSaldoException, TitularNoValidoException, Exception {
		if(cantidadARetirar <= this.saldo) {
			this.saldo -= cantidadARetirar;
		}else {
			throw new CantidadARetirarMenorQueSaldoException();
		}
	}
	
	public void ingresarDinero(double dinero) {
		this.saldo += dinero;
	}
	
	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Bonificacion getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(Bonificacion bonificacion) {
		this.bonificacion = bonificacion;
	}
}