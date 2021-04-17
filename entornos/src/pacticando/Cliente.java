package pacticando;

import java.util.ArrayList;

public class Cliente {
	private String codigo;
	private String nombre;
	private String dni;
	private String direccion;
	private String telefono;
	
	private ArrayList <Reservacion> reservas = new ArrayList();
	
	private Cliente avalador;
	private Cliente avalado;
	
	
	public Cliente(String codigo, String nombre, String dni, String direccion, String telefono, Cliente avalador) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.dni = dni; 
		this.direccion = direccion;
		this.telefono = telefono;
		this.avalador = avalador;
	}
	
	public void anadirReserva(Reservacion reserva) {
		this.reservas.add(reserva);
	}
	
	public void anadirAvalado(Cliente avalado) {
		this.avalado = avalado;
	}

}
