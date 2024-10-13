package Com.Tutorial.Java;

import java.util.Scanner;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		int x,y,temp;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your numbers");
		 x=in.nextInt();
		 y=in.nextInt();
		 
		System.out.println("Before Swapping of x and y: "+x+" "+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swapping of x and y: "+x+" "+y);
		

	}

}
