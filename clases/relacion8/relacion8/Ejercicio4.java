package relacion8;

import java.util.Scanner;

public class Ejercicio4 {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Pedimos los datos necesarios para mostrar la fecha en formato largo
	 * @throws DiasInexistentesExeption
	 * @throws MesesInexistentesException
	 * @throws AnioInexistenteException
	 */
	public static int[] pideDatos() throws DiasInexistentesExeption, MesesInexistentesException, AnioInexistenteException {
		int[] fecha = new int[3];
		
		System.out.println("Introduce los días del mes: ");
		fecha[0] = Integer.parseInt(teclado.nextLine());
		if(fecha[0] >31 || fecha[0]<1) {
			throw new DiasInexistentesExeption();}
		
		System.out.println("Introduce el mes: ");
		fecha[1] = Integer.parseInt(teclado.nextLine());
		if(fecha[1] >12 || fecha[1] < 1) {
			throw new MesesInexistentesException();}
		
		System.out.println("Introduce el año: ");
		fecha[2] = Integer.parseInt(teclado.nextLine());
		if(fecha[2] < 0) {
			throw new AnioInexistenteException();}
		
		return fecha;
	}

	
	
	
	
}





