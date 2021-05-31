package com.jacaranda.tamano;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class TamanoMunicipioComunidad {

	private ArrayList<Comunidad> lista;

	public TamanoMunicipioComunidad() {
		lista = new ArrayList<Comunidad>();
		cargarDatos();
	}

	public ArrayList<Comunidad> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Comunidad> lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof TamanoMunicipioComunidad))
			return false;
		TamanoMunicipioComunidad other = (TamanoMunicipioComunidad) obj;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Comunidad comunidad : lista) {
			sb.append(comunidad + "\n");
		}
		return sb.toString();
	}

	/***********************
	 * CARGAR DATOS *
	 ***********************/
	public void cargarDatos() {
		String linea = "";
		StringBuilder resul = new StringBuilder();
		try (BufferedReader buffer = new BufferedReader(new FileReader(".\\fichero\\tamanoMunicipioComunidad.json"))) {
			linea = buffer.readLine();
			while (linea != null) {
				resul.append(linea);
				linea = buffer.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		Gson gson = new Gson();
		lista = gson.fromJson(resul.toString(), new TypeToken<ArrayList<Comunidad>>() {
		}.getType());
	}

	/***********************
	 * MÉTODOS PROPIOS *
	 ***********************/
	// Mostrar los datos de todas las comunidades y de España de un año que se
	// pedirá
	// por teclado. Es decir, se mostrarán todos los datos.
	public String muestraDatosComunidades(int ano) {
		StringBuilder sb = new StringBuilder();

		for (Comunidad c : lista) {

			sb.append("\n" + c.getNombre() + "\n");

			sb.append(c.getDatoAnno(ano));
		}
		return sb.toString();
	}

	// Mostrar los datos de una comunidad y un año. Los datos se pedirán por teclado
	public String muestraDatosComAnio(String nomComunidad, int anio) {
		StringBuilder sb = new StringBuilder();
		try {
			Comunidad c = this.lista.get(this.lista.indexOf(new Comunidad(nomComunidad)));// Saco la comunidad que me
																							// interesa
			sb.append("\n" + c.getNombre() + "\n");

			sb.append(c.getDatoAnno(anio));
		} catch (Exception e) {
			return "La comunidad introducida no existe";
		}
		return sb.toString();
	}

	// Añadir un dato. Se pedirá el nombre de la comunidad y la descripción
	// (descrip).
	// A continuación se pedirá el año y el valor del dato.
	public void addDato(String nomCom, String descrLoc, int valor, int anio) {

		try {
			Comunidad c = this.lista.get(this.lista.indexOf(new Comunidad(nomCom)));// Saco la comunidad que me
																					// interesa
			c.addDato(anio, valor, descrLoc);
			

		} catch (Exception e) {
			System.out.println("Alguno de los valores introducidos no existe");
		}

	}

	/**
	 * Comprobar que el valor de Total es la suma de todos los valores: Para ello se
	 * deberá pedir la comunidad y el año. Se deberá comparar el valor “Total” de
	 * ese año con la suma de todos los datos de todos los municipios menos “Total”.
	 * Se deberá informar si el valor es igual o en caso de que no sea igual el
	 * valor actual y el que debería estar.
	 **/
	public boolean compruebaTotal(String com, int ano) {
		boolean resul = true;
		
		Comunidad c = this.lista.get(this.lista.indexOf(new Comunidad(com)));
		
		if(c.compruebaTotal(ano) != c.consigueDatoTotal(ano)) {
			resul = false;
			System.out.println("Incorrecto. El dato debería ser "+ c.consigueDatoTotal(ano));
		}
		
		return resul;
	}
	
	
	
	

}
