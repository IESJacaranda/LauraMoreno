package relacion8;

import java.util.Scanner;

public class Ejercicio1 {

	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		try {
			invertirOrden();
		} catch (NumeroNegativoException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void invertirOrden() throws NumeroNegativoException {
		System.out.println("Introduzca 10 números enteros:");
		int[]numeros = new int[10];
		int[]numerosInversos = new int [10];
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduzca un número: ");
			int num = Integer.parseInt(teclado.nextLine());
			if(num<0) {
				throw new NumeroNegativoException();
			}else {
				numeros[i] = num;
			}
		}
		
		int posicion = 0;
		for(int i=9; i>=0;i--) {
			numerosInversos[posicion] = numeros[i];
			posicion++;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(numerosInversos[i]);
		}
	}
	
	
	

}
