package euler;

public class P014 {
	public static void main(String[] args) {
		int cap = 1000000, count, max = 0, maxn = 0;
		long temp = 0L;
		for (int i = cap / 2; i <= cap; i++) {
			temp = i;
			count = 0;

			while (temp > 1) {
				if (temp % 2 == 0) {
					temp = temp / 2;

				} else {
					temp = 3 * temp + 1;
				}

				count++;

			}


			maxn = count > max ? i : maxn;
			max = count > max ? count : max;

		}
		System.out.println(maxn);
	}
}
