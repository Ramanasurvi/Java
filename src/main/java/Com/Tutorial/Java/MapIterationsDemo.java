package Com.Tutorial.Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterationsDemo {

	public static void main(String[] args) {
	
		Map<Integer, String> fruitmap = new HashMap<>();
		
		fruitmap.put(1, "banana");
		fruitmap.put(2, "Apple");
		fruitmap.put(3, "pineapple");
		fruitmap.put(4, "neredupallu");
		
//		usingKeySet(fruitmap);
		usingEntrySet(fruitmap);
//		usingIterator(fruitmap);
//		usingStreams(fruitmap);
//		usingForEach(fruitmap);
	}
		
		
		//Iterate Using keySet() method
	public static void usingKeySet(Map<Integer, String> fruitmap) {
		for(Integer i : fruitmap.keySet()) {
			if(fruitmap.get(i)=="neredupallu")
				continue;                                    //skip if fruit is neredupallu
		System.out.println("Key:"+i+" value:"+fruitmap.get(i));
		}
	}
		
		//Iterate using entrySet() method
	public static void usingEntrySet(Map<Integer, String> fruitmap) {
		for(Entry<Integer, String> entry : fruitmap.entrySet()) {                                   
		System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
		}
	}
		
		//Iterate using iterator
	public static void usingIterator(Map<Integer, String> fruitmap) {
		Iterator<Map.Entry<Integer,String>> iterator = fruitmap.entrySet().iterator();
		while(iterator.hasNext()) {        
			Map.Entry<Integer, String> entry = iterator.next();
		System.out.println("Key:"+entry.getKey()+" value:"+entry.getValue());
		}
	}
		
		//Using Java 8 streams API 
	public static void usingStreams(Map<Integer, String> fruitmap) {
		fruitmap.entrySet().stream().forEach(e->
		System.out.println(e.getKey()+":"+e.getValue()));
	}
		//using forEach
		public static void usingForEach(Map<Integer, String> fruitmap) {
		fruitmap.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
		}
		
		
	

}
