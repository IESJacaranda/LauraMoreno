package pacticando;

import java.util.ArrayList;

public class Reservacion {
	private double precioTotal;
	
	public Agencia agencia;
	private ArrayList <ReservacionDetalle> detallesReservas = new ArrayList();
	private ArrayList <Coche> coches = new ArrayList();
	
	public Reservacion(double precioTotal, Agencia agencia) {
		this.precioTotal = precioTotal;
	}
	
	public void anadirCoche(Coche coche){
		this.coches.add(coche);
	}
	
	public void anadirReservacionDetalles (ReservacionDetalle detallesReserva) {
		this.detallesReservas.add(detallesReserva);
	}

}
