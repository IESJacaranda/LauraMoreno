package instituto;

public class CompenciasNoValidas extends Exception {
	public CompenciasNoValidas() {
		super("Las competencias no son v�lidas. Deben ser: secretar�a, direcci�n o jefatura de estudios");
	}

}
