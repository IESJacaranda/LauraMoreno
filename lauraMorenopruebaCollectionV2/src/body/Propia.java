package body;


public class Propia extends AbsTarea {

	protected String depart;
	
	public Propia(String descrip, String prioridad, String depart) throws Exception {
		super(descrip, prioridad);
		this.depart = depart;
	}

	@Override
	public String toString() {
		return super.toString() + ", departamento=" +depart ;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
}
