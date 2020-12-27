package winterExercises;


public class E04MatrixSum {
	public static void main(String[] args) {
		
		int x = 4;
		int[][]  firstMatrix = new int[x][x];
		int[][] secondMatrix = new int [x][x];
		int[][] sumMatrix = new int [x][x];
		
		
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				firstMatrix [i][j]= (int)(Math.random()*100);
				secondMatrix [i][j]= (int)(Math.random()*100);
				sumMatrix [i][j]=firstMatrix [i][j]+secondMatrix [i][j];
				System.out.format("%4d",sumMatrix[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
