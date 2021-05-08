package simuGeneradores2.body;

import java.time.LocalDate;

import interaz.Monetizable;

public abstract class AbsGenerador implements Monetizable, Comparable<AbsGenerador>{
	
	private static int contador = 0;
	String localidad;
	LocalDate fechaInicio;
	double potencia;
	int codigo;
	
	public AbsGenerador(String localidad, LocalDate fechaInicio, double potencia) {
		super();
		this.localidad = localidad;
		this.fechaInicio = fechaInicio;
		this.potencia = potencia;
		this.codigo = contador;
		contador++;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaInicio == null) ? 0 : fechaInicio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AbsGenerador))
			return false;
		AbsGenerador other = (AbsGenerador) obj;
		if (fechaInicio == null) {
			if (other.fechaInicio != null)
				return false;
		} else if (!fechaInicio.equals(other.fechaInicio))
			return false;
		return true;
	}

	@Override
	public int compareTo(AbsGenerador o) {
		return this.fechaInicio.compareTo(o.fechaInicio);
	}
	
	@Override
	public String toString() {
		return "localidad=" + localidad + ", fechaInicio=" + fechaInicio + ", potencia=" + potencia
				+ ", codigo=" + codigo ;
	}

	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getLocalidad() {
		return localidad;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	
	

}
