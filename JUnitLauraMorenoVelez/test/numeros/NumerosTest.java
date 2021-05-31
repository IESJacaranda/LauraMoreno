package numeros;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;

class NumerosTest {

	
	static Stream<Arguments> datos() {
		Numeros n1 = new Numeros(11,7);
		Numeros n2 = new Numeros(5,10);
		Numeros n3 = new Numeros(12,15);
	    return Stream.of(
	            Arguments.of(n1,true),
	            Arguments.of(n2,false),
	            Arguments.of(n3,false));
	}
	
	@ParameterizedTest
	@MethodSource("datos")
	void testPrimos(Numeros n, boolean resul) {
		assertEquals(resul, n.primos());
	}

	
	static Stream<Arguments> datos1() {
		Numeros n1 = new Numeros(7,11);
		Numeros n2 = new Numeros(5,10);
		Numeros n3 = new Numeros(12,15);
		Numeros n4 = new Numeros(12,15);
	    return Stream.of(
	            Arguments.of(n1,7,15,true),
	            Arguments.of(n2,6,11,false),
	            Arguments.of(n3,11,14,false),
	            Arguments.of(n4,12,15,false));
	}
	
	
	@ParameterizedTest
	@MethodSource("datos1")//FALLA PORQUE NO DEBERÍA ACEPTAR BORDES
	void testIntervaloAbierto(Numeros n, int x, int y, boolean resul) {
		assertEquals(resul, n.intervaloAbierto(x, y));
	}
	
	static Stream<Arguments> datos2() {
		Numeros n1 = new Numeros(7,11);
		Numeros n2 = new Numeros(5,10);
		Numeros n3 = new Numeros(9,15);
		Numeros n4 = new Numeros(9,14);
	    return Stream.of(
	            Arguments.of(n1,7,11,true),
	            Arguments.of(n2,5,11,true),
	            Arguments.of(n3,11,14,false),
	            Arguments.of(n4,11,14,false));
	}

	@ParameterizedTest
	@MethodSource("datos2")//FALLA PORQUE NO DEBERÍA SER <= --> FALSE YA QUE LOS BORDES ESTAN INCLUÍDOS
	void testIntervaloCerrado(Numeros n, int x, int y, boolean resul) {
		assertEquals(resul, n.intervaloCerrado(x, y));
	}
	
	static Stream<Arguments> datos5() {
		Numeros n1 = new Numeros(7,11);
		
	    return Stream.of(
	            Arguments.of(n1, 18));
	}


	@ParameterizedTest
	@MethodSource("datos5")
	void testSuma(Numeros n, int resul) {
		assertEquals(resul, n.suma());
		
	}

}
