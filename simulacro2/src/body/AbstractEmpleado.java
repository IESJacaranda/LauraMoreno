package body;

public abstract class AbstractEmpleado implements ActualizableSueldo, Comparable<AbstractEmpleado>{

	protected String nombre;
	protected String dni;
	protected double sueldo;
	
	public AbstractEmpleado(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	@Override
	public int compareTo(AbstractEmpleado otro) {
		return nombre.compareTo(otro.nombre);
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ", dni: " + this.dni +", sueldo: " + sueldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AbstractEmpleado))
			return false;
		AbstractEmpleado other = (AbstractEmpleado) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	
}
