package maquinaCafe;

import java.util.Scanner;

public class Main {

	public final static String MENU = "1. Servir caf� solo (1 euro)\n2. Servir leche (0,8 euros)\n3. Servir caf� con leche (1,5 euros)\n4. Consultar estado m�quina. Aparecen los datos de los dep�sitos y del monedero\n5. Apagar m�quina y salir";

	
	public static void main(String[] args) throws Exception {
		
		
		
		//IMPRIMIR MEN�
		System.out.println(MENU);
		
		
		//PREGUNTAR OPCI�N
		System.out.println("Introduzca la opci�n que desea: ");
		Scanner teclado = new Scanner(System.in);
	
		
		//CONSTRUCTOR
		Maquina maquina = new Maquina();
		
		//M�TODOS LLAMADOS SEG�N OPCI�N:
		int opcion;
		

			opcion = teclado.nextInt();
			System.out.println("�Cu�nto dinero va a introducir?");
			double dineroIntroducido;
	        dineroIntroducido = teclado.nextDouble(); 
			
			switch (opcion) {//ESTE SWITCH DEBER�A ESTAR DENTRO DE UN TRY/CATCH Y ESTOS DOS ENGLOB�NDOLO TODO.
				case 1: 
					if (maquina.comprobarMonedero(dineroIntroducido) && dineroIntroducido>=maquina.PRECIO_CAFE) {
						maquina.pedirCafeSolo();
						break;
					}else {
						System.out.println("Operaci�n no aceptada.");
						break;
						
					}case 2:
						if(maquina.comprobarMonedero(dineroIntroducido) && dineroIntroducido>=maquina.PRECIO_LECHE) {
							maquina.pedirLeche();
							break;
						}else {
							System.out.println("Operaci�n no aceptada.");
							break;
							
					}case 3: 
						if(maquina.comprobarMonedero(dineroIntroducido) && dineroIntroducido>=maquina.PRECIO_CAFE_LECHE) {
							maquina.pedirCafeConLeche();
							break;
						}else {
							System.out.println("Operaci�n no aceptada.");
							break;
							
					}case 4: 
						System.out.println(maquina.getStatus());
						break;
					case 5: 
						System.out.println(maquina.salirYApagar());
						break;
			}
		}
	
					

	public static void mostrarMenu() {
		System.out.println(MENU);
		
	}
	
	
	
	
}
