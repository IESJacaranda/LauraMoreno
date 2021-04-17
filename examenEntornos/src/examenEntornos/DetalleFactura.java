package examenEntornos;

public class DetalleFactura {
	private int noltem;
	private int cantidad;
	private double descuento;
	private Factura factura;
	private Producto producto;
	
	public DetalleFactura(int noltem, int cantidad, double descuento, Factura factura, Producto producto) {
		this.noltem = noltem;
		this.cantidad = cantidad;
		this.descuento = descuento;
		this.factura = factura;
		this.producto = producto;
	}
}
