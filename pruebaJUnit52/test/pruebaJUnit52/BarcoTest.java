package pruebaJUnit52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BarcoTest {
	Barco barco;

	@BeforeEach
	void init() {
		barco = new Barco("marca", "modelo", 23);
	}

	@Test
	void testObtenerMarca() {
		assertEquals("marca", barco.ObtenerMarca());
	}

	@Test
	void testObtenerEslora() {
		assertEquals(23, barco.ObtenerEslora());
	}

	@Test
	void testObtenerModelo() {
		assertEquals(barco.modelo, barco.ObtenerModelo());
	}

	@Test
	void testToString() {
		assertEquals("Marca: " + barco.ObtenerMarca() + " Modelo: "+ barco.ObtenerModelo() +
				" Eslora: " + barco.ObtenerEslora(), barco.toString());
	}

	@Test
	void testCompareTo() {
		Barco b1 = new Barco("", "", 23);
		Barco b2 = new Barco("","", 10);
		Barco b3 = new Barco("", "", 50);
		
		assertEquals(1, barco.compareTo(b2));
		assertEquals(0, barco.compareTo(b1));
		assertEquals(-1, barco.compareTo(b3));
		
	}

}
