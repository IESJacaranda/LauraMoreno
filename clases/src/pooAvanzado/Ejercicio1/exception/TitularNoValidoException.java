package pooAvanzado.Ejercicio1.exception;

public class TitularNoValidoException extends Exception {
	
	public TitularNoValidoException(){
		super("El titular de la cuenta no es v�lido ya que no es joven, por lo que no puede retirar dinero.");
	}
}
