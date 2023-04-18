package javacCollectionConcepts;

import java.util.TreeSet;

public class TreesetConcept {
	public static void main(String[] args) {
		
		TreeSet<Object> set =new TreeSet<Object>();
		set.add(10);
		set.add(221);
		set.add(34);
		set.add(56);	
		//set.add(10.678);	//not allowed gives class cast exception 
		//set.add(null);	//not allowed gives nullpointer exception
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.descendingSet()); 	//sort in descending order

	}
}
