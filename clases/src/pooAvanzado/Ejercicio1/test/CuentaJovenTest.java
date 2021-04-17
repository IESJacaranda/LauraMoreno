package pooAvanzado.Ejercicio1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pooAvanzado.Ejercicio1.CuentaJoven;
import pooAvanzado.Ejercicio1.Titular;
import pooAvanzado.Ejercicio1.exception.TitularNoValidoException;

class CuentaJovenTest {

	private static CuentaJoven cuentaJoven;
	private static Titular titularJoven;
	
	@BeforeAll
	public static void init() {
		titularJoven = new Titular("Antonio", 23);
		try {
			cuentaJoven = new CuentaJoven(titularJoven, 220);
		} catch (TitularNoValidoException e) {
			assert(false);
		}
	}
	
//	@Test
//	void testRetirarDinero() {
//		assert(cuentaJoven.retirarDinero(200));
//	}

	@Test
	void testEsTitutlarValido() {
		assertEquals(true, cuentaJoven.esTitutlarValido());//también se podría poner assert(cuentaJoven.esTitularValido());
	}

	@Test
	void testMostrar() {
		assertEquals("Cuenta joven 0.25", cuentaJoven.mostrar());
	}

}
