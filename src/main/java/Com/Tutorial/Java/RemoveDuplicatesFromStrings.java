package Com.Tutorial.Java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

// Ex: Input: Sandeep Ouput: Sandep
public class RemoveDuplicatesFromStrings {

	public static void main(String[] args) {
	
		String inName= "sandeep";
		String outName="";
		
		Set<Character> s = new LinkedHashSet();
		
		char[] c1 = inName.toCharArray();
		
		for(char c: c1) {
			s.add(c);
		}
		
		for(Character c: s) {
			outName=outName+c;
		}
		
		System.out.println(outName);
	}

}
