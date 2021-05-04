package dominio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import org.junit.jupiter.api.Test;

import dominio.Movimiento;

class MovimientoTest {
	
	@Test
	void testMovimiento() {
		Movimiento m = new Movimiento();
		Date d = new Date();
		assertEquals(d,m.getFecha());
	}

	@Test
	void testGetImporte() {
		Movimiento m = new Movimiento();
		m.setImporte(20.0);
		assertEquals(20.0, m.getImporte());
	}


}
