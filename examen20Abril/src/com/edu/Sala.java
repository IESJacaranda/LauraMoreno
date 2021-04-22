package com.edu;

public abstract class Sala extends Habitacion{
	//EN PRINCIPIO NO IBA A EXTENDER DE HABITACION. 
	//LO PENS� POR SEPARADO (HABITACIONES Y SALA) PERO EN EL M�TODO QUE DEVUELVE LA RESERVA ERA NECESARIO
	
	protected Persona personaReserva;
	protected int numAsistentes;
	
	public Sala(int numPersonas) {
		super(numPersonas);
	}

	public Sala() {}
	
	public Sala(Persona personaReserva, int numAsistentes) {
		this.personaReserva = personaReserva;
		this.numAsistentes = numAsistentes;
	}

	public Persona getPersonaReserva() {
		return personaReserva;
	}

	public void setPersonaReserva(Persona personaReserva) {
		this.personaReserva = personaReserva;
	}

	public int getNumAsistentes() {
		return numAsistentes;
	}

	public void setNumAsistentes(int numAsistentes) {
		this.numAsistentes = numAsistentes;
	}

	
}
