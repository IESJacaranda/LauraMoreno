package relacion8;

public class Ejercicio7MostrarAlumnosAprobados {

	
	public void muestraAlumnosAprobados(double[]notas, String[]nombres) {
		
		for(int i=0; i<notas.length;i++) {
			if(notas[i]>=5) {
				System.out.println(nombres[i]);
			}
		}
	}
	
	public void muestraAlumnosSuspensos(double[]notas, String[]nombres) {
			
			for(int i=0; i<notas.length;i++) {
				if(notas[i]<5) {
					System.out.println(nombres[i]);
				}
			}
		}
}
