package euler;

public class P007 {
	public static void main(String[] args) {

		boolean x;
		int z = 0;

		for (int i = 2;; i++) {
			x = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					x = true;
					break;
				}

			}
			if (!x) {
				z++;
			}
			if (z == 10001) {
				System.out.println(i);
				break;
			}
		}
	}
}
