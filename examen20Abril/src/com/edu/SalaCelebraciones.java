package com.edu;

public class SalaCelebraciones extends Sala {
	
	private int numMaxPersonas;
	private double PRECIO_FACTOR_SCELEBRACIONES;
	
	public SalaCelebraciones(Persona personaReserva, int numAsistentes) {
		super(personaReserva, numAsistentes);
		this.numMaxPersonas = MaximoEstancias.SCELEBRACION.getNumMaxPersonas();
		this.PRECIO_FACTOR_SCELEBRACIONES = MaximoEstancias.SCELEBRACION.getNumMaxPersonas();
	}
	
	public SalaCelebraciones() {
		super();
		this.numMaxPersonas = MaximoEstancias.SCELEBRACION.getNumMaxPersonas();
		this.PRECIO_FACTOR_SCELEBRACIONES = MaximoEstancias.SCELEBRACION.getNumMaxPersonas();
	}

	public int getNumMaxPersonas() {
		return numMaxPersonas;
	}

	public void setNumMaxPersonas(int numMaxPersonas) {
		this.numMaxPersonas = numMaxPersonas;
	}

	public double getPRECIO_FACTOR_SCELEBRACIONES() {
		return PRECIO_FACTOR_SCELEBRACIONES;
	}

	public void setPRECIO_FACTOR_SCELEBRACIONES(double pRECIO_FACTOR_SCELEBRACIONES) {
		PRECIO_FACTOR_SCELEBRACIONES = pRECIO_FACTOR_SCELEBRACIONES;
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

	public int getnumMaxPersonas() {
		return MaximoEstancias.SCELEBRACION.getNumMaxPersonas();
	}
	

}
