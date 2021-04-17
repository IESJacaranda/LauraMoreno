package primeraPruebaLauraMorenoDescompresor;

public class Descompresor {

	public static void main(String[] args) {
		System.out.println(comprimir("aaazzqq"));

	}

	public static String comprimir(String cadenaAComprimir) {
		String mensajeComprimido = "";
		int k = 1;
		int cont = 1;
		
		for(int i=0;i<cadenaAComprimir.length();i++) {
			
			if(mensajeComprimido.indexOf(cadenaAComprimir.charAt(i))<0) {
				mensajeComprimido += cadenaAComprimir.charAt(i);
			}
			
			if(cadenaAComprimir.charAt(i)==cadenaAComprimir.charAt(k)) {
				cont++;
			}else {
				mensajeComprimido += cont;
				cont = 1;
			}
		}
		
		return mensajeComprimido;
	}
	
	
	
	public static void descomprimir(String cadenaComprimir) {
		
		String mensajeDescomprimido = "";
		
		for (int i=0;i<cadenaComprimir.length();i++){
			
		}
		
		
		
		
		
		
	}
}
