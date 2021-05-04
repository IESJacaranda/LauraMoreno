package SimulacroExamen.src.model;

public enum EPuesto {
	
	ADMINISTRATIVO(1150),
	OPERARIO(1100),
	CONTABLE(1350);
	
	public double sueldoIni;
	
	EPuesto(double sueldo) {
		this.sueldoIni=sueldo;
	}

	public double getSueldoIni() {
		return sueldoIni;
	}

}
