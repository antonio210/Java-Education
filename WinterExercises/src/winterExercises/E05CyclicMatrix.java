package winterExercises;
public class E05CyclicMatrix {
	
	public static void main(String[] args) {
		int size = 5; int xz = size-1; int yz = size-1;
		 
		int xa= 0; int ya= 0;
		
		int num = 1; 
	
		int[][] table = new int[size][size];
	
		for(int i=xz;i>=xa;i-- ) {
			table[i][yz]= num++;
		}

		yz--;
		for(int j = yz;j>=ya;j--) {
			table[xa][j]=num++;
		}
		xa++;
		
		for(int i = xa;i<=xz;i++) {
			table[i][ya]=num++;
		}
		ya++;
		
		for(int i =ya;i<=yz;i++) {
			table[xz][i]=num++;
		}
		xz--;
		
		for(int i=xz;i>=xa;i-- ) {
			table[i][yz]= num++;
		}
		
		yz--;
		for(int j = yz;j>=ya;j--) {
			table[xa][j]=num++;
		}
		xa++;
		
		for(int i = xa;i<=xz;i++) {
			table[i][ya]=num++;
		}
		ya++;
		
		for(int i =ya;i<=yz;i++) {
			table[xz][i]=num++;
		}
		xz--;
	
		for(int i=xz;i>=xa;i-- ) {
			table[i][yz]= num++;
		}
	
		for (int i = 0; i < table.length; i++) { 
	         for (int j = 0; j < table[i].length; j++) {
	            System.out.print(table[i][j] + " ");
	         }
	         System.out.println();
	      }
		
		
	}

}
