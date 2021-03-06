package ficheroPaises.body;

public class ClaseContenedor {

	private String id;
	private String name;
	private int numCiudades;
	private int numDirecciones;
	private String id_city;

	public ClaseContenedor(String id, String name) {
		this.id = id;
		this.name = name;
		this.numCiudades = 0;
		this.numDirecciones = 0;
		this.id_city = id_city;
	}

	public String getId_city() {
		return id_city;
	}

	public void setId_city(String id_city) {
		this.id_city = id_city;
	}

	public ClaseContenedor(String id) {
		this.id = id;
		this.name = name;
		this.numCiudades = 0;
		this.numDirecciones = 0;
	}

	public String muestraIds() {
		StringBuilder sb = new StringBuilder();

		return sb.toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumCiudades() {
		return numCiudades;
	}

	public void setNumCiudades(int numCiudades) {
		this.numCiudades = numCiudades;
	}

	public int getNumDirecciones() {
		return numDirecciones;
	}

	public void setNumDirecciones(int numDirecciones) {
		this.numDirecciones = numDirecciones;
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
		if (!(obj instanceof ClaseContenedor))
			return false;
		ClaseContenedor other = (ClaseContenedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(
				name + " con id " + id + " con " + numCiudades + ((numCiudades==1) ?" ciudad y " :" ciudades y ") + numDirecciones + ((numDirecciones == 1) ? " dirección." : " direcciones."));
		return sb.toString();
	}

}
