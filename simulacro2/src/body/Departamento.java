package body;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Departamento {

	protected Set<AbstractEmpleado>empleados;
	protected String nombre;
	private static int aux = 0;
	
	public Departamento(String nombre) {
		super();
		this.nombre = nombre;
		this.empleados = new HashSet<AbstractEmpleado>();
	}

	public boolean addEmpleado(AbstractEmpleado emp) {
		boolean resul = true;
		if(emp instanceof EDepart || empleados.contains(emp)) {
			resul = false;
		}
		empleados.add(emp);//no hace falta que lo introduzca en un else porque es un hashset
		return resul;
	}
	
	public boolean addJefe(EDepart emp) {
		boolean resul = false;
		if(aux>0) {
			System.out.println("Ya no se pueden añadir más jefes");
		}
		if(aux == 0) {
			resul = true;
			empleados.add(emp);
			aux++;
		}
		return resul;
	}
	
	public double obtenerSueldo() {
		double suma = 0;
		Iterator<AbstractEmpleado> it = empleados.iterator();
		while(it.hasNext()){
			AbstractEmpleado aux = it.next();
				suma += aux.getSueldo();
			}
		return suma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Los integrantes del departamento "+ nombre + " son: \n");
		List<AbstractEmpleado>lista = new ArrayList<AbstractEmpleado>(empleados);
		Collections.sort(lista);
		for(AbstractEmpleado i: lista) {
			sb.append(i+"\n");
		}
		return sb.toString();
	}
	
	public String toStringSueldo() {
		StringBuilder sb = new StringBuilder("Los integrantes del departamento "+ nombre + " son: \n");
		List<AbstractEmpleado>lista = new ArrayList<AbstractEmpleado>(empleados);
		Collections.sort(lista, new OrdenaSueldoEmp());
		for(AbstractEmpleado i: lista) {
			sb.append(i+"\n");
		}
		return sb.toString();
	}

	public Set<AbstractEmpleado> getEmpleados() {
		return empleados;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
