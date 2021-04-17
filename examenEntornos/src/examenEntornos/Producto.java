package examenEntornos;

import java.util.ArrayList;
import java.util.Currency;

public class Producto {
	private int codProducto;
	private String descripcion;
	private String um;
	private Currency pu;
	private String presentacion;
	
	private ArrayList <DetalleFactura> detalleFacturas = new ArrayList();
	
	public Producto(int codProducto, String descripcion, String um, Currency pu, String presentacion) {
		this.codProducto = codProducto;
		this.descripcion = descripcion;
		this.um = um;
		this.pu = pu;
		this.presentacion = presentacion;
	}
	
	public void anadirDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFacturas.add(detalleFactura);
	}
}
