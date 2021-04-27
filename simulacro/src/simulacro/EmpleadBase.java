package simulacro;

public class EmpleadBase extends AbstractEmpleado implements IActualizableSueldo{
	

	public EmpleadBase(String dni, String nombre, String tipo) {
		super(dni, nombre);
		tipo.toUpperCase();
		if(tipo == "ADMINISTRATIVO") {
			setSueldo(EPuesto.ADMINISTRATIVO.getSueldoInicial());
		}else if(tipo == "OPERARIO") {
			setSueldo(EPuesto.OPERARIO.getSueldoInicial());
		}else if(tipo == "CONTABLE") {
			setSueldo(EPuesto.CONTABLE.getSueldoInicial());
		}
	}
	
	@Override
	public double actualizarSueldo() {
		return getSueldo() + (getSueldo()*INCREMENTO_EMPLEADO_BASE);
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
