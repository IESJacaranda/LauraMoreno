package empleado;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class EmpleadoTest {
	
	static Stream<Arguments>parametros(){
		return Stream.of(
				Arguments.of("Joaquin", "Marin", 25, 500,false),
				Arguments.of("Pepe","Ruiz", 41, 500,true),
				Arguments.of("Susana", "García", 40, 500,false)
				);
	}

	@ParameterizedTest
	@MethodSource("parametros")
	void testPlus(String nombre, String apellido, int edad, double sueldo, boolean estado) {
		Empleado empleado = new Empleado(nombre, apellido, edad, sueldo);
		double aux = empleado.getSalario();
		
		assertEquals(estado, empleado.plus(5));
		if(estado) {
			assertEquals(aux+5, empleado.getSalario());
		}else {
			assertEquals(aux, empleado.getSalario());
		}
	}

	
	static Stream<Arguments>parametros2(){
		Empleado emp1 = new Empleado("Joaquin", "Marin");
		Empleado emp2 = new Empleado("Joaquin","Marin");
		Empleado emp3 = new Empleado("Manue","Marín");
		Empleado emp4 = new Empleado("Joaquin","García");
		return Stream.of(
				Arguments.of(emp1,emp2,true),
				Arguments.of(emp1, emp3,false),
				Arguments.of(emp1, emp4,false)
				);
	}
	
	@ParameterizedTest
	@MethodSource("parametros2")
	void testEqualsEmpleado(Empleado emp,Empleado emp2, boolean sonIguales) {
		assertEquals(sonIguales,emp.equals(emp2));
	}
	
	
	
	static Stream<Arguments>parametros3(){
		Empleado emp1 = new Empleado("Joaquin", "Marin",25);
		Empleado emp2 = new Empleado("Jesus","Marin",25);
		Empleado emp3 = new Empleado("Manue","Marín",30);
		Empleado emp4 = new Empleado("David","García",20);
		return Stream.of(
				Arguments.of(emp1,emp2,0),
				Arguments.of(emp1, emp3,-1),
				Arguments.of(emp1, emp4,1)
				);
	}

	@ParameterizedTest
	@MethodSource("parametros3")
	void testCompareTo(Empleado emp1, Empleado emp2, double posicion) {
		assertEquals(posicion, emp1.compareTo(emp2));
	}

}
