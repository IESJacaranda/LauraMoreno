package simuGeneradores2.body;

import java.time.LocalDate;

import interaz.Monetizable;

public class Eolico extends AbsGenerador {

private int numAspas;
	
	public Eolico(String localidad, LocalDate fechaInicio, double potencia, int numAspas) {
		super(localidad, fechaInicio, potencia);
		this.numAspas = numAspas;
	}

	public int getNumAspas() {
		return numAspas;
	}

	public void setNumAspas(int numAspas) {
		this.numAspas = numAspas;
	}

	@Override
	public String toString() {
		return super.toString() + " (Eolico) numAspas=" + numAspas ;
	}

	@Override
	public double dinero(double precio) {
		return (potencia*numAspas)*PRECIO_ENERGIA;
	}

	

	
}
