package relacion11.ejercicio7;

import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opc;
		Almacen a = new Almacen();
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch(opc) {
				case 1: {
					int caja = leerEntero("Introduce el código de la caja que quiere abrir: ");
					try {
						a.abrirCaja(caja);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}break;
				case 2: {
					int caja = leerEntero("Introduce el código de la caja que quiere abrir: ");
					try {
						a.cerrarCaja(caja);
					} catch (Exception e) {
						System.out.println(e.getMessage());						
					}
				}break;
				case 3: {
					System.out.println(a.addCliente());
				}break;
				case 4:{
					int caja = leerEntero("Introduce el código de la caja que quiere abrir: ");
					int codCli = leerEntero("Introduce el código del cliente: ");
					try {
						System.out.println(a.atiendeCliente(caja, codCli));
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}break;
				default:
					System.out.println("Opción inválida");
				break;
			}	
		}while(opc != 5);
	}
	public static void mostrarMenu() {
		System.out.println("1.- abrir caja\n"+
							"2.- cerrar caja\n"+
							"3.- nuevo cliente\n"+
							"4.- atender cliente\n"+
							"5.- Salir");
	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}
}
