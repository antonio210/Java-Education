package euler;

public class P002 {
public static void main(String[] args) {
	

	int a=1,b=2,c=0,sum=2;
	
	
		for(int i = 2;;i++) {
			c=a+b;
			a=b;
			b=c;
			sum+= c%2==0 ? c:0;
			if(c>4000000) {
				break;
			}
	
	
	}
	System.out.println(sum);
	
	
}
}
