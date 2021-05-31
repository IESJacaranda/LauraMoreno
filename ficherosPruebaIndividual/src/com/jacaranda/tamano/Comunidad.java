package com.jacaranda.tamano;

import java.util.ArrayList;
import java.util.List;

public class Comunidad {
	private String nombre;
	private List<Municipio>listMunicipio;
	
	public Comunidad(String descrip) {
		this.nombre = descrip;
		this.listMunicipio = new ArrayList<Municipio>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Municipio> getListMunicipio() {
		return listMunicipio;
	}

	public void setListMunicipio(List<Municipio> listMunicipio) {
		this.listMunicipio = listMunicipio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Comunidad))
			return false;
		Comunidad other = (Comunidad) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(nombre+"\n");
		for (Municipio municipio : listMunicipio) {
			sb.append("\t"+municipio+"\n");
		}
		return sb.toString();
	}
	

	
}
