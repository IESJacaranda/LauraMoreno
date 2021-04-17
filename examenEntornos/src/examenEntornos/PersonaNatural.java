package examenEntornos;

public class PersonaNatural extends Cliente {
	
	private String nombre;
	private String dni;
	
	public PersonaNatural(int codCliente, String direccion, long telefono, Pais pais, String nombre, String dni) {
		super(codCliente, direccion, telefono, pais);
		this.nombre = nombre;
		this.dni = dni;
	}
	
}
