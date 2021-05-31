package pruebaJUnit52;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BocaDeRiegoTest {
	BocaDeRiego boca; 
	
	@BeforeEach
	void init() {
		boca = new BocaDeRiego(1);
	}
	
	static Stream<Arguments>parametros(){
		return Stream.of(
				Arguments.of(1));
	}
	
	@MethodSource("parametros")
	@ParameterizedTest
	void testRiega(int agua) {
		try {
			boca.riega();
		} catch (NoQuedaAguaException e) {
		}
		assertEquals(0, boca.getAguaDisponible());
	}
	
	@Test
	void testRiegaException() {
		BocaDeRiego boca2 = new BocaDeRiego(0);
		try {
			boca2.riega();
			fail("No entra en la excepción");
		} catch (NoQuedaAguaException e) {
			String msg = e.getMessage();
			assertEquals("Ya no queda agua", msg);
		}
		
	}

	static Stream<Arguments>parametros2(){
		return Stream.of(
				Arguments.of(1));
	}
	
	@MethodSource("parametros2")
	@ParameterizedTest
	void testEstado(int agua) {
		try {
			boca.riega();
		} catch (NoQuedaAguaException e) {
		}
		assertTrue(boca.estado());
		
		BocaDeRiego boca2 = new BocaDeRiego(agua);
		assertFalse(boca2.estado());
	}
	
	static Stream<Arguments>parametros3() throws NoQuedaAguaException{
		BocaDeRiego boca2 = new BocaDeRiego(1);
		boca2.riega();
		BocaDeRiego boca3 = new BocaDeRiego(0);
		
		return Stream.of(
				Arguments.of(boca2,"Abierta"),
				Arguments.of(boca3,"Cerrada"));
	}	

	@MethodSource("parametros3")
	@ParameterizedTest
	void testMuestraEstado(BocaDeRiego boca, String result) {
		assertEquals(result, boca.muestraEstado());
	}

}
