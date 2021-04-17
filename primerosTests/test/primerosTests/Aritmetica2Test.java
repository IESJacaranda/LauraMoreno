package primerosTests;

import static org.junit.jupiter.api.Assertions.*;//assertEquals...si no usamos el asterisco, sino que seleccionamos los 
//métodos que vamos a usar solo, entonces ahorramos memoria. 

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Aritmetica2Test {

	private static Aritmetica aritmetica;
	
	@BeforeAll
	public static void init() {
		aritmetica = new Aritmetica();
	}
	
	@Test
	void testSuma() {
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

}
