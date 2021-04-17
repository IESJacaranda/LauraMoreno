package elementos;

import logicaJuego.Constantes;

public class Guerrero extends Jugador {

	public Guerrero(char simbolo, int fil, int col) {
		super(simbolo, fil, col);
		this.setMagia(Constantes.GUERRERO_MAGIA);
		this.setFuerza(Constantes.GUERRERO_FUERZA);
		this.setVelocidad(Constantes.GUERRERO_VELOCIDAD);
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
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
	public int getMagia() {
		return super.getMagia();
	}

	@Override
	public void setMagia(int magia) {
		super.setMagia(magia);
	}

	@Override
	public int getVelocidad() {
		return super.getVelocidad();
	}

	@Override
	public void setVelocidad(int velocidad) {
		super.setVelocidad(velocidad);
	}

	@Override
	public int getFil() {
		return super.getFil();
	}

	@Override
	public void setFil(int fil) {
		super.setFil(fil);
	}

	@Override
	public int getCol() {
		return super.getCol();
	}

	@Override
	public void setCol(int col) {
		super.setCol(col);
	}

	@Override
	public int getDinero() {
		return super.getDinero();
	}

	@Override
	public void setDinero(int dinero) {
		super.setDinero(dinero);
	}

	@Override
	public int getPociones() {
		return super.getPociones();
	}

	@Override
	public void setPociones(int pociones) {
		super.setPociones(pociones);
	}

	@Override
	public int getGemas() {
		return super.getGemas();
	}

	@Override
	public void setGemas(int gemas) {
		super.setGemas(gemas);
	}

	@Override
	public char getSimbolo() {
		return super.getSimbolo();
	}

	@Override
	public void setSimbolo(char simbolo) {
		super.setSimbolo(simbolo);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
}
