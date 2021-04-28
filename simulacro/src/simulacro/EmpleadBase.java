package simulacro;

public class EmpleadBase extends AbstractEmpleado implements IActualizableSueldo{
	
	private EPuesto tipo;
	private final double ACTUALIZACIONSUELDO = 1.025;
	
	public EmpleadBase(String dni, String nombre, EPuesto tipo, double sueldo) {
		super(dni, nombre);
		this.tipo = tipo;
		super.sueldo = tipo.getSueldoInicial();
	}
	
	public EmpleadBase(String dni, String nombre, EPuesto tipo) {
		super(dni, nombre);
		this.tipo = tipo;
		super.sueldo = tipo.getSueldoInicial();
	}
	
	@Override
	public void actualizarSueldo() {
		sueldo += (sueldo*ACTUALIZACIONSUELDO);
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

	public EPuesto getTipo() {
		return tipo;
	}

	public void setTipo(EPuesto tipo) {
		this.tipo = tipo;
	}

	
}
