package winterExercises;

import java.util.Scanner;

public class E03PrimeNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number:");
		int a = input.nextInt();
		System.out.println("Enter second number:");
		int b = input.nextInt();
		input.close();

		int start = a < b ? a : b;
		int end = a > b ? a : b;
		
		boolean x;

		for (int i = start; i <= end; i++) {
			x=false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					x= true;
					break;
				}
				
			}
			if(!x) {
			System.out.println(i);
			}
		}
	}

}
