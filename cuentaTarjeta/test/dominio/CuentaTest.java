package dominio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dominio.Cuenta;

class CuentaTest {
	
	Cuenta cuenta;
	
	@BeforeEach
	void init() {
		this.cuenta = new Cuenta("1234", "Joaquín");
	}

	@Test
	void testIngresarDouble() {
		double saldo = cuenta.getSaldo();
		try {
			cuenta.ingresar(25);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(saldo + 25, cuenta.getSaldo());
	}
	
	@Test
	void testIngresarDouble0() {
		double saldo = cuenta.getSaldo();
		try {
			cuenta.ingresar(25);
			assertEquals(saldo + 25, cuenta.getSaldo());
			cuenta.ingresar(0);
			fail("No lanza excepción al ingresar 0");
		} catch (Exception e) {
		}
		
		try {
			cuenta.ingresar(-1);
			fail("No lanza excepción al ingresar -1");
		}catch (Exception e) {
			String mensaje = e.getMessage();
			assertEquals("No se puede ingresar una cantidad negativa", mensaje);
		}
	}

	@Test
	void testRetirarDouble() {
		double saldo = cuenta.getSaldo();
		try {
			cuenta.retirar(-1);//Cantidad a retirar negativa
			fail("No lanza la excepción al retirar -1");
		}catch (Exception e) {
			String mensaje = e.getMessage();
			assertEquals("No se puede ingresar una cantidad negativa", mensaje);
		}
		
		try {
			cuenta.retirar(3);//Cantidad a retirar mayor que saldo
			fail("No lanza la excepción al retirar 3 con saldo 0");
			cuenta.ingresar(20);
			cuenta.retirar(10);
			assertEquals(saldo - 10, cuenta.getSaldo());//Saldo mayor que cantidad a retirar
			cuenta.retirar(10);
			assertEquals(saldo - 10, cuenta.getSaldo());//Saldo igual que cantidad a retirar
		}catch(Exception e) {
			String mensaje = e.getMessage();
			assertEquals("Saldo induficiente", mensaje);
		}
	}

	@Test
	void testIngresarStringDouble() {
		double saldo = cuenta.getSaldo();
		try {
			cuenta.ingresar("cosas", 0);
			fail("No lanza la excepción al ingresar 0");
			cuenta.ingresar("cosas2", -1);
			fail("No lanza la excepción al ingresar -1");
			cuenta.ingresar("cosas3", 10);
			assertEquals(saldo + 10, cuenta.getSaldo());
		}catch(Exception e) {
			String mensaje = e.getMessage();
			assertEquals("No se puede ingresar una cantidad negativa", mensaje);
		}
	}

	@Test
	void testRetirarStringDouble() {
		double saldo = cuenta.getSaldo();
		try {
			cuenta.retirar("cosas",0);
			fail("No lanza la excepción al ingresar 0");
		} catch (Exception e) {
			String mensaje = e.getMessage();
			assertEquals("No se puede retirar una cantidad negativa", mensaje);
		}
		
		try {
			cuenta.ingresar(20);
			cuenta.retirar("cosas", 30);
			fail("No entra en la excepción al retirar más del saldo");
		}catch(Exception e) {
			String mensaje = e.getMessage();
			assertEquals("Saldo insuficiente", mensaje);
		}
		
		try {
			cuenta.retirar("cosas", 10);
			assertEquals(saldo - 10, cuenta.getSaldo());
		} catch (Exception e) {
		}
		
	}


	@Test
	void testAddMovimiento() {
		Cuenta c = new Cuenta("123R" ,"Pepe");
		int numMovs = c.mMovimientos.size();
		Movimiento mov = new Movimiento();
		c.addMovimiento(mov);
		assertEquals(numMovs +1, c.mMovimientos.size());
	}

}
