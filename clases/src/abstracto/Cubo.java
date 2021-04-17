package abstracto;

public class Cubo extends AbstractFiguraEspacio {

	private Double lado;
	
	public Cubo(double peso, double lado) {
		super();
		this.peso = peso;
		this.lado = lado;
	}
	
	@Override
	public Double calcularVolumen() {
		return Math.pow(lado, 3);
	}
}
