package euler;

public class P016 {
	public static void main(String[] args) {

		long x = 1L;
		int n = 15;
		for (int i = 0; i < n; i++) {
			x *= 2;
		}
		//System.out.println(x);

		long sum = 0;
		while (x > 0) {
			sum = sum + x % 10;
			x = x / 10;
		}
		System.out.println(sum+"\n");

	}
}
