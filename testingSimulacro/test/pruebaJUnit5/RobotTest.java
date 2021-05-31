package pruebaJUnit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotTest {
	Robot robot;
	
	@BeforeEach
	void init() {
		robot = new Robot("2", 10, 10);
	}

	@Test
	void testToString() {
		assertEquals("ID: " + robot.getID() + " Porcentaje de vida: " + robot.getVida(), robot.toString());
	}

	@Test
	void testCompareTo() {
		Robot ro = new Robot("1",9,9);
		assertEquals(robot.getVida()-ro.getVida(), robot.compareTo(ro));
	}

	@Test
	void testSetFuerza() {
		assertEquals(10, robot.getFuerza());
	}

}
