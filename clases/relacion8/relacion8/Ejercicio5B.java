package relacion8;

import java.util.Scanner;

public class Ejercicio5B {

	public static void main(String[] args) {
		GUI();
	}
		
	/**
	 * Comprueba que las cartas no se repiten en ninguno de los jugadores.
	 * Si no es así, imprime las cartas para 1 jugador.
	 * @param jugador1
	 * @param jugador2
	 */
	public static void asignarCartas(Carta[]jugador1, Carta[]jugador2) {
		int aux = jugador1.length-1;
		while(aux>=0) {
			Carta carta = new Carta();
			if(!existeLaCarta(carta, jugador1, jugador2)) {
				jugador1[aux] = carta;
				System.out.println(carta);
				aux--;
			}
		}
		
	}
	
	private static boolean existeLaCarta(Carta carta, Carta[]jugador1, Carta[]jugador2) {
		boolean existe = false;
		for(int i=0;i<jugador1.length;i++) {
			if(jugador1[i] != null && jugador1[i].equals(carta) || jugador2[i] != null && jugador2[i].equals(carta)) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	
	/**
	 * Pide el número de cartas, crea los vectores con ello (String) y llama al método 2 veces 
	 * alternando el orden de los jugadores para alternar la asignación de cartas.
	 */
	public static void GUI() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("¿Cuántas cartas queréis?");
		int numCartas = Integer.parseInt(teclado.nextLine());
		teclado.close();
		
		Carta[] jugador1 = new Carta[numCartas];
		Carta[] jugador2 = new Carta[numCartas];
		
		System.out.println("Cartas del jugador 1:");
		asignarCartas(jugador1, jugador2);
		System.out.println("Cartas del jugador 2:");
		asignarCartas(jugador2, jugador1);
	}
}
