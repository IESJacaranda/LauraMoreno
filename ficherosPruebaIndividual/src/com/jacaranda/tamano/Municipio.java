package com.jacaranda.tamano;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

	private String  descrip;
	private List<Datos>datos;
	
	public Municipio(String descrip) {
		this.descrip = descrip;
		this.datos = new ArrayList<Datos>();
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public List<Datos> getDatos() {
		return datos;
	}

	public void setDatos(List<Datos> datos) {
		this.datos = datos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrip == null) ? 0 : descrip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Municipio))
			return false;
		Municipio other = (Municipio) obj;
		if (descrip == null) {
			if (other.descrip != null)
				return false;
		} else if (!descrip.equals(other.descrip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(descrip+"\n");
		for (Datos datos2 : datos) {
			sb.append("\t"+datos2+"\n");
		}
		return sb.toString();
	}
}
