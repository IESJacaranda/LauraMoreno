package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FridgeTest {

	static Stream<Arguments>parametros(){
		return Stream.of(
				Arguments.of("acedías", true),
				Arguments.of("manzana", false));
	}
	
	@MethodSource("parametros")
	@ParameterizedTest
	void testParamPut(String comida, boolean tf) {
		Fridge fridge = new Fridge();
		fridge.put("manzana");
		assertEquals(tf, fridge.put(comida));
	}
	
	
	

	static Stream<Arguments>parametros2(){
		return Stream.of(
				Arguments.of("acedías", false),
				Arguments.of("manzana", true));
	}
	
	@MethodSource("parametros2")
	@ParameterizedTest
	void testParamContains(String comida, boolean tf) {
		Fridge fridge = new Fridge();
		fridge.put("manzana");
		assertEquals(tf, fridge.contains(comida));
	}

	
	
	
	static Stream<Arguments>parametros3(){
		return Stream.of(
				Arguments.of(false, "acedías"),
				Arguments.of(false, "manzana"),
				Arguments.of(true, "judías"));
	}
	
	@MethodSource("parametros3")
	@ParameterizedTest
	void testParamTake(boolean tf, String comida) {
		Fridge fridge = new Fridge();
		fridge.put("acedías");
		fridge.put("manzana");
		try {
			fridge.take(comida);
			assertEquals(tf,fridge.contains(comida));
		} catch (NoSuchItemException e) {
		}
	}
	
	@Test//LAS EXCEPCIONES NO SE PARAMETRIZAN
	void testTake() {
		Fridge fridge = new Fridge();
		try {
			fridge.take("patata");
			fail("No entra en la excepción");
		} catch (NoSuchItemException e) {
			String msg = e.getMessage();
			assertEquals("patata" + " not found in the fridge", msg);
		}
	}
	

}
