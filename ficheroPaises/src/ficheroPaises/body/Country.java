package ficheroPaises.body;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private String name;
	private String id_country;
	private List<City>cities;
	
	public Country(String name, String id_country, List<City>cities) {
		this.name = name;
		this.id_country = id_country;
		this.cities = new ArrayList<City>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId_country() {
		return id_country;
	}

	public void setId_country(String id_country) {
		this.id_country = id_country;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_country == null) ? 0 : id_country.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Country))
			return false;
		Country other = (Country) obj;
		if (id_country == null) {
			if (other.id_country != null)
				return false;
		} else if (!id_country.equals(other.id_country))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Country "+this.name+", id: "+id_country+", ciudades: ");
		for (City city : cities) {
			sb.append(city.toString());
		}
		return "Country [name=" + name + ", id_country=" + id_country + ", cities=" + cities + "]";
	}
	
	
}
