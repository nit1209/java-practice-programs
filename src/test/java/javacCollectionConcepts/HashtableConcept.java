package javacCollectionConcepts;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashtableConcept {

	public static void main(String[] args) {
		Hashtable<Integer, String> map= new Hashtable<Integer, String>();
		map.put(20, "hi");
		map.put(40, "hello");
//		map.put(null, "ello");
//		map.put(40, null);		//null not allowed
		map.put(30, "hu");
		map.put(30, "ji pa");
		map.put(50, "hello");
	System.out.println("\n"+map);	
	
	for (Entry<Integer, String> entry : map.entrySet()) {
		System.out.println(entry.getKey()+" "+ entry.getValue());
	
		
	}

	System.out.println("\n"+map.contains("hello"));
	System.out.println("\n"+map.containsKey(50));
	map.remove(40);
	map.remove(30,"ji pa");
	System.out.println("\n"+map.get(50));
	System.out.println("\n"+map);
	
	}
	
	
	
	
 }
