package ejercicio5;

public class Main {
  
	static Equipo equipoVisitante = new Equipo("Sevilla","Sevilla","S�nchez-Pizju�n");
	static Equipo equipoLocal = new Equipo("Betis","Sevilla","Benito Villamar�n");
	
	static Equipo equipoLocal1 = new Equipo("Levante", "ciudad","campo");
	static Equipo equipoVisitante1 = new Equipo("C�diz","ciudad","campo");

	static Partido partido = new Partido (equipoVisitante, equipoLocal);
	static Partido partido1 = new Partido (equipoVisitante1, equipoLocal1);

	
	public static void main(String[] args) throws Exception {

		//System.out.println(partido.sonMismoEquipoEnPartido(partido1));
		
		partido1.ponerResultado("1-2");
		
		
	}

}
