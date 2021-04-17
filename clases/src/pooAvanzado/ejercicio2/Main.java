package pooAvanzado.ejercicio2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		
//			Barco barco = new Barco(23, 2020, "234JGH");
			Cliente cliente = new Cliente("Diana Montes", "49484746K");
//			Alquiler alquiler = new Alquiler(cliente, barco, LocalDate.now(), LocalDate.now(), null); 
//			
//			System.out.println(alquiler.calcularAlquiler());
			
			Yate yate = new Yate(12, 2021, "345FV", 4, 96);
			Alquiler alquilerYate = new Alquiler(cliente, yate, LocalDate.now(), LocalDate.now(), null); 
			System.out.println(alquilerYate.getPrecio());
		}

	}


