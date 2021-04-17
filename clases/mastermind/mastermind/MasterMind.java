package mastermind;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MasterMind {

	static final int CIFRASECRETA = ThreadLocalRandom.current().nextInt(1000, 10000);
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int j = 7;
		String result = "";
		
		for(int i=0;i<7;i++) {
			System.out.println("Le quedan "+ j + " intentos.");
			j--;
			System.out.println("Inserte el número de 4 dígicos: ");
			
			result = masterMind(Integer.parseInt(teclado.nextLine()));
			if(result == "OK") {
				System.out.println("ENHORABUENA, HAS ADIVINADO LA COMBINACIÓN.");
				i=7;
			}else if (i==6) {
				System.out.println("LOOOOOOOOOOOOOOSER");
			}else {
				System.out.println(result);
			}
		}
			
	}
	
	
	
	/**
	 * Utiliza una cifra de 4 dígitos generada aleatoriamente.
	 * @return El número de aciertos (posiciones y cifras)
	 */
	public static String masterMind(int cifraIntroducida) {
	int cifraSecreta = CIFRASECRETA;
	
	int numCoincidencias = 0;
	int numPosicionesIguales = 0; 
	 
	
	String cifraSecretaString = String.valueOf(cifraSecreta); 
	String cifraIntroducidaString = String.valueOf(cifraIntroducida);
	
	
	
	for(int i=0;i<cifraSecretaString.length();i++) {
		if(cifraIntroducidaString.charAt(i)==cifraSecretaString.charAt(i)) {
				numPosicionesIguales += 1;
			}
		
	}
		
		StringBuilder sb = new StringBuilder(cifraSecretaString);
		for(int i=0;i<cifraSecretaString.length();i++) { 
			if(sb.toString().indexOf(cifraIntroducidaString.charAt(i))>=0){
				numCoincidencias += 1;
				int posicion = sb.toString().indexOf(cifraIntroducidaString.charAt(i));
				
				sb = sb.deleteCharAt(posicion);
			}
			
		}
		
		String result = "Número de coincidencias: "+numCoincidencias + "\nNúmero de posiciones acertadas: "+numPosicionesIguales;
		
		if(sb.length() == 0 && numPosicionesIguales == 4) {
			result = "OK";
		}
		
	return result;
	}
	
		
	
}
	
	
		
		
	


