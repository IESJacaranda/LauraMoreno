package simulacro;

import exception.SueldoDepartamentoException;

public class JefeDepartamento extends AbstractEmpleado implements IActualizableSueldo{
	
	private int antiguedad;
	private double sueldo;
	
	//HE INTRODUCIDO EL SUELDO POR CONSTRUCTOR PORQUE SI NO NO SE PODÍA OBTENER POR NINGÚN OTRO LADO
	//CON ESTO YA PUEDO INTRODUCIR EL CUERPO DEL MÉTODO DE LA INTERFAZ 
	public JefeDepartamento(String dni, String nombre, int antiguedad, double sueldo) throws SueldoDepartamentoException {
		super(dni, nombre);
		this.antiguedad = antiguedad;
		if(this.sueldo < 1300) {
			throw new SueldoDepartamentoException();
		}else {
		this.sueldo = sueldo;
		}
	}

	@Override
	public double actualizarSueldo() {
		return this.sueldo + (sueldo*INCREMENTO_JEFE);
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	//NO HE AÑADIDO SET PORQUE NO SE PUEDE MODIFICAR
	public double getSueldo() {
		return sueldo;
	}

	@Override
	public String getDni() {
		// TODO Auto-generated method stub
		return super.getDni();
	}

	@Override
	public void setDni(String dni) {
		// TODO Auto-generated method stub
		super.setDni(dni);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	
}
