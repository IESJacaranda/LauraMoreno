package corona;

import java.util.ArrayList;
import java.util.List;

public class ClaseMetrica {
	
	private List<Informacion>Datos;
	
	public ClaseMetrica() {
		this.Datos = new ArrayList<Informacion>();
	}

	public List<Informacion> getDatos() {
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
		if (!(obj instanceof ClaseMetrica))
			return false;
		ClaseMetrica other = (ClaseMetrica) obj;
		if (Datos == null) {
			if (other.Datos != null)
				return false;
		} else if (!Datos.equals(other.Datos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClaseMetrica [Datos=" + Datos + "]";
	}
	
}
