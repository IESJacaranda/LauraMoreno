package ficheroLibros2.registro;

public class Materia {
	private String materia;
	private Libro libro;
	
	public Materia(Libro libro, String materia) {
		this.libro = libro;
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Materia))
			return false;
		Materia other = (Materia) obj;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\t Materia: "+this.materia +"\n \t \tLibro: " + libro ;
	}

	
	
}
