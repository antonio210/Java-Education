package euler;

public class P003 {

	public static void main(String[] args) {

		long num = 600851475143L;
		long max = 0L;
		int calc =0;
		

		for (int j = 2; j < (int)num / 2; j++) {
			if (num % j == 0) {
				max = max < j ? j : max;
				calc= calc==0 ? j:calc*j;
				if (calc==num) {
					System.out.println(max);
				}
				
			}

		}

	}
}
