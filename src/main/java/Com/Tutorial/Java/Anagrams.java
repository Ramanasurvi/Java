package Com.Tutorial.Java;

import java.util.Arrays;

//Anagram: If two strings contain same set of characters
public class Anagrams {
    public static void main(String[] args) {
       
    	String s1= "Java";
    	String s2= "aJva";
    	
    	boolean check=anagrams(s1,s2);
    	
    	if(check==true) {
    		System.out.println("Given Strings are anagrams");
    	}
    	else {
    		System.out.println("Given Strings are not anagrams");
    	}
    	
    }
    	
    	
    	public static boolean anagrams(String s1, String s2) {
    	char[] c1= s1.toCharArray();
    	char[] c2= s2.toCharArray();
    	
    	Arrays.sort(c1);
    	Arrays.sort(c2);
    	
    	return Arrays.equals(c1, c2);
    	}
}
