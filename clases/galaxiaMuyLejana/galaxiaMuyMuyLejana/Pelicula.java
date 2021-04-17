package galaxiaMuyMuyLejana;

import java.util.Arrays;

public class Pelicula {

	private String nombrePeli;
	private int anyoEstreno;
	private Personaje personaje1;
	private Personaje personaje2;
	private Personaje personaje3;
		
	
	Pelicula(){}
	
	Pelicula (String nombrePeli, int anyoEstreno){
		this.nombrePeli = nombrePeli;
		this.anyoEstreno = anyoEstreno;
		this.personaje1 = personaje1;
		this.personaje2 = personaje2;
		this.personaje3 = personaje3;
	}

	
	
		
	
	public Personaje getPersonaje1() {
		return personaje1;
	}

	public void setPersonaje1(Personaje personaje1) {
		this.personaje1 = personaje1;
	}

	public Personaje getPersonaje2() {
		return personaje2;
	}

	public void setPersonaje2(Personaje personaje2) {
		this.personaje2 = personaje2;
	}

	public Personaje getPersonaje3() {
		return personaje3;
	}

	public void setPersonaje3(Personaje personaje3) {
		this.personaje3 = personaje3;
	}

	public String getNombrePeli() {
		return nombrePeli;
	}

	public void setNombrePeli(String nombrePeli) {
		this.nombrePeli = nombrePeli;
	}

	public int getAnyoEstreno() {
		return anyoEstreno;
	}

	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}
	
	
	
	/**
	 * 
	 * @param pelicula1
	 * @param pelicula2
	 * @return película más antigua. 
	 */
	public String compararPelis(Pelicula pelicula1, Pelicula pelicula2) {
		String peliMasAntigua;
		
		if(pelicula1.anyoEstreno > pelicula2.anyoEstreno) {
			peliMasAntigua = "La película más antigua es: " + pelicula1;	
			
		}else if (pelicula1.anyoEstreno <pelicula2.anyoEstreno) {
			peliMasAntigua = "La película más antigua es: " + pelicula2;	
			
		}else {
			peliMasAntigua = "Las dos películas son del mismo año.";
		}
		return peliMasAntigua;
	}
	
	
	/**
	 * Poder máx. de la peli = poder de destrucción de los personajes de la peli sumados.
	 * @param pelicula
	 * @return el poder máximo de destrucción de la película
	 */
	public String poderMaxPeli(Pelicula pelicula) {
		
		int poderMaxPeli = pelicula.getPersonaje1().getCapDestruccion() + pelicula.getPersonaje2().getCapDestruccion() + pelicula.getPersonaje3().getCapDestruccion();
		
		return "El poder máximo de la película es: " + poderMaxPeli;
	}
	
	
	/**
	 * Utiliza sort con un array para recoger a los personajes 
	 * @return personajes de la película ordenados alfabéticamente
	 */
//	public String ordenarPersonajes() {
//		String personajesOrdenados ="";	
//		Personaje[] nombres = {this.personaje1, this.personaje2, this.personaje3};
//		Arrays.sort(nombres);
//
//		for (Personaje i : nombres) {
//            personajesOrdenados += i + ", ";
//		}
//		return personajesOrdenados;
//	}
	
	/**
	 * Ordena alfabéticamente utilizando compareTo
	 * @return String con los nombres de los 3 personajes (Personaje)
	 */
	public String ordenarPersonajes() {
		String mayor = "";
		String menor = "";
		String medio = "";
		if(personaje1.getNombrePersonaje().compareTo(personaje2.getNombrePersonaje())>0){
			mayor = personaje1.getNombrePersonaje();
			menor = personaje2.getNombrePersonaje();
		}else {
			mayor = personaje2.getNombrePersonaje();
			menor = personaje1.getNombrePersonaje();
		}
		
		if(personaje3.getNombrePersonaje().compareTo(mayor)>0) {
			medio = mayor;
			mayor = personaje3.getNombrePersonaje();
		}else {
			medio = personaje3.getNombrePersonaje();
		}
		
		if(personaje3.getNombrePersonaje().compareTo(menor)>0) {
			medio = personaje3.getNombrePersonaje();
		}else {
			menor = personaje3.getNombrePersonaje();
			
		}
		
		
		return  menor + ", " + medio + ", " + mayor + ".";
	}
	
	
	
	@Override
	public String toString() {
		return this.nombrePeli + ", (" + this.anyoEstreno + "), " + ordenarPersonajes();
	}
	
	
	

	
}
