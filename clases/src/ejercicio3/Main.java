package ejercicio3;

import java.util.Scanner;

import exceptions.JarraLlenaExceptions;


public class Main {

	public static String MENU = "1.Llenar jarra\n"
			+ "2.Vaciar jarra\n"
			+ "3.Volcar jarra A en B\n"
			+ "4.Volcar jarra B en A\n"
			+ "5.Ver estado de las jarras\n"
			+ "6.Salir";
	
	public static String SUBMENU = "¿Qué jarra desea seleccionar (A/B)?";
	
	static Jarra jarraA;
	static Jarra jarraB;
	
	
	
	
	
	static Scanner teclado = new Scanner(System.in);
	
	//----------------------------------------------------
	public static void main(String[] args) {

		{
			
			try {
				jarraA = new Jarra(1,1);
				jarraB = new Jarra(6,4);
				GUIMenu();	
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
	
}
	//----------------------------------------------------
	
	public static String comprobarSUBMENU() {
		System.out.println(SUBMENU);
		String letra = teclado.nextLine();
		
		while(!"A".equals(letra.toUpperCase()) && !"B".equals(letra.toUpperCase()) ) {//equalsIgnoreCase
			System.out.println("Introduzca de nuevo la opción (A o B): ");
			letra = teclado.nextLine();
		}
		return letra;
	}
	
	
	public static void GUIMenu() throws Exception {
		int opcion = 1;
		
		while (opcion>0 && opcion<6) {
			
		System.out.println(MENU);
		System.out.println("Introduzca la opción que desea (1-6):");
		opcion = Integer.parseInt(teclado.nextLine());
		
		while(opcion<1 || opcion>6) {
			System.out.println("Introduzca de nueva la opción (de 1 a 6): ");
			opcion = Integer.parseInt(teclado.nextLine());
		}
		
	
			switch (opcion) {
			case 1: 
				if(comprobarSUBMENU().toUpperCase().equals("A")) {//mejor que reciba el valor por el metodo
					jarraA.llenarJarra();
				}
				else {
					jarraB.llenarJarra();
				}
				break;
			case 2:
				if(comprobarSUBMENU()=="A".toUpperCase()) {
					jarraA.vaciarJarra();
				}
				else {
					jarraB.vaciarJarra();
				}
				break;
			case 3: 
				try {
					jarraA.volcarJarra(jarraB);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				break;
			case 4: 
				try {
					jarraB.volcarJarra(jarraA);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5: 
				System.out.println("Jarra A:");
				System.out.println(jarraA.toString());
				System.out.println("Jarra B: ");
				System.out.println(jarraB.toString());
				break;
			}
			
			if(opcion == 6) {
			System.out.println(jarraA.totalAguaUsada());
			}
		 		
		
	}
	}

}
