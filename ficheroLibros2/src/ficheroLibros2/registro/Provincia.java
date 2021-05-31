package ficheroLibros2.registro;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
	
	private String provincia;
	private List<Localidad>localidades;
	
	public Provincia(String nombre) {
		this.localidades = new ArrayList<Localidad>();
		this.provincia = nombre;
	}
	
	public void addLocalidad(Localidad l, Materia m, Centro c, Curso cu) {
		if(!this.localidades.contains(l)) {
			localidades.add(l);
		}else {
			localidades.get(localidades.indexOf(l)).addCentro(m, c, cu);
		}
	}
	
	public String getNombre() {
		return provincia;
	}

	public void setNombre(String nombre) {
		this.provincia = nombre;
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Provincia))
			return false;
		Provincia other = (Provincia) obj;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Provincia: "+this.provincia+"\n");
		for (Localidad localidad : localidades) {
			sb.append(localidad.toString()+"\n");
		}
		return sb.toString();
	}

}
