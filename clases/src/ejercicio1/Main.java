package ejercicio1;

import java.util.Scanner;

public class Main {
	static Punto puntoA = new Punto(1.1, 2.2);
	static Punto puntoB = new Punto(1.1, 2.2);
	static Punto puntoC = new Punto(1.1, 2.2);
	static Punto puntoD = new Punto(1.1, 2.3);
	
	static Linea linea1 = new Linea(puntoA, puntoB);
	static Linea linea2 = new Linea(puntoC, puntoD);
	
	public static final String MENU = "1.Mover l�nea\n2.Mostrar l�nea\n3.Salir.";
	public static final String MENU_MOVIMIENTOS = "A. Mover arriba\nB. Mover abajo\nI. Mover a la izquierda\nD. Mover a la derecha";
	
	static Scanner teclado = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
	
	GUILinea();
	
}
	
	public static void GUILinea() {
		
		pedirDatos(puntoA);
		pedirDatos(puntoB);
		System.out.println(MENU);
		int opcion = 1;
		
		while(opcion != 3) {
			System.out.println("Introduzca la opci�n elegida: ");
			opcion = Integer.parseInt(teclado.nextLine());
			
			if(opcion >3 || opcion<1) {
				System.out.println("Introduzca de nueva la opci�n(1,2,3): ");
				opcion = Integer.parseInt(teclado.nextLine());
			}
			switch (opcion) {
			case 1:
				GUIIntraMenu();
				break;
			case 2: 
				System.out.println(linea1.toString());
				break;
			}
		}
	}
	
	
	public static void GUIIntraMenu() {
		
		System.out.println(MENU_MOVIMIENTOS);
		String movimiento;
		
		System.out.println("Elija la opci�n que desea: ");
		movimiento = teclado.nextLine();
		String opciones = "ABDI";
		

		while((movimiento.length() < 1) || (opciones.indexOf(movimiento.toUpperCase()))<0) {
			System.out.println("Introduzca de nuevo la opci�n (A,B,D,I): ");
			movimiento = teclado.nextLine();
		}
		
		System.out.println("Introduzca la distancia: ");
		switch (movimiento) {
		case "A": 	
			linea1.moverArriba(Double.parseDouble(teclado.nextLine()));
			break;
		case "B":
			linea1.moverAbajo(Double.parseDouble(teclado.nextLine()));
			break;
		case "D":
			linea1.moverDerecha(teclado.nextDouble());
			break;
		case "I":
			linea1.moverIzquierda(teclado.nextDouble());
			break;
	}
	}
	
	
	public static void pedirDatos(Punto punto) {
		
		System.out.println("Introduzca el eje X: ");
		punto.setCoordX(Double.parseDouble(teclado.nextLine()));
		
		System.out.println("Introduzca el eje Y: ");
		punto.setCoordY(Double.parseDouble(teclado.nextLine()));
		
				
	}
	
}




