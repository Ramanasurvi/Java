package Com.Tutorial.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateArrayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("20");
		list.add("30");
		list.add("40");
	
		System.out.println("advanced for loop");
		for(Object o:list) {
			System.out.println(o);
		}
		
		System.out.println("\nfor loop");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\nusing while loop");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
