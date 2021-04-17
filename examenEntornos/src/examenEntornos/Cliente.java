package examenEntornos;

import java.util.ArrayList;

public class Cliente {
	private int codCliente;
	private String direccion;
	private long telefono;
	private Pais pais;
	
	private ArrayList <Factura> facturas = new ArrayList();
	//Dijimos en clase que los objetos y colecciones también debían ser privadas.
	
	public Cliente (int codCliente, String direccion, long telefono, Pais pais) {
		this.codCliente = codCliente;
		this.direccion = direccion;
		this.telefono = telefono;
		this.pais = pais;
	}
	
	public void anadirFactura(Factura factura) {
		this.facturas.add(factura);
	}
}
