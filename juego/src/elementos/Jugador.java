package elementos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import logicaJuego.Juego;

public class Jugador extends Elemento {
	//ThreadLocalRandom.current().nextInt(1000, 10000)
	private int fuerza;
	private int magia;
	private int velocidad;
	private int fil;
	private int col;
	private int dinero;
	private int pociones;
	private int gemas;
	static Scanner teclado = new Scanner(System.in);
	
	public Jugador(char simbolo, int fil, int col) {
		super(simbolo);
		this.fil = fil;
		this.col = col;
	}

	public int nextMovimientoVacio() {
		int nextFil = 0;
		int dado = (int) (Math.random()*this.velocidad)+1;
		System.out.println("El dado ha sacado: " + dado);
		int aux = 1;
		for(int i=0;i<dado;i++) {
			System.out.println("Movimiento "+ aux);
			aux++;
			System.out.println("Indique a dónde desea moverse. N:norte, S:sur, E:este, O:oeste.");
			String move = teclado.nextLine();
			switch (move) {
			case "N":
				this.fil += 1;
			break;
			case "S":
				this.fil -= 1;
			break;
			case "E":
				this.col += 1;
			break;
			case "O":
				this.col -= 1;
			break;
			}
		}
		return nextFil;
	}
	
//	private boolean estaVacio() {
//		boolean estaVacio;
//		return Juego.tablero[][] == 0 ? estaVacio = true : estaVacio = false;
//	}
	
	
	@Override
	public int hashCode() {
		int result = this.fil + this.col;
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this == obj) {
			sonIguales = true;
		}else if(obj != null && obj instanceof Jugador) {
			if(
				((Jugador)obj).hashCode() == this.hashCode()) {
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


}
