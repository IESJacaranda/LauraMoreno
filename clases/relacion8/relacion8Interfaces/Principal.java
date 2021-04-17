package relacion8Interfaces;

public class Principal {

	public static void main(String[] args) {
		
		IEdificio miPisillo = new Casa(30,10,3);
		System.out.println(((Casa)miPisillo).getPrecioEdificio());
		
		
	}

}
