package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BoaTest {

	static Stream<Arguments>parametros(){
		Boa b1 = new Boa("pipo",3,"granola bars");
		Boa b2 = new Boa("pipo",3,"bananas");
		
		return Stream.of(
				Arguments.of(b1,true),
				Arguments.of(b2,false));
	}
	
	@ParameterizedTest
	@MethodSource("parametros")
	void testParamIsHealthy(Boa b, boolean tf) {
		assertEquals(tf, b.isHealthy());
	}
	
	static Stream<Arguments>parametros2(){
		Boa b1 = new Boa("pipo",3,"granola bars");
		Boa b2 = new Boa("pipo",21,"bananas");
		
		return Stream.of(
				Arguments.of(b1,true),
				Arguments.of(b2,false));
	}

	@ParameterizedTest
	@MethodSource("parametros2")
	void testFitsInCage(Boa b, boolean tf) {
		assertEquals(tf, b.fitsInCage(20));
	}

}
