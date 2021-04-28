package simulacro;

public abstract class AbstractEmpleado implements Comparable<AbstractEmpleado>{
	
	private String dni;
	private String nombre;
	protected double sueldo;//HAY QUE PONERLO COMO PROTECTED PARA QUE LUEGO LO PUEDA COGER
	
	public AbstractEmpleado(String dni, String nombre) {
		super();//ES NECESARIO EN EL PADRE
		this.dni = dni;
		this.nombre = nombre;
	}

	//LO USARÉ PARA DEVOLVER LAS LISTAS ORDENADAS
	@Override
	public int compareTo(AbstractEmpleado otro) {
		return this.nombre.compareTo(otro.nombre);
	}
	
	public int compareToSueldo(AbstractEmpleado otro) {
		int resul;
		if ( sueldo == otro.getSueldo()){
			resul=0;
		}else{
			if ( sueldo > otro.getSueldo()){
				resul=1;
			}else{
				resul=-1;
			}
		}
	return resul;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sueldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof AbstractEmpleado))
			return false;
		AbstractEmpleado other = (AbstractEmpleado) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(other.sueldo))
			return false;
		return true;
	}

	
	
}
