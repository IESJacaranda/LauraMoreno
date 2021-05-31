package ficheroPaises.body;

import java.util.ArrayList;
import java.util.List;

public class City {

	private String id_city;
	private String name;
	private List<Address>directions;
	
	public City(String id_city, String name, List<Address>directions) {
		this.id_city = id_city;
		this.name = name;
		this.directions = new ArrayList<Address>();
	}

	public String getId_city() {
		return id_city;
	}

	public void setId_city(String id_city) {
		this.id_city = id_city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getDirections() {
		return directions;
	}

	public void setDirections(List<Address> directions) {
		this.directions = directions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_city == null) ? 0 : id_city.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof City))
			return false;
		City other = (City) obj;
		if (id_city == null) {
			if (other.id_city != null)
				return false;
		} else if (!id_city.equals(other.id_city))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.name+", direcciones: ");
		for (Address a : directions) {
			sb.append(a.toString());
		}
		return sb.toString();
	}
	
	
}
