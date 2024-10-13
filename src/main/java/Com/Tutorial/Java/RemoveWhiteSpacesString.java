package Com.Tutorial.Java;


//usecase1: replacing whitespaces with empty string and usecase2: Replacing multi whitespace with single whitespace

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {
		
		String str1 = "Saket Saurav        is a QualityAna    list"; 

		String str2="";

//1 Replace whitespaces using replaceAll method	
		
		
//		String str2=str1.replaceAll("\\s", "");     // find any space \\s and replace with empty string
//		String str3=str1.replaceAll("\\s+", " ");   // find more than one space \\s+ and replace with single space " "
//		
//		System.out.println(str2);
//		System.out.println(str3);
		
		
		
//2 program for replacing multiple whitespaces with single whitespace without using replaceAll
		
		
		boolean islastspace=false;
		for(int i=0 ; i<str1.length();i++) {
		if(str1.charAt(i)==' ' || str1.charAt(i)=='\t'){
			if(!islastspace) {
			str2+=' ';
			islastspace=true;
			}
		}else {
			str2+=str1.charAt(i);
			islastspace=false;
		}
		}
		System.out.println(str2);
		
		
		
//3 Program for replacing all whitespaces with empty string
		
		
//		for(int i=0 ; i<str1.length();i++) {
//			
//		if(str1.charAt(i)!=' ' || str1.charAt(i)!='\t'){
//			str2+=str1.charAt(i);
//		}
//		}
//		System.out.println(str2);
	
		

	}

}
