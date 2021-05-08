package body;

import java.util.Comparator;

public class OrdenaSueldoEmp implements Comparator<AbstractEmpleado> {

	@Override
	public int compare(AbstractEmpleado o1, AbstractEmpleado o2) {
		int result = 0;
		if(o1.getSueldo()>o2.getSueldo()) {
			result = -1;
		}else if(o1.getSueldo()<o2.getSueldo()) {
			result = 1;
		}else {
			result = 0;
		}
		return result;
	}

}
