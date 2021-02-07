import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Testing.JunitTesting;

class DivisionTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.division(50, 2);
		assertEquals(100, output);
	}

}
