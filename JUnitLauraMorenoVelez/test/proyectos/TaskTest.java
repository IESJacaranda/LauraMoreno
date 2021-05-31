package proyectos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {
Task ta;

	@BeforeEach
	void init() {
		ta = new Task();
	}

	@Test
	void testEnded() {
		ta.setConcept("cocinar");
		ta.ended();
		assertEquals("Task cocinar, Fecha inicio=null, duración=0.Terminado", ta.toString());
	}

	@Test
	void testToString() {//YA PROBBADO ARRIBA
		
	}

}
