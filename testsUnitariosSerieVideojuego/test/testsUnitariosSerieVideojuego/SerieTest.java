package testsUnitariosSerieVideojuego;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ejerciciosUnitarias.Serie;

class SerieTest {
	
	//SETTERS Y GETTERS
	@Test
	void testGetTitulo() {
		
		fail("Not yet implemented");
	}

	@Test
	void testSetTitulo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetnumeroTemporadas() {
		fail("Not yet implemented");
	}

	@Test
	void testSetnumeroTemporadas() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGenero() {
		fail("Not yet implemented");
	}

	@Test
	void testSetGenero() {
		fail("Not yet implemented");
	}

	@Test
	void testGetcreador() {
		fail("Not yet implemented");
	}

	@Test
	void testSetcreador() {
		fail("Not yet implemented");
	}

	//MÉTODOS PROPIOS
	@Test
	void testEntregar() {
		Serie serie = new Serie();
		
		fail("Not yet implemented");
	}

	@Test
	void testDevolver() {
		Serie serie = new Serie();
		//assertFalse(serie.devolver());
	}

	@Test
	void testIsEntregado() {
		Serie serie = new Serie();
		assertEquals(false, serie.isEntregado());
	}

	//MÉTODOS
	@Test//CREAR OTRO PARA COMPROBAR QUE SEA MAYOR
	void testCompareTo() {
		Serie serie = new Serie("caca",5,"amor","Mr. váter");
		Serie serie2 = new Serie("pipi", 4, "terror","Ms. váter");
		assertEquals(1, serie.compareTo(serie2));
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsSerie() {
		fail("Not yet implemented");
	}

	//CONSTRUCTORES
	@Test
	void testSerie() {
		fail("Not yet implemented");
	}

	@Test
	void testSerieStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testSerieStringIntStringString() {
		fail("Not yet implemented");
	}

}
