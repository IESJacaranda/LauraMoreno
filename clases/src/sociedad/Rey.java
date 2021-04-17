package sociedad;

import java.util.Objects;

import exceprtionPracticando.siSaludaException;

public class Rey extends Persona {

	private String privilegios;
	
	public Rey() {
		super();
	}

	public Rey(String nombre, int edad, String derechosBasicos, String aspiraciones, String privilegios) {
		super(nombre, edad, derechosBasicos, aspiraciones);
		this.privilegios=privilegios;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(privilegios,getEdad());
		//return this.privilegios.hashCode() + String.valueOf(this.edad).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		if (this == obj) {
			sonIguales = true;}
		else if(obj != null && obj instanceof Rey && ((Rey)obj).hashCode()==this.hashCode()) {
			sonIguales = true;}
		return sonIguales;
	}

	/**MÉTODOS**/
	@Override
	public void moverse() {
		System.out.println("En brazos de sus siervos");
	}

	@Override
	public void aprender() {
		System.out.println("En internados privados");
	}

	
	public void saludarConLaManita() throws Exception {
		if(this.getEdad()<6) {
			throw new aunNoSaludaException();}
		else {throw new siSaludaException();}
	}
	
	public boolean loli() {
		if(this.getNombre()=="Loli") {
			return false;
		}
		
		else {
			return true;
		}
	}
	
	/**SETTERS Y GETTERS**/
	public String getPrivilegios() {
		return privilegios;
	}

	public void setPrivilegios(String privilegios) {
		this.privilegios = privilegios;
	}

	@Override
	public String toString() {
		return "Rey [privilegios=" + privilegios + "]" + getDerechosBasicos();
	}

	
	
}
