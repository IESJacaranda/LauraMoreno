package relacion8;

public class NumeroNegativoException extends Exception {
	
	public NumeroNegativoException(){
		super("El número introducido no debe ser menor de 0.");
	}

}
