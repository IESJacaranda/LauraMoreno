package maquinaCafe;

import java.util.Scanner;

public class Main {

	public final static String MENU = "1. Servir café solo (1 euro)\n2. Servir leche (0,8 euros)\n3. Servir café con leche (1,5 euros)\n4. Consultar estado máquina. Aparecen los datos de los depósitos y del monedero\n5. Apagar máquina y salir";

	
	public static void main(String[] args) throws Exception {
		
		
		
		//IMPRIMIR MENÚ
		System.out.println(MENU);
		
		
		//PREGUNTAR OPCIÓN
		System.out.println("Introduzca la opción que desea: ");
		Scanner teclado = new Scanner(System.in);
	
		
		//CONSTRUCTOR
		Maquina maquina = new Maquina();
		
		//MÉTODOS LLAMADOS SEGÚN OPCIÓN:
		int opcion;
		

			opcion = teclado.nextInt();
			System.out.println("¿Cuánto dinero va a introducir?");
			double dineroIntroducido;
	        dineroIntroducido = teclado.nextDouble(); 
			
			switch (opcion) {//ESTE SWITCH DEBERÍA ESTAR DENTRO DE UN TRY/CATCH Y ESTOS DOS ENGLOBÁNDOLO TODO.
				case 1: 
					if (maquina.comprobarMonedero(dineroIntroducido) && dineroIntroducido>=maquina.PRECIO_CAFE) {
						maquina.pedirCafeSolo();
						break;
					}else {
						System.out.println("Operación no aceptada.");
						break;
						
					}case 2:
						if(maquina.comprobarMonedero(dineroIntroducido) && dineroIntroducido>=maquina.PRECIO_LECHE) {
							maquina.pedirLeche();
							break;
						}else {
							System.out.println("Operación no aceptada.");
							break;
							
					}case 3: 
						if(maquina.comprobarMonedero(dineroIntroducido) && dineroIntroducido>=maquina.PRECIO_CAFE_LECHE) {
							maquina.pedirCafeConLeche();
							break;
						}else {
							System.out.println("Operación no aceptada.");
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
