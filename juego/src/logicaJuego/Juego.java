package logicaJuego;

import static logicaJuego.Constantes.CELL_HORIZONTAL_SEP;
import static logicaJuego.Constantes.LINE_SEP;
import static logicaJuego.Constantes.LINE_SEPARATOR;
import static logicaJuego.Constantes.NUM_ARBOLES;
import static logicaJuego.Constantes.NUM_DINERO;
import static logicaJuego.Constantes.NUM_GEMAS;
import static logicaJuego.Constantes.NUM_POCIONES;
import static logicaJuego.Constantes.NUM_ROCAS;

import java.util.ArrayList;
import elementos.Arbol;
import java.util.concurrent.ThreadLocalRandom;
import elementos.Dinero;
import elementos.Elemento;
import elementos.Elfo;
import elementos.Gema;
import elementos.Guerrero;
import elementos.Jugador;
import java.util.List;
import java.util.Random;

import elementos.Mago;
import elementos.Ogro;
import elementos.Pocion;
import elementos.Roca;
import java.util.Scanner;

public class Juego {
	static Scanner teclado = new Scanner (System.in);
	
	public static Elemento[][] tablero;
	private List <Jugador>jugadores;
	private int alto;
	private int ancho;
	private int numJugadores;
	private boolean finished = false;
	private int jugadorJuega;
	
	public Juego(int alto, int ancho) {
		this.alto = Constantes.ALTO;
		this.ancho = Constantes.ANCHO;
		setTablero(new Elemento[this.alto][this.ancho]);	
		this.numJugadores = preguntarNumJugadores();
		this.crearJugadores();
		this.crearTablero();
	}
	
	private void crearTablero() {
		crearRoca();
		crearArbol();
		crearPocion();
		crearGema();
		crearDinero();
		imprimirTablero();
	}
	
	//TABLERO
	public void imprimirTablero() {
		StringBuilder sb = new StringBuilder();
		sb.append(LINE_SEP + LINE_SEPARATOR);
		for(int i=0;i<tablero.length;i++) {
			sb.append(CELL_HORIZONTAL_SEP);
			for(int j=0;j<tablero[0].length;j++) {
				sb.append((tablero[i][j] != null ? tablero[i][j] 
						                        : " ") + CELL_HORIZONTAL_SEP);
			}
			sb.append(LINE_SEPARATOR + LINE_SEP + LINE_SEPARATOR);
		}
		System.out.println(sb.toString());
	}
	//---------------------------------------------------------------------------
	
	//MÉTODOS SOBRE JUGADORES ---------------------------------------------------
	private int preguntarNumJugadores() {
		do {
			System.out.println("¿Cuántos jugadores vais a ser?");
			this.numJugadores = Integer.parseInt(teclado.nextLine());
		}while(this.numJugadores <2 || this.numJugadores>6);
			
		return numJugadores;
	}
	
	private void crearJugadores () {
		this.jugadores = new ArrayList<Jugador>();		
		for(int i=0; i<numJugadores;i++) {
			System.out.println("¿Qué tipo de jugador quiere ser: (E)Elfo, (O)Ogro, (G)Guerrero, (M)Mago?");
			char tipo = teclado.next().charAt(0);
			this.jugadorJuega = i;
			crearJugador(tipo);
		}
	}
	
	/**
	 * Por defecto creará un elfo si no se le indica lo contrario.
	 * @param letraJugador
	 */
	private void crearJugador(char letraJugador) {
		
		int ancho;
		int alto;
		char simboloJugador = Constantes.NOMBRE_JUGADORES[this.jugadorJuega];
		
		do{
			ancho = new Random().nextInt(this.ancho); 
			alto = new Random().nextInt(this.alto);
			
		}while(Juego.tablero[ancho][alto] != null);
		
		Jugador nuevoJugador;	//PODRÍA HACER ESTO SI LA CLASE JUGADOR ES ABSTRACTA??
		switch (Character.toUpperCase(letraJugador)) {
		case 'E': 
			nuevoJugador = new Elfo(simboloJugador, alto, ancho);
			break;
		case 'O' :
			nuevoJugador = new Ogro(simboloJugador, alto, ancho);
			break;
		case 'G':
			nuevoJugador = new Guerrero(simboloJugador, alto, ancho);
			break;
		case 'M':
			nuevoJugador = new Mago(simboloJugador, alto, ancho);
			break;
		default:
			nuevoJugador = new Elfo(simboloJugador, alto, ancho);
			break;
		}
		this.jugadores.add(nuevoJugador);
	}
	
	public void moverJugador() {
		
	}
	//-------------------------------------------------------------------------------
	
	//CREACIÓN DE LOS OBJETOS DEL TABLERO -------------------------------------------
	private void crearRoca() {
		int ancho, alto;
		for(int i=0; i<NUM_ROCAS;i++) {
			do {
				ancho = ThreadLocalRandom.current().nextInt(0, this.ancho);
				alto = ThreadLocalRandom.current().nextInt(0, this.alto);
			}while(getTablero()[ancho][alto] != null);
			this.getTablero()[ancho][alto] = new Roca();
		}
	}
	
	private void crearArbol() {
		int ancho, alto;
		for(int i=0; i<NUM_ARBOLES;i++) {
			do {
				ancho = ThreadLocalRandom.current().nextInt(0, this.ancho);
				alto = ThreadLocalRandom.current().nextInt(0, this.alto);
			}while(getTablero()[ancho][alto] != null);
			this.getTablero()[ancho][alto] = new Arbol();
		}
	}
	
	private void crearPocion() {
		int ancho, alto;
		for(int i=0; i<NUM_POCIONES;i++) {
			do {
				ancho = ThreadLocalRandom.current().nextInt(0, this.ancho);
				alto = ThreadLocalRandom.current().nextInt(0, this.alto);
			}while(getTablero()[ancho][alto] != null);
			this.getTablero()[ancho][alto] = new Pocion();
		}
	}
	
	private void crearGema() {
		int ancho, alto;
		for(int i=0; i<NUM_GEMAS;i++) {
			do {
				ancho = ThreadLocalRandom.current().nextInt(0, this.ancho);
				alto = ThreadLocalRandom.current().nextInt(0, this.alto);
			}while(getTablero()[ancho][alto] != null);
			this.getTablero()[ancho][alto] = new Gema();
		}
	}
	
	private void crearDinero() {
		int ancho, alto;
		for(int i=0; i<NUM_DINERO;i++) {
			do {
				ancho = ThreadLocalRandom.current().nextInt(0, this.ancho);
				alto = ThreadLocalRandom.current().nextInt(0, this.alto);
			}while(getTablero()[ancho][alto] != null);
			this.getTablero()[ancho][alto] = new Dinero();
		}
	}
//------------------------------------------------------------------------------
	
	public Elemento[][] getTablero() {
		return tablero;
	}

	public void setTablero(Elemento[][] tablero) {
		Juego.tablero = tablero;
	}
	
}






