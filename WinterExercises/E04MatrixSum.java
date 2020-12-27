package winterExercises;


public class E04MatrixSum {
	public static void main(String[] args) {
		
		int x = 4;
		int[][]  firstMatrix = new int[x][x];
		int[][] secondMatrix = new int [x][x];
		int[][] sumMatrix = new int [x][x];
		
		System.out.println("Generated matrix #1:            Generated matrix #2:          Matrix #1 + Matrix #2:\n");
		
		
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				firstMatrix [i][j]= (int)(Math.random()*100);
				secondMatrix [i][j]= (int)(Math.random()*100);
				sumMatrix [i][j]=firstMatrix [i][j]+secondMatrix [i][j];
				System.out.format("%4d",firstMatrix[i][j]);
			}
			for(int j=0;j<x;j++) {
				System.out.format(j==0 ? ("		%4d"):("%4d"),secondMatrix[i][j],secondMatrix[i][j]);
			}
			
			for(int j=0;j<x;j++) {
				System.out.format(j==0 ? ("		%4d"):("%4d"),sumMatrix[i][j],sumMatrix[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
