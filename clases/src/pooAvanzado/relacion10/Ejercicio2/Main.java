package pooAvanzado.relacion10.Ejercicio2;

import static pooAvanzado.relacion10.Ejercicio2.Gama.ALTA;
import static pooAvanzado.relacion10.Ejercicio2.Gama.BAJA;
import static pooAvanzado.relacion10.Ejercicio2.Gama.MEDIA;

import java.util.Scanner;

import pooAvanzado.relacion10.Ejercicio2.Exception.CombustibleNoValidoException;
import pooAvanzado.relacion10.Ejercicio2.Exception.GamaIncorrectaException;
import pooAvanzado.relacion10.Ejercicio2.Exception.NumPlazasInvalidoException;
import pooAvanzado.relacion10.Ejercicio2.Exception.PMDInvalidoException;
import pooAvanzado.relacion10.Ejercicio2.Exception.TipoIncorrectoException;

public class Main {
	
	final static String MENU = "1.Alta del vehículo\n2.Precio del alquiler\n3.Salir";
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		GUI();
	}

	public static void GUI() {
		int opcion;
		do {
			System.out.println(MENU);
			System.out.println("Introduzca la opción que desea elegir:");
			opcion = Integer.parseInt(teclado.nextLine());
			AbstractVehiculo vehiculo = null;
			switch (opcion) {
			case 1: 
				try {
					vehiculo = opcion1();
				} catch (GamaIncorrectaException | TipoIncorrectoException e) {
					e.getMessage();
				}
				break;
			case 2:
				try {
					opcion2(vehiculo);
				} catch (CombustibleNoValidoException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Adiós");
				break;
			default:
				System.out.println("Opción incorrecta. Marque 1, 2 o 3.");
				break;
			}
		}while(opcion != 3);
		
	}
	
	private static AbstractVehiculo opcion1() throws GamaIncorrectaException, TipoIncorrectoException {
		//GAMA
		System.out.println("¿Qué gama de vehículo desea (alta, media o baja)?");
		String gama = teclado.nextLine().toLowerCase();
		if(gama != "alta" || gama != "media" || gama != "baja") {
			throw new GamaIncorrectaException();
		}
		//TIPO
		System.out.println("Seleccione el tipo de vehículo que desea (coche, furgoneta o microbus): ");
		String tipo = teclado.nextLine().toLowerCase();
		if(tipo != "coche" || tipo != "furgoneta" || tipo != "microbus") {
			throw new TipoIncorrectoException();
		}
		//MATRICULA
		System.out.println("Introduzca la matrícula del vehículo: ");
		String matricula = teclado.nextLine();
		//CREACIÓN DEL OBJETO
		AbstractVehiculo v = devuelveVehiculo(tipo, devuelveGama(gama), matricula);
		
		System.out.println("Su vehículo se ha dado de alta.");
		
		return v;
		
	}
	
	private static AbstractVehiculo devuelveVehiculo(String tipo, double gama, String matricula) {
		AbstractVehiculo vehiculo = null;
		if(tipo == "coche") {
			vehiculo = new Coche(matricula, gama);
		}else if(tipo == "furgoneta") {
			vehiculo = new Furgoneta(matricula, gama);		
		}else if(tipo == "microbus") {
			vehiculo = new Microbus(matricula, gama);
		}
		return vehiculo;
	}
	
	private static double devuelveGama(String gama) {
		double enumGama = ALTA.getPrecio();
		if(gama == "alta") {
			enumGama = ALTA.getPrecio();
		}else if(gama == "media") {
			enumGama = MEDIA.getPrecio();
		}else if(gama == "baja") {
			enumGama = BAJA.getPrecio();
		}
		return enumGama;
	}
	
	public static void opcion2(AbstractVehiculo vehiculo) throws CombustibleNoValidoException {
		System.out.println("Introduzca la matrícula de su vehículo");
		System.out.println("¿Cuántos días será alquilado?");
		int dias = Integer.parseInt(teclado.nextLine());
		
		if(vehiculo == null) {
			System.out.println("El vehículo aún no se ha dado de alta.");
		}else {
		//COCHE
		if(vehiculo instanceof Coche) {
			System.out.println("¿Qué combustible desea (gasolina o diesel)?");
			String combustible = teclado.nextLine().toLowerCase();
			if(combustible == "gasolina") {
				System.out.println(((Coche)vehiculo).calcularPrecio(dias, 3.5));
			}else if(combustible == "diesel") {
				((Coche)vehiculo).calcularPrecio(dias, 2);
			}else {
				throw new CombustibleNoValidoException();
			}
		}
		//FURGONETA
		else if(vehiculo instanceof Furgoneta) {
			System.out.println("Introduzca el peso máximo autorizado (PMA)");
			double PMA = Double.parseDouble(teclado.nextLine());
			try {
				System.out.println(((Furgoneta)vehiculo).calcularPrecio(dias, PMA));
			} catch (PMDInvalidoException e) {
				e.getMessage();
			}
		}
		//MICROBUS
		else if(vehiculo instanceof Microbus) {
			System.out.println("¿Cuántas plazas tiene el microbus?");
			int plazas = Integer.parseInt(teclado.nextLine());
			try {
				System.out.println(((Microbus)vehiculo).calcularPrecio(dias, plazas));
			} catch (NumPlazasInvalidoException e) {
				e.getMessage();
			}
		}
		}
	}
	
}
