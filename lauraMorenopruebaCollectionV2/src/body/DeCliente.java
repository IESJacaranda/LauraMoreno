package body;


public class DeCliente extends AbsTarea {

	protected String nombre;
	protected String ciudad;
	
	public DeCliente(String descrip, String prioridad, String nombre, String ciudad) throws Exception {
		super(descrip, prioridad);
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", ciudad="+ciudad+", nombre cliente="+nombre  ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
}
