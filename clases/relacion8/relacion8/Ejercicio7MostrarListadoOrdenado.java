package relacion8;

public class Ejercicio7MostrarListadoOrdenado {

	public String mostrarListadoOrdenado(String[]nombres, double[]notas) {
		for(int i=0; i<notas.length-1;i++) {
			for(int j=i+1; j<notas.length;j++) {
				if(notas[i]<notas[j]) {
					String aux = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = aux;
				}
			}
		}
		String alumnosOrdenados = "";
		for(int i=0;i<nombres.length;i++) {
			if(i != nombres.length-1) {
				alumnosOrdenados += nombres[i] + ", ";
			}else {
				alumnosOrdenados += nombres[i];
			}
		}
		return alumnosOrdenados;
	}
}
