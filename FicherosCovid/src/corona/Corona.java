package corona;

import java.time.LocalDate;

public class Corona {
	
	private final static String[] meses= {"","enero","febrero","marzo","abril","mayo","junio",
										"julio","agosto","septiembre","octubre","noviembre","diciembre"};
	private LocalDate fecha;
	private int contagios;
	private int fallecidos;
	private int curados;
	
	public Corona(int contagios, int fallecidos, int curados, int Agno, String Parametro) {
		this.fecha = convierteFormato(Agno, Parametro);
		this.contagios = contagios;
		this.fallecidos = fallecidos;
		this.curados = curados;
	}
	
	//Formato de parametro: Día 22 de enero
	public LocalDate convierteFormato(int Agno, String Parametro) {
		StringBuilder sb = new StringBuilder();
		LocalDate fecha;
		String[] aux = Parametro.split(" ");
		sb.append(Agno);
		
		for(int i=1; i<meses.length;i++) {
			if(aux[3].equals(meses[i])) {
				if(i>9) {
					sb.append("-"+i+"-");
				}else {
					sb.append("-0"+i+"-");
				}
				
			}
		}
		String dia = aux[1];
		if(dia.length()==1) {
			dia = "0"+dia;
		}
		sb.append(dia);
		fecha = LocalDate.parse(sb.toString());
		//USAR MEJOR EL LOCALDATE.OF
		return fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public int getContagios() {
		return contagios;
	}

	public int getFallecidos() {
		return fallecidos;
	}

	public int getCurados() {
		return curados;
	}
	
	public void setContagios(int contagios) {
		this.contagios = contagios;
	}

	public void setFallecidos(int fallecidos) {
		this.fallecidos = fallecidos;
	}

	public void setCurados(int curados) {
		this.curados = curados;
	}

	//HASHCODE E EQUALS POR FECHA
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Corona))
			return false;
		Corona other = (Corona) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Corona [fecha=" + fecha + ", contagios=" + contagios + ", fallecidos=" + fallecidos + ", curados="
				+ curados + "]";
	}

	
	
}
