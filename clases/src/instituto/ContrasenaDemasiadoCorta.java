package instituto;

public class ContrasenaDemasiadoCorta extends Exception {

	public ContrasenaDemasiadoCorta() {
		super("La contrase�a es demasiado corta.");
	}
}
