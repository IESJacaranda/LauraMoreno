package cuentaTarjetaTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dominio.Cuenta;
import dominio.Movimiento;

class DebitoTest {
	
	private Cuenta cuenta;
	private double x;
	private String datos;
	private Movimiento mov;
	
	@BeforeEach
	private void init() {
		Cuenta cuenta = new Cuenta("123", "Lola");
		double x = 10.0;
		String datos = "datos datos datos";
		Movimiento mov = new Movimiento();
	}

	@Test
	void testRetirar() {
		
	}

	@Test
	void testIngresar() {
		fail("Not yet implemented");
	}

	@Test
	void testPagoEnEstablecimiento() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testDebito() {
	}

}
