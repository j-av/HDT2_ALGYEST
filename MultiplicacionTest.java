import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Testing.JunitTesting;

class MultiplicacionTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.multiplicacion(8, 5);
		assertEquals(60, output);
	}

}
