package excepxionesInstituto;

class ContrasenaDemasiadoCorta extends Exception {

	public ContrasenaDemasiadoCorta() {
		super("La contraseņa es demasiado corta.");
	}
}
