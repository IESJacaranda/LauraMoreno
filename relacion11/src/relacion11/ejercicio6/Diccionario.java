package relacion11.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario{
	
	protected Map<String, Set<String>>diccionario;
	
	public Diccionario() {
		this.diccionario = new HashMap<String, Set<String>>();
	}
	
	public void addPalabra(String palabra, String sdo) {
		if(diccionario.containsKey(palabra)) {
			diccionario.get(palabra).add(sdo);
		}else {
			diccionario.put(palabra, new HashSet<String>());
			diccionario.get(palabra).add(sdo);
		}
	}
	
	public String buscaPalabra(String palabra) throws Exception {
		StringBuilder sb = new StringBuilder("La palabra "+palabra+" tiene los siguientes significados:\n");
		if(diccionario.containsKey(palabra)) {
			sb.append(diccionario.get(palabra));
		}else {
			throw new Exception("La palabra no se encuentra en el diccionario");
		}
		return sb.toString();
	}
	
	public void borraPalabra(String palabra) {
		if(diccionario.containsKey(palabra)) {
			diccionario.remove(palabra);
		}
	}
	
	//Primero lo ordeno todo almacenándo las claves en una lista. 
	//Después solo imprimo los que empiecen por la palabra buscada
	public String listarPorPalabraEnOrden(String palabra) {
		StringBuilder sb = new StringBuilder();
		List<String>list = new ArrayList<String>(diccionario.keySet());
		Collections.sort(list, new OrdenarPorKey());
		for(String i: list) {
			if(i.startsWith(palabra)) {
				sb.append(i+"\n");
			}
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diccionario == null) ? 0 : diccionario.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Diccionario))
			return false;
		Diccionario other = (Diccionario) obj;
		if (diccionario == null) {
			if (other.diccionario != null)
				return false;
		} else if (!diccionario.equals(other.diccionario))
			return false;
		return true;
	}

	public Map<String, Set<String>> getDiccionario() {
		return diccionario;
	}

	public void setDiccionario(Map<String, Set<String>> diccionario) {
		this.diccionario = diccionario;
	}

	
}
