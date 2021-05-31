package examen;

public class Caseta {

	private String titulo;
	private String numero;
	private String modulo;
	private Clase clase;
	private String entidad;
	private String id;

	public Caseta(String titulo, String numero, String modulo, String clase, String entidad, String id)
			throws Exception {
		this.titulo = titulo;
		this.numero = numero;
		this.modulo = modulo;
		Clase cla = null;
		try {
			cla = Clase.valueOf(clase.toUpperCase());
			this.clase = cla;
		} catch (Exception e) {
			throw new Exception("El tipo de la caseta no corresponde con ningún tipo");
		}

		this.entidad = entidad;
		this.id = id;
		

	}

	public String getTitulo() {
		return titulo;
	}

	public String getNumero() {
		return numero;
	}

	public String getModulo() {
		return modulo;
	}

	public Clase getClase() {
		return clase;
	}

	public String getEntidad() {
		return entidad;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Caseta))
			return false;
		Caseta other = (Caseta) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return "Caseta: titulo:" + titulo + ", numero:" + numero + ", modulo:" + modulo + ", clase:" + clase
				+ ((entidad=="") ? ", " : ", entidad:"+entidad) + ", id:" + id;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}
