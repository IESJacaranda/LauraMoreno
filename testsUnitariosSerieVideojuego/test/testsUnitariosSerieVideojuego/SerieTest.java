package testsUnitariosSerieVideojuego;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ejerciciosUnitarias.Serie;

class SerieTest {
	
	//SETTERS Y GETTERS
	@Test
	void testGetTitulo() {
		Serie serie = new Serie("caca", "Mr. váter");
		assertEquals(serie.getTitulo(), "caca");
	}

	@Test
	void testSetTitulo() {
		Serie serie = new Serie();
		serie.setTitulo("caca");
		assertEquals(serie.getTitulo(), "caca");
	}

	@Test
	void testGetnumeroTemporadas() {
		Serie serie = new Serie("caca", "Mr. váter");
		assertEquals(serie.getnumeroTemporadas(), 3);
		Serie serie1 = new Serie("caca",5,"amor","Mr. váter");
		assertEquals(serie1.getnumeroTemporadas(), 5);
	}

	@Test
	void testSetnumeroTemporadas() {
		Serie serie = new Serie();
		serie.setnumeroTemporadas(6);
		assertEquals(serie.getnumeroTemporadas(), 6);
	}

	@Test
	void testGetGenero() {
		Serie serie = new Serie("caca",5,"amor","Mr. váter");
		assertEquals(serie.getGenero(), "amor");
	}

	@Test
	void testSetGenero() {
		Serie serie = new Serie();
		serie.setGenero("amor");
		assertEquals(serie.getGenero(), "amor");
	}

	@Test
	void testGetcreador() {
		Serie serie = new Serie("caca", "Mr. váter");
		assertEquals(serie.getcreador(), "Mr. váter");
	}

	@Test
	void testSetcreador() {
		Serie serie = new Serie();
		serie.setcreador("Mr. váter");
		assertEquals(serie.getcreador(), "Mr. váter");
	}

	//MÉTODOS PROPIOS
	@Test
	void testEntregar() {
		Serie serie = new Serie();
		boolean a = true;
		serie.entregar();
		assertEquals(a, serie.isEntregado());
	}

	@Test
	void testDevolver() {
		Serie serie = new Serie();
		boolean a = false;
		serie.devolver();
		assertEquals(a, serie.isEntregado());
	}

	@Test
	void testIsEntregado() {
		Serie serie = new Serie();
		assertEquals(false, serie.isEntregado());
		serie.entregar();
		assertEquals(true, serie.isEntregado());
	}

	//MÉTODOS
	@Test//CREAR OTRO PARA COMPROBAR QUE SEA MAYOR
	void testCompareTo() {
		Serie serie = new Serie("caca",2,"amor","Mr. váter");
		Serie serieBase = new Serie("caca",3,"amor","Mr. váter");
		if(serieBase.getnumeroTemporadas()>serie.getnumeroTemporadas()) {
			assertEquals(1, serieBase.compareTo(serie));
		}
	}

	@Test
	void testCompareToEquals() {
		Serie serieBase = new Serie("caca",3,"amor","Mr. váter");
		Serie serie2 = new Serie("caca",3,"amor","Mr. váter");
		if(serieBase.getnumeroTemporadas()==serie2.getnumeroTemporadas()) {
			assertEquals(0, serieBase.compareTo(serie2));
		}
	}

	@Test
	void testCompareToMenor() {
		Serie serieBase = new Serie("caca",3,"amor","Mr. váter");
		Serie serie2 = new Serie("caca",5,"amor","Mr. váter");
		if(serieBase.getnumeroTemporadas()<serie2.getnumeroTemporadas()) {
			assertEquals(-1, serieBase.compareTo(serie2));
		}
	}
	
	
	@Test
	void testToString() {
		Serie serie = new Serie("caca",5,"amor","Mr. váter");
		String patron = "Informacion de la Serie: \n" + 
			"\tTitulo: caca\n" +
			"\tNumero de temporadas: 5\n" +
			"\tGenero: amor\n" +
			"\tCreador: Mr. váter";
		
		assertEquals(serie.toString(),patron);
	}

	@Test
	void testEqualsSerie() {
		Serie serie = new Serie("caca", "Mr. váter");//TITULO, CREADOR
		Serie serieBase = new Serie("caca","Mr. váter");
		assertTrue(serie.equals(serieBase));
		
	}

	@Test
	void testEqualsSerieTitulo() {
		Serie serie = new Serie("caca", "Mr. váter");//TITULO, CREADOR
		Serie serieBase = new Serie("cca","Mr. váter");
		assertFalse(serie.equals(serieBase));
		
	}
	
	@Test
	void testEqualsSerieFalseCreador() {
		Serie serie = new Serie("caca", "Mr. vter");//TITULO, CREADOR
		Serie serieBase = new Serie("caca","Mr. váter");
		assertFalse(serie.equals(serieBase));
		
	}
	
	//CONSTRUCTORES
	@Test
	void testSerie() {
		Serie serie = new Serie();
		assertEquals(serie.getnumeroTemporadas(), 3);
		assertEquals(serie.getGenero(), "");
		assertEquals(serie.getcreador(), "");
		assertEquals(serie.getTitulo(), "");
	}

	@Test
	void testSerieStringString() {
		Serie serie = new Serie("caca", "Mr. váter");
		assertEquals(serie.getTitulo(), "caca");
		assertEquals(serie.getcreador(), "Mr. váter");
	}

	@Test
	void testSerieStringIntStringString() {
		Serie serie = new Serie("caca",5,"amor","Mr. váter");
		assertEquals(serie.getTitulo(), "caca");
		assertEquals(serie.getnumeroTemporadas(), 5);
		assertEquals(serie.getGenero(), "amor");
		assertEquals(serie.getcreador(), "Mr. váter");
	}

}
