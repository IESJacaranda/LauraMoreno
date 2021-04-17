package pooAvanzado.relacion10.ejercicio1;

import pooAvanzado.Ejercicio1.Cuenta;
import pooAvanzado.Ejercicio1.Titular;
import pooAvanzado.Ejercicio1.exception.CantidadARetirarMenorQueSaldoException;
import pooAvanzado.relacion10.ejercicio1.exception.DineroInsuficienteException;

public class CuentaCredito extends Cuenta {
	
	private final int LIMITE_INFERIOR_CREDITO = -300;
	private double credito = 100;
	private double saldo = 0;
	
	public CuentaCredito(Titular titular, double saldo, double credito) {
		super(titular, saldo);
		this.credito = credito;
		if(this.saldo <= 300) {
			this.credito -= this.saldo;
		}else {
			this.credito = LIMITE_INFERIOR_CREDITO;
		}
	}
	
	@Override
	public void ingresarDinero(double dinero) {
		super.ingresarDinero(dinero);
	}

	public double getCredito() {
		return credito;
	}

	public CuentaCredito(Titular titular) {
		super(titular, 0);
	}
	
	public void sacarDinero(double dineroASacar) throws DineroInsuficienteException {
		if(dineroASacar == this.saldo) {
			this.saldo = 0;
		}else if(dineroASacar < this.saldo) {
			this.saldo -= dineroASacar;
		}else if((this.saldo + (-this.credito)) < dineroASacar) {
			dineroASacar -= this.saldo;
			this.saldo = 0;
			this.credito += dineroASacar;
		}if(this.saldo + (-this.credito) == dineroASacar) {
			this.saldo = 0;
			this.credito = 0;
		}else {
			throw new DineroInsuficienteException();
		}
	}

	@Override
	public Titular getTitular() {
		return super.getTitular();
	}

	@Override
	public void setTitular(Titular titular) {
		super.setTitular(titular);
	}

	@Override
	public double getSaldo() {
		return super.getSaldo();
	}

	@Override
	public void setSaldo(double saldo) {
		super.setSaldo(saldo);
	}

}
