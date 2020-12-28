package euler;

public class P005 {

	public static void main(String[] args) {

		boolean x = true;
		for (int i = 20;; i++) {
			for (int j = 2; j <= 20; j++) {
				x = i % j == 0;
				if (!x) {
					break;
				}
			}
			if (x) {
				System.out.println(i);
				break;
			}
		}

	}

}
