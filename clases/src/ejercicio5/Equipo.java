package ejercicio5;

public class Equipo {
	
	private String nombre;
	private int partidosGanados;
	private int partidosEmpatado;
	private String ciudad;
	private String campo;

	
	public Equipo() {}
	
	public Equipo(String nombre, String ciudad, String campo) {
		this.nombre = nombre;
		this.partidosEmpatado = partidosEmpatado;
		this.partidosGanados = partidosGanados;
		this.campo = campo;
		this.ciudad = ciudad;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		
		if(this==obj) {
			sonIguales = true;
		}
		else if(obj!=null && obj instanceof Equipo) {
			if(((Equipo)obj).getNombre().equals(this.getNombre())) {
				sonIguales = true;
			}
		}
		return sonIguales;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	

	public int getPartidosEmpatado() {
		return partidosEmpatado;
	}

	public void setPartidosEmpatado() {
		this.partidosEmpatado += 1;
	}

	public void setPartidosGanados() {
		this.partidosGanados += 1;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public void setPartidosEmpatado(int partidosEmpatado) {
		this.partidosEmpatado = partidosEmpatado;
	}

		
	
	
	
	
}


