package corona;

public class Informacion {
	
	private int Agno;
	private String Periodo;
	private int Valor;
	
	public Informacion(int Agno, String Periodo, int Valor) {
		this.Agno = Agno;
		this.Periodo = Periodo;
		this.Valor = Valor;
	}

	public int getAgno() {
		return Agno;
	}

	public String getPeriodo() {
		return Periodo;
	}

	public int getValor() {
		return Valor;
	}

	public void setAgno(int agno) {
		Agno = agno;
	}

	public void setPeriodo(String Periodo) {
		Periodo = Periodo;
	}

	public void setValor(int valor) {
		Valor = valor;
	}

	@Override
	public String toString() {
		return "Informacion [Agno=" + Agno + ", Periodo=" + Periodo + ", Valor=" + Valor + "]";
	}

}
