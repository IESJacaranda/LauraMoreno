package corona;

import java.util.ArrayList;
import java.util.List;

public class ClaseDatos {
	
	private List<ClaseMetrica>Metricas;
	
	public ClaseDatos() {
		this.Metricas= new ArrayList<ClaseMetrica>();
	}

	public List<ClaseMetrica> getMetricas() {
		return Metricas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Metricas == null) ? 0 : Metricas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ClaseDatos))
			return false;
		ClaseDatos other = (ClaseDatos) obj;
		if (Metricas == null) {
			if (other.Metricas != null)
				return false;
		} else if (!Metricas.equals(other.Metricas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClaseDatos [Metricas=" + Metricas + "]";
	}
	
	

}
