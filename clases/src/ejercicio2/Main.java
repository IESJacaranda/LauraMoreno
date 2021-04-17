package ejercicio2;

import java.util.Scanner;

public class Main {
	static Producto producto1 = new Producto(20.3, "Portátil");
	
	static Scanner teclado = new Scanner (System.in);
	
	public static final String MENU_CONSULTAR_CAMBIAR = "Pulse 1 si quiere cambiarlo o 2 si quiere consultarlo.";
	
	public static final String MENU_OPCIONES = "Seleccione la opción que desea:\n"
												+ "1. Descripción\n"
												+ "2. Precio\n"
												+ "3. Precio con IVA\n"
												+ "4. Código\n"
												+ "5. Salir";

	
	public static void main(String[] args) {
		
		GUIOpciones();		
	}
	
	
	public static int GUIConsultarOCambiar() {
		int opcion = 1;
		System.out.println(MENU_CONSULTAR_CAMBIAR);
		
		while(opcion !=1 && opcion != 2) {
			System.out.println("Selecciona una opción correcta (1: cambiar o 2: seleccionar. )");
		}
		opcion = Integer.parseInt(teclado.nextLine());
	
		return opcion;
	}

	
	
	
	public static void GUIOpciones() {
		int opcion = 1;
		
		while (opcion != 5) {
			System.out.println(MENU_OPCIONES);
			opcion = Integer.parseInt(teclado.nextLine());
			
			while(opcion > 5 || opcion <1) {
				System.out.println("Marque de nuevo una opción entre 1 y 4: ");
				opcion = Integer.parseInt(teclado.nextLine());
			}
			
			switch (opcion) {
			case 1:
				if(GUIConsultarOCambiar() == 1) {
					System.out.println("Introduzca la nueva descripción: ");
					producto1.setDescripcion(teclado.nextLine());
				}
				else {
					System.out.println(producto1.getDescripcion());
				}
			break;
			
			case 2:
				if(GUIConsultarOCambiar()==1) {
					System.out.println("Introduzca el nuevo precio: ");
					producto1.setPrecio(Double.parseDouble(teclado.nextLine()));
				}
				else {
					System.out.println(producto1.getPrecio());
				}
			break;
			
			case 3: 
				System.out.println(producto1.getPrecioConIva());
			break;
			
			case 4: 
				if(GUIConsultarOCambiar()==1) {
					System.out.println("Introduzca el nuevo código: ");
					producto1.setCodigo(Integer.parseInt(teclado.nextLine()));
				}
				else {
					System.out.println(producto1.getCodigo());
				}
			break;
			}
			
		}
		
	}

}

