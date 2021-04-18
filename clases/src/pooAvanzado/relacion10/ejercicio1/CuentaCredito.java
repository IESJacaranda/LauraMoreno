package pooAvanzado.relacion10.ejercicio1;

import pooAvanzado.Ejercicio1.Cuenta;
import pooAvanzado.Ejercicio1.Titular;
import pooAvanzado.Ejercicio1.exception.CantidadARetirarMenorQueSaldoException;
import pooAvanzado.relacion10.ejercicio1.exception.DineroInsuficienteException;

public class CuentaCredito extends Cuenta {
	
	private final int LIMITE_INFERIOR_CREDITO = 300;
	private double credito = 100;
	
	public CuentaCredito(Titular titular, double saldo, double credito) {
		super(titular, saldo);
		this.credito = credito;
		if(saldo <= 300) {
			this.credito = saldo;
		}else {
			this.credito = LIMITE_INFERIOR_CREDITO;
		}
	}
	
	public CuentaCredito(Titular titular) {
		super(titular, 0); 
	}
	
	@Override
	public void ingresarDinero(double dinero) {
		super.ingresarDinero(dinero);
	}

	public double getCredito() {
		return credito;
	}

	
	public void sacarDinero(double dineroASacar) throws DineroInsuficienteException {
		if(dineroASacar == getSaldo()) {
			setSaldo(0);
		}else if(dineroASacar <= getSaldo()) {
			setSaldo(getSaldo()-dineroASacar);
		}else if((getSaldo() + this.credito) >= dineroASacar) {
			dineroASacar -= getSaldo();
			setSaldo(0);
			this.credito -= dineroASacar;
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
