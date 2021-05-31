package cuentas;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
class CuentaTest {
	Cuenta cuenta;
	
	@BeforeEach
	void init() {
		cuenta = new Cuenta("1", "yo");
	}
	

	@Test
	void testIngresar() throws IngresoNegativoException {
		cuenta.ingresar("Jamón para aprobar entorno", 5);
		assertEquals(5, cuenta.getSaldo());
		
	}
	
	@Test
	void testIngresarException() {
		try {
			cuenta.ingresar("Jamón para aprobar entorno", -1);
			fail("Lanza la excepcion");
		} catch (IngresoNegativoException e) {
			
			
		}
	}

	@Test
	void testRetirar() throws IngresoNegativoException, SaldoInsuficienteException {
		Cuenta cuenta2 = new Cuenta("2", "tu");
		Movimiento aux = new Movimiento();
		aux.setImporte(50);
		cuenta2.addMovimiento(aux);
		
		double saldoInicial = cuenta2.getSaldo();
		
		cuenta2.retirar("Comer", 5);
		cuenta2.getSaldo();
		assertEquals(saldoInicial-5,cuenta2.getSaldo());
		
	}
	
	@Test
	void testRetirarExceptionIngresoNegativo() {
		try {
			cuenta.retirar("prueba", -1);
		} catch (IngresoNegativoException e) {
			String mensaje = e.getMessage();
			assertEquals("No se puede retirar una cantidad negativa", mensaje);
		} catch (SaldoInsuficienteException e) {
			
		}
	}
	
	@Test
	void testRetirarExceptionSaldoInsuficiente() {
		try {
			cuenta.retirar("prueba", 3);
		} catch (IngresoNegativoException e) {
			
		} catch (SaldoInsuficienteException e) {
			String mensaje = e.getMessage();
			assertEquals("Saldo insuficiente", mensaje);
		}
	}

	@Test
	void testAddMovimiento() {
		Movimiento m = new Movimiento();
		int aux = cuenta.mMovimientos.size();
		cuenta.mMovimientos.add(m);
		assertEquals(aux+1, cuenta.mMovimientos.size());
		
	}

}
