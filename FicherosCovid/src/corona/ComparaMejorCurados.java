package corona;

import java.util.Comparator;

public class ComparaMejorCurados implements Comparator<Corona>{

	@Override
	public int compare(Corona o1, Corona o2) {
		int resul = 0;
		
		if(o1.getCurados() > o2.getCurados()) {
			resul = -1;
		}else if(o1.getCurados() < o2.getCurados()) {
			resul = 1;
		}
		return resul;
	}

}
