package body;

import java.time.LocalDate;

import enumerado.Tipo;
import interfaz.IMonetizable;

public class Solar extends AbstractGenerador {

	protected int numPaneles;
	protected int m2;
	protected Tipo tipo;
	
	public Solar(LocalDate fecha, String localidad, int potencia, int numPaneles, int m2, Tipo tipo) {
		super(fecha, localidad, potencia);
		this.numPaneles = numPaneles;
		this.m2 = m2;
		this.tipo = tipo;
	}

	@Override
	public double dinero() {
		return this.potencia*this.numPaneles*PRECIO;
	}

	@Override
	public String toString() {
		return super.toString() + ", número de paneles: " + numPaneles + ", metros cuadrados: " + m2 + ", tipo: " + tipo 
				+ ", coeficiente solar: " + this.m2*this.numPaneles;
	}

	
}
