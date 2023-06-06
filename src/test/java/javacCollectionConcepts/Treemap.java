package javacCollectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map= new TreeMap<Integer, String>();
//		map.put(20, "hi");    
//		map.put(40, "hello");
//
//		map.put(null, "ello");	//not allowed
//		//map.put(null, null);	//not allowed
//		map.put(50, null);	//allowed
//		map.put(60, null);	//allowed
		map.put(30, "hu");
		map.put(30, "ji pa");
//		map.put(50, "hello");
	System.out.println(map);	
	
//	for (Entry<Integer, String> entry : map.entrySet())
//	{
//		System.out.println(entry.getKey()+" "+ entry.getValue());
//	
//	}

	
//	System.out.println("\n"+map.containsKey(50));
//	map.remove(40);
//	map.remove(30,"ji pa");
//	System.out.println("\n"+map.get(50));
//	System.out.println("\n"+map);
}
}