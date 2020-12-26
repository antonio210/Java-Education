package winterExercises;

public class E02MultiplicationArray {

	public static void main(String[] args) {

		int[][] mtable = new int[16][16];

		for (int i = 0; i <= mtable.length - 1; i++) {
			for (int j = 0; j <= mtable[i].length - 1; j++) {
				mtable[i][j] = (i==0 & j==0)? 0:((i==0 ? 1:i)*(j==0 ? 1:j));
				if (mtable[i][j] < 10) {
					System.out.print(("  " + mtable[i][j] + (j!=0?" ":" | ")));
				} else if (mtable[i][j] < 100) {
					System.out.print(" " + mtable[i][j] + (j!=0?" ":" | "));
				} else {
					System.out.print(mtable[i][j] + (j!=0?" ":" | "));
				}
			}
			System.out.println(i==0 ? "\n----|-----------------------------------------------------------":"\n    |");
			
		}


	}

}
