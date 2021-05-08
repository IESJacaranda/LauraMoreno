package enumerado;

public enum ETipo {

	ADMINISTRATIVO(1150), 
	OPERARIO(1100),
	CONTABLE(1350);
	
	private int sueldoBase;
	
	ETipo(int sueldoBase){
		this.sueldoBase = sueldoBase;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}
}
