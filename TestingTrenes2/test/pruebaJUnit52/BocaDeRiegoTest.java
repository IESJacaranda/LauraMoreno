package pruebaJUnit52;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BocaDeRiegoTest {

	static Stream<Arguments>parametros(){
		BocaDeRiego b1 = new BocaDeRiego(2);
		return Stream.of(
				Arguments.of(b1, 1));
	}

	@MethodSource("parametros")
	@ParameterizedTest
	void testRiega(BocaDeRiego b, int resul) throws NoQuedaAguaException {
		b.riega();
		assertEquals(resul, b.getAguaDisponible());
	}

	@Test
	void testRiegaException() {
		BocaDeRiego b1 = new BocaDeRiego(0);
		try {
			b1.riega();
		} catch (NoQuedaAguaException e) {
			assertEquals("Ya no queda agua", e.getMessage());
		}
	}
	
	static Stream<Arguments>parametros2(){
		BocaDeRiego b1 = new BocaDeRiego(2);
		
		return Stream.of(
				Arguments.of(b1, true)
				);
	}

	@MethodSource("parametros2")
	@ParameterizedTest
	void testEstado(BocaDeRiego b, boolean resul) throws NoQuedaAguaException {
		b.riega();
		assertEquals(resul, b.estado());
	}
	
	@Test
	void testEstadoException() {
		BocaDeRiego b1 = new BocaDeRiego(0);
			assertEquals(false, b1.estado());
	}
	
	static Stream<Arguments>parametros3() throws NoQuedaAguaException{
		BocaDeRiego b1 = new BocaDeRiego(2);
		BocaDeRiego b2 = new BocaDeRiego(0);
		b1.riega();
		return Stream.of(
				Arguments.of(b1, "Abierta"),
				Arguments.of(b2, "Cerrada")
				);
	}


	@MethodSource("parametros3")
	@ParameterizedTest
	void testMuestraEstado(BocaDeRiego b, String resul) {
		assertEquals(resul,b.muestraEstado());
	}

}
