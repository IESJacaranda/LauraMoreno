package relacion8Ejercicio7;

public class Alumno implements Comparable <Alumno>{

	private double nota;
	private String nombre;
	private String apellido;
	
	public Alumno(double nota, String nombre, String apellido) {
		this.nota = nota;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	/**
	 * Ordena a los alumnos alfabéticamente
	 */
	@Override
	public int compareTo(Alumno o) {
		int comparaResult = 0;
		if(this.nota>o.getNota()) {
			comparaResult = 1;
		}else if(this.nota<o.getNota()) {
			comparaResult = -1;
		}
		return comparaResult;
	}
	
//	/**
//	 * Ordena a los alumnos alfabéticamente
//	 */
//	public int compareTo(Alumno o) {
//		return this.getNombre().compareTo(o.getNombre());
//	}

	@Override
	public String toString() {
		return this.nombre + " " + this.apellido;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
}
