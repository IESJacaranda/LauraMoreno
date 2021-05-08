package body;

import java.util.Comparator;

public class ComparaPrioridad implements Comparator<AbsTarea> {
/**
 * a que salgan primero las tareas de prioridad Alta, luego las medias y luego las bajas.
Para las tareas con la misma prioridad se ordenarán de forma alfabética por la descripción
 */
	
	//comparo los dias almacenados directamente puesto que cada prioridad tiene su propio num de dias y es una forma de compararlos
	//Los he puesto en este orden para que salgan de mayor a menor
	@Override
	public int compare(AbsTarea o1, AbsTarea o2) {
		int resul = 0;
		if(o1.getPrioridad().getDias() < o2.getPrioridad().getDias() ) {
			resul = -1;
		}else if(o1.getPrioridad().getDias() > o2.getPrioridad().getDias()) {
			resul = 1; 
		}else {
			o1.getDescrip().compareTo(o2.getDescrip());
		}
		
		return resul;
	}
}

