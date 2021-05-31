package ficheroPaises.body;

public class Address {
	
	private String id_address;
	private String name;
	
	public Address(String id_address, String name) {
		this.id_address= id_address;
		this.name = name;
	}

	public String getId_address() {
		return id_address;
	}

	public void setId_address(String id_address) {
		this.id_address = id_address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_address == null) ? 0 : id_address.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Address))
			return false;
		Address other = (Address) obj;
		if (id_address == null) {
			if (other.id_address != null)
				return false;
		} else if (!id_address.equals(other.id_address))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.name+ ", id: "+this.id_address);
		return sb.toString();
	}

	
}
