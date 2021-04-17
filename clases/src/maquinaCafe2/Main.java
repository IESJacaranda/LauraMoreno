package maquinaCafe2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Maquina maquina = new Maquina();
		

		GUIMaquina();

	}
	static Scanner teclado = new Scanner(System.in);

	
	
	public static void GUIMaquina() {
		int opcion = 0;
		Maquina maquina = new Maquina();
		
		
		while(opcion!=5) {
			System.out.println("Seleccione una opción.");
			opcion= Integer.parseInt(teclado.nextLine());
			try{
				switch(opcion) {
				case 1: System.out.println(maquina.cafeSolo(1.5));
				break;
				}
			}
			catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	
	
	}
		
}
