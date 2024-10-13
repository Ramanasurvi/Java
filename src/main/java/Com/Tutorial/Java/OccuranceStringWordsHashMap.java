package Com.Tutorial.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceStringWordsHashMap {

	public static void main(String[] args) {

		String s1 ="This this is is done by Saket Saket";
		
		String[] s2 =s1.toLowerCase().split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String s: s2) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(Entry<String,Integer> entry: map.entrySet()) {
			
			if(entry.getValue()>0)
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		

	}

}
