package abstracto;

public class Principal {

	public static void main(String[] args) {
		Cubo cubo = new Cubo(6, 9);
		System.out.println(cubo.obtenerDensidad());
		System.out.println(cubo.flotaEnAgua());
	}

}
