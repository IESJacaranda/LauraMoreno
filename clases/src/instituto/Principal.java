package instituto;

import java.util.Scanner;

//ME PASÉ AL DOS A MITAD DE ESTE EJERCICIO Y NO ME HA DADO TIEMPO A TERMINARLO.
public class Principal {

	static Scanner teclado = new Scanner(System.in);
	final static String MENUEMPLEADO = "Seleccione la opción que desea:\n1.Nombre"
			+ "\n2.Edad \n3.Género \n4.Horario \n5.Contraseña";
	
	
	
	static Empleado empleado1 = new Empleado();
	public static void main(String[] args) {
		
		PersonalAdministracion personalAdminsitrativo1 = new PersonalAdministracion();
		
		
		//llamada a GUI();
		
	}
	
	public void GUI() {
		int opcion= 1 ;
		
		while (opcion==1){
			System.out.println("Seleccione si desea consultar(1) o modificar(2) datos. \n1 Para consultar\n2 Para modificar");
			opcion = Integer.parseInt(teclado.nextLine());
			
			while(opcion!=1 || opcion!=2) {
				System.out.println("Introduzca de nuevo la opción");
				opcion = Integer.parseInt(teclado.nextLine());}
			
			int opcionMenu = 1;
			System.out.println(MENUEMPLEADO);
			System.out.println("Seleccione la opción del menú que elige:");
			opcionMenu = Integer.parseInt(teclado.nextLine());
			
			while(opcionMenu>0 && opcionMenu<6) {
			try {
				switch (opcionMenu) {
				case 1: 
					if(opcion == 1) {
						System.out.println(empleado1.getNombre());
					}else {
						System.out.println("Introduzca el nombre:");
						empleado1.setNombre(teclado.nextLine());
					}
				case 2: 
					if(opcion==1) {
						
					}
					
			}}catch (Exception e) {
			}
			
			}
		}
		
		
		
		
				
		
	
		
}
}
