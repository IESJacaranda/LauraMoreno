package com.jacaranda.tamano;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


public class TamanoMunicipioComunidad {

	private List<Comunidad> lista;

	public TamanoMunicipioComunidad() {
		lista = new ArrayList<Comunidad>();
		conseguirDatos();
	}

	public List<Comunidad> getLista() {
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
			sb.append(comunidad+"\n");
		}
		return sb.toString();
	}
	
	
									/**********************************
									 *       CONSEGUIR DATOS          *
									 **********************************/
	
	public void conseguirDatos() {
		String linea = "";
		StringBuilder resul = new StringBuilder();
		try (BufferedReader buffer = new BufferedReader(new FileReader(".\\ficheros\\tamanoMunicipioComunidad.json"))){
			linea = buffer.readLine();
				while(linea!=null) {
					resul.append(linea);
					linea = buffer.readLine();
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		lista = gson.fromJson(resul.toString(), new TypeToken<ArrayList<Comunidad>>(){}.getType());
	}
	
									/**********************************
									 *       MÉTODOS PROPIOS          *
									 **********************************/
	public void getDatosAno(int ano) {
		
		for (Comunidad i : lista) {
			System.out.println("\n"+i.getNombre()+", ");
			for (Municipio j : i.getListMunicipio()) {
				System.out.println(j.getDescrip()+", ");
				for (Datos dato : j.getDatos()) {
					if(dato.getAno() == ano) {
						System.out.println(dato);
					}
				}
			}
		}
	}
	
	public void getDatosComunidadAno(int ano, String comunidad) {
		boolean resul = false;
		for (Comunidad i : lista) {
			if(i.getNombre().toLowerCase().contains(comunidad.toLowerCase())&&!resul) {
				System.out.println("\n"+i.getNombre()+", ");
				resul = true;
				for (Municipio j : i.getListMunicipio()) {
					System.out.println(j.getDescrip()+", ");
					for (Datos dato : j.getDatos()) {
						if(dato.getAno() == ano) {
							System.out.println(dato);
						}
					}
				}
			}
		}
	}
	
	public void addDato(int ano, int dato1, String nomComunidad, String descripComunidad) throws noComunidadException, noDescriptException {
		Datos datos = new Datos(ano, dato1);
		boolean resul = false;
		boolean resul1 = false;
		boolean resul2 = false;
		
		for(Comunidad i: lista) {
			if(i.getNombre().toLowerCase().contains(nomComunidad.toLowerCase()) && !resul) {
				resul = true;
				
				for (Municipio j : i.getListMunicipio()) {
					if(j.getDescrip().toLowerCase().equals(descripComunidad.toLowerCase()) && !resul1) {
						resul1 = true;
						
						for (Datos dato : j.getDatos()) {
							if(dato.getAno() == ano && !resul2) {
								resul2 = true;
								j.getDatos().get(j.getDatos().indexOf(dato)).setDato(dato1);
								//dato.setDato(dato1);
							}
						}
						if(!resul2) {
							j.getDatos().add(datos);
						}
					}
				}
			}
		}
		
		//COMPROBACIONES 
		if(!resul) {
			throw new noComunidadException();
		}if(!resul1) {
			throw new noDescriptException();
		}
	}
	
	
	public boolean esTotalCorrecto(String nomComunidad, int ano) {
		boolean resul = false;
		boolean coincide = false;
		boolean resul2 = false;
		int datoTotal = 0;
		int datoMunicipio = 0;
		
		for (Comunidad i : lista) {
			if(i.getNombre().toLowerCase().contains(nomComunidad.toLowerCase()) && !resul) {
				for (Municipio j : i.getListMunicipio()) {
					
					if(j.getDescrip().equalsIgnoreCase("Total")) {
						for (Datos dato : j.getDatos()) {
							if(dato.getAno() == ano && !resul2) {
								datoTotal = dato.getDato();
								resul2 = true;
							}
						}
					}else {
						for (Datos dato : j.getDatos()) {
							if(dato.getAno() == ano) {
								datoMunicipio += dato.getDato();
							}
						}
					}
				}
				resul = true;
			}
		}	
		
		if(datoTotal == datoMunicipio) {
			coincide = true;
		}else {
			System.out.println("El valor debería ser: "+datoMunicipio);
		}
		
		return coincide;
	}
	
	
	public void escribeNewFile(String fichero) throws IOException {
		FileWriter fw = new FileWriter(".\\ficheros\\"+fichero);
		
		try (BufferedWriter filtroEscritura = new BufferedWriter(fw)) {
			//Le añado lo ya creado (con las posibles modificaciones) porque ya estarán dentro las posibles modificaciones
			
			final Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
			final String representacionBonita = prettyGson.toJson(lista);
			
			PrintWriter pw = new PrintWriter(fw);
			pw.println(representacionBonita);

			pw.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
	
