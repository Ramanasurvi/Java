package Com.Tutorial.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraystoArrayList {

	public static void main(String[] args) {
	
		String[] colors= {"Red","Green", "Yellow"};
		
		/*
		//using Arrays.asList()
		List<String> list=Arrays.asList(colors);
		System.out.println(list);
		
		//using Collections.addAll
		List l = new ArrayList();
		Collections.addAll(l, colors);
		System.out.println(l);
		*/
		
		//using iterating array and add method
		List l = new ArrayList();
		for(String s: colors){
			l.add(s);
		}
		System.out.println(l);
		
		
	}
}
