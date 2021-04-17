package ejercicio5;

import java.util.concurrent.ThreadLocalRandom;

public class Partido {
	
	private Equipo equipoVisitante;
	private Equipo equipoLocal;
	private String quiniela; 
	private int golesVisitante;
	private int golesLocal;
	
	private static final int JORNADA = ThreadLocalRandom.current().nextInt(1,38);
	
	public Partido() {}
	
	public Partido (Equipo equipoVisitante, Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}
	
	
	public void ponerResultado(String resultado) {
		resultado = resultado.replace(" ", "");
		String[] parts = resultado.split("-");

		this.golesLocal = Integer.parseInt(parts[0]);		
		this.golesVisitante = Integer.parseInt(parts[1]);
		
		//OTRA OPCIÓN (AUNQUE SOLO VALDRÍA PARA NÚMEROS CON UNA SOLA CIFRA)
		//this.golesLocal = Character.getNumericValue(resultado.charAt(0));
		
		
		setQuiniela();
		
	}

	public void setQuiniela() {
		
		if(this.golesLocal == this.golesVisitante) {
			this.quiniela = "X";
			equipoLocal.setPartidosEmpatado();
			
		}else if (this.golesLocal > this.golesVisitante) {
			this.quiniela = "1";
			equipoLocal.setPartidosGanados();
		}else {
			this.quiniela ="2";
			equipoVisitante.setPartidosGanados();
		}
	}

	public String getQuiniela() {
		return quiniela;
	}

	@Override
	public String toString() {
		String print;
		
		if(this.quiniela == null) {
			print = "Partido entre equipo local "+equipoLocal.getNombre()+" y equipo visitante "+equipoVisitante.getNombre()+" todavía no se ha jugado";
		}
		else {
		
		print = "Partido entre equipo local "+equipoLocal.getNombre()+" y el equipo visitante "+equipoVisitante.getNombre()+" jugado en el estadio "+equipoLocal.getCampo() +"\r\n" + 
				" de la ciudad "+equipoLocal.getCiudad()+" ha finalizado con "+ golesLocal+" goles de equipo local y "+golesVisitante+ " goles de equipo\r\n" + 
				"visitante. Resultado quiniela= "+quiniela;
		}
		return print;
	}

	public boolean sonMismoEquipoEnPartido(Partido partido) throws Exception {
		boolean sonIguales = true;
		
		if(partido.equipoLocal.equals(partido.equipoVisitante)) {
			throw new Exception ("El partido debe contener dos equipos diferentes.");
		}
		
		return sonIguales;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public void setQuiniela(String quiniela) {
		this.quiniela = quiniela;
	}

	
	
	
}

