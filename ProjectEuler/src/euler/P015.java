package euler;

public class P015 {

	public static void main(String[] args) {

		int size = 20;

		long[][] grid = new long[size + 1][size + 1];

		for (int i = 0; i < size + 1; i++) {
			grid[0][i] = 1;
			grid[i][0] = 1;
		}

		for (int y = 1; y < size + 1; y++) { // row
			for (int x = 1; x < size + 1; x++) { // column
				grid[y][x] = grid[y][x - 1] + grid[y - 1][x];

			}

		}

		System.out.println(grid[size][size]);

	}

}
