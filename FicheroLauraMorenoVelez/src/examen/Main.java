package examen;

import java.util.Scanner;

public class Main {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		Feria f = new Feria();
		f.cargaDatos(f);
		//System.out.println(f.muestraCasetasCalle("JOSELITO EL GALLO"));
		//System.out.println(f.muestraNumCasetasPorCalle());
		//f.eliminaCaseta("JUAN BELMONTE", 10);
		GUI(f);

	}

	public static void GUI(Feria f) throws Exception {

		int opc;

		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch (opc) {
			case 1: {
				String calle = leerCadena("Indica la calle");
				System.out.println(f.muestraCasetasCalle(calle));
			}
				break;
			case 2: {
				System.out.println(f.muestraNumCasetasPorCalle());
			}
				break;
			case 3: {
				String calle = leerCadena("Introduce nombre de la calle:");
				int num = leerEntero("Introduce el número: ");
				f.eliminaCaseta(calle, num);
			}
				break;
			case 4: {
				System.out.println("¡Adiós!");
			}
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		} while (opc != 4);
	}

	public static void mostrarMenu() {
		System.out.println("1.Mostrar todas las casetas existentes en una calle. (Se pedirá el nombre de la calle)\n"
				+ "2.Mostrar para cada una de las calles del recinto ferial el número de casetas que hay en la\r\n"
				+ "calle\n"
				+ "3. Eliminar una caseta. (Extra)Si se elimina una caseta se considerará que el resto de las\r\n"
				+ "casetas posteriores se desplazan, es decir si borro la caseta 5 de una calle, todas las casetas a\r\n"
				+ "partir del número 5 deberán descender un número si la caseta borrada tiene un módulo, dos\r\n"
				+ "si tiene dos módulos, y así sucesivamente. Se pedirá el nombre de la calle y el número. Si no\r\n"
				+ "existe se deberá mostrar un mensaje de error.\n " + "4.Salir");
	}

	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}

	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}

}
