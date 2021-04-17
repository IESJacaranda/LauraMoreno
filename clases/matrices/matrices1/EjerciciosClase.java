package matrices1;

//COMO AVERIGUO EL VALOR DE Y DENTRO DE LA MATRIZ¿?
import java.util.Scanner;

public class EjerciciosClase {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[][]matriz ={{1,1,1,3,3},{2,2,2,4,5}};
		int[][]matriz2 = {{2,1},{2,1},{2,1},{4,3},{5,3}};
		
		try {
			esMatrizRotadaDispar(matriz, matriz2);
		} catch (NoSonMatricesIgualesException e) {
			e.printStackTrace();
		}
		//System.out.println(esMatrizRotada(matriz, matriz2));
		//System.out.println(esMatrizRotada(matriz2, matriz));
	
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

	/**
	 * Este método devuelve la suma de las dos matrices.
	 * Podría hacerse la implementación de añadir el tipo de operador según la operación que queramos realizar.
	 * @param matriz
	 */
	public static void matrizString(int[][]matriz) {
		StringBuilder fila = new StringBuilder();
		StringBuilder texto = new StringBuilder();
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				fila.append(matriz[i][j]);
				if(j!=matriz.length) {
					fila.append(",");
				}
			}texto.append("["+fila+"]"+"\n");
		
			fila.delete(0, fila.length());
	}
		System.out.println(texto);
	}

	
	public static int[][] sumaMatrices(int[][]matriz, int[][]matriz2) {
		int[][]matrizResultante = new int [matriz.length][matriz2[0].length];
		
		if(sonMismaDimension(matriz, matriz2)) {
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					matrizResultante[i][j] = matriz[i][j] + matriz2[i][j];
				}}
		}
	return matrizResultante;
	}
	
	private static boolean sonMismaDimension(int[][]matriz, int[][]matriz2) {
		boolean sonIguales = false;
		if(matriz.length==matriz2.length) {
			sonIguales = true;
		}return sonIguales;
	}
	
	
	public static int[] concatenacionMatrices(int[]matriz1, int[]matriz2) {
		int[]resultado = new int[0];
		int a = 0;
		if(matriz1!=null && matriz2!=null && matriz1.length>0 && matriz2.length>0) {
			
			resultado = new int[matriz1.length+matriz2.length];
			
		for(int i=0;i<matriz1.length;i++) {
			resultado[i] = matriz1[i];}
		for(int j=matriz1.length;j<resultado.length;j++) {
			resultado[j] = matriz1[a];
			a++;}
		}
		return resultado;
	}
	
	public static void matrizString1Dimension(int[]matriz) {
		StringBuilder fila = new StringBuilder();
		StringBuilder texto = new StringBuilder();
		
		for(int i=0;i<matriz.length;i++) {
			fila.append(matriz[i]);
			if(i!=matriz.length-1) {
				fila.append(",");
				}
			}texto.append("["+fila+"]"+"\n");
		
			fila.delete(0, fila.length());
	
		System.out.println(texto);
	}
	
	/**
	 * Se comprueba si el misma matriz girada a la derecha o a la izquierda (2 veces a la derecha).
	 * @param matriz
	 * @param rotada
	 * @return boolean
	 * La comprobación del tamaño de la matriz no se incluiría si las matrices no tienen el mismo tamaño.
	 */
	public static boolean esMatrizRotada(int[][]matriz, int[][]rotada) {
		boolean esIgual = false;
		
		if( matriz != null && rotada != null && matriz.length == rotada.length && matriz[0].length == rotada[0].length && 
				(sonIguales(esRotadaDerecha(rotada),matriz) 
				|| sonIguales(esRotadaDerecha(esRotadaDerecha(esRotadaDerecha(rotada))),matriz)))
				 {
			esIgual = true; 
		}
		
		return esIgual;
	}
	
	private static int[][] esRotadaDerecha(int[][]matriz) {
		
		int x = matriz.length;
		int[][] girada = new int[x][x];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				girada[j][matriz.length-1-i] = matriz[i][j];		
			}
		}

		return girada;
	}
	
	private static boolean sonIguales(int[][]matriz, int[][]rotada) {
		boolean sonIguales = true;
		
		for(int i=0; i<rotada.length;i++) {
			for(int j=0; j<rotada[i].length;j++) {
				if(matriz[i][j]!=rotada[i][j]) {
					sonIguales = false;
				}
			}
		}
		return sonIguales;
	}
	
	
	/**
	 * Variación del ejercicio anterior. Ahora usando matricen con diferente nº de filas y columnas
	 * @param matriz
	 * @return 
	 */
	public static int[][] rotarALaDerecha(int[][]matriz) {
		int[][] rotada = new int[matriz[0].length][matriz.length];

		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				rotada[j][matriz.length-1-i] = matriz[i][j];		
			}
		}		
		return rotada;

	}
	
	//IMPORTANTE colocar los paréntesis entre métodos.
	/**
	 * Se comprueba que la matriz rotada es idéntica a la original (matriz) comparándola con el resto de posiciones.
	 * @param matriz
	 * @param rotada
	 * @return
	 * @throws NoSonMatricesIgualesException 
	 */
	public static boolean esMatrizRotadaDispar(int[][]matriz, int[][]rotada) throws NoSonMatricesIgualesException {
		boolean esIgual = false;
		
		if(matriz != null && rotada != null) {
			if((sonIguales(matriz,rotarALaDerecha(rotada))) || (sonIguales(matriz,rotarALaDerecha(rotarALaDerecha(rotada))) 
					|| (sonIguales(matriz,rotarALaDerecha(rotarALaDerecha(rotarALaDerecha(rotada))))))){
			
			}
		}else {
			throw new NoSonMatricesIgualesException();
		}
		return esIgual;
	}
	
}











