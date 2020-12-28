package euler;

public class P012 {

	public static void main(String[] args) {

		int temp = 0;
		int count;

		for (int i = 1;; i++) {
			temp += i;
			count = 1;
			for (int j = 1; j < temp; j++) {
				if (temp % j == 0) {
					count++;
				}

			}
			if (count > 500) {
				break;
			}
		}
		System.out.println(temp);

	}

}
