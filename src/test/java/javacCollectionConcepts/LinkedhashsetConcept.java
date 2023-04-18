package javacCollectionConcepts;

import java.util.ArrayList;

import java.util.LinkedHashSet;

public class LinkedhashsetConcept {
	public static void main(String[] args) {
	
		LinkedHashSet<Object> set =new LinkedHashSet<Object>();
		set.add(10);
		set.add("hi");
		set.add(null);
		set.add('P');	
		set.add(10.678);	
		set.add(null);	
		System.out.println(set);
		ArrayList<Object> list =new ArrayList<Object>();
		list.add(20);
		list.add("bye");
		System.out.println(list);

		System.out.println(set.size());
		System.out.println(list.size());




	}
}
