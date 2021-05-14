package instituto;

public class PersonalDireccion extends Profesor {

	private String ubicacion;
	private String competencias; 
	
	public PersonalDireccion() {
		super();
	}

	public PersonalDireccion(String nombre, int edad, String genero, String horario,
			String contrasena, String departamento, String curso, String modulo, String ubicacion, String competencias) {
		super(nombre, edad, genero, horario, contrasena, departamento, curso, modulo);
		this.ubicacion = ubicacion;
		this.competencias = competencias;
	}
	
	
	public boolean comprobarCompetencias() throws CompenciasNoValidas {
		boolean valido = false;
		
		if(this.competencias.equalsIgnoreCase("secretaria") || this.competencias.equalsIgnoreCase("jefatura de estudios") || 
				this.competencias.equalsIgnoreCase("direccion")) {
			valido = true;
		}else {
			throw new CompenciasNoValidas();
		}
		
		return valido;
	}
	
	

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	@Override
	public String toString() {
		return "PersonalDireccion [ubicacion=" + ubicacion + ", competencias=" + competencias + "]";
	}

	
	
}
