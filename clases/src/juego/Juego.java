package juego;
//están bien los atributos? como los relaciono con las constantes?
//lo de el constructor de guerrero, mago...a qué se refiere? 
public class Juego {
	
	private Elemento[][] tablero;
	private Jugador[] jugadores;
	private int alto;
	private int ancho;
	private int numJugadores;
	private boolean finished = false;
	private int jugadorJuega;
	
	public Juego() {}
	
	public Juego(int ancho, int alto, int numJugadores) {
		this.ancho = ancho;
		this.alto = alto;
		this.numJugadores = numJugadores;
	}
	
	

}
