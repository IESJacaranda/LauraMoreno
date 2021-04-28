package simulacro;

import exception.SueldoDepartamentoException;

public class JefeDepartamento extends AbstractEmpleado implements IActualizableSueldo{
	
	private int antiguedad;
	private final double INCREMENTOSUELDOJEFE = 1.10;
	
	//HE INTRODUCIDO EL SUELDO POR CONSTRUCTOR PORQUE SI NO NO SE PODÍA OBTENER POR NINGÚN OTRO LADO
	//CON ESTO YA PUEDO INTRODUCIR EL CUERPO DEL MÉTODO DE LA INTERFAZ 
	public JefeDepartamento(String dni, String nombre, int antiguedad, double sueldo) throws SueldoDepartamentoException {
		super(dni, nombre);
		this.antiguedad = antiguedad;
		if(sueldo < 1300) {
			throw new SueldoDepartamentoException();
		}else {
			super.sueldo = sueldo;
		}
	}

	@Override
	public void actualizarSueldo() {
		sueldo += antiguedad*(sueldo*INCREMENTOSUELDOJEFE);
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
