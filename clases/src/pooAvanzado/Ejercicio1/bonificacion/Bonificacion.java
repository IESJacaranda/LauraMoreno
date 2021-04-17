package pooAvanzado.Ejercicio1.bonificacion;

public enum Bonificacion {
	
	CUENTA_JOVEN(0.25), CUENTA_NORMAL(0);
	
	private double porcentaje;
	
	Bonificacion(double porcentaje){
		this.porcentaje = porcentaje;
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}
}
