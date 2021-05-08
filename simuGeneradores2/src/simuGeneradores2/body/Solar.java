package simuGeneradores2.body;

import java.time.LocalDate;

import enumerado.ETipo;
import interaz.Monetizable;

public class Solar extends AbsGenerador {

	private int numPaneles;
	private int m2;
	private ETipo tipo;
	private double coeficiente;
	
	public Solar(String localidad, LocalDate fechaInicio, double potencia, int numPaneles, int m2, String tipo) throws Exception {
		super(localidad, fechaInicio, potencia);
		this.numPaneles = numPaneles;
		this.m2 = m2;
		ETipo aux = null;
		try {
			aux = ETipo.valueOf(tipo);
		}catch (Exception e) {
			throw new Exception("El tipo de panel introducido no es correcto");
		}
		this.tipo = aux;
		this.coeficiente = m2/numPaneles;
	}

	public int getNumPaneles() {
		return numPaneles;
	}

	public void setNumPaneles(int numPaneles) {
		this.numPaneles = numPaneles;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public ETipo getTipo() {
		return tipo;
	}

	public void setTipo(ETipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " (Solar) numPaneles=" + numPaneles + ", m2=" + m2 + ", tipo=" + tipo + ", coeficiente="+coeficiente;
	}

	@Override
	public double dinero(double precio) {
		// TODO Auto-generated method stub
		return (potencia*numPaneles)*PRECIO_ENERGIA;
	}
	

	
	
	
	

}
