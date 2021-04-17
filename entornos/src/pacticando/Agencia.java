package pacticando;

import java.util.ArrayList;

public class Agencia {
	private String nombre;
	private String direccion; 
	
	private ArrayList <Reservacion> reservas = new ArrayList();
	
	public Agencia(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion; 
	}

	public void a�adirReserva(Reservacion reserva) {
		this.reservas.add(reserva);
	}
	
}
