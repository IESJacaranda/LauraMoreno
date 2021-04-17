package examenEntornos;

import java.util.ArrayList;

public class Pais {
	private int codPais;
	private String descripcion;
	
	private ArrayList <Cliente> clientes = new ArrayList();
	
	public Pais(int codPais, String descripcion) {
		this.codPais = codPais;
		this.descripcion = descripcion;
	}
	
	public void anadirCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
}
