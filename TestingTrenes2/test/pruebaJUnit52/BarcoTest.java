package pruebaJUnit52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BarcoTest {


	@Test
	void testObtenerMarca() {
		Barco barco = new Barco("mar64", "c1", 13);
		assertEquals("mar64", barco.ObtenerMarca());
	}

	@Test
	void testObtenerEslora() {
		Barco barco = new Barco("mar64", "c1", 13);
		assertEquals(13, barco.ObtenerEslora());
	}

	@Test
	void testObtenerModelo() {
		Barco barco = new Barco("mar64", "c1", 13);
		String model = "c1";
		assertEquals("c1", model);   
	}

	@Test
	void testToString() {
		Barco barco = new Barco("mar64", "c1", 13);
		assertEquals("Marca: " + barco.marca + " Modelo: "+ barco.modelo + " Eslora: " + barco.eslora, barco.toString());
	}

	@Test
	void testCompareTo() {
		Barco barco = new Barco("mar64", "c1", 13);
		Barco barco1 = new Barco("mar", "c4", 15);//mas
		Barco barco2 = new Barco("mar64", "c1", 13);//misma
		Barco barco3 = new Barco("mar64", "c1", 10);//menor
		
		assertEquals(1, barco.compareTo(barco3));
		assertEquals(-1, barco.compareTo(barco1));
		assertEquals(0, barco.compareTo(barco2));
	}

}
