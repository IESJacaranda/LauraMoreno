package simulacro;

import java.util.Comparator;

public class OrdenaSueldo implements Comparator<AbstractEmpleado> {

	@Override
	public int compare(AbstractEmpleado o1, AbstractEmpleado o2) {
		int result = (int)(o1.getSueldo() - o2.getSueldo());
		return result;
	}

}
