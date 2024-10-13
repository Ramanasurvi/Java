package Com.Tutorial.Java;

import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;
import java.util.Random;

public class GenerateRandomNumbers {

	public static void main(String[] args) {
		
		// using Math.random() in java.lang.Math
//		System.out.println(Math.random()*100);           
		
		//using ThreadLocalRandom in java.util.concurrent
		/*
		 * System.out.println(ThreadLocalRandom.current().nextInt());
		 * System.out.println(ThreadLocalRandom.current().nextDouble());
		 * System.out.println(ThreadLocalRandom.current().nextBoolean());
		 */
		
		
		//using java.util.Random
		Random random = new Random();
		System.out.println(random.nextInt(100000));
		

	}

}
