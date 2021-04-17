package vocales;

import java.util.Scanner;

public class Prueba {
	
	private static Scanner teclado = new Scanner(System.in);
		
		public static void main(String[] args) {
			String texto, textoVocalesEnMayusculas;
			
			System.out.println("Introduce un texto: ");
			
			texto = teclado.nextLine();
			
			textoVocalesEnMayusculas = soloVocalesMayusculas(texto);
			
			System.out.println("La cadena con solo las vocales y en mayúsculas es " + textoVocalesEnMayusculas);
		}
		
		private static String soloVocalesMayusculas(String cadena){
			StringBuilder builder = new StringBuilder();
			
			String vocales = "AEIOU";
			
			char caracter;
			int indice;
			
			//cadena.toUpperCase(); Se ha eliminado ya que en el for ya se pasa a mayúsculas cada caracter. No se estaba almacenando en un nuevo String.
			
			for (indice=0; indice<cadena.length(); indice++){
				caracter = cadena.charAt(indice);
				//Se ha cambiado lo siguiente:
				if (vocales.contains(String.valueOf(caracter).toUpperCase())){
						builder.append(caracter);
				}
			}
			return builder.toString().toUpperCase();//Se pasa a mayus tambén.
		}
		


}


