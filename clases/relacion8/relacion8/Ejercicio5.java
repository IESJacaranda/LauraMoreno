package relacion8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio5 {

	static Scanner teclado = new Scanner(System.in);
	
	/**
	 * Implementación: controlar que num max de cartas a repartir por jugador sea 24.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("¿Cuántas cartas se van a repartir?");
		int numCartas = Integer.parseInt(teclado.nextLine());
		asignaCartas(numCartas, generarCarta());
	}
	
	/**
	 * Genera una baraja de cartas de 48 cartas
	 * @return List<String>
	 */
	public static List<String> generarCarta() {
		String[]palos = {"oros","copas","espadas","bastos"};
		List<String> baraja = new ArrayList<String>();
		
		for(int i=0;i<palos.length;i++) {
			for(int j=1;j<13;j++) {
				baraja.add(j + " de " + palos[i]);
			}
		}
		return baraja;
	}
	
	/**
	 * Le asigna a cada jugador el número de cartas predefinido aleatoriamente. 
	 * Imprime dos StringBuilder con las cartas de cada jugador.
	 * Implementación: incluir el jugador como parámetro para no tener que repetir el código 2 veces.
	 * @param numCartas
	 * @param baraja
	 */
	public static void asignaCartas(int numCartas, List<String>baraja) {
		String[] jugador1 = new String[numCartas];
		String[] jugador2 = new String[numCartas];
		StringBuilder j1 = new StringBuilder("Las cartas del jugador 1 son:");
		StringBuilder j2 = new StringBuilder("Las cartas del jugador 2 son:");

		for(int i=0;i<jugador1.length;i++) {
			//JUGADOR 1
			int carta = ThreadLocalRandom.current().nextInt(0,baraja.size());
			jugador1[i] = baraja.get(carta);
			baraja.remove(carta);
			//JUGADOR 2
			carta = ThreadLocalRandom.current().nextInt(0,baraja.size());
			jugador2[i] = baraja.get(carta);
			baraja.remove(carta);
		}
		System.out.println(j1);
		System.out.println(imprimeCartas(jugador1));
		System.out.println(j2);
		System.out.println(imprimeCartas(jugador2));
	}
	
	private static StringBuilder imprimeCartas(String[]cartas) {
		StringBuilder carta = new StringBuilder();
		for(Integer i=0;i<cartas.length;i++) {
			String carta1 = (i == cartas.length-1) ? cartas[i] : cartas[i] + ", ";
			carta.append(carta1);
		}
		return carta;
	}
	
}



