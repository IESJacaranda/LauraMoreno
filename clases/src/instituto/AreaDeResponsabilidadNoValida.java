package instituto;

public class AreaDeResponsabilidadNoValida extends Exception {
	public AreaDeResponsabilidadNoValida() {
		super("El area de responsabilidad debe ser gestión del alumnado o gestión del profesorado");
	}
}
