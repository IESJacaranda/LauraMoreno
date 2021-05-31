package ficheroLibros2.registro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaProvincias lp = new ListaProvincias();
		try {
			lp.cargarDatos(lp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//GUI(lp);
		System.out.println(lp.editorialMasUsada());
	}

	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void GUI(ListaProvincias lp) {
		
		int opc;
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch(opc) {
				case 1: {
				}break;
				default:
					System.out.println("Opción inválida");
				break;
			}	
		}while(opc != 8);
	}
	
	public static void mostrarMenu() {
		System.out.println("1.- Editorial más usada en cada una de las provincias.\n"+
							"2.- Editorial más usada en una provincia cuyo nombre se pedirá por teclado.\n"+
							"3.- Editorial más usada en una localidad. Se pedirán los datos de localidad y provincia.\n"+
							"4.- Editorial más usada en una materia (se pedirán los datos de la materia).\n"+
							"5.- Listado de todos los libros usados en todas las materias en un centro (se pedirá el código del\r\n" + 
							"centro).\n"+
							"6.- Listado de todos los libros usados en todas las materias en un centro (se pedirá el nombre\r\n" + 
							"del centro).\n"+
							"7.- Listado de todos los libros usados en una materia en una localidad (se pedirá el nombre de la\r\n" + 
							"localidad y el nombre de la materia) mostrando el nombre del centro y el libro\r\n" + 
							"correspondiente en cada curso que tenga dicha materia.\n"+
							"8.- Salir");
	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}
	
}
