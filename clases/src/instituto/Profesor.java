package instituto;

public class Profesor extends Empleado {

	private String departamento;
	private String curso;
	private String modulo;
	
	public Profesor() {
		super();
	}

	public Profesor(String nombre, int edad, String genero, String horario,
			String contrasena, String departamento, String curso, String modulo) {
		super(nombre, edad, genero, horario, contrasena);
		this.departamento = departamento;
		this.curso = curso;
		this.modulo = modulo;
		
	}

	
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", curso=" + curso + ", modulo=" + modulo + "]";
	}
	
	
	

}
