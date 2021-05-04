package main;

import java.time.LocalDate;
import java.util.Scanner;

import Exception.GeneradorNoIncluidoException;
import body.AbstractGenerador;
import body.Empresa;
import body.Eolico;
import body.Solar;
import enumerado.Tipo;

public class Main {

	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opc;
		Empresa e = new Empresa("Generadores SL");
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch(opc) {
				case 1: {
					LocalDate fecha = LocalDate.parse(leerCadena("Introduzca la fecha en formato YYYY-MM-DD"));
					String localidad = leerCadena("Introduzca la localidad:");
					int potencia = leerEntero("Introduzca la potencia: ");
					int numPanels = leerEntero("Introduzca el número de paneles: ");
					int m2 = leerEntero("Introduzca el número de metros cuadrados: ");
					String ti = leerCadena("Introduce el tipo (FOTOVOLTAICO, TERMICO o HIBRIDO)");
					Tipo tipo = null;
					try {
						tipo = Tipo.valueOf(ti);
					}catch(Exception ex) {
						System.out.println("El tipo introducido no corresponde con ningún tipo");
					}
					AbstractGenerador geneSolar = new Solar(fecha, localidad, potencia, numPanels, m2, tipo);
					e.addGenerador(geneSolar);
				}break;
				case 2:{
					LocalDate fecha = LocalDate.parse(leerCadena("Introduzca la fecha en formato YYYY-MM-DD"));
					String localidad = leerCadena("Introduzca la localidad:");
					int potencia = leerEntero("Introduzca la potencia: ");
					int numAspas = leerEntero("Introduce el número de aspas");
					AbstractGenerador geneEolico = new Eolico(fecha, localidad, potencia, numAspas);
					e.addGenerador(geneEolico);
				}break;
				case 3:{
					e.mostrarPorFecha();
				}break;
				case 4:{
					e.mostrarPorLocalidad();
				}break;
				case 5:{
					e.mostrarPorFecha();
					int cod = leerEntero("Introduce el código del generador que desean eliminar: ");
					try {
						e.borraGenerador(cod);
					} catch (GeneradorNoIncluidoException e1) {
						System.out.println(e1.getMessage());
					}
				}break;
				case 6: {
					System.out.println(e.mostrarTotalEnergia());
				}break;
				case 7:{
					String localidad = leerCadena("Introduce el nombre de la localidad a buscar: ");
					if(e.existeGeneradorEnLocalidad(localidad)) {
						System.out.println("¡Existe!");
					}else {
						System.out.println("No existe :(");
					}
				}
				break;
				case 8:{
					System.out.println("Adiós");
				}
				break;
				default:
					System.out.println("Opción inválida");
				break;
			}
		}while(opc!=8);

	}
	
	public static void mostrarMenu() {
		System.out.println("1.- añadir generador solar\n"+
							"2.- añadir generador eólico\n"+
							"3.- mostrar generadores ordenados por fecha\n"+
							"4.- mostrar generadores ordenados por localidad o por fecha en caso de ser la misma\n"+
							"5.- borrar generador\n"+
							"6.- mostrar total de energía\n"+
							"7.- ¿Existe el generador en x localidad?\n"+
							"8.- Salir");
	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}
	
	public static double leerReal(String msg) {
		System.out.println(msg);
		return Double.parseDouble(teclado.nextLine());
	}

}
