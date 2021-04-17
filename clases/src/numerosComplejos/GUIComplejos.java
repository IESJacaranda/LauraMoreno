package numerosComplejos;

import java.util.Scanner;

public class GUIComplejos {

	public final static String MENU = "1.Sumar números complejos\n2.Restar números complejos\n3.Consultar si son iguales\n4.Salir";
		
	
	static Scanner teclado = new Scanner (System.in);
	
	public static void opciones(){
		System.out.println(MENU);
		
		NumerosComplejos complejo = new NumerosComplejos();
		NumerosComplejos complejo2 = new NumerosComplejos();

		
		int opcion = 1;
		
		try {
			
		while (opcion == 1 || opcion == 2 || opcion == 3) {
			
			System.out.println("Inserte la opción que desea: ");
			opcion = teclado.nextInt();
		
			while (opcion!=1 && opcion!=2 && opcion!=3) {
				System.out.println("Inserte la opción correctamente. De 1 a 3: ");
				opcion = teclado.nextInt();
			}
				complejo = pedirNumero();
				complejo2 = pedirNumero();
			
			switch (opcion) {
			case 1: 
				System.out.println("El resultado de la suma es: " + complejo.sumaComplejos(complejo2)+"i");
			
				break;
			
			case 2: 
				System.out.println("El resultado de la resta es:" + complejo.restaCompleja(complejo2)+"i");
				break;
			
			case 3:
				System.out.println(complejo.equals(complejo2));
				break;
			
			default:
				System.out.println("Inserte una opción válida.");
			}
		}
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
			
			}
		
	}
	
	
	
	/**
	 * Pide los números complejos por partes al user
	 * @return num complejo de tipo Complejo
	 * @throws Exception (en caso de introducir un valor no válido como una letra)
	 */
	public static NumerosComplejos pedirNumero() throws Exception  {
		NumerosComplejos complejo = new NumerosComplejos();

		
		try {
			System.out.println("Inserte la parte real del número complejo: ");
			complejo.setParteReal1(teclado.nextDouble());
			
			System.out.println("Inserte la parte imaginaria del número complejo: ");
			complejo.setParteImaginaria1(teclado.nextDouble());
			
		}catch (Exception ex) {
			throw new Exception("El valor introducido no es válido.");
		}
		
		return complejo;
	}
	
	
	
	
}
