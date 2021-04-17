package enumeracionesPractica;

public enum Color {

	VERDE(4),
	ROJO(5),
	AZUL(1),
	MORADO(2),
	AMARILLO(3),
	NARANJA(6);
	
	private int preferencia; //mi preferencia
	
	Color(int p){
		preferencia = p;
	}
	
	public int getPreferencia() {
		return preferencia;
	}
}
