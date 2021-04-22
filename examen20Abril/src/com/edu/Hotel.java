package com.edu;

import static com.edu.Reserva.PRECIO_BASE;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

public class Hotel {
	
	private List<Habitacion> habitaciones; //13
	private List <Reserva> reservas;
	
	
	public Hotel(List<Habitacion> habitaciones, List<Reserva>reservas) {
		this.habitaciones = habitaciones;
		this.reservas = reservas;
	}
	
	public Hotel() {}
	
	//CASE 1
	public void inicializarHotel() {
		//SIMPLES
		Habitacion simple1 = new Simple();
		Habitacion simple2 = new Simple();
		Habitacion simple3 = new Simple();
		Habitacion simple4 = new Simple();
		Habitacion simple5 = new Simple();
		habitaciones.add(simple1);
		habitaciones.add(simple2);
		habitaciones.add(simple3);
		habitaciones.add(simple4);
		habitaciones.add(simple5);
		
		//DOBLES
		Habitacion doble1 = new Doble(); 
		Habitacion doble2 = new Doble(); 
		Habitacion doble3 = new Doble(); 
		habitaciones.add(doble1);
		habitaciones.add(doble2);
		habitaciones.add(doble3);
		
		//SUITE
		Habitacion suite = new Suite();
		habitaciones.add(suite);
		
		//SALAS CELEBRACIONES
		Habitacion salasCelebracion1 = new SalaCelebraciones();
		Habitacion salasCelebracion2 = new SalaCelebraciones();
		habitaciones.add(salasCelebracion1);
		habitaciones.add(salasCelebracion2);
		
		//SALAS REUNIONES
		Habitacion salasReunion1 = new SalaReuniones();
		Habitacion salasReunion2 = new SalaReuniones();
		habitaciones.add(salasReunion1);
		habitaciones.add(salasReunion2);
		
		System.out.println("El hotel se ha inicializado correctamente.");
	}
	
	//CASE 2
	public String listarInstalaciones(){
		return toString();
	}
	
	@Override
	public String toString() {
		return "Instalaciones:\nHabitación simple1\nHabitación simple2\nHabitación simple3\nHabitación simple4\nHabitación simple5\n"
				+ "Suite\nHabitación doble1\nHabitación doble2\nHabitación doble3\n"
				+ "Sala de reunión 1\nSala de reunión 2\nSala de celebración 1\nSala de celebración 2";
	}

	//CASE 3
	public void addReserva(Reserva reserva) throws FechaDeReservaIncorrectaException {
		
		if(reserva.getFechaInicio().isEqual(LocalDate.now()) || reserva.getFechaInicio().isAfter(LocalDate.now())) {
			throw new FechaDeReservaIncorrectaException();
		}else {
			reservas.add(reserva);
		}
	}
	
	
	//CASE 4
	public double calcularIngresosGenerados() {
		double ingresoGenerado = 0;
		long dias = 0;
		for(Reserva i: reservas) {
			dias = ChronoUnit.DAYS.between(i.getFechaInicio(), i.getFechaFin());
			if(i.getHabitacion() instanceof Simple) {
				ingresoGenerado += PRECIO_BASE * dias * i.getNumPersonas() * ((Simple)i.getHabitacion()).getPRECIO_FACTOR_SIMPLE();
			}else if(i.getHabitacion() instanceof Doble) {
				ingresoGenerado += PRECIO_BASE * dias * i.getNumPersonas() *((Doble)i.getHabitacion()).getPRECIO_FACTOR_DOBLE();
			}else if(i.getHabitacion() instanceof Suite) {
				ingresoGenerado += PRECIO_BASE * dias * i.getNumPersonas() * ((Suite)i.getHabitacion()).getPRECIO_FACTOR_SUITE();
			}else if(i.getHabitacion() instanceof SalaCelebraciones) {
				ingresoGenerado += PRECIO_BASE * dias * i.getNumPersonas() * ((SalaCelebraciones)i.getHabitacion()).getPRECIO_FACTOR_SCELEBRACIONES();
			}else if(i.getHabitacion() instanceof SalaReuniones) {
				ingresoGenerado += PRECIO_BASE * dias * i.getNumPersonas() * ((SalaReuniones)i.getHabitacion()).getPRECIO_FACTOR_SREUNIONES();
			}
		}
		
		return ingresoGenerado;
	}
	
	//CASE 5
	public void listarInstalacionesEnFecha(LocalDate fecha){
		System.out.println("A partir del " + fecha + " tenemos estas estancias reservadas: ");
		for(Reserva i: reservas) {
			if(i.getFechaInicio().isAfter(fecha)) {
				System.out.println(i.toString()); //EL toString DE RESERVA
			}
		}
	}
	
	//CASE 6
	public void listarReservaInstalaciones() {
		Collections.sort(reservas); 
	}
	
	
	//GETTERS Y SETTERS
	
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
	
	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	

}
