package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	Movimiento mov;
	
	@BeforeEach
	void init() {
		mov = new Movimiento();
	}

	@Test
	void testGetImporte() {
		mov.setImporte(5);
		assertEquals(5, mov.getImporte());
	}

	@Test
	void testGetConcepto() {
		mov.setConcepto("pago");
		assertEquals("pago", mov.getConcepto());
	}

	@Test
	void testSetConcepto() {
		mov.setConcepto("aux");
		assertEquals("aux", mov.getConcepto());
	}

	@Test
	void testSetImporte() {
		mov.setImporte(5);
		assertEquals(5, mov.getImporte());
	}

}
