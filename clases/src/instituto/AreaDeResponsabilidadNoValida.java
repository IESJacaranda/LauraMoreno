package instituto;

public class AreaDeResponsabilidadNoValida extends Exception {
	public AreaDeResponsabilidadNoValida() {
		super("El area de responsabilidad debe ser gesti�n del alumnado o gesti�n del profesorado");
	}
}
