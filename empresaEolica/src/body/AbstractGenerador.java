package body;

import java.time.LocalDate;

import interfaz.IMonetizable;

public abstract class AbstractGenerador implements IMonetizable, Comparable<AbstractGenerador>{
	
	protected int codigo;
	protected LocalDate fecha;
	protected String localidad;
	protected int potencia;
	private static int CONTADOR = 0;
	
	AbstractGenerador(LocalDate fecha, String localidad, int potencia){
		super();
		this.fecha = fecha;
		this.localidad = localidad;
		this.potencia = potencia;
		this.codigo = CONTADOR;
		CONTADOR++;
	}

	@Override
	public String toString() {
		return "Código: " + codigo + ", fecha: " + fecha + ", localidad: " + localidad + ", potencia: "
				+ potencia;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + potencia;
		return result;
	}
	
//	@Override
//	public int compareTo(AbstractGenerador otro) {
//		int result = 0;
//		
//		if(fecha.isAfter(otro.fecha)) {
//			result = 1;
//		}else if (fecha.isBefore(otro.fecha)) {
//			result = -1;
//		}
//		return result;
//	}
	
	@Override
	public int compareTo(AbstractGenerador o) {
		
		return this.fecha.compareTo(o.fecha);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AbstractGenerador))
			return false;
		AbstractGenerador other = (AbstractGenerador) obj;
		if (codigo != other.codigo)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (potencia != other.potencia)
			return false;
		return true;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getLocalidad() {
		return localidad;
	}
	
	
	
	
	
}
