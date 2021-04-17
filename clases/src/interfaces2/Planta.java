package interfaces2;

public class Planta implements ISerVivo {

	private String nombre;
	private int altura;
	private String clima;
	
	public Planta(String nombre, int altura, String clima) {
		this.nombre = nombre;
		this.altura = altura;
		this.clima = clima;
	}
	
	public Planta() {}
	
	
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
	
	public void hacerFotosintesis() {
		
	}
	
	public void echarRaices() {
		
	}

}
