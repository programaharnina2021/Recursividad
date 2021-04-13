import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MayorTest {

	@Test
	void testDescubreMayor() {
		int[] numeros = { 115, 34, 434, 123, 23, 54, 56, 9991 };
		Mayor instancia=new Mayor();
		assertEquals(9991, instancia.descubreMayor(numeros,numeros.length-1));

	}

}
