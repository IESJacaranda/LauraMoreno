package productos;

public class Producto {

	private String categoria;
	private String codigo;
	
	
	//*****************************************CONSTRUCTORES***************************************************************
	public Producto() {}
	
	public Producto(String categoria, String codigo) {
		this.categoria = categoria;
		this.codigo = codigo;
	}
	
		
	//******************************************SETTERS Y GETTERS***********************************************************
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	//*********************************************MÉTODOS******************************************************************
	//CÓDIGO:
	/**
	 * Comprueba que la longitud del código es adecuada
	 * @param codigo
	 * @return boolean
	 */
	public boolean checkLongCodigo(String codigo){
		boolean result;
		
		if(codigo.length() < 5 || codigo.length() > 12) {
			result = false;
		}else {
			result=true;
		}
		return result;
	}
	
	
	/**
	 * Comprobar número de vocales en código (mín 3)
	 * @param codigo
	 * @return boolean
	 */
	public boolean checkDatosCodigo(String codigo) {
		boolean result = false;
		int numVocales = 0;
		
		for (int i=0;i<codigo.length();i++) {
			if(Character.isLetter(codigo.charAt(i))){
				numVocales++;
			}
		}
		if(numVocales >=3) {
			result = true;
		}
		return result;
	}
	
	
	
	//CATEGORÍA:
	/**
	 * Comprueba que la categoría comience por C.
	 * @param categoria
	 * @return booelan
	 */
	public boolean checkCCategoria(String categoria) {
		boolean result = false;
		
		if((categoria.substring(0, 1) == "C")) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
	
	
	/**
	 * Comprueba que la cadena de caracteres que sigue son vocales
	 * @param categoria
	 * @return boolean
	 */
	public boolean checkVocales(String categoria) {
		boolean result = false;
		int cont= 0;
		
		String categoriaAcortada = new String();
		categoriaAcortada = categoria.substring(1, categoria.length());
		
		for(int i=0;categoriaAcortada.length()<i;i++) {
			if(esVocal(categoriaAcortada.charAt(i))) {
				cont++;
			}
		}
		if(cont == categoriaAcortada.length()) {
			result = true;
		}
		return result;
	}
	
	
	
	/**
	 * Comprueba que un caracter sea vocal
	 * @param letra
	 * @return boolean
	 */
	public boolean esVocal(char letra) {
	    return "aeiou".contains(String.valueOf(letra).toLowerCase());
	}
	
	
	
	/**
	 * Comprueba que la longitud de la categoria sea correcta (2 a 5)
	 * @param categoria
	 * @return boolean
	 */
	public boolean checkLongCategoria(String categoria) {
		boolean result = true;
		
		if(categoria.length() < 2 && categoria.length() > 5) {
			result = false;
		}
		
		return result;
	}
	

	/**
	 *Realiza todas las comprobaciones juntas
	 * @param codigo
	 * @return boolean
	 */
	public boolean checkCodigoCorrecto(String codigo) {
		boolean result = false;
		
		if(checkLongCodigo(codigo) && checkDatosCodigo(codigo)) {
			result = true;
		}
		return result;
	}
	
	
	/**
	 * Realiza todas las comprobaciones juntas pero de categoria
	 * @param categoria
	 * @return boolean
	 */
	public boolean checkCategoriaCorrecta(String categoria) {
		boolean result = false;
		
		if(checkVocales(categoria) && checkCCategoria(categoria) && checkLongCategoria(categoria)) {
			result = true;
		}
		return result;
	}
	
}