package pooAvanzado.relacion10.ejercicio1;

import java.util.Scanner;

import pooAvanzado.Ejercicio1.Titular;
import pooAvanzado.relacion10.ejercicio1.exception.DineroInsuficienteException;

public class MenuCuentaCredito {
	static Scanner teclado = new Scanner(System.in);
	final static String MENU = "1. Ingresar dinero\n" + 
								"2. Sacar dinero\n" + 
								"3. Mostrar saldo y cr�dito\n" + 
								"4. Salir";
	
	public void menuCredito(CuentaCredito cuentaCredito){
	int opcion;
	do {
		 System.out.println(MENU);
		 System.out.println("Introduce la opci�n que desea: ");
		 opcion = Integer.parseInt(teclado.nextLine());
			 switch(opcion) {
			 case 1: 
				 double cantidad;
				 do {
					 System.out.println("Introduce la cantidad que desea ingresar: ");
					 cantidad = Integer.parseInt(teclado.nextLine());
				 }while(cantidad <= 0);
				 	cuentaCredito.ingresarDinero(cantidad);
				 break;
			 case 2: 
				 double dineroASacar;
				 System.out.println("Introduce la cantidad que desea sacar: ");
				 dineroASacar = Integer.parseInt(teclado.nextLine());
				 try {
					 cuentaCredito.sacarDinero(dineroASacar);
				 } catch (DineroInsuficienteException e) {
					 System.out.println(e.getMessage());
					 System.exit(0);
				 } 
					 break;
			 case 3: 
				 System.out.println("Su saldo es: " + cuentaCredito.getSaldo());
				 System.out.println("Su cr�dito es " + cuentaCredito.getCredito());
				 break;
			 case 4: 
				 System.out.println("Adi�s");
				 break;
			 default:
				 System.out.println("Opci�n incorrecta, int�ntelo de nuevo.");
				 break;
			 }
	}while(opcion != 4);
	}
}

