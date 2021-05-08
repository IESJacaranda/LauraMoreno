package body;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import enumerado.EPrioridad;

public abstract class AbsTarea implements Comparable<AbsTarea>, ITemporizable{
	
	private static int contador = 1; 
	protected static boolean resuelta;
	protected String descrip;
	protected LocalDate fechaAlta;
	protected LocalDate fechaFin;
	protected int codigo;
	protected EPrioridad prioridad;
	
	public AbsTarea(String descrip, String prioridad) throws Exception {
		super();
		this.descrip = descrip;
		this.fechaAlta = LocalDate.now();
		this.codigo = contador;
		contador++;
		EPrioridad prio = null;
		try {
			prio = EPrioridad.valueOf(prioridad);
		}catch(Exception e) {
			throw new Exception("La prioridad no se corresponde con ninguna (ALTA,MEDIA BAJA)");
		}
		this.prioridad = prio;
	}

	
	//He creado con estos datos es hashcode y el equals porque solo te dice que sean iguales si la descripcion y la fecha son iguales
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrip == null) ? 0 : descrip.hashCode());
		result = prime * result + ((fechaAlta == null) ? 0 : fechaAlta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AbsTarea))
			return false;
		AbsTarea other = (AbsTarea) obj;
		if (descrip == null) {
			if (other.descrip != null)
				return false;
		} else if (!descrip.equals(other.descrip))
			return false;
		if (fechaAlta == null) {
			if (other.fechaAlta != null)
				return false;
		} else if (!fechaAlta.equals(other.fechaAlta))
			return false;
		return true;
	}

	@Override
	public int compareTo(AbsTarea o) {
		return this.fechaAlta.compareTo(o.fechaAlta);
	}
	
	@Override
	public long numDias(LocalDate fecha) {
		long aux = ChronoUnit.DAYS.between(fechaAlta, fecha);
		if(aux<0) {
			aux = 0;//Entienndo que 0 es positivo y si es menor que 0 será 0
		}
		return aux;
	}
	
	@Override//tareas pendientes de realizar
	public String toString() {
		return "Tarea: " + descrip + ", fechaAlta=" + fechaAlta + ", codigo=" + codigo + ", prioridad="
				+ prioridad;
	}


	public String getDescrip() {
		return descrip;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public static int getContador() {
		return contador;
	}

	public static boolean isResuelta() {
		return resuelta;
	}

	public EPrioridad getPrioridad() {
		return prioridad;
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public int getCodigo() {
		return codigo;
	}
	

}
