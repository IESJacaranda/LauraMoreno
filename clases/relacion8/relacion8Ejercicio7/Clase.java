package relacion8Ejercicio7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Clase {
	private List <Alumno> alumnos;
	
	public Clase() {
		this.alumnos = new ArrayList<Alumno>();
	}

	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}
	
	public String getAlumnosAprobados() {
		StringBuilder aprobados = new StringBuilder("Los alumnos aprobados son: \n");
		for(Alumno al : alumnos) {
			if(al.getNota() >= 5) {
				aprobados.append(al + "\n");
			}
		}
		return aprobados.toString();
	}
	
	public String getAlumnosSuspensos() {
		StringBuilder aprobados = new StringBuilder("Los alumnos suspensos son: \n");
		for(Alumno al : alumnos) {
			if(al.getNota() < 5) {
				aprobados.append(al + "\n");
			}
		}
		return aprobados.toString();
	}
	
	public String getAlumnosSuperanNota(double notaCorte) {
		StringBuilder aprobados = new StringBuilder("Los alumnos que superan la nota son: \n");
		for(Alumno al : alumnos) {
			if(al.getNota() >= notaCorte) {
				aprobados.append(al + "\n");
			}
		}
		return aprobados.toString();
	}
	
	public String getNotaMedia() {
		double suma = 0.0;
		
		if(!alumnos.isEmpty()) {
			for(Alumno al:alumnos) {
				suma += al.getNota();
			}
		}
		return "La nota media es: " + suma / alumnos.size();
	}
	
	public String getMaximaNota() {
		return getNotaLimiteDeClase(true);
	}
	
	/**
	 *Devuelve false para que el siguiente Método getNotaLimiteDeClase devuelva a mínima nota
	 * @return boolean
	 */
	public String getMinimaNota() {
		 return getNotaLimiteDeClase(false);
	}
	
	/**
	 * Devuelve la máxima o mínima nota
	 * @param maximaNota boolean
	 * @return String con frase máx o mín nota
	 */
	public String getNotaLimiteDeClase(boolean maximaNota) {
		String result = "No hay datos de alumnos";
		if(!this.alumnos.isEmpty()) {
			Collections.sort(this.alumnos);
			int posicion = maximaNota? this.alumnos.size()-1 : 0;
			String mensaje = maximaNota ? "máxima" : "mínima" ;
			result = "La " + mensaje + " nota es: " + this.alumnos.get(posicion).getNota();
		}
		 return result;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
}
