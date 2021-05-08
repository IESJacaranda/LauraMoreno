package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubscripcionTest {

	@Test
	void testPrecioPorMes() {
		Subscripcion s  = new Subscripcion(0,0);
		assertEquals(0.0, s.precioPorMes());
		
		Subscripcion s2  = new Subscripcion(12,4);
		assertEquals(3.0, s2.precioPorMes());
		
		Subscripcion s3  = new Subscripcion(12,5);
		assertEquals(3.4, s3.precioPorMes());
		
		Subscripcion s4  = new Subscripcion(-12,5);
		assertEquals(0.0, s4.precioPorMes());

	}

	@Test
	void testCancel() {
		Subscripcion s  = new Subscripcion(0,0);
		s.cancel();
		assertEquals(0.0, s.precioPorMes());
	}

}
