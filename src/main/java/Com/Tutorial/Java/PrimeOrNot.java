package Com.Tutorial.Java;

public class PrimeOrNot {

	public static void main(String[] args) {
/*		
		for(int i=2;i<=100;i++) {
			boolean isprime=true;
			for(int j=2; j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			
			if(isprime) {
				System.out.println(i);
			}
		}
*/
		
		int num=14;
		boolean isprime=true;
		for(int i=2; i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isprime=false;
				System.out.println(num+" is not a prime");
			}			
		}
		
		if(isprime){
			System.out.println(num+" is a prime");
		}
		
		
	}

}
