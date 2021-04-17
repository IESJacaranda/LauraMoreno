package pooAvanzado.ejercicio2;

public class Barco {

	protected double eslora;
	protected int anyo;
	protected String matricula;

	public Barco(double eslora, int anyo, String matricula) {
		this.eslora = eslora;
		this.anyo = anyo;
		this.matricula = matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
