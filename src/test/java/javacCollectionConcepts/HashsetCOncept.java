package javacCollectionConcepts;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetCOncept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> set =new HashSet<Object>();
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
