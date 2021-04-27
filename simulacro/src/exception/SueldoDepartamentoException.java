package exception;

public class SueldoDepartamentoException extends Exception {
	public SueldoDepartamentoException() {
		super("El sueldo de un jefe de departamento no debe ser menor de 1300");
	}

}
