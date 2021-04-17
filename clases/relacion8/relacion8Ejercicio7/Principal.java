package relacion8Ejercicio7;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
	static final String MENU = "1. Nombre y nota de los alumnos aprobados\n" 
			+ "2. Nombre y nota de los alumnos suspensos\n"
			+ "3. Nota media de la clase\n"
			+ "4. Alumnos con más de X nota\n"
			+ "5. Alumnos con la máxima y mínima nota\n"
			+ "6. Listado creaciente de alumnos por nota\n"
			+ "7. Salir";
	
	static Scanner teclado = new Scanner(System.in);
	static Clase primeroB = new Clase();
	
	public static void main(String[] args) {
		GUI();
	}

	private static void introducirAlumnado() {
		Clase primeroB = new Clase();
		System.out.println("¿Cuántos alumnos desea introducir?");
		int numAlumnos = Integer.parseInt(teclado.nextLine());
		
		for(int i=0;i<numAlumnos;i++) {
			System.out.println("Introduzca la nota: ");
			double nota = Double.parseDouble(teclado.nextLine());
			System.out.println("Introduzca el nombre: ");
			String nombre = teclado.nextLine();
			System.out.println("Introduzca el apellido: ");
			String apellido = teclado.nextLine();
			primeroB.addAlumno(new Alumno(nota,nombre,apellido));
		}
		teclado.close();
	}
	
	public static void GUI() {
		introducirAlumnado();
		int opcion = 0;
		System.out.println(MENU);
		while(opcion <=6 && opcion>0) {
			switch (opcion) {
				case 1: 
					System.out.println(primeroB.getAlumnosAprobados());
					break;
				case 2: 
					System.out.println(primeroB.getAlumnosSuspensos());
					break;
				case 3:
					System.out.println(primeroB.getNotaMedia());
					break;
				case 4: 
					System.out.println("Indique la nota mínima que deben tener los alumnos para que sean mostrados:");
					double nota = Double.parseDouble(teclado.nextLine());
					System.out.println(primeroB.getAlumnosSuperanNota(nota));
					break;
				case 5: 
					System.out.println(primeroB.getMaximaNota());
					System.out.println(primeroB.getMinimaNota());
					break;
				case 6: 
					Collections.sort(primeroB.getAlumnos());
					break;
				default:
					System.out.println("Adiós");
			}
		}
	}
}
