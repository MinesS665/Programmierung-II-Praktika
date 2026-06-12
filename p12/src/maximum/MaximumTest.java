package maximum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumTest {
	
	Maximum max;
	
	@BeforeEach
	public void setUp() {
		max = new Maximum();
	}

	@Test
	void findMax() {

		int res = max.findMax(2, 8, 5);
		assertEquals(8, res);
		
	}
	
	@Test
	void findMax2() {
		int res = max.findMax(-100, -4, -12);
		assertEquals(-4, res);
	}
	
	
	@Test
	void findMax3() {
		int res = max.findMax(3, 2, 1);
		assertEquals(3, res);
	}
	@Test
	void findMax31() {
		int res = max.findMax(1, 2, 3);
		assertEquals(3, res);
	}
	
	@Test
	void findMax4() {
		int res = max.findMax(-200, -200, -200);
		assertEquals(-200, res);
	}
	
	@Test
	void findMax5() {
		int res = max.findMax(-10, -8, -12);
		assertEquals(-8, res);
	}
	
	@Test
	void findMax6() {
		int res = max.findMax(7, 7, 7);
		assertEquals(7, res);
	}

}
