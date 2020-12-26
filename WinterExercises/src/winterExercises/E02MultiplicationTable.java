package winterExercises;

public class E02MultiplicationTable {
	public static void main(String[] args) {

		System.out.format("   x |");
		for (int i = 1; i <= 15; i++) {
			System.out.format("%4d", i);
		}
		System.out.println("\n-----|------------------------------------------------------------");

		for (int i = 1; i <= 15; i++) {

			System.out.format("%4d |", i);
			for (int j = 1; j <= 15; j++) {
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}

	}
}
