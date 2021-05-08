package simuGeneradores2.body;

import java.util.Comparator;

public class ComparaLocalidad implements Comparator<AbsGenerador> {

	@Override
	public int compare(AbsGenerador o1, AbsGenerador o2) {
		int result = o1.localidad.compareTo(o2.getLocalidad());
		
		if(result == 0) {
			if(o1.getFechaInicio().isAfter(o2.fechaInicio)) {
				result = 1;
			}else if(o1.getFechaInicio().isBefore(o2.getFechaInicio())) {
				result = -1;
			}
		}
		return result;
	}

}
