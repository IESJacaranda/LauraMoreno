package relacion8Interfaces;

public class Polideportivo implements IInstalacionDeportiva, IEdificio {

	@Override
	public double superficieEdificio() {
		return 100;
	}

	@Override
	public double aforoMaximoEdificio() {
		// TODO Auto-generated method stub
		return 150;
	}

	@Override
	public double superficieJuego() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public int aforoMaxJuego() {
		// TODO Auto-generated method stub
		return 200;
	}

}
