package relacion11.ejercicio6;

import java.util.Comparator;

public class OrdenarPorKey implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	

}
