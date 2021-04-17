package ejercicio1;

public class Punto {
	
	private double coordX;
	private double coordY;
	
	
	public Punto (double coordX, double coordY) {
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public Punto() {
		this.coordX = 0.0;
		this.coordY = 0.0;
	}
	
	
	
	public double getCoordX() {
		return coordX;
	}


	public void setCoordX(double coordX) {
		this.coordX = coordX;
	}


	public double getCoordY() {
		return coordY;
	}


	public void setCoordY(double coordY) {
		this.coordY = coordY;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(this==obj) {
			result = true;
		}else if(obj!=null && obj instanceof Punto) {
			if(((Punto)obj).getCoordX()==this.getCoordX() && ((Punto)obj).getCoordY()==this.getCoordY()){
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "("+ this.getCoordX()+"," + this.getCoordY()+")";
	}
	
	

}
