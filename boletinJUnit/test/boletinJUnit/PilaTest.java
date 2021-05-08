package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

	Pila pila;
	Pila p;
	Pila p1;
	
	@BeforeEach
	void init() {
		pila = new Pila();
		p = new Pila();
		p1 = new Pila();
	}
	
	@Test
	void testPush() {
		pila.push(3);
		p.push(0);
		p1.push(40);
		assertEquals(3, pila.top());
		assertEquals(null, p.top());
		assertEquals(null, p1.top());
	}

	@Test
	void testPop() {
		assertEquals(null, p.pop());
		pila.push(5);
		assertEquals(5, pila.pop());
	}

	@Test
	void testIsEmpty() {
		assertEquals(true, p.isEmpty());
		pila.push(6);
		assertEquals(false, pila.isEmpty());
	}

	@Test
	void testTop() {
		pila.push(3);
		p.push(0);
		assertEquals(3, pila.top());
		assertEquals(null, p.top());
	}

}
