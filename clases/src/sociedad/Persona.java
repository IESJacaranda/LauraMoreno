package sociedad;

public class Persona {
	
	private String nombre;
	private int edad;
	private String derechosBasicos;
	private String aspiraciones;
	
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, int edad, String derechosBasicos, String aspiraciones) {
		this.nombre = nombre;
		this.edad = edad;
		this.derechosBasicos = derechosBasicos;
		this.aspiraciones = aspiraciones;
	}

	
	/**MÉTODOS**/
	public void moverse() {
		System.out.println("andando");
	}
	
	public void aprender() {
		System.out.println("viviendo");
	}
		
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", derechosBasicos=" + derechosBasicos
				+ ", aspiraciones=" + aspiraciones + "]";
	}

	/**SETTERS Y GETTERS**/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDerechosBasicos() {
		return derechosBasicos;
	}

	public void setDerechosBasicos(String derechosBasicos) {
		this.derechosBasicos = derechosBasicos;
	}

	public String getAspiraciones() {
		return aspiraciones;
	}

	public void setAspiraciones(String aspiraciones) {
		this.aspiraciones = aspiraciones;
	}

	
	



	
	
	

}
