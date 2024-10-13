package Com.Tutorial.Java;

public class Armstrong {

	public static void main(String[] args) {
		int n=1634;
		int c=0, a,temp;
		temp=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a*a);
		}
		if(temp==c) {
			System.out.println("Given number is a Armstrong");
		}
		else {
			System.out.println("Given number is not a Armstrong");
		}
		
		
//		System.out.println(n%10); //3
//		System.out.println(n/10); //15
		
	}

}
