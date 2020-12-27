package winterExercises;

public class E01MinMaxSum {

	public static void main(String[] args) {

		int[] array = new int[24];

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
			max = array[i] > max ? array[i] : max;
			min = array[i] < min ? array[i] : min;
			sum += array[i];
			System.out.print(array[i] + " ");

		}

		System.out.println("\nNajmanji uneseni broj je: " + min + "\nNajveći uneseni broj je: " + max
				+ "\nZbroj unesenih brojeva je: " + sum);

	}

}
