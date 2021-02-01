package euler;

public class P010 {

	public static void main(String[] args) {

		boolean x;
		long sum = 0L;

		for (int i = 2;; i++) {
			x = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					x = true;
					break;
				}

			}
			if (!x) {
				sum += i;
			}
			if (i == 2000000) {
				System.out.println(sum);
				break;
			}
		}
	}
}