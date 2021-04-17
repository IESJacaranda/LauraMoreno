package matrices;

import java.util.Scanner;

public class EjercicioClase {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Indique qué número quiere que rellene el cuadro: ");
		
		matriz(Integer.parseInt(teclado.nextLine()));
	}
	
	
	public static void matriz(int num) {
		System.out.println("Introduzca ahora el tamaño que desea que tenga el cuadro: ");
		System.out.println("Primero el eje X: ");
		int x = Integer.parseInt(teclado.nextLine());
		System.out.println("Introduzca ahora el eje Y: ");
		int y = Integer.parseInt(teclado.nextLine());
		
		int[][]matriz = new int[x][y];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(i==j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=num;
				}
				System.out.println(matriz[i][j]);
			}
		}
		
	}

}
