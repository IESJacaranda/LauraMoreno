package com.edu;

import java.util.List;

public class Simple extends Habitacion {

	private double PRECIO_FACTOR_SIMPLE;
	private int maxPersonas;
	
	public Simple(int numPersonas) {
		super(numPersonas);
		this.PRECIO_FACTOR_SIMPLE = MaximoEstancias.SIMPLE.getNumMaxPersonas();
		this.maxPersonas = MaximoEstancias.SIMPLE.getNumMaxPersonas();
	}
	
	public Simple(){
		super();
		this.PRECIO_FACTOR_SIMPLE = MaximoEstancias.SIMPLE.getNumMaxPersonas();
		this.maxPersonas = MaximoEstancias.SIMPLE.getNumMaxPersonas();
	}

	public double getPRECIO_FACTOR_SIMPLE() {
		return PRECIO_FACTOR_SIMPLE;
	}

	public void setPRECIO_FACTOR_SIMPLE(double pRECIO_FACTOR_SIMPLE) {
		PRECIO_FACTOR_SIMPLE = pRECIO_FACTOR_SIMPLE;
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

}
