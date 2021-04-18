package pooAvanzado.relacion10.Ejercicio2;

public abstract class AbstractVehiculo {
	protected String matricula;
	protected double precio;
	
	public AbstractVehiculo(String matricula, double precio) {
		this.matricula = matricula;
		this.precio = precio;
	}

	public abstract double calcularPrecio(int dias, double complemento) throws Exception;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
