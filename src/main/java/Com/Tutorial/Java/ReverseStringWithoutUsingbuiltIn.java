package Com.Tutorial.Java;



public class ReverseStringWithoutUsingbuiltIn {

	public static void main(String[] args) {
		
		
		String s="Saket Saurav";
		String s1="";
		
		//iterate from backtofront and append to empty string
		for(int i=s.length()-1;i>-1;i--) {
			s1=s1+s.charAt(i);
		}

			System.out.println(s1);
	}

}
