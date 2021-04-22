package pooAvanzado.relacion10.Ejercicio2;

import static pooAvanzado.relacion10.Ejercicio2.Gama.ALTA;
import static pooAvanzado.relacion10.Ejercicio2.Gama.BAJA;
import static pooAvanzado.relacion10.Ejercicio2.Gama.MEDIA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import pooAvanzado.relacion10.Ejercicio2.Exception.CombustibleNoValidoException;
import pooAvanzado.relacion10.Ejercicio2.Exception.GamaIncorrectaException;
import pooAvanzado.relacion10.Ejercicio2.Exception.NumPlazasInvalidoException;
import pooAvanzado.relacion10.Ejercicio2.Exception.PMDInvalidoException;
import pooAvanzado.relacion10.Ejercicio2.Exception.TipoIncorrectoException;
import pooAvanzado.relacion10.Ejercicio2.Exception.VehiculoNoEncontradoException;

public class Main {
	
	final static String MENU = "1.Alta del vehículo\n2.Precio del alquiler\n3.Salir";
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		GUI();
	}

	public static void GUI() {
		int opcion;
		AbstractVehiculo vehiculo = null;
		List<AbstractVehiculo> listaVehiculos = new ArrayList<>();
		do {
			System.out.println(MENU);
			System.out.println("Introduzca la opción que desea elegir:");
			opcion = Integer.parseInt(teclado.nextLine());
			switch (opcion) {
			case 1: 
				try {
					vehiculo = opcion1();
					listaVehiculos.add(vehiculo);
				} catch (GamaIncorrectaException | TipoIncorrectoException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					opcion2(listaVehiculos);
				} catch (CombustibleNoValidoException | VehiculoNoEncontradoException e) {
					System.out.println(e.getMessage());
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
		if(!"alta".equals(gama) && !"media".equals(gama) && !"baja".equals(gama)) {
			throw new GamaIncorrectaException();
		}
		//TIPO
		System.out.println("Seleccione el tipo de vehículo que desea (coche, furgoneta o microbus): ");
		String tipo = teclado.nextLine().toLowerCase();
		if(!"coche".equals(tipo) && !"furgoneta".equals(tipo) && !"microbus".equals(tipo)) {
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
		if("coche".equals(tipo)) {
			vehiculo = new Coche(matricula, gama);
		}else if("furgoneta".equals(tipo)) {
			vehiculo = new Furgoneta(matricula, gama);		
		}else if("microbus".equals(tipo)) {
			vehiculo = new Microbus(matricula, gama);
		}
		return vehiculo;
	}
	
	private static double devuelveGama(String gama) {
		double enumGama = ALTA.getPrecio();
		if("alta".equals(gama)) {
			enumGama = ALTA.getPrecio();
		}else if("media".equals(gama)) {
			enumGama = MEDIA.getPrecio();
		}else if("baja".equals(gama)) {
			enumGama = BAJA.getPrecio();
		}
		return enumGama;
	}
	
	public static void opcion2(List<AbstractVehiculo> listaVehiculos) throws CombustibleNoValidoException, VehiculoNoEncontradoException {
		//ENCUENTRA COCHE SEGÚN MATRÍCULA
		System.out.println("Introduzca la matrícula de su vehículo");
		String matricula = teclado.nextLine();
		AbstractVehiculo vehiculo = encuentraVehiculo(listaVehiculos, matricula);
		if(vehiculo == null) {
			throw new VehiculoNoEncontradoException();
		}else {
		
		//DIAS
		System.out.println("¿Cuántos días será alquilado?");
		int dias = Integer.parseInt(teclado.nextLine());
		
		//COCHE
		if(vehiculo instanceof Coche) {
			System.out.println("¿Qué combustible desea (gasolina o diesel)?");
			String combustible = teclado.nextLine().toLowerCase();
			if("gasolina".equals(combustible)) {
				System.out.println(((Coche)vehiculo).calcularPrecio(dias, 3.5));
			}else if("diesel".equals(combustible)) {
				System.out.println("El precio del alquiler serán: " + ((Coche)vehiculo).calcularPrecio(dias, 2));
			}else {
				throw new CombustibleNoValidoException();
			}
		}
		//FURGONETA
		else if(vehiculo instanceof Furgoneta) {
			System.out.println("Introduzca el peso máximo autorizado (PMA)");
			double PMA = Double.parseDouble(teclado.nextLine());
			try {
				System.out.println("El precio del alquiler serán: " + ((Furgoneta)vehiculo).calcularPrecio(dias, PMA));
			} catch (PMDInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
		//MICROBUS
		else if(vehiculo instanceof Microbus) {
			System.out.println("¿Cuántas plazas tiene el microbus?");
			int plazas = Integer.parseInt(teclado.nextLine());
			try {
				System.out.println("El precio del alquiler serán: " + ((Microbus)vehiculo).calcularPrecio(dias, plazas));
			} catch (NumPlazasInvalidoException e) {
				System.out.println(e.getMessage());
			}
		}
		}
	}
	
	private static AbstractVehiculo encuentraVehiculo(List<AbstractVehiculo> listaVehiculos, String matricula) {
		AbstractVehiculo v = null;
		for(AbstractVehiculo i: listaVehiculos) {
			if(i.getMatricula().equals(matricula)) {
				v = i;
			}
		}return v;
	}
	
}
