package pot;

public class hoch {

	public static void main(String[] args) {
		System.out.println("Ergebnis: " + potenz(5, 2));
	}

	public static double potenz(double zahl, int pot) {
		if (pot == 1) {
			return zahl;
		} else {
			return zahl * potenz(zahl, pot - 1);
		}
	}
}