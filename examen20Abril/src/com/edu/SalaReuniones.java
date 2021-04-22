package com.edu;

public class SalaReuniones extends Sala {

	private int numMaxPersonas;
	private double PRECIO_FACTOR_SREUNIONES;
	
	public SalaReuniones() {
		super();
		this.numMaxPersonas = MaximoEstancias.SREUNIONES.getNumMaxPersonas();
		this.PRECIO_FACTOR_SREUNIONES = MaximoEstancias.SREUNIONES.getNumMaxPersonas();
	}
	
	public SalaReuniones(Persona personaReserva, int numAsistentes) {
		super(personaReserva, numAsistentes);
		this.numMaxPersonas = MaximoEstancias.SREUNIONES.getNumMaxPersonas();
		this.PRECIO_FACTOR_SREUNIONES = MaximoEstancias.SREUNIONES.getNumMaxPersonas();
	}

	public int getNumMaxPersonas() {
		return numMaxPersonas;
	}

	public void setNumMaxPersonas(int numMaxPersonas) {
		this.numMaxPersonas = numMaxPersonas;
	}

	public double getPRECIO_FACTOR_SIMPLE() {
		return PRECIO_FACTOR_SREUNIONES;
	}

	public void setPRECIO_FACTOR_SIMPLE(double pRECIO_FACTOR_SIMPLE) {
		PRECIO_FACTOR_SREUNIONES = pRECIO_FACTOR_SIMPLE;
	}

	@Override
	public Persona getPersonaReserva() {
		// TODO Auto-generated method stub
		return super.getPersonaReserva();
	}

	@Override
	public void setPersonaReserva(Persona personaReserva) {
		// TODO Auto-generated method stub
		super.setPersonaReserva(personaReserva);
	}

	@Override
	public int getNumAsistentes() {
		// TODO Auto-generated method stub
		return super.getNumAsistentes();
	}

	@Override
	public void setNumAsistentes(int numAsistentes) {
		// TODO Auto-generated method stub
		super.setNumAsistentes(numAsistentes);
	}

	public double getPRECIO_FACTOR_SREUNIONES() {
		// TODO Auto-generated method stub
		return 0;
	}

}
