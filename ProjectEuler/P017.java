package euler;

public class P017 {

	public static void main(String[] args) {

		String a[]= {"","one", "two","three","four","five","six","seven","eight","nine","ten","eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String b[]={"","", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		int num;
		String temp="",allnumbers="";
		
		for(int i=1;i<1001;i++) {
			num=i;
			if(num<20) {
				temp=a[i];
			}else if(num>=20 & num<100) {
				temp=b[((num-num%10)/10)]+ (num%10==0 ? "":("-"+a[(num%10)]));	
			}else if(num>=100&num<1000){
				temp= a[(num-num%100)/100]+"hundred"+ (num%100==0 ? "":("and"))+ (num%100<20? a[num%100]:(b[((num%100-num%10)/10)]+(num%10!=0&((num%100-num%10)/10)!=0 ? "-":"")+(a[(num%10)])));
			}else {
				temp= "onethousand";
			}
			System.out.println(temp);
			allnumbers+=temp;
			
		}
		System.out.println(allnumbers.length());
		
		
	}
}
