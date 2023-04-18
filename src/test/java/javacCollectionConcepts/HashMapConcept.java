package javacCollectionConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(20, "hi");    
		map.put(40, "hello");
		map.put(null, "ello");	//allowed
		map.put(null, null);
		map.put(50, null);	//allowed
		map.put(60, null);	//allowed
		map.put(30, "hu");
//		map.put(30, "ji pa");
		map.put(50, "hello");
	System.out.println("\n"+map);	
	System.out.println("\n");
	for (Entry<Integer, String> entry : map.entrySet())
	{
		System.out.println(entry.getKey()+" "+ entry.getValue());
	
	}

	
	System.out.println("\n"+map.containsKey(50));
	map.remove(40);
	map.remove(30,"ji pa");
	System.out.println("\n"+map.get(50));
	System.out.println("\n"+map);

}
}
