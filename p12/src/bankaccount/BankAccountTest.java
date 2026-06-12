package bankaccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BankAccountTest {

	BankAccount a;
	
	@BeforeEach
	public void setUp() {
		a = new BankAccount();
	}
	
	@Test
	void nAccount() {
		assertEquals(0, a.getBalance());
	}
	
	@Test
	void Account100() {
		a.deposit(100);
		assertEquals(100, a.getBalance());
	}
	
	@Test
	void Account80() {
		a.deposit(100);
		a.withdraw(20);
		assertEquals(80, a.getBalance());
	}
	
	@Test
	void AccountMinus() {
		a.withdraw(30);
		assertEquals(-30, a.getBalance());
	}
	
	@Test
	void AccountMore() {
		a.withdraw(30);
		a.deposit(50);
		a.deposit(10);
		a.withdraw(100);
		assertEquals(-70, a.getBalance());
	}

}
