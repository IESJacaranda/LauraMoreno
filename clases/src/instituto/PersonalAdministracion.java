package instituto;
//ENTIENDO QUE EL PERSONAL DE ADMINISTRACIÓN NO ES PROFESOR, SOLO EMPLEADO DEL CENTRO. 
public class PersonalAdministracion extends Empleado {

	private String ubicacion;
	private int telefono;
	private String areaResponsabilidad;
	
	public PersonalAdministracion() {
		super();
}

	public PersonalAdministracion(String nombre, int edad, String genero, String horario, int codigoIdentificacion,
			String contrasena, String ubicacion, int telefono, String areaResponsabilidad) {
		super(nombre, edad, genero, horario, contrasena);
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.areaResponsabilidad = areaResponsabilidad;
	}
	
	public boolean comprobarAreaResponsabilidad() throws AreaDeResponsabilidadNoValida {
		boolean valido = false;
		
		if(this.areaResponsabilidad.equalsIgnoreCase("gestion del alumnado") 
				|| this.areaResponsabilidad.equalsIgnoreCase("gestion del profesorado")) {
			valido = true;
		}else {
			throw new AreaDeResponsabilidadNoValida() ;
		}
		
		return valido;
	}
	
	

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getAreaResponsabilidad() {
		return areaResponsabilidad;
	}

	public void setAreaResponsabilidad(String areaResponsabilidad) {
		this.areaResponsabilidad = areaResponsabilidad;
	}

	
	@Override
	public String toString() {
		return "PersonalAdministracion [ubicacion=" + ubicacion + ", telefono=" + telefono + ", areaResponsabilidad="
				+ areaResponsabilidad + "]";
	}

}
