package SimulacroExamen.src.model;

public class EmpleadoBase extends AbstractEmpleado implements Comparable<EmpleadoBase> {
	
	private EPuesto puesto;
	//Constante de incremento  1.025

	public EmpleadoBase(String dni, String nombre, EPuesto puesto) {
		super(dni, nombre);
		this.puesto=puesto;
		super.sueldo = puesto.getSueldoIni();
	}

	@Override
	public void ActualizableSueldo() {
		double incremento = (this.sueldo*2.5/100);
		this.sueldo = this.sueldo+incremento;
	}

	public EPuesto getPuesto() {
		return puesto;
	}

	
	@Override
	public String toString() {
		return super.toString()+", Sueldo: "+this.sueldo+", Puesto: "+this.puesto;
	}

	@Override
	public int compareTo(EmpleadoBase o) {
		
		return this.nombre.compareTo(o.getNombre());
	}

}
