package relacion8;

import java.util.Scanner;

public class Ejercicio7 {

	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Las diferentes partes ded este ejercicio las he hecho en varias clases para practicar con las llamadas a otras clases.
	 * @param args
	 */
	public static void main(String[] args) {
		Ejercicio7MostrarAlumnosAprobados aprobadosOSuspensos = new Ejercicio7MostrarAlumnosAprobados();
		Ejercicio7NotaMedia notaMedia = new Ejercicio7NotaMedia();
		Ejercicio7MasDeXNota masDeX = new Ejercicio7MasDeXNota();
		Ejercicio7MostrarListadoOrdenado alumnosOrdenados = new Ejercicio7MostrarListadoOrdenado();
		
		int numAlumnos = pedirNumAlumnos();
		String[] nombres = pedirNombres(numAlumnos);
		double[] notas = pedirNotas(numAlumnos);
//		
//		//Mostrar alumnos aprobados:
//		aprobadosOSuspensos.muestraAlumnosAprobados(notas, nombres);
//		
//		//Mostrar alumnos suspensos:
//		aprobadosOSuspensos.muestraAlumnosSuspensos(notas, nombres);
//		
//		//Mostrar media de la clase:
//		notaMedia.notaMedia(notas, numAlumnos);
		
		//Mostrar alumnos con más de X nota: 
//		System.out.println("¿A partir de qué nota quiere que se muestren alumnos?");
//		int x = Integer.parseInt(teclado.nextLine());
//		System.out.println(masDeX.mostrarAlumnosConMasDeXNota(numAlumnos, nombres, notas, x));
		
		//Mostrar lista ordenada:
		System.out.println(alumnosOrdenados.mostrarListadoOrdenado(nombres, notas));
		
	}
	
	public static int pedirNumAlumnos() {
		System.out.println("¿Cuántos alumnos hay en la clase?");
		int numAlumnos = Integer.parseInt(teclado.nextLine());
		
		return numAlumnos;
	}
	
	public static String[] pedirNombres(int numAlumnos) {
		String[]nombres = new String[numAlumnos];
		
		for(int i=0;i<numAlumnos;i++) {
			System.out.println("Introduce el nombre del alumno: ");
			nombres[i] = teclado.nextLine();		
		}
		return nombres;
	}
	
	public static double[] pedirNotas(int numAlumnos) {
		double[]notas = new double[numAlumnos];
		
		for(int i=0;i<numAlumnos;i++) {
		System.out.println("Introduce la nota del alumno: ");
		notas[i] = Integer.parseInt(teclado.nextLine());
		}
		return notas;
	}
	
	
}
