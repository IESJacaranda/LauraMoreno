package pruebaJUnit52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrenTest {
	Tren tren;
	
	@BeforeEach
	void init() {
		tren = new Tren("we12", "Pepito");
	}
	
	@Test
	void testEnganchaVagon() {//incrementa el número de vagones
		int aux = tren.getNumVagones();
		tren.enganchaVagon(5, 1, "tomates");
		assertEquals(aux+1, tren.getNumVagones());
	}
	
	@Test
	void testEnganchaVagonSolo5() {//solo se pueden enganchar 5 vagones
		int aux = tren.getNumVagones();
		tren.enganchaVagon(5, 1, "tomates");
		tren.enganchaVagon(5, 1, "tomates");
		tren.enganchaVagon(5, 1, "tomates");
		tren.enganchaVagon(5, 1, "tomates");
		tren.enganchaVagon(5, 1, "tomates");
		tren.enganchaVagon(5, 1, "tomates");
		assertFalse(tren.getNumVagones() == aux+6);
		assertEquals(aux+5, tren.getNumVagones());
	}

	@Test
	void testDesenganchaVagon() {
		int aux = tren.getNumVagones();
		tren.enganchaVagon(5, 1, "tomates");
		try {
			tren.desenganchaVagon();
		} catch (NotVagonException e) {
		}
		assertEquals(aux, tren.getNumVagones());
	}
	
	@Test
	void testDesenganchaVagonException() {
		try {
			tren.desenganchaVagon();
			fail("No entra en la excepción");
		} catch (NotVagonException e) {
			assertEquals("No hay vagones que desenganchar", e.getMessage());
			
		}
	}

	@Test
	void testGetNumVagones() {
		
		assertEquals(0, tren.getNumVagones());
	}

}
