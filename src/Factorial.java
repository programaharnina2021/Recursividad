
public class Factorial {

	public long calculaFactorial(int numero) {
		//El numero == 1
		if(numero==1) {
			return 1;
		}
		//El numero>1
		long calculaFactorial = calculaFactorial(numero-1);
		return numero*calculaFactorial;
	}
}
