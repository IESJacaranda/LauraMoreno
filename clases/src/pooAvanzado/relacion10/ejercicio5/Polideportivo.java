package pooAvanzado.relacion10.ejercicio5;

public class Polideportivo implements IEdificio, IInstalacionDeportiva {

	private String tipoDeInstalacion;
	private double superficieEdificio;
	
	public Polideportivo(String tipoDeInstalacion, double superficieEdificio) {
		this.tipoDeInstalacion = tipoDeInstalacion;
		this.superficieEdificio = superficieEdificio;
	}
	
	@Override
	public String getTipoDeInstalacion() {
		return null;
	}

	@Override
	public double getSuperficieEdificio() {
		return 0;
	}

}
