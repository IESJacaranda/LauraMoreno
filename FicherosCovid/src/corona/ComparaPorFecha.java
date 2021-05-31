package corona;

import java.util.Comparator;

public class ComparaPorFecha implements Comparator<Corona>{

	@Override
	public int compare(Corona o1, Corona o2) {
		int resul = 0;
		
		if(o1.getFecha().isAfter(o2.getFecha())) {
			resul = 1;
		}else if(o1.getFecha().isBefore(o2.getFecha())) {
			resul = -1;
		}
		return resul;
	}

	
}
