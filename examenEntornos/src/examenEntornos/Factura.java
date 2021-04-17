package examenEntornos;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Currency;

public class Factura {
	private int tipoFactura; 
	private Date fecha; 
	private double gv;
	private Currency descuento;
	private Cliente cliente; //Se añade en el constructor porque siempre hay 1.
	
	private ArrayList <DetalleFactura> detallesFacturas = new ArrayList();
	
	public Factura(int tipoFactura, Date fecha, double gv, Currency descuento, Cliente cliente) {
		this.tipoFactura = tipoFactura;
		this.fecha = fecha;
		this.gv = gv;
		this.descuento = descuento;
		this.cliente = cliente;
	}
	
	public void anadirDetalleFactura(DetalleFactura detalleFactura) {
		this.detallesFacturas.add(detalleFactura);
	}
}
