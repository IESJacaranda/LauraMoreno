package body;

import java.util.HashSet;
import java.util.Set;

public class Pais {

	protected int countryId;
	protected String name;
	protected Set<Ciudad>ciudades;
	
	public Pais(int countryId, String name, Set<Ciudad>ciudades) {
		super();
		this.countryId = countryId;
		this.name = name;
		this.ciudades = new HashSet<Ciudad>();
	}
	
	public Pais(int countryId,  String name) {
		super();
		this.countryId = countryId;
		this.name = name;
		this.ciudades = new HashSet<Ciudad>();
	}
	
	public String toString() {
		return name +" con id "+ countryId;
	}
	
	public void addCiudad(Ciudad c) {
		ciudades.add(c);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudades == null) ? 0 : ciudades.hashCode());
		result = prime * result + countryId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Pais))
			return false;
		Pais other = (Pais) obj;
		if (ciudades == null) {
			if (other.ciudades != null)
				return false;
		} else if (!ciudades.equals(other.ciudades))
			return false;
		if (countryId != other.countryId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getCountryId() {
		return countryId;
	}

	public String getName() {
		return name;
	}

	public Set<Ciudad> getCiudades() {
		return ciudades;
	}
	
	/** 
	 * get lista ciudad --> string
	 * get ciudad --> string
	 * get codigo --> string
	 * get numero ciudad --> int
	 * hay que crear una lista de paises en una clase nueva que será la que escriba y lea
	 */
	
	
}
