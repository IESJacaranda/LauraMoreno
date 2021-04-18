package pooAvanzado.ejercicio3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		//EMPLEADO TEMPORAL
		AbstractEmpleado empleadoBasic = new EmpleadoTemporal("Pepe", 50, "30303030N", 2000, LocalDate.of(2020, 10, 30), LocalDate.of(2021, 10, 30)); 
		System.out.println(empleadoBasic.getSueldo());
		
		EmpleadoTemporal empleadoTemp = new EmpleadoTemporal("Lucas", 30, "50203012K", 1500, LocalDate.of(2019, 10, 30), LocalDate.of(2020, 8, 10));
		System.out.println(empleadoTemp.getSueldo());
		
		//EMPLEADO FIJO
		EmpleadoFijo fijo = new EmpleadoFijo("Lola", 34, "54625895L", 2000, 2000);
		System.out.println(fijo.getSueldo());
		
		//EMPLEADO POR HORAS
		EmpleadoHoras horas = new EmpleadoHoras("Catalina", 50, "95123654J", 1500, 10, 18);
		System.out.println(horas.getSueldo());
		
	}
	
}
