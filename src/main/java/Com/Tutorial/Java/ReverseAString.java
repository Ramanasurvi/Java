package Com.Tutorial.Java;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		//Reversing a String using StringBuilder class and use builtin reverse method of StringBuilder
		
		/*
		String s= "Automation"; // String is a Immutable class
		
		//String Builder is a non-synchronous mutable class
		StringBuilder sb = new StringBuilder(); 
		
		sb.append(s);
		StringBuilder res=sb.reverse();
		
		System.out.println(res);
		*/
		
		//reversing a string without using String inbuilt classes just by iterating string in reverse
		
		/* 
		String s="Saket Saurav";
		
		String s1="";
		
		//iterate from backtofront and append to empty string
		 * 
		for(int i=s.length()-1;i>-1;i--) {
			s1=s1+s.charAt(i);
		}
		
		System.out.println(s1);
		*/
		
		//reversing string using scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();
		
		//splitting string into string array and iterate over each string character and print
		String[] tokens=str.split("");
		
		for(int i=tokens.length-1;i>-1;i--) {
			System.out.print(tokens[i]+"");
		}
		
		System.out.println();
		
		//another way is iterate directly string str and add to empty reverse variable

		System.out.println("Enter your string");
		String original=sc.nextLine();
		String reverse="";
		
		for(int i=original.length()-1;i>-1;i--) {
			reverse=reverse+original.charAt(i);
		}
		
		System.out.println(reverse);
	}
}
