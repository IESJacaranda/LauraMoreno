package primerProyecto;

import java.util.Scanner; 

public class primeraClase {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int x = 23, y = 7;
		// TODO Auto-generated method stub
		char c;
		String nombre;
		int num;
		double resul = (double)x/y; //Por defecto la división es entera. Si no la queremos así, habrá que poner (double).
		System.out.println(resul);
		
		x='a'; //Es el código de esa letra. La ACI. 
		
		
		System.out.println("Hola mundo");
		System.out.println("Introduce un caracter: ");
		c = teclado.nextLine().charAt(0);
		System.out.println("Hola mundo. El valor de x es "+x);
		System.out.println("Introduce un nombre: ");
		nombre = teclado.nextLine();
		System.out.println("El nombre es "+nombre);
		System.out.println("Introduduce el número");
		//num = Integer.parseIn(teclado.nextLine());
		
		
//		char cBuscado, cReemplazar;
//		String cadena;		
//		
//		System.out.println("Introduzca su nombre: ");
//		cadena = teclado.nextLine();
//		
//		System.out.println("Introduzca el caracter a reemplazar: ");
//		cBuscado = teclado.nextLine().charAt(0);
//		
//		System.out.println("Introduzca el caracter que reemplaza: ");
//		cReemplazar = teclado.nextLine().charAt(0);
//		
//		
//		cadena = cadena.replace(cBuscado,cReemplazar);
//		if (Character.isUpperCase(cBuscado)) {
//			cadena = cadena.replace(Character.toLowerCase(cBuscado), cReemplazar);//Es necesario poner otra variable porque String es inmutable.
//		}else {
//			cadena = cadena.replace(Character.toUpperCase(cBuscado),cReemplazar);//Tiene que ser 1 a 1. Para ver si está en mayus o minus.
//		}
//		
//		System.out.println(cadena);

//		
//		String cadena = "Hi";
//		String cadena1 = "Holi";
//		
//		System.out.println(cadena.equals(cadena1));//Esto sí compara el contenido.
//		System.out.println(cadena==cadena1);//Con los strings, ==, compara que sean el mismo objeto, pero no compara su contenido.
		
		
	}
	

}
