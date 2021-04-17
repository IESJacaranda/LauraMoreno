package relacion8;

import java.util.Scanner;

public class Ejercicio3 {
	
	static final int MAX_NUMEROS = 10;
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
			System.out.println(calcularMedia(solicitarNumerosYPasarlosArray()));
			System.out.println(contarNumsFinales(solicitarNumerosYPasarlosArray()));
			System.out.println(numeroFinalMasRepetido(solicitarNumerosYPasarlosArray()));
			System.out.println(numerosQueNoAparecen(solicitarNumerosYPasarlosArray()));

		} catch (NumeroIncorrectoException | RespuestaIncorrectaException e) {
			e.printStackTrace();
		}
	}
	

	public static String[] solicitarNumerosYPasarlosArray() throws NumeroIncorrectoException, RespuestaIncorrectaException {
		String respuestas = "SN";
		String nums = "";
		String[]array;
		String respuesta = "";
		
		while(!respuesta.toUpperCase().equalsIgnoreCase("N")) {
			System.out.println("Introduzca un número entre 1 y 1000: ");
			int n = Integer.parseInt(teclado.nextLine());
			if(n<0||n>1000) {
				throw new NumeroIncorrectoException();
			}
			nums += n + ",";
			
			System.out.println("¿Desea seguir? S/N");
			respuesta = teclado.nextLine();
		
		if(!respuestas.contains(respuesta.toUpperCase())) {
			throw new RespuestaIncorrectaException();
		}
		}
		
		array = nums.split(",");
		return array;
	}
	
	
	/**
	 * Se le pasa un array String y se calcula la media de sus elementos (números).
	 * @param array
	 * @return String con la media de los nums del array
	 */
	public static int calcularMedia(String[]array) {
		int[]numeros = new int[array.length];
		int suma = 0;
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = Integer.parseInt(array[i]);
		}
		
		for(int i=0;i<numeros.length;i++) {
			suma += numeros[i];
		}
		
		return suma/numeros.length;
	}
		
	
	/**
	 * Calcula cuántos numeros finales se repiten con un array de tipo entero.
	 * @param array (String)
	 * @return String con los números finales de los elementos del array que le introducimos.
	 */
	public static String contarNumsFinales(String[]array) {
	int[]contadores = new int[10];
		
		for(int i=0;i<array.length;i++) {
			int num = 0;
			if(array[i].length() == 1) {
				num =Integer.parseInt(array[i]);
			}else {
				num = Integer.parseInt(array[i].substring(-1));
			}
			contadores[num]++;
		}
		
		String textoFinal = "";
		for(int i=0;i<contadores.length;i++) {
			textoFinal += "El número " + i + " aparece " + contadores[i] + " veces\n"; 
		}
		
		return textoFinal;
	}
	
	
	/**
	 * Calcula los números finales que aparecen y los compara para poder conseguir el mayor. 
	 * Si se repiten, se almacenan en el String junto con el anterior con el mismo num de repeticiones.
	 * @param array
	 * @return String con el/los números finales que más hayan aparecido.
	 */
	public static String numeroFinalMasRepetido(String[]array) {
		
		int[]contadores = new int[10];
		
		for(int i=0;i<array.length;i++) {
			int num = 0;
			if(array[i].length() == 1) {
				num =Integer.parseInt(array[i]);
			}else {
				num = Integer.parseInt(array[i].substring(-1));
			}
			contadores[num]++;
		}
		
		int mayor = contadores[0];
		String numeros = "";
		
		for(int i=1;i<contadores.length;i++) {
			if(contadores[i]>mayor) {
				mayor = contadores[i];
				numeros = String.valueOf(i);
			}
			//Esto se realiza para imprimir números que aparezcan la misma cantidad de veces.
			else if(contadores[i]==mayor) {
				numeros = numeros + ", " +  String.valueOf(i);
			}
		}
		return numeros;
	}
	
	
	/**
	 * Calcula los números que no aparecen en el array, que serán la posición del array de tipo
	 * entero creado que tengan valor 0.
	 * @param array de tipo String.
	 * @return String con los números que no aparecen en el array pasado por parámetro.
	 */
	public static String numerosQueNoAparecen(String[]array) {
		int[]contadores = new int[10];
		
		for(int i=0;i<array.length;i++) { 
			int num = 0;
			
			if(array[i].length() == 1) {
				num =Integer.parseInt(array[i]);
				
			}else{
				num = Integer.parseInt(array[i].substring(-1));
			}
			contadores[num]++;
		}
		
		String textoFinal = "";
		for(int i=0;i<contadores.length;i++) {
			
			if(contadores[i] == 0) {
				textoFinal += "No aparece el: " + i;
			}
		}
		return textoFinal;
	}
			
			
}
	
	
	


