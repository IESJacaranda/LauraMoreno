package body;

import java.util.Comparator;

public class OrdenaLocalidad implements Comparator<AbstractGenerador>{

	@Override
	public int compare(AbstractGenerador o1, AbstractGenerador o2) {
		int resultado;
		if(o1.localidad==o2.localidad) {
			resultado=o1.fecha.compareTo(o2.fecha);
		}
		else {
			resultado=o1.localidad.compareTo(o2.localidad);
		}
		return resultado;
	}
}
