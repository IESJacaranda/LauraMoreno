package pooAvanzado.relacion10.ejercicio5;

public class EdificioOficinas implements IEdificio {

	private int numOficinas;
	private String tipoDeInstalacion;
	private double superficieEdificio;
	
	public EdificioOficinas(int numOficinas, String tipoDeInstalacion, double superficieEdificio) {
		this.numOficinas = numOficinas;
		this.tipoDeInstalacion = tipoDeInstalacion;
		this.superficieEdificio = superficieEdificio;
	}
	
	@Override
	public double getSuperficieEdificio() {
		return 0;
	}

	public int getNumOficinas() {
		return this.numOficinas;
	}

	public void setNumOficinas(int numOficinas) {
		this.numOficinas = numOficinas;
	}
}
