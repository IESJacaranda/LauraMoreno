package com.jacaranda.tamano;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TamanoMunicipioComunidad tm = new TamanoMunicipioComunidad();
		GUI(tm);
		//System.out.println(tm.getLista());
	}
	
	public static void GUI(TamanoMunicipioComunidad tm) {
		int opc;
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch(opc) {
				case 1: {
					int anyo = leerEntero("Introduzca el año");
					tm.getDatosAno(anyo);
				}break;
				case 2: {
					int anyo = leerEntero("Introduzca el año");
					String comunidad = leerCadena("Introduzca la comunidad");
					tm.getDatosComunidadAno(anyo, comunidad);
				}break;
				case 3: {
					int anyo = leerEntero("Introduzca el año");
					int dato1 = leerEntero("Introduzca el dato de ese año");
					String comunidad = leerCadena("Introduzca la comunidad");
					String descripComunidad = leerCadena("Introduzca el tipo de municipio (Total, Menos de 101, De 101 a 500, De 501 a 1.000, De 1.001 a 2.000, De 2.001 a 3.000, \n"
							+ "De 3.0001 a 5.000, De 5.001 a 10.000, De 10.001 a 20.000, De 20.001 a 30.000, De 30.001 a 50.000, De 50.001 a 100.000, De 100.001 a 500.000, Más de 500.000)");
					try {
						tm.addDato(anyo, dato1, comunidad, descripComunidad);
					} catch (noComunidadException | noDescriptException e) {
						e.printStackTrace();
					}
				}break;
				case 4: {
					int anyo = leerEntero("Introduzca el año");
					String comunidad = leerCadena("Introduzca la comunidad");
					System.out.println(tm.esTotalCorrecto(comunidad, anyo));
				}break;
				case 5: {
					String respuesta = leerCadena("¿Desea guardar los datos? S/N");
					if(respuesta.equalsIgnoreCase("s")) {
						String fichero = leerCadena("Introduce el nombre del fichero(no la ruta). Ejemplo: resultado.json");
						try {
							tm.escribeNewFile(fichero);
							System.out.println("Su fichero se ha creado");
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Adiós");
				}break;
				default:
					System.out.println("Opción inválida");
				break;
			}	
		}while(opc != 5);
	}
	
	static Scanner teclado = new Scanner(System.in);
	public static void mostrarMenu() {
		System.out.println("1.- Mostrar los datos de todas las comunidades y de España de un año\n"+
							"2.- Mostrar los datos de una comunidad y un año\n"+
							"3.- Añadir un dato. Si la comunidad y la descripción no existe se mostrará un mensaje de error. Si\n" + 
							"\t existe y existe el año se modificará el dato de ese año. Si el año\n" + 
							"\t no existe se modificará el año junto con el dato.\n"+
							"4.- Comprobar que el valor de Total es la suma de todos los valores de ese año\n"+
							"5.- Salir");
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
