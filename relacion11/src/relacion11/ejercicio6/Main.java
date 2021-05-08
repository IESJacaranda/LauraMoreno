package relacion11.ejercicio6;

public class Main {

	public static void main(String[] args) {
		Diccionario d = new Diccionario();
		
		d.addPalabra("patata", "tubérculo");
		d.addPalabra("patata", "tubérculo");
		d.addPalabra("patata", "cosa que se come");
		d.addPalabra("pera", "fruta");
		d.addPalabra("pecera", "objeto");
		d.addPalabra("dragón", "mito");
		
		try {
			System.out.println(d.buscaPalabra("patata"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		d.borraPalabra("pera");
		
		try {
			System.out.println(d.listarPorPalabraEnOrden("pe"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
