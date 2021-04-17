package abstracto;

public abstract class AbstractFiguraEspacio {
	
	public final static Double DENSIDAD_AGUA = 1.0;
	protected Double peso;
	
	public abstract Double calcularVolumen();
	
	private Double getPeso() {
		return peso;
	}
	
	public Double obtenerDensidad() {
		return calcularVolumen()>0	?	getPeso()/calcularVolumen() : Double.NaN;
	}
	
	public boolean flotaEnAgua() {
		return obtenerDensidad()<DENSIDAD_AGUA;
	}
	
}
