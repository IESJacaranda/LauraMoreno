package ficheroLibros2.registro;

import java.util.ArrayList;
import java.util.List;

public class Localidad {
	
	private String localidad;
	private List<Centro>centros;
	
	public Localidad(String nombre) {
		this.localidad = nombre;
		this.centros = new ArrayList<Centro>();
	}
	
	public void addCentro(Materia m, Centro c, Curso cu) {
		if(!centros.contains(c)) {
			centros.add(c);
		}else {
			centros.get(centros.indexOf(c)).addCurso(cu, m);
		}
	}

	public String getNombre() {
		return localidad;
	}

	public void setNombre(String nombre) {
		this.localidad = nombre;
	}

	public List<Centro> getCentros() {
		return centros;
	}

	public void setCentros(List<Centro> centros) {
		this.centros = centros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Localidad))
			return false;
		Localidad other = (Localidad) obj;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		return true;
	}


	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("Localidad: "+this.localidad+"\n");
		
		for (Centro centro : centros) {
			sb.append(centro.toString()+"\n");
			
		}
		return sb.toString();
	}
	
}
