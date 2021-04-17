package juego;
//Hashcode --> problemas
import java.util.Objects;

import ejercicio5.Equipo;

public class Jugador extends Elemento {

	private int fuerza;
	private int magia;
	private int velocidad;
	private int fil;
	private int col;
	private int dinero;
	private int pociones;
	private int gemas;
	private int hashCode;
	
	public Jugador() {
		super();
	}

	public Jugador(char simbolo, int fuerza, int magia, int velocidad, int fil, int col, int dinero, int pociones, int gemas) {
		super(simbolo);
		this.fuerza = fuerza;
		this.magia = magia;
		this.velocidad = velocidad;
		this.fil = fil;
		this.col = col;
		this.dinero = dinero;
		this.pociones = pociones;
		this.gemas = gemas;
		this.hashCode = hashCode();
	}
	
	

	@Override
	public String toString() {
		return "Jugador: " + super.toString() + " ,fuerza=" + fuerza + ", magia=" + magia + ", velocidad=" + velocidad + ", fil=" + fil + ", col="
				+ col + ", dinero=" + dinero + ", pociones=" + pociones + ", gemas=" + gemas + ".";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(fuerza, magia, velocidad);
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if(this==obj) {
			sonIguales = true;
		}
		else if(obj!=null && obj instanceof Jugador) {
			if(((Jugador)obj).getHashCode() == this.getHashCode()) {
				sonIguales = true;
			}
		}
		return sonIguales;
	}

	
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFil() {
		return fil;
	}

	public void setFil(int fil) {
		this.fil = fil;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public int getPociones() {
		return pociones;
	}

	public void setPociones(int pociones) {
		this.pociones = pociones;
	}

	public int getGemas() {
		return gemas;
	}

	public void setGemas(int gemas) {
		this.gemas = gemas;
	}

	public int getHashCode() {
		return hashCode;
	}

	public void setHashCode(int hashCode) {
		this.hashCode = hashCode;
	}

}
