package SimulacroExamen.src.model;

import java.util.Comparator;

public class OrdenaSueldo implements Comparator<AbstractEmpleado> {

	@Override
	public int compare(AbstractEmpleado o, AbstractEmpleado o2) {
		int result = (int)(o.getSueldo() - o2.getSueldo());
		return result;
	}

	

}
