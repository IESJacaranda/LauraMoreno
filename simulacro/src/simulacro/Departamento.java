package simulacro;

import java.util.Collections;
import java.util.List;

public class Departamento {
	
	private int aux = 0;
	private String nombreDepart;
	private List<AbstractEmpleado> empleados; 
	//PODRÍA HABERSE CREADO UN SET PERO PERO PREFIERO CONTROLAR LA INTRODUCCIÓN
	//DE DATOS EN LA LISTA PARA QUE NO SE REPITAN A USAR UN HASHSET, ADEMAS, TODAVÍA NO LOS HEMOS TRABAJADO REALMENTE. 
	
	public Departamento(String nombreDepart, List<AbstractEmpleado>empleados) {
		this.nombreDepart = nombreDepart;
		this.empleados = empleados;
	}
	
	public Departamento(String nombreDepart) {
		this.nombreDepart = nombreDepart;
	}

	//PODRÍA PONERSE DIRECTAMENTE QUE LA LISTA FUERA DE TIPO EMPLEADOBASE PERO ENTONCES DARÍA ERROR AL INTRODUCIR EL OBJETO
	//Y LO QUE PIDE ES QUE DE TRUE/FALSE
	public boolean addEmpleado(AbstractEmpleado empleado) {
		//FALTA INICIALIZAR LA LISTA
		boolean result = false;
		if(empleado instanceof EmpleadBase && !empleados.contains(empleado)) {
			result = true;
			empleados.add(empleado);
		}
		return result;
	}
	
	//MISMO CASO QUE EN EL EJEMPLO ANTERIOR, PARA QUE NO DE FALLO, SERÁ ABSTRACTEMPLEADO. 
	//Solo entrará si aux es 0. Cuando se haya añadido un jefe ya se habrá aumentado la variable y no se añadirá.
	public void addJefe(AbstractEmpleado empleado) {
		if(empleado instanceof JefeDepartamento && this.aux == 0) {
			empleados.add(empleado);
			aux++;
		}
	}
	
	//ENTIENDO QUE EL SUELDO QUE PIDE ES EL BASE. ESE EL QUE HE USADO.
	public double obtenerSueldo() {
		double sueldosTotales = 0;
		
		for(AbstractEmpleado i: empleados) {
			if(i instanceof EmpleadBase) {
				sueldosTotales += ((EmpleadBase)i).getSueldoBase();
			}else {
				sueldosTotales += ((JefeDepartamento)i).getSueldo();
			}
		}
		return sueldosTotales;
	}
	
	//AQUÍ USO COLLECTIONS.SORT() PARA TENER ORDENADA POR NOMBRE LA LISTA
	public String toString() {
		StringBuilder sb = new StringBuilder("El departamento es: ");
		sb.append(this.nombreDepart);
		Collections.sort(empleados);
		for(AbstractEmpleado i: empleados) {
			sb.append("\n" +i.getNombre());
		}
		return sb.toString();
	}
	
	//public String toStringSueldo() { NO ME HA DADO TIEMPO
		
	
	//NO HE AÑADIDO EL SET DEL NOMBRE PORQUE NO SE PUEDE MODIFICAR
	public String getNombreDepart() {
		return nombreDepart;
	}


	public List<AbstractEmpleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<AbstractEmpleado> empleados) {
		this.empleados = empleados;
	}
	
	

}
