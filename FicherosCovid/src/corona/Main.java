package corona;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		ListaRecuento l = new ListaRecuento();

		GUI(l);
	
		
	}
	
	public static void GUI(ListaRecuento l) {
		int opc;
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch(opc) {
				case 1: {
					l.getMejorDia();
				}break;
				case 2: {
					int dia = leerEntero("Introduzca el día");
					String mes = leerCadena("Introduzca el nombre del mes");
					int anyo = leerEntero("Introduzca el año");
					l.getMejorDiaAPartir(dia, mes, anyo);
				}break;
				case 3: {
					l.getPeorDia();
				}break;
				case 4: {
					int dia = leerEntero("Introduzca el día");
					String mes = leerCadena("Introduzca el nombre del mes");
					int anyo = leerEntero("Introduzca el año");
					l.getPeorDiaAPartir(dia, mes, anyo);
				}break;
				case 5: {
					int dia = leerEntero("Introduzca el día");
					int mes = leerEntero("Introduzca el número del mes");
					int anyo = leerEntero("Introduzca el año");
					l.getDatosDia(dia, mes, anyo);
				}break;
				case 6:{
					System.out.println(l.getMedia());
				}break;
				case 7:{
					System.out.println("Adiós");
				}break;
				default:
					System.out.println("Opción inválida");
				break;
			}	
		}while(opc != 7);
	}
	
	
	static Scanner teclado = new Scanner(System.in);
	public static void mostrarMenu() {
		System.out.println("1.- Mejor día\n"+
							"2.- Mejor día a partir de una fecha\n"+
							"3.- Peor día de todos\n"+
							"4.- Peor día a partir de una fecha\n"+
							"5.- Número de contagios, número de muertes y número de curados en un día\n"+
							"6.- Media de contagios, de muertes y de curados\n"+
							"7.- Salir");
	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}

}
