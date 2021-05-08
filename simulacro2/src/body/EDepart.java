package body;

public class EDepart extends AbstractEmpleado {

	protected int antiguedad;
	private double INCREMENTO_ED = 1.10;
	
	public EDepart(String nombre, String dni, int antiguedad, double sueldo) throws Exception {
		super(nombre, dni);
		this.antiguedad = antiguedad;
		if(sueldo < 1300) {
			throw new Exception("El sueldo de un jefe de departamento no puede ser menor de 1300");
		}else {
			super.sueldo = sueldo;
		}
	}

	@Override
	public void actualizaSueldo() {
		sueldo = (sueldo*INCREMENTO_ED)*antiguedad;
	}

	@Override
	public String toString() {
		return super.toString() + ", antigüedad: " + antiguedad;
	}

}
