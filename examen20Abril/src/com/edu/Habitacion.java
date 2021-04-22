package com.edu;

import java.util.List;
import java.util.Objects;

public abstract class Habitacion {
	
	protected int numPersonas;
	protected int codigo;
	protected List <Persona> personas;
	
	public Habitacion(int numPersonas){
		this.numPersonas = numPersonas;
		this.codigo = Objects.hash(numPersonas);
	}

	public Habitacion() {}
	
	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	
}
