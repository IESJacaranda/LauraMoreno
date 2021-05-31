package ficheroLibros2.registro;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private String curso;
	private List <Materia>materias;
	
	public Curso(String curso) {
		this.materias = new ArrayList<Materia>();
		this.curso = curso;
	}
	
	public void addMateria(Materia m) {
		if(!materias.contains(m)) {
			materias.add(m);
		}
	}

	public String getNombre() {
		return curso;
	}


	public void setNombre(String nombre) {
		this.curso = nombre;
	}


	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curso == null) ? 0 : curso.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Curso))
			return false;
		Curso other = (Curso) obj;
		if (curso == null) {
			if (other.curso != null)
				return false;
		} else if (!curso.equals(other.curso))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Curso: "+this.curso+"\n");
		for (Materia materia : materias) {
			sb.append(materia.toString()+"\n");
		}
		return sb.toString();
	}
	
}
