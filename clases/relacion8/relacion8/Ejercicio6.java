package relacion8;

import java.util.Scanner;

public class Ejercicio6 {

	final static String ABC = "abcdefghijklmnñopqrstuvwxyz";
	
	public static void main(String[] args) {
		
		GUI();
	}
	
	public static void contarLetrasEnFrase(String frase) {
		
		frase = frase.replaceAll(" ", "");
			
		int[]cont = new int[ABC.length()];
		
		for(int i=0;i<frase.length();i++) {
			for(int j=0;j<ABC.length();j++) {
			if(ABC.charAt(j) == Character.toLowerCase(frase.charAt(i))) {
				cont[j] ++;
				
			}}
		}
		for(int i=0;i<cont.length;i++) {
			if(cont[i] > 0) {
				System.out.println("La letra: " + ABC.charAt(i) + " aparece " + cont[i] + 
						(cont[i]>1 ? " veces" : " vez" + "\n"));
			}}}
	
	public static void GUI() {
		System.out.println("Introduzca la frase: ");
		
		Scanner teclado = new Scanner(System.in);
		
		String frase = teclado.nextLine();
		
		contarLetrasEnFrase(frase);
		teclado.close();
	}

}
