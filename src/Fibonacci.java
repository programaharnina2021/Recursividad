
public class Fibonacci {

	public int calculaTerminoFibonacci(int termino) {
		assert termino >= 0;
		int retornado = 0;
		// Caso base
		if (termino == 0 || termino == 1) {
			retornado = termino;
		} else {
			retornado = calculaTerminoFibonacci(termino - 2) + calculaTerminoFibonacci(termino - 1);
		}
		return retornado;
	}
}
