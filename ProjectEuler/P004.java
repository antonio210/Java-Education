package euler;

public class P004 {

	public static void main(String[] args) {

		int num, temp, s, rem,max=0, x=0,y=0;

		for (int i = 999; i > 800; i--) {
			for (int j = 999; j > 800; j--) {
				num=i * j;
				temp = num;
				for (s = 0; num > 0; num /= 10) {
					rem = num % 10;
					s = (s * 10) + rem;
				}
				if (s == temp) {
					
					x=temp>max ? i:x;
					y=temp>max ? j:y;
					max=temp>max ? temp:max;

					
				}
		}
		
	}
		System.out.println(max + " is a largest palindrome number that it product of two 3-digit numbers ("+x+"x"+y+")");
	}
}
