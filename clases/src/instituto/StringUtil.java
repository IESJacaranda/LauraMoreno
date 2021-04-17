package instituto;
//NO ESTOY DEL TODO SEGURA PORQUE HE USADO LA CLASE CHARACTER QUE NO LA HABÍA USADO ANTES PORQUE DE OTRA FORMA ME
//DABA ERROR.
	public class StringUtil {

	    public static boolean contieneTodasLasLetras(String texto1, String texto2) {
	        boolean result;
	        
	        String minus1 = texto1.toLowerCase();
	        String minus2 = texto2.toLowerCase();
	        
	        //Si contiene la palabra entera
	        if (minus1.contains(minus2)) {
	            result = true;
	        }
	        //Si contiene todas las letras pero separadas
	        else {
	            result = contieneTodasLasLetras1(minus1, minus2);
	        }
	        return result;
	    }

	    public static boolean contieneTodasLasLetras1(String texto1, String texto2) {
	        boolean result = false;
	        int indice = 0;
	        
	        for (int i = 0 ; i < texto1.length(); i++) {
	            Character character = texto1.charAt(i);
	       
	            if (character.equals(texto2.charAt(indice)))
	                indice++;
	        }
	        	if (indice >= texto2.length()) {
	        		result = true;
	        }
	        return result;
		    }
		
	}


