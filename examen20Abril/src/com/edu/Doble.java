package com.edu;

import java.util.List;

public class Doble extends Habitacion {

	private double PRECIO_FACTOR_DOBLE;
	private int maxPersonas;
	
	public Doble() {
		super();
		this.PRECIO_FACTOR_DOBLE = MaximoEstancias.DOBLE.getNumMaxPersonas();
		this.maxPersonas = MaximoEstancias.DOBLE.getNumMaxPersonas();
	}
	
	public Doble(int numPersonas) {
		super(numPersonas);
		this.PRECIO_FACTOR_DOBLE = MaximoEstancias.DOBLE.getNumMaxPersonas();
		this.maxPersonas = MaximoEstancias.DOBLE.getNumMaxPersonas();
	}

	
	@Override
	public String toString() {
		return "Habitación doble";
	}

	public double getPRECIO_FACTOR_SIMPLE() {
		return PRECIO_FACTOR_DOBLE;
	}

	public void setPRECIO_FACTOR_SIMPLE(double pRECIO_FACTOR_SIMPLE) {
		PRECIO_FACTOR_DOBLE = pRECIO_FACTOR_SIMPLE;
	}

	public int getMaxPersonas() {
		return maxPersonas;
	}

	public void setMaxPersonas(int maxPersonas) {
		this.maxPersonas = maxPersonas;
	}

	@Override
	public int getNumPersonas() {
		// TODO Auto-generated method stub
		return super.getNumPersonas();
	}

	@Override
	public void setNumPersonas(int numPersonas) {
		// TODO Auto-generated method stub
		super.setNumPersonas(numPersonas);
	}

	@Override
	public int getCodigo() {
		// TODO Auto-generated method stub
		return super.getCodigo();
	}

	@Override
	public void setCodigo(int codigo) {
		// TODO Auto-generated method stub
		super.setCodigo(codigo);
	}

	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		return super.getPersonas();
	}

	@Override
	public void setPersonas(List<Persona> personas) {
		// TODO Auto-generated method stub
		super.setPersonas(personas);
	}

	public double getPRECIO_FACTOR_DOBLE() {
		// TODO Auto-generated method stub
		return 0;
	}


}
