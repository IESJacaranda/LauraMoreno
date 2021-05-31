package corona;

import java.util.Comparator;

public class ComparaMejorFallecidos implements Comparator<Corona>{


	@Override
	public int compare(Corona o1, Corona o2) {
		int resul=0;
		
		if(o1.getFallecidos()>o2.getFallecidos()) {
			resul = 1;
		}else if(o1.getFallecidos()<o2.getFallecidos()) {
			resul = -1;
		}
		
		return resul;
	}
	
	
	
}
