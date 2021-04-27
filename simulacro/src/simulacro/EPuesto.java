package simulacro;

public enum EPuesto {
	
	ADMINISTRATIVO(1150),
	OPERARIO(1100),
	CONTABLE(1350);
	
	private int sueldoInicial;
	
	EPuesto(int sueldoInicial){
		this.sueldoInicial = sueldoInicial;
	}

	public int getSueldoInicial() {
		return sueldoInicial;
	}

}
