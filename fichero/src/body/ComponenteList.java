package body;

public class ComponenteList implements Comparable<ComponenteList>{
	String nombrePais;
	String idPais;
	String numCiudad;
	String numDirec;
	
	public ComponenteList(String nombrePais, String idPais, String numCiudad, String numDirec) {
		super();
		this.nombrePais = nombrePais;
		this.idPais = idPais;
		this.numCiudad = numCiudad;
		this.numDirec = numDirec;
	}

	@Override
	public String toString() {
		return nombrePais + ", idPais=" + idPais + ", numCiudad=" + numCiudad
				+ ", numDirec=" + numDirec;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombrePais == null) ? 0 : nombrePais.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ComponenteList))
			return false;
		ComponenteList other = (ComponenteList) obj;
		if (nombrePais == null) {
			if (other.nombrePais != null)
				return false;
		} else if (!nombrePais.equals(other.nombrePais))
			return false;
		return true;
	}

	@Override
	public int compareTo(ComponenteList o) {
		return this.nombrePais.compareTo(o.nombrePais);
	}
	
	

}
