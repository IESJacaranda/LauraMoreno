
package SimulacroExamen.src.empresa;



import java.util.Scanner;

import SimulacroExamen.src.ExcepcionesCustom.SueldoException;
import SimulacroExamen.src.model.Departamento;
import SimulacroExamen.src.model.EPuesto;
import SimulacroExamen.src.model.EmpleadoBase;
import SimulacroExamen.src.model.JefeDepartamento;

public class menu {

	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {

		int opc;
		Departamento d = new Departamento("Contabilidad");
		do {
			mostrarMenu();
			opc = leerEntero("Introduzca la opción deseada");
			switch (opc) {
			case 1:{
				String dni = leerCadena("Introduzca dni");
				String nombre = leerCadena("Introduzca el nombre");
				System.out.println("Introduzca el tipo. Los posibles valores son ADMINISTRATIVO, OPERARIO, CONTABLE");
				String aux= teclado.nextLine();
				
				EPuesto tipo = null;
				if(aux.equalsIgnoreCase("administrativo")) {
					tipo = EPuesto.ADMINISTRATIVO;
				}else if(aux.equalsIgnoreCase("operario")) {
					tipo = EPuesto.OPERARIO;
				}else {
					tipo = EPuesto.CONTABLE;
				}
				d.addEmpleado(new EmpleadoBase(dni,nombre,tipo));
			}
				break;
			case 2:
				String dni = leerCadena("Introduzca dni");
				String nombre = leerCadena("Introduzca el nombre");
				System.out.println("Introduzca el sueldo: ");
				double sueldo = Integer.parseInt(teclado.nextLine());
				System.out.println("Indique antiguedad: ");
				int year = Integer.parseInt(teclado.nextLine());
				try {
					d.addJefe(new JefeDepartamento(dni, nombre, year, sueldo));
				} catch (SueldoException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			case 3:
				System.out.println("El total del sueldo es " + d.obtenerSueldo());
				break;
			case 4:
				System.out.println(d.toString());
				break;
			case 5:
				System.out.println(d.toStringSueldo());
				break;
			case 6:
				System.out.println("Saliendo");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}
		}while (opc!=6);
	}


	// Muestra el menú
	public static void mostrarMenu() {
		System.out.println("1.- anadir empleado\n"+
							"2.- anadir jefe\n"+
							"3.- obtener total sueldo departamento\n"+
							"4.- Mostrar departamento ordenado por nombre\n"+
							"5.- Mostrar departamento ordenado por sueldo\n"+
							"6.- Salir\n");
	}
	
	public static int leerEntero(String msg) {
		System.out.println(msg);
		return Integer.parseInt(teclado.nextLine());
	}
	
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return teclado.nextLine();
	}
	
	public static double leerReal(String msg) {
		System.out.println(msg);
		return 0;
	}
}