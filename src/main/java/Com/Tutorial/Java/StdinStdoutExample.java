package Com.Tutorial.Java;

import java.util.Scanner;

public class StdinStdoutExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String s=scanner.next();
		int num=scanner.nextInt();
		
		scanner.close();
		
		System.out.println(s+"="+num);

	}

}
