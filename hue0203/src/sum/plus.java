package sum;

public class plus {

	public static void main(String[] args) {
		System.out.println("Ergebnis R: " + summeR(6));
		System.out.println("Ergebnis I: " + summeI(6));
	}

	static double summeR(double number) {
		if (number <= 0) {
			return 0;
		}
		return number + summeR(number - 1);
	}

	static double summeI(double number) {
		double result = 0;

		while (number > 0) {
			result += number;
			number -= 1;
		}
		return result;
	}
}