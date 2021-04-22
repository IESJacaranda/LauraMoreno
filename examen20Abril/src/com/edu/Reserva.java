package com.edu;

import java.time.LocalDate;
import java.util.List;

public class Reserva implements Comparable<Reserva>{
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private List <Persona> clientes;
	private int numPersonas;
	private int codigo;
	private Habitacion habitacion;
	public static final double PRECIO_BASE = 10.75;
	
	
	public Reserva(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin, int numPersonas) {
		this.fechaInicio = fechaInicio;
		this.habitacion = habitacion;
		this.fechaFin = fechaFin;
		this.numPersonas = numPersonas;
		for(int i=0;i<numPersonas;i++) {
			clientes.add(new Persona());
		}
	}
	
	public Reserva() {}

	//PARA MOSTRAR LAS RESERVAS DE FORMA ORDENADA POR FECHA
	@Override
	public int compareTo(Reserva o) {
		int resul;
		if ( o.getFechaInicio().isEqual(this.fechaInicio)){
			resul=0;
		}else{
			if (o.getFechaInicio().isAfter(this.fechaInicio)){
				resul=1;
			}else{
				resul=-1;
			}
		}
		return resul;
	}
	
	@Override
	public String toString() {
		String nombre = "";
		if(habitacion instanceof Simple) {
			nombre = "Habitación Simple";
		}else if(habitacion instanceof Doble) {
			nombre = "Habitación Doble";		
		}else if(habitacion instanceof Suite) {
			nombre = "Suite";
		}else if(habitacion instanceof SalaCelebraciones) {
			nombre = "Sala de celebraciones";
		}else if(habitacion instanceof SalaReuniones) {
			nombre = "Sala de reuniones";
		}
		return "La reserva está hecha para el " + fechaInicio + nombre;
	}

	//SETTERS Y GETTERS
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<Persona> getClientes() {
		return clientes;
	}

	public void setClientes(List<Persona> clientes) {
		this.clientes = clientes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public int getNumPersonas() {
		return numPersonas;
	}

	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	public static double getPrecioBase() {
		return PRECIO_BASE;
	}


	

}
