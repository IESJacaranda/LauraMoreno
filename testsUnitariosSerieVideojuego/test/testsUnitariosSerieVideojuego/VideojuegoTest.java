package testsUnitariosSerieVideojuego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ejerciciosUnitarias.Videojuego;

class VideojuegoTest {
	
	@Test
	void testGetTitulo() {
		Videojuego videojuego = new Videojuego("testear", "entornosSL");
		assertEquals("testear", videojuego.getTitulo());
	}

	@Test
	void testSetTitulo() {
		Videojuego videojuego = new Videojuego();
		videojuego.setTitulo("testear");
		assertEquals("testear", videojuego.getTitulo());
	}

	@Test
	void testGetHorasEstimadas() {
		Videojuego videojuego = new Videojuego("testear", "entornorSL");
		assertEquals(100, videojuego.getHorasEstimadas());
	}

	@Test
	void testSetHorasEstimadas() {
		Videojuego videojuego = new Videojuego("testear", "entornorSL");
		videojuego.setHorasEstimadas(20);
		assertEquals(20, videojuego.getHorasEstimadas());
	}

	@Test
	void testGetGenero() {
		Videojuego videojuego = new Videojuego("testear", 30, "amor", "entornorSL");
		assertEquals("amor", videojuego.getGenero());
	}

	@Test
	void testSetGenero() {
		Videojuego videojuego = new Videojuego();
		videojuego.setGenero("amor");
		assertEquals("amor", videojuego.getGenero());
	}

	@Test
	void testGetcompania() {
		Videojuego videojuego = new Videojuego("testear", 30, "amor", "entornosSL");
		assertEquals("entornosSL", videojuego.getcompania());
	}

	@Test
	void testSetcompania() {
		Videojuego videojuego = new Videojuego();
		videojuego.setcompania("entornosSL");
		assertEquals("entornosSL", videojuego.getcompania());
	}

	@Test
	void testEntregarFalse() {
		Videojuego videojuego = new Videojuego();
		assertEquals(false, videojuego.isEntregado());
	}//assertFalse(videojuego.isEntregado()); --> OTRA OPCIÓN

	@Test
	void testEntregarTrue() {
		Videojuego videojuego = new Videojuego();
		videojuego.entregar();
		assertEquals(true, videojuego.isEntregado());
	}
	
	@Test
	void testDevolver() {
		Videojuego videojuego = new Videojuego();
		videojuego.devolver();
		assertEquals(false, videojuego.isEntregado());
	}

	@Test
	void testIsEntregadoTrue() {
		Videojuego videojuego = new Videojuego();
		videojuego.entregar();
		assertEquals(true, videojuego.isEntregado());
	}
	
	@Test
	void testIsEntregadoFalse() {
		Videojuego videojuego = new Videojuego();
		assertEquals(false, videojuego.isEntregado());
	}

	@Test
	void testCompareToMenor() {
		Videojuego videojuego = new Videojuego("testear", 20, "amor", "entornosSL");
		Videojuego videojuego1 = new Videojuego("testear", 30, "amor", "entornosSL");
		assertEquals(-1, videojuego.compareTo(videojuego1));
	}
	
	@Test
	void testCompareToMayor() {
		Videojuego videojuego = new Videojuego("testear", 40, "amor", "entornosSL");
		Videojuego videojuego1 = new Videojuego("testear", 30, "amor", "entornosSL");
		assertEquals(1, videojuego.compareTo(videojuego1));
	}
	
	@Test
	void testCompareToIgual() {
		Videojuego videojuego = new Videojuego("testear", 20, "amor", "entornosSL");
		Videojuego videojuego1 = new Videojuego("testear", 20, "amor", "entornosSL");
		assertEquals(0, videojuego.compareTo(videojuego1));
	}

	@Test
	void testToString() {
		Videojuego videojuego = new Videojuego("testear", 20, "amor", "entornosSL");
		String patron = "Informacion del videojuego: \n" +
	               "\tTitulo: "+"testear"+"\n" +
	               "\tHoras estimadas: "+20+"\n" +
	               "\tGenero: "+"amor"+"\n" +
	               "\tcompania: "+"entornosSL";
		assertEquals(patron, videojuego.toString());
	}

	@Test
	void testEqualsVideojuego() {
		Videojuego videojuego = new Videojuego("testear", "entornosSL");
		Videojuego videojuego1 = new Videojuego("testear", "entornosSL");
		assertTrue(videojuego.equals(videojuego1));
	}
	
	@Test
	void testEqualsVideojuegoTitulo() {
		Videojuego videojuego = new Videojuego("testear", "entornosSL");
		Videojuego videojuego1 = new Videojuego("testar", "entornosSL");
		assertFalse(videojuego.equals(videojuego1));
	}
	
	@Test
	void testEqualsVideojuegoEmpresa() {
		Videojuego videojuego = new Videojuego("testear","enrnosSL");
		Videojuego videojuego1 = new Videojuego("testar", "entornosSL");
		assertFalse(videojuego.equals(videojuego1));
	}

	@Test
	void testVideojuego() {
		Videojuego videojuego = new Videojuego();
		assertEquals("", videojuego.getTitulo());
		assertEquals("", videojuego.getcompania());
		assertEquals("", videojuego.getGenero());
		assertEquals(100, videojuego.getHorasEstimadas());
	}

	@Test
	void testVideojuegoStringString() {
		Videojuego videojuego = new Videojuego("testear", "entornosSL");
		assertEquals("testear", videojuego.getTitulo());
		assertEquals("entornosSL", videojuego.getcompania());
		assertEquals("", videojuego.getGenero());
		assertEquals(100, videojuego.getHorasEstimadas());
	}

	@Test
	void testVideojuegoStringIntStringString() {
		Videojuego videojuego = new Videojuego("testear", 20, "amor", "entornosSL");
		assertEquals("testear", videojuego.getTitulo());
		assertEquals("entornosSL", videojuego.getcompania());
		assertEquals("amor", videojuego.getGenero());
		assertEquals(20, videojuego.getHorasEstimadas());
	}

}
