package simulacro;

import exception.SueldoDepartamentoException;

public class JefeDepartamento extends AbstractEmpleado implements IActualizableSueldo{
	
	private int antiguedad;
	
	//HE INTRODUCIDO EL SUELDO POR CONSTRUCTOR PORQUE SI NO NO SE PODÍA OBTENER POR NINGÚN OTRO LADO
	//CON ESTO YA PUEDO INTRODUCIR EL CUERPO DEL MÉTODO DE LA INTERFAZ 
	public JefeDepartamento(String dni, String nombre, int antiguedad, double sueldo) throws SueldoDepartamentoException {
		super(dni, nombre);
		this.antiguedad = antiguedad;
		if(getSueldo() < 1300) {
			throw new SueldoDepartamentoException();
		}else {
			setSueldo(sueldo);
		}
	}

	@Override
	public double actualizarSueldo() {
		return getSueldo() + (getSueldo()*INCREMENTO_JEFE);
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String getDni() {
		return super.getDni();
	}

	@Override
	public void setDni(String dni) {
		super.setDni(dni);
	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	
}
