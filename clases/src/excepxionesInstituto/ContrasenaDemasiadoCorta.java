package excepxionesInstituto;

class ContrasenaDemasiadoCorta extends Exception {

	public ContrasenaDemasiadoCorta() {
		super("La contraseña es demasiado corta.");
	}
}
