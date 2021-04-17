package relacion8;

public class Ejercicio7NotaMedia {
	
	public String notaMedia(double[]notas, int numAlumnos) {
		double suma = 0;
		
		for(int i=0;i<numAlumnos;i++) {
			suma += notas[i];
		}
		return "La media de la clase es: " + suma/numAlumnos;
	}

}
