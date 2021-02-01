package euler;

public class P020 {

	public static void main(String[] args) {
	
		int num=1,sum=0,x=10;
	for(int i=x;i>0;i--) {
		num*=i;
	}
	System.out.println(num);
	
	while(num>0) {
		sum+=num%10;
		num/=10;
	}
	System.out.println(sum);
	
	
}
}
