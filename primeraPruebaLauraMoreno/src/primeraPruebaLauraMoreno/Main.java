package primeraPruebaLauraMoreno;

import java.util.Scanner;

public class Main {
	public final static String MENU = "1. Consultar n�mero de mensajes\n2.Consultar mensaje:\n    1.Mensaje n�mero 1 (1. O�r, 2.Borrar)"+
									"\n    2. Mensaje n�mero 2 (1.O�r, 2.Borrar)\n    3.Mensaje n�mero 3 (1.O�r, 2.Borrar)\n2.A�adir mensaje\n4.Borrar todos los mensajes\n5.Salir";

	public static void main(String[] args) {
		
		Contestador contestador = new Contestador();
		GUIContestador();
	}
	
	public static void GUIContestador() {
		Contestador contestador = new Contestador();
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion = 1;
		int mensajeAConsultar = 0;
		int opcionInterna = 0;
		
		System.out.println(MENU);//Solo imprimo una vez el men�. No me gusta que se imprima tantas veces. No se dice que haya que imprimirlo m�s veces.
		
		while(opcion!=5) {
			System.out.println("Introduce la opci�n deseada:");
			opcion= Integer.parseInt(teclado.nextLine());
			try{
				switch(opcion) {
				case 1: System.out.println(contestador.consultarMensajes());
				break;
				
				case 2: 
					System.out.println("Introduzca qu� mensaje quiere consultar: ");
					
			
					if(mensajeAConsultar == 1) {
						System.out.println("Introduzca 1 para o�rlo o 2 para borrarlo: ");
						
						if(opcionInterna == 1) {
							contestador.oirMensaje(1);
							break;
						}else {
							contestador.borrarMensaje(1);
							break;
						}
					}
					else if(mensajeAConsultar == 2) {
						System.out.println("Introduzca 1 para o�rlo o 2 para borrarlo: ");
						if(opcionInterna == 1) {
							contestador.oirMensaje(2);
							break;
						}else {
							contestador.borrarMensaje(2);
							break;
						}
					}
					else if(mensajeAConsultar == 3) {
						System.out.println("Introduzca 1 para o�rlo o 2 para borrarlo: ");
						if(opcionInterna == 1) {
							contestador.oirMensaje(3);
							break;
						}else {
							contestador.borrarMensaje(3);
						}break;
					}
				case 3: 
					System.out.println("Introduzca el mensaje que desea poner: ");
					contestador.anadirMensaje(teclado.nextLine());
					break;
				
				case 4: 
					contestador.borrarAllMensajes();
					break;
			}
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
	}
	

}
	
	


