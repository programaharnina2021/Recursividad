import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumatorioTest {

	@Test
	void testSumarElmentos() {
		int vector[]= {5,10,15,20,25,30};//suma 105
		long resultado=105;
		assertEquals(resultado,new Sumatorio().sumarElementos(vector,vector.length-1));
	}

}
