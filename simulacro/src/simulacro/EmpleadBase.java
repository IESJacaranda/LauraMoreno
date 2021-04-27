package simulacro;

public class EmpleadBase extends AbstractEmpleado implements IActualizableSueldo{
	
	private double sueldoBase;

	public EmpleadBase(String dni, String nombre, String tipo) {
		super(dni, nombre);
		tipo.toUpperCase();
		if(tipo == "ADMINISTRATIVO") {
			this.sueldoBase = EPuesto.ADMINISTRATIVO.getSueldoInicial();
		}else if(tipo == "OPERARIO") {
			this.sueldoBase = EPuesto.OPERARIO.getSueldoInicial();
		}else if(tipo == "CONTABLE") {
			this.sueldoBase = EPuesto.CONTABLE.getSueldoInicial();
		}
	}
	
	@Override
	public double actualizarSueldo() {
		return sueldoBase + (sueldoBase*INCREMENTO_EMPLEADO_BASE);
	}
	
	//NO HE AÑADIDO SET DEL SUELDO PORQUE NO PUEDE MODIFICARSE
	public double getSueldoBase() {
		return sueldoBase;
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
