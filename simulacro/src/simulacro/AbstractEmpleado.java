package simulacro;

public abstract class AbstractEmpleado implements Comparable<AbstractEmpleado>{
	
	private String dni;
	private String nombre;
	
	public AbstractEmpleado(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	//LO USARÉ PARA DEVOLVER LAS LISTAS ORDENADAS
	@Override
	public int compareTo(AbstractEmpleado otro) {
		return this.nombre.compareTo(otro.nombre);
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

	
}
