package pooAvanzado.relacion10.Ejercicio2;

public enum Gama {
	
	BAJA(30), 
	MEDIA(40), 
	ALTA(50);
	
	private double precio;
	
	Gama(double precio){
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}
}
