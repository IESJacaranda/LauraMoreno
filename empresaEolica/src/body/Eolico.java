package body;

import java.time.LocalDate;
import interfaz.IMonetizable;

public class Eolico extends AbstractGenerador {

	protected int numAspas;
	
	public Eolico(LocalDate fecha, String localidad, int potencia, int numAspas) {
		super(fecha, localidad, potencia);
		this.numAspas = numAspas;
	}

	@Override
	public double dinero() {
		return this.potencia*this.numAspas*PRECIO;
	}

	@Override
	public String toString() {
		return super.toString() + ", número de aspas: "+ this.numAspas;
	}

	public int getNumAspas() {
		return numAspas;
	}

	public void setNumAspas(int numAspas) {
		this.numAspas = numAspas;
	}

}
