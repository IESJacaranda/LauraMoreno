package proyectos;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProyectoTest {
	Proyecto pro;
	
	@BeforeEach
	void init() throws FechaInicialFinalNoValidaException, FechaInicialProyectoNoValidaException {
		pro = new Proyecto("pro",LocalDate.of(2021, 10, 12), LocalDate.of(2021, 12, 12));
		
	}
	
	@Test
	void testProyecto() {
		try {
			Proyecto pro1 = new Proyecto("pro",LocalDate.of(2021, 11, 12), LocalDate.of(2022, 12, 12));
			assertEquals("Proyecto pro con código 0. Fecha de comienzo 2021-11-12. Fecha final:2022-12-12\n", pro1.toString());
		} catch (FechaInicialFinalNoValidaException | FechaInicialProyectoNoValidaException e) {
		}//válido
	}
	
	@Test
	void testProyectoException() {//para probar las excepciones
		try {
			Proyecto pro1 = new Proyecto("pro",LocalDate.of(2021, 05, 23), LocalDate.of(2022, 12, 12));//fecha inicio: ayer
			fail("No salta la excepción");
		} catch (FechaInicialFinalNoValidaException | FechaInicialProyectoNoValidaException e) {
			String msg = e.getMessage();
			assertEquals("La fecha de inicio debe ser posterior a hoy", msg);
		}
		
		try {
			Proyecto pro1 = new Proyecto("pro",LocalDate.of(2021, 06, 24), LocalDate.of(2021, 02, 12));
			fail("No salta la excepción");
		} catch (FechaInicialFinalNoValidaException | FechaInicialProyectoNoValidaException e) {
			String msg = e.getMessage();
			assertEquals("La fecha final debe ser posterior a la fecha inicial", msg);
		}
		
	}

	@Test
	void testAddTarea() {
		try {
			pro.addTarea("limpiar", LocalDate.of(2021, 06, 23), 5);
			assertEquals("Proyecto pro con código 0. Fecha de comienzo 2021-11-12. Fecha final:2022-12-12\n"
					+ "Task limpiar, Fecha inicio=2021-06-23, duración=5.En proceso\n", pro.toString());
			
		} catch (FechaInicialTareaNoValidaException | DuracionTareaNoValidoException e) {
		}
		
		System.out.println(pro.toString());
		try {
			pro.addTarea("aprobar", LocalDate.of(2021, 06, 23), -1);
			fail("No entra en la excepción");
		} catch (FechaInicialTareaNoValidaException | DuracionTareaNoValidoException e) {
			String msg = e.getMessage();
			assertEquals("No se puede añadir una tarea con tiempo negativo", msg);
		}
		
		try {
			pro.addTarea("aprobar", LocalDate.of(2021, 8, 12), 4);
			fail("No entra en la excepción");
		} catch (FechaInicialTareaNoValidaException | DuracionTareaNoValidoException e) {
			String msg = e.getMessage();
			assertEquals("No se puede añadir una tarea fuera de los límites del proyecto", msg);
		}
		
	}

	//TEST NO CORRECTO PORQUE NO ELIMINA LA TAREA. CREA UNA NUEVA DENTRO DEL MÉTODO
	@Test
	void testDelTask() throws FechaInicialTareaNoValidaException, DuracionTareaNoValidoException {
		pro.addTarea("limpiar", LocalDate.of(2021, 11, 23), 5);
		//pro.delTask("limpiar");
		//assertEquals("Proyecto pro con código 0. Fecha de comienzo 2021-11-12. Fecha final:2022-12-12\n", pro.toString());
		assertEquals(true, pro.delTask("limpiar"));
	}

	@Test
	void testEndTask() {//EL TEST ESTÁ MAL POR EL MISMO MOTIVO QUE ARRIBA
		try {
			pro.addTarea("limpiar", LocalDate.of(2021, 11, 23), 5);
			assertEquals(true ,pro.endTask("limpiar"));
		} catch (FechaInicialTareaNoValidaException | DuracionTareaNoValidoException e) {
		}
		
		try {
			pro.addTarea("limpiar", LocalDate.of(2021, 11, 23), 5);
			assertEquals(false ,pro.endTask("cantar"));
		} catch (FechaInicialTareaNoValidaException | DuracionTareaNoValidoException e) {
		}
	}

	@Test
	void testToString() {//YA PROBADO
		
	}

}
