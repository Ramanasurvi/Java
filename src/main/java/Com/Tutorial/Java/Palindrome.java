package Com.Tutorial.Java;

public class Palindrome {

	public static void main(String[] args) {
		
		String s1="radr";
		String s2="";
		
		for(int i=s1.length()-1;i>-1;i--) {
			s2=s2+s1.charAt(i);
		}
		
		if(s2.equalsIgnoreCase(s1)) {
		System.out.println("Given string is a Palindrome");
		}
		else {
			System.out.println("Given string is not a palindrome");
		}

	}

}
