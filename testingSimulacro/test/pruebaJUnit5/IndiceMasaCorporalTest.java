package pruebaJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


class IndiceMasaCorporalTest {
	
	static Stream<Arguments>parametros(){
		return Stream.of(//también se le pueden pasar los objetos creándolos aquí antes
				Arguments.of(50,150, "Muy bien"),
				Arguments.of(30,160,"Tienes que engordar"),
				Arguments.of(80,120, "Sobrepeso"));
			
	}

	@MethodSource("parametros")
	@ParameterizedTest
	void testDiagnostico(float peso, float altura, String resul) {
		IndiceMasaCorporal i1 = new IndiceMasaCorporal(peso, altura);
		try {
			assertEquals(resul, i1.diagnostico());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static Stream<Arguments>parametros2(){
		return Stream.of(Arguments.of(-1,-2, "No pueden ser negativos!"),
						Arguments.of(-1,4,"No pueden ser negativos!"),
						Arguments.of(60,-3, "No pueden ser negativos!"));
	}
	
	@MethodSource("parametros2")
	@ParameterizedTest
	void testDiagnosticoException(float peso, float altura, String resul) {
		IndiceMasaCorporal i1 = new IndiceMasaCorporal(peso, altura);
		try {
			i1.diagnostico();
			fail("No entra en la excepción");
		} catch (Exception e) {
			String msg = e.getMessage();
			assertEquals(msg, resul);
		}
	}

}
