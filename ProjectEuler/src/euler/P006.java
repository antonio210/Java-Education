package euler;

public class P006 {
	public static void main(String[] args) {

		int sum1 = 0, sum2 = 0, res;

		for (int i = 1; i <= 100; i++) {
			sum1 += i;
			sum2 += (i * i);
		}
		res = (sum1 * sum1) - sum2;
		System.out.println(res);
	}
}
