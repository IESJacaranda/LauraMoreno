package pacticando;

import java.util.ArrayList;

public class ReservacionDetalle {
	
	private String fechaInicio;
	private String fechaFinal;
	private double gasolina; 
	
	private Reservacion reserva;
	private Coche coche;

	public ReservacionDetalle(String fechaInicio, String fechaFinal, double gasolina, Reservacion reserva, Coche coche) {
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.gasolina = gasolina;
		this.reserva = reserva;
		this.coche = coche;
	}
	
}
