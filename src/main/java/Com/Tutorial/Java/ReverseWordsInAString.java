package Com.Tutorial.Java;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		
		String s1 = "Welcome To Java World";
		
		//split string into words using split(" ") method
		String[] s2=s1.split(" ");
		
		// Create a New array to store reversed words
		String[] s3 = new String[s2.length];
		
		//Iterate s2 to add reverse words to s3
		for(int i=0; i<s2.length; i++) {
		
		s3[i]=s2[s2.length-i-1];	
			
		}
		
		//Iterate s3 to print reverse words
		for(String c: s3) {
			System.out.println(c);
		}

	}

}
