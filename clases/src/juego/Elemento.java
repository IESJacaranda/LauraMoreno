package juego;
//Es necesaria una comprobación para establecer que los sibolos sean solo A, R, G, P, D.
public class Elemento {

	private char simbolo;
	
	public Elemento() {
		super();
	}
	
	public Elemento(char simbolo) {
		this.simbolo = simbolo;
	}

	
	
	@Override
	public String toString() {
		return "El elemento es: " + this.simbolo;
	}

	
	
	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}
	
	
	
}
