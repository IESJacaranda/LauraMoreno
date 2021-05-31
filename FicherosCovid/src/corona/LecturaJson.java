package corona;

public class LecturaJson {
	
	private ClaseDatos Datos;
	
	public LecturaJson() {
		this.Datos = Datos;
	}

	public ClaseDatos getDatos() {
		return Datos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Datos == null) ? 0 : Datos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LecturaJson))
			return false;
		LecturaJson other = (LecturaJson) obj;
		if (Datos == null) {
			if (other.Datos != null)
				return false;
		} else if (!Datos.equals(other.Datos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LecturaJson [Datos=" + Datos + "]";
	}

}
