package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {

	OperadorAritmetico o;
	OperadorAritmetico o1;
	
	@BeforeEach
	void init() {
		o = new OperadorAritmetico();
		o1 = new OperadorAritmetico();
	}
	
	@Test
	void testSuma() {
		assertEquals(2, o.suma(1, 1));
	}

	@Test
	void testDivisionException() {
		try {
			assertEquals(0, o.division(4, 0));
			fail("No lanza la excepción al ser b = 0");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Test
	void testDivision() {
		try {
			assertEquals(3, o.division(12, 4));
		} catch (Exception e) {
		}
	}
	
}
