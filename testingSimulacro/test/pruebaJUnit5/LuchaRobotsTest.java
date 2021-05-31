package pruebaJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LuchaRobotsTest {
	
	LuchaRobots luchaRobot;
	
	@BeforeEach
	void init() {
		luchaRobot = new LuchaRobots("Robot Arena", "Robotronic");
	}

	@Test
	void testLuchaRobots() {//ya creo la luchaRobots en el init
		assertEquals(0, luchaRobot.getNumLuchadores());
	}

	@Test
	void testAñadeRobot() {
		luchaRobot.añadeRobot("2", 10, 10);
		assertEquals(1, luchaRobot.getNumLuchadores());
	}
	
	@Test
	void testAñadeRobotSolo2() {//No añade 3, se queda en 2
		luchaRobot.añadeRobot("2", 10, 10);
		luchaRobot.añadeRobot("2", 10, 10);
		luchaRobot.añadeRobot("2", 10, 10);
		assertEquals(2, luchaRobot.getNumLuchadores());
	}

	@Test
	void testSetArbitro() throws NotAllowedChangeException {
		luchaRobot.setEstadio("RoboFight!");
		assertEquals("RoboFight!", luchaRobot.getEstadio());
	}
	
	@Test
	void testSetArbitroException() {
		luchaRobot.añadeRobot("2", 2, 3);
		try {
			luchaRobot.setEstadio("RoboFight!");
			fail("No entra en la excepción");
		} catch (NotAllowedChangeException e) {
			String msg = e.getMessage();
			assertEquals("Ya se han añadido luchadores", msg);
		}
	}

}
