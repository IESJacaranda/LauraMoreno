package interfaces2;

public class Humano implements IAnimal {

	private String nombre;
	private int edad;
	private String profesion;
	
	public Humano (String nombre, int edad, String profesion) {
		this.nombre = nombre;
		this.edad = edad;
		this.profesion = profesion;
	}
	
	public Humano() {}
	
	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alimentarse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int tenerCrias() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String tenerSentiminetos() {
		// TODO Auto-generated method stub
		return null;
	}

}
