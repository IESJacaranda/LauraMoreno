package SimulacroExamen.src.model;
import SimulacroExamen.src.ExcepcionesCustom.SueldoException;

public class main {

	public static void main(String[] args) {
		Departamento c = new Departamento("Contable");
		
		EmpleadoBase emp = new EmpleadoBase("aaa", "Jesus", EPuesto.ADMINISTRATIVO);
		EmpleadoBase emp2 = new EmpleadoBase("aaba", "David", EPuesto.ADMINISTRATIVO);
		try {
			JefeDepartamento jefe = new JefeDepartamento("l", "Joaquin", 3, 2000);
			c.addEmpleado(emp);
			c.addJefe(jefe);
			c.addEmpleado(emp2);
			
			System.out.println(c.toString());

		} catch (SueldoException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
