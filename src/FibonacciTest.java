import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void testCalculaTerminoFibonacci() {
		int termino[]= {5,9,15};
		int resultado[]= {5,34,610};
		Fibonacci instancia=new Fibonacci();
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(i);
			assertEquals(resultado[i], instancia.calculaTerminoFibonacci(termino[i]));
		}
	}

}
