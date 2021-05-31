package com.jacaranda.tamano;

public class Datos {
	
	private int ano;
	private int dato;
	
	public Datos(int ano, int dato) {
		this.ano = ano;
		this.dato = dato;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return "\t"+"Datos [año=" + ano + ", dato=" + dato + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ano;
		result = prime * result + dato;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Datos))
			return false;
		Datos other = (Datos) obj;
		if (ano != other.ano)
			return false;
		if (dato != other.dato)
			return false;
		return true;
	}
	
}
