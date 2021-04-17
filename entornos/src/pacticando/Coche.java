package pacticando;

import java.util.ArrayList;

public class Coche {
	
	private double precio;
	private boolean cocheDisponible;
	private String matricula;
	private String marca;
	private String modelo;
	private String color; 
	
	private ArrayList <Reservacion> reservas = new ArrayList();
	private ArrayList <ReservacionDetalle> detallesReservas = new ArrayList();

	public Coche(double precio, boolean cocheDisponible, String matricula, String marca, String modelo, String color) {
		this.precio = precio;
		this.cocheDisponible = cocheDisponible;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	
	public void anadirReservacionDetalles (ReservacionDetalle detallesReserva) {
		this.detallesReservas.add(detallesReserva);
	}
	
	public void añadirReserva(Reservacion reserva) {
		this.reservas.add(reserva);
	}	

}
