package ejercicio2;

import java.util.concurrent.ThreadLocalRandom;

public class Producto {

	private int codigo;
	private double precio;
	private String descripcion; 

	public static final int IVA = 20;
	
	public Producto () {} 
	
	public Producto(double precio, String descripcion) {
		this.codigo = ThreadLocalRandom.current().nextInt(1000, 10000);
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	
	/**
	 * Genera el precio final del producto con el IVA añadido.
	 * @return String con el precio final
	 */
	public String getPrecioConIva() {
		double precioIva;
		double precioConIva;
		
		precioIva = (this.precio*IVA)/100;
		precioConIva = this.precio+precioIva;
		
		return "El precio con IVA es : " + precioConIva;
	}

	
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}




