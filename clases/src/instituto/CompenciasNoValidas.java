package instituto;

public class CompenciasNoValidas extends Exception {
	public CompenciasNoValidas() {
		super("Las competencias no son válidas. Deben ser: secretaría, dirección o jefatura de estudios");
	}

}
