package euler;

public class P009 {

	public static void main(String[] args) {

		int c;

		for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				c = 1000 - a - b;
				if (a * a + b * b == c * c) {
					System.out.println(a * b * c);
				}

			}
		}

	}

}
