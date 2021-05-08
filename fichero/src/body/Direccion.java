package body;

import java.util.HashSet;

public class Direccion {
	
	protected int addressId;
	protected String address;
	protected HashSet<Direccion>direcciones;
	protected int ciudadId;
	
	public Direccion(int addressId, String address, int ciudadId) {
		super();
		this.addressId = addressId;
		this.address = address;
		this.direcciones = new HashSet<Direccion>();
		this.ciudadId = ciudadId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + addressId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Direccion))
			return false;
		Direccion other = (Direccion) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (addressId != other.addressId)
			return false;
		return true;
	}

	public int getAddressId() {
		return addressId;
	}

	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return addressId + ", "+ address + " con ciudad is: " + ciudadId;
	}

	public int getCiudadId() {
		return ciudadId;
	}

	
}
