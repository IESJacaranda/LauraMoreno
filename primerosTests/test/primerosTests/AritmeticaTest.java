package primerosTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AritmeticaTest {
	Aritmetica aritmetica = new Aritmetica();
	@Test
	void testSuma() {
		Aritmetica aritmetica = new Aritmetica();//NO HARÍA FALTA. SE PUEDE INSTANCIAR ARITMETICA FUERA O EN CADA PRUEBA
		assertEquals(2, aritmetica.suma(1, 1));
	}

	@Test
	void testResta() {
		assertEquals(0, aritmetica.resta(1, 1));
	}

	@Test
	void testMultiplicacion() {
		assertEquals(12, aritmetica.multiplicacion(4, 3));
	}

	@Test
	void testDivision() {
		assertEquals(4, aritmetica.division(12, 3));
	}

	@Test
	void testGetUltimaResultado() {
		aritmetica.suma(2, 2);
		assertEquals(4, aritmetica.getUltimaResultado());
		
	}

}
