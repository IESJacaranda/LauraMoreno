package relacion8;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio7MasDeXNota {

	
	public String mostrarAlumnosConMasDeXNota(int numAlumnos, String[]nombres, double[]notas, double x) {
		String alumnosConMasDeX = "";
		List <String> alumnos = new ArrayList<>();
		
		for(int i=0;i<numAlumnos;i++) {
			if(notas[i] > x) {
				alumnos.add(nombres[i]);
			}
		}
		for(int i=0;i<alumnos.size();i++) {
			if(i != alumnos.size()) {
				alumnosConMasDeX += alumnos.get(i) + ", ";
			}else {
				alumnosConMasDeX += alumnos.get(i);
			}
		}
		
		return "Los alumnos con más de un " + x + " son: " + alumnosConMasDeX;
	}
}
