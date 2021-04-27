package simulacro;

public abstract class AbstractEmpleado implements Comparable<AbstractEmpleado>{
	
	private String dni;
	private String nombre;
	private double sueldo;
	
	public AbstractEmpleado(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		this.sueldo = sueldo;
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

	
}
