package body;

import java.util.HashSet;
import java.util.Set;

public class Ciudad {
	
	protected Set<Direccion>direcciones;
	protected int ciudadId;
	protected String name;
	protected int paisId; //NECESITO GUARDAR EL ID DEL PAÍS PARA QUE LUEGO LOS PUEDA RELACIONAR 
	
	public Ciudad(Set<Direccion>direcciones, int ciudadId, String name, int paisId) {
		super();
		this.direcciones = new HashSet<Direccion>();
		this.ciudadId = ciudadId;
		this.name = name;
		this.paisId = paisId;
	}
	
	public Ciudad(int ciudadId, String name, int paisId) {
		super();
		this.direcciones = new HashSet<Direccion>();
		this.ciudadId = ciudadId;
		this.name = name;
		this.paisId = paisId;
	}
	
	public void addDireccion(Direccion d) {
		direcciones.add(d);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ciudadId;
		result = prime * result + ((direcciones == null) ? 0 : direcciones.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public String toString() {
		return ciudadId + ", " + name + " con país id: "+paisId;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ciudad))
			return false;
		Ciudad other = (Ciudad) obj;
		if (ciudadId != other.ciudadId)
			return false;
		if (direcciones == null) {
			if (other.direcciones != null)
				return false;
		} else if (!direcciones.equals(other.direcciones))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getPaisId() {
		return paisId;
	}

	public Set<Direccion> getDirecciones() {
		return direcciones;
	}

	public int getCiudadId() {
		return ciudadId;
	}

	public String getName() {
		return name;
	}
	
	
}
