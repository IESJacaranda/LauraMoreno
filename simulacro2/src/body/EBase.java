package body;

import enumerado.ETipo;

public class EBase extends AbstractEmpleado {

	protected ETipo ti;
	private double INCREMENTO_EB = 1.025;
	
	public EBase(String nombre, String dni, String tipo) throws Exception {
		super(nombre, dni);
		this.ti = null;
		try {
			ti = ETipo.valueOf(tipo);
		}catch (Exception e){
			throw new Exception("El tipo no se corresponde con ningún tipo de empleado base (ADMINISTRATIVO, OPERARIO o CONTABLE)");
		}
		super.sueldo = ti.getSueldoBase();
	}

	@Override
	public void actualizaSueldo() {
		sueldo = sueldo*INCREMENTO_EB;
	}

	@Override
	public String toString() {
		return super.toString() + ", puesto: " + ti;
	}

}
