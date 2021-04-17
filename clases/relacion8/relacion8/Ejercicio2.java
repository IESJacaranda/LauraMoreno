package relacion8;



public class Ejercicio2 {

	public final static int MAX_ITERACIONES = 10;
	
	public static void main(String[] args) {
		
		int[]array = new int[MAX_ITERACIONES];
		
		desplazarFila1(array);
		
	}

	
	public static void desplazarFila1(int[]array) {
		int ultimaPosicion = array[array.length-1];
		
		for(int i=8;i>=0;i--) {
			array[i+1] = array[i];
		}
		
		array[0] = ultimaPosicion;
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	
	
}







