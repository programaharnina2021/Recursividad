
public class Mayor {

	public int descubreMayor(int[] vector, int indice) {
		assert vector != null;
		assert indice >= 0 && indice < vector.length;
		if (indice > 0) {
			int descubreMayor = descubreMayor(vector, indice - 1);
			if (vector[indice] > descubreMayor) {
				return vector[indice];
			} else {
				return descubreMayor;
			}
		} else {
			return vector[indice];
		}
	}
}
