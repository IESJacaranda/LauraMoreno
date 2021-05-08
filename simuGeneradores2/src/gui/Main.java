package gui;

import java.time.LocalDate;
import java.util.Scanner;
import simuGeneradores2.body.AbsGenerador;
import simuGeneradores2.body.Empresa;
import simuGeneradores2.body.Eolico;
import simuGeneradores2.body.Solar;

public class Main {

	public static void main(String[] args) {
		int opc;
		Empresa e = new Empresa("Generadores SL");
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch(opc) {
				case 1: {LocalDate fecha = LocalDate.parse(leerCadena("Introduzca la fecha en formato YYYY-MM-DD"));
				String localidad = leerCadena("Introduzca la localidad:");
				int potencia = leerEntero("Introduzca la potencia: ");
				int numPanels = leerEntero("Introduzca el número de paneles: ");
				int m2 = leerEntero("Introduzca el número de metros cuadrados: ");
				String ti = leerCadena("Introduce el tipo (FOTOVOLTAICO, TERMICO o HIBRIDO)");
				AbsGenerador geneSolar;
				try {
					geneSolar = new Solar(localidad, fecha, potencia, numPanels, m2, ti);
					e.addSolar(geneSolar);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}break;
			case 2:{
				LocalDate fecha = LocalDate.parse(leerCadena("Introduzca la fecha en formato YYYY-MM-DD"));
				String localidad = leerCadena("Introduzca la localidad:");
				int potencia = leerEntero("Introduzca la potencia: ");
				int numAspas = leerEntero("Introduce el número de aspas");
				AbsGenerador geneEolico = new Eolico(localidad, fecha, potencia, numAspas);
				e.addEolico(geneEolico);
			}break;
			case 3:{
				System.out.println(e.toString());
			}break;
			case 4:{
				System.out.println(e.toStringLocal());
			}break;
			case 5:{
				int cod = leerEntero("Introduce el código del generador que desean eliminar: ");
				try {
					e.borraGenerador(cod);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}break;
			case 6: {
				System.out.println(e.muestraEnergia());
			}break;
			case 7:{
				String localidad = leerCadena("Introduce el nombre de la localidad a buscar: ");
				System.out.println(e.existeLocal(localidad));
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
	
	static Scanner teclado = new Scanner(System.in);
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
