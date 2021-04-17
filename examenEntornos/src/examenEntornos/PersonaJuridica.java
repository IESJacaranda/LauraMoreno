package examenEntornos;

public class PersonaJuridica extends Cliente {

	private String razonSocial;
	private String ruc;
	
	public PersonaJuridica(int codCliente, String direccion, long telefono, Pais pais, String razonSocial, String ruc) {
		super(codCliente, direccion, telefono, pais);
		this.razonSocial = razonSocial;
		this.ruc = ruc;
	}

}
