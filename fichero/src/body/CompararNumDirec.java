package body;

import java.util.Comparator;

public class CompararNumDirec implements Comparator<ComponenteList> {

	@Override
	public int compare(ComponenteList o1, ComponenteList o2) {
		int resul = Integer.valueOf(o2.numDirec).compareTo(Integer.valueOf(o1.numDirec));
		if(resul == 0) {
			resul = o1.compareTo(o2);
		}
		return resul;
	}

}
