package poo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Cuenta cuenta = new Cuenta();
		
		
		
//CONSEGUIR SALDO:	
		System.out.println("Bienvenido. Introduzca su saldo: ");
		cuenta.setSaldo(teclado.nextDouble());
		
		
		
//IMPRIMIR MEN�:	
		String menu = "1. Hacer un reintegro, se pedir� la cantidad a retirar.\n"
				+ "2. Hacer un ingreso, se pedir� la cantidad a ingresar.\n"
				+ "3. Consultar el saldo y el n�mero de reintegros e ingresos realizados.\n"
				+ "4. Finalizar las operaciones. Debe confirmar si realmente desea salir e informar del saldo al final de todas las operaciones.\n";
		
		System.out.println("Escoja la opci�n deseada del men�. Pulse 4 para salir\n"+menu);	
		
		
		
//ACCIONES SEG�N LA OPCI�N ESCOGIDA:
		String respuesta = new String("no");
		int opcion; //int opcion = Integer.parseInt(teclado.nextLine());
		
		while (respuesta.equals("no")){
			System.out.println("Introduzca la opci�n que desea: ");
			opcion = teclado.nextInt();
	
			if (opcion<=0 || opcion>4) {
				System.out.println("Introduzca un n�mero entre 1 y 4.");
				
			}else if(opcion==1) {
				System.out.println("Introduzca el reintegro: ");
				cuenta.hacerReintegro(teclado.nextDouble());
				
			}else if (opcion==2) {
				System.out.println("Introduzca el importe del ingreso: ");
				cuenta.hacerIngreso(teclado.nextDouble());
				
			}else if (opcion==3) {
				System.out.println(cuenta.getStatus());
				
			}else {
				System.out.println("Su saldo es de: " + cuenta.getSaldoFinal());
				System.out.println("�Est� seguro de que desea salir? (si o no)");
				respuesta = teclado.next().toLowerCase();
				
		}
		}
	
		
	}

}
