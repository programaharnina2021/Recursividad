import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testCalculaFactorial() {
		assertEquals(new Factorial().calculaFactorial(5),120);
	}

}
