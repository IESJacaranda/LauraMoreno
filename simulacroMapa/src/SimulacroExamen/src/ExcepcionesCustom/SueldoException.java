package SimulacroExamen.src.ExcepcionesCustom;

public class SueldoException extends Exception {
	public SueldoException() {
		super("El sueldo debe ser mayor o igual a 1300");
	}

}
