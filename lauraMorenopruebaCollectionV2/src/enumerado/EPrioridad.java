package enumerado;

public enum EPrioridad {
	//Como he usado localDate lo he pasado a dias en vez de dejarlo en horas
	ALTA(1),
	MEDIA(3),
	BAJA(7);
	
	protected int dias;

	private EPrioridad(int dias) {
		this.dias = dias;
	}
	
	public int getDias() {
		return dias;
	}

	
}
