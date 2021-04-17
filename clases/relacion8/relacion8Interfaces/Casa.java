package relacion8Interfaces;

public class Casa implements IEdificio {

	private double ancho;
	private double plantas;
	private double largo;
	
	
	public Casa(double ancho, double plantas, double largo) {
		super();
		this.ancho = ancho;
		this.largo = largo;
		this.plantas = plantas;
	}
	
	public Casa() {}
	
	
	@Override
	public double superficieEdificio() {
		// TODO Auto-generated method stub
		return ancho*largo*plantas;
	}

	@Override
	public double aforoMaximoEdificio() {
		// TODO Auto-generated method stub
		return 20;
	}

	public double getPrecioEdificio() {
		return PRECIO_POR_METRO * superficieEdificio();
	}
	
}
