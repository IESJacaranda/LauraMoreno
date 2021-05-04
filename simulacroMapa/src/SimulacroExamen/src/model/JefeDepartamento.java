package SimulacroExamen.src.model;

import SimulacroExamen.src.ExcepcionesCustom.SueldoException;

public class JefeDepartamento extends AbstractEmpleado {
	private int year;
	private double sueldo;

	public JefeDepartamento(String dni, String nombre, int year, double sueldo) throws SueldoException {
		super(dni, nombre);
		if(sueldo < 1300) {
			throw new SueldoException();
		}
		this.year=year;
		super.sueldo=sueldo;
		
	}
	
	
	@Override
	public void ActualizableSueldo() {
		double incremento = (this.sueldo*10/100);
		this.sueldo = this.sueldo+incremento;

	}
	
	@Override
	public String toString() {
		return super.toString()+", Sueldo: "+this.sueldo+", Antiguedad: "+this.year;
	}


	public int getYear() {
		return year;
	}


	public double getSueldo() {
		return sueldo;
	}

}
