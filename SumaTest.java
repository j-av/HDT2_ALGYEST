import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Testing.JunitTesting;

class SumaTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.suma(1, 2);
		assertEquals(7, output);
	}

}
