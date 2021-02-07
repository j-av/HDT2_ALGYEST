import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Testing.JunitTesting;

class RestaTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.resta(2, 1);
		assertEquals(9, output);
	}

}
