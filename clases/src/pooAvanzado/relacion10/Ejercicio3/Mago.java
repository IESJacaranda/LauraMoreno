package pooAvanzado.relacion10.Ejercicio3;

import java.util.Arrays;
import pooAvanzado.relacion10.Ejercicio3.Exception.FuerzaMagoNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.FuerzaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.InteligenciaMagoNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.InteligenciaNoPermitida;
import pooAvanzado.relacion10.Ejercicio3.Exception.RazaNoPermitidaException;
import pooAvanzado.relacion10.Ejercicio3.Exception.VidaMaximaNoPermitida;

public class Mago extends AbstractPersonaje {

	private String[] hechizos = new String[4];

	public Mago(String nombre, String raza, int fuerza, int inteligencia, int vidaMaxima)
			throws RazaNoPermitidaException, FuerzaNoPermitidaException, InteligenciaNoPermitida, VidaMaximaNoPermitida,
			FuerzaMagoNoPermitidaException, InteligenciaMagoNoPermitida {
		super(nombre, raza, fuerza, inteligencia, vidaMaxima);
		// FUERZA
		if (fuerza > 15) {
			throw new FuerzaMagoNoPermitidaException();
		}
		// INTELIGENCIA
		if (inteligencia < 17) {
			throw new InteligenciaMagoNoPermitida();
		}
	}

	// MÉTODOS_PROPIOS
	public void aprendeHechizo(String hechizo) {
		int cont = 0;
		for (int i = 0; i < hechizos.length; i++) {
			if (hechizos[i] == null) {
				hechizos[i] = hechizo;
				System.out.println("¡Hechizo aprendido!");
				cont++;
				break;
			}
		}if (cont == 0) {
			System.out.println("La lista de hechizos memorizados está llena. No se puede incluir ninguno más.");
		}
	}

	public void lanzaHechizo(AbstractPersonaje personaje, String hechizo) {
		if (personaje.getVidaActual() - 10 <= 0) {
			personaje.setVidaActual(0);
		} else {
			personaje.setVidaActual(personaje.getVidaActual() - 10);
		}

		for (int i = 0; i < hechizos.length; i++) {
			if (hechizos[i] != null && hechizos[i].equals(hechizo)) {
				hechizos[i] = null;
				System.out.println("¡Hechizo lanzado! Ya no tienes ese hechizo.");
			}
		}
	}

	// TOSTRING
	@Override
	public String toString() {
		return "MAGO. Nombre: " + nombre + ", hechizos aprendidos: " + Arrays.toString(hechizos) + ", nombre: " + nombre
				+ ", raza: " + raza + ", fuerza: " + fuerza + ", inteligencia: " + inteligencia + ", vidaMaxima: "
				+ vidaMaxima + ", vidaActual: " + vidaActual;
	}

	// SETTERS Y GETTERS
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
