
public class Sumatorio {
	//indice es como si fuera la i del for
 public long sumarElementos(int vector[],int indice) {
	 if(indice==0) {
		 return vector[0];
	 }
	 return vector[indice]+sumarElementos(vector, indice-1);
 }
}
