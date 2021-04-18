package pooAvanzado.relacion10.Ejercicio3;

import pooAvanzado.relacion10.Ejercicio3.Exception.ClerigoFuerzaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.ClerigoIteligenciaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.FuerzaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.InteligenciaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.RazaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.VidaMaximaNoPermitida;

public class Clerigo extends AbstractPersonaje {

	private String dios;
	
	public Clerigo(String nombre, String raza, int fuerza, int inteligencia, int vidaMaxima, String dios)
			throws RazaNoPermitidaException, FuerzaNoPermitidaException, InteligenciaNoPermitida,
			VidaMaximaNoPermitida, ClerigoFuerzaNoPermitida, ClerigoIteligenciaNoPermitida {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		this.dios = dios;
		//FUERZA
		if(fuerza < 18) {
			throw new ClerigoFuerzaNoPermitida();
		}
		//INTELIGENCIA
		if(inteligencia < 12 || inteligencia > 16) {
			throw new ClerigoIteligenciaNoPermitida();
		}
	}
	
	//MÉTODOS PROPIOS
	public void curar(AbstractPersonaje personaje) {
		if(personaje.getVidaActual()+10 >= 100) {
			personaje.setVidaActual(100);
		}else {
			personaje.setVidaActual(personaje.getVidaActual()+10);
		}
	}

	//TOSTRING
	@Override
	public String toString() {
		return "CLÉRIGO. Nombre: " + nombre + ", nombre: " + nombre 
				+ ", raza: " + raza + ", fuerza: " + fuerza + ", inteligencia: " + inteligencia + ", vidaMaxima: " + vidaMaxima 
				+ ", vidaActual: " + vidaActual + ", dios: " + dios;
	}

	//GETTERS Y SETTERS
	public String getDios() {
		return dios;
	}
	
	public void setDios(String dios) {
		this.dios = dios;
	}
	
	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	@Override
	public String getRaza() {
		return super.getRaza();
	}

	@Override
	public void setRaza(String raza) {
		super.setRaza(raza);
	}

	@Override
	public int getFuerza() {
		return super.getFuerza();
	}

	@Override
	public void setFuerza(int fuerza) {
		super.setFuerza(fuerza);
	}

	@Override
	public int getInteligencia() {
		return super.getInteligencia();
	}

	@Override
	public void setInteligencia(int inteligencia) {
		super.setInteligencia(inteligencia);
	}

	@Override
	public int getVidaMaxima() {
		return super.getVidaMaxima();
	}

	@Override
	public void setVidaMaxima(int vidaMaxima) {
		super.setVidaMaxima(vidaMaxima);
	}

	@Override
	public int getVidaActual() {
		return super.getVidaActual();
	}

	@Override
	public void setVidaActual(int vidaActual) {
		super.setVidaActual(vidaActual);
	}

}
