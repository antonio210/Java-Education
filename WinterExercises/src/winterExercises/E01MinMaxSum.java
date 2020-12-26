package winterExercises;

import java.util.Scanner;

public class E01MinMaxSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] array = new int[24];
		
		int max =-9999999; //minimum int
		int min = 9999999; //maximum int
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			max=array[i]>max ? array[i]:max;
			min=array[i]<min ? array[i]:min;
			sum+=array[i];
				
			}
		input.close();
		System.out.println("Najmanji uneseni broj je: "+min);
		System.out.println("Najveći uneseni broj je: "+max);
		System.out.println("Zbroj unesenih brojeva je: "+sum);
		
		}

}

