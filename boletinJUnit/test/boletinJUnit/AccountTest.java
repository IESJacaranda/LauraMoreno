package boletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTest {
	Account account;
	
	@BeforeEach
	void init() {
		Account account = new Account("pepe",123, 20);
	}

	@Test
	void testDeposit() {//devuelve false si no se añade dinero. No recoge que sea 0
		assertTrue(account.deposit(30.00f));
		assertFalse(account.deposit(-1.00f));
	}

	@Test
	void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	void testAddInterest() {
		fail("Not yet implemented");
	}

	@Test
	void testGetBalance() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAccountNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
