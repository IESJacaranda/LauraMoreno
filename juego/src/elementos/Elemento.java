package elementos;

public class Elemento {
	
	protected char simbolo;

	public Elemento(char simbolo) {
		this.simbolo = simbolo;
	}

	public Elemento() {}
	
	
	
	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}
	
	

	@Override
	public String toString() {
		return Character.toString(this.simbolo);
	}
	
	
}
