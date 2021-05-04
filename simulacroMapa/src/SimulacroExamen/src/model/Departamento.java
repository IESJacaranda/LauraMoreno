package SimulacroExamen.src.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Departamento {
	private String nombre;
	private Map<String, AbstractEmpleado> empleados;
	
	public Departamento(String nombre) {
		this.nombre=nombre;
		empleados = new HashMap<String, AbstractEmpleado>();
	}
	
	// Ahora que modifique el equals y el hascode lo podria hacer directamente con el .contain
	public boolean addEmpleado(AbstractEmpleado o) {
		boolean estado = true;
		if(empleados.get(o.getDni()) != null || o instanceof JefeDepartamento ) {
			estado = false;
		}else {
			empleados.put(o.getDni(), o);
		}
		return estado;
	}
	
	public boolean addJefe(JefeDepartamento o) {
		boolean estado = true;
		
		if(empleados.get(o.getDni())!= null) {
			estado = false;
		}else {
			for(AbstractEmpleado emp: empleados.values()) {
				if(emp instanceof JefeDepartamento) {
					estado = false;
				}
			}
			if(estado) {
				empleados.put(o.getDni(), o);
			}
		}
		return estado;
	}
	
	public double obtenerSueldo() {
		double total = 0;
		for(AbstractEmpleado emp : empleados.values()) {
			total += emp.getSueldo();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento: "+getNombre()+"\n");
		
		 List<String> mapValues = new ArrayList<>();
		
		for(AbstractEmpleado emp : empleados.values()) {
			mapValues.add(emp.getNombre());
		}
		Collections.sort(mapValues);
		
		for(String aux : mapValues) {
			sb.append(aux+"\n");
		}
		return sb.toString();
	}
	
	public String toStringSueldo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento: "+getNombre()+"\n");
		
		//Collections.sort(empleados,new Ordenasueldo());
		
		return "";
	}


	public String getNombre() {
		return nombre;
	}


	public Map<String, AbstractEmpleado> getEmpleados() {
		return empleados;
	}

}
