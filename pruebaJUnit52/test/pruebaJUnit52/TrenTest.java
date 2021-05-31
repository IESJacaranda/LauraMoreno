package pruebaJUnit52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrenTest {

	Tren tren;
	
	@BeforeEach
	void init() {
		tren = new Tren("locomotora", "responsable");
	}

	@Test//comprueba si incrementa el número de vagones y comprueba que no puede haber más de 5
	void testEnganchaVagon() {
		tren.enganchaVagon(5, 1, "jamones");
		assertEquals(1, tren.getNumVagones());
		tren.enganchaVagon(5, 1, "jamones");
		tren.enganchaVagon(5, 1, "jamones");
		tren.enganchaVagon(5, 1, "jamones");
		tren.enganchaVagon(5, 1, "jamones");
		assertFalse(tren.enganchaVagon(5, 1, "jamones"));
	}

	@Test
	void testDesenganchaVagonException() {
		try {
			tren.desenganchaVagon();
			fail("No entra en la excepción");
		}catch(Exception e) {
			String msg = e.getMessage();
			assertEquals("No hay vagones que desenganchar", msg);
		}
	}
	
	@Test
	void testDesenganchaVagon() {
		tren.enganchaVagon(5, 3, "oro");
		try {
			tren.desenganchaVagon();
		} catch (NotVagonException e) {
		}
		assertEquals(0, tren.getNumVagones());
	}

	@Test//comprueba que el numVagones de inicializa a 0
	void testGetNumVagones() {
		assertEquals(0, tren.getNumVagones());
	}

}
