package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CharacterCount {
	// i/p :- aaabbcdddf		o/p:- a3b2c1d3f1
	@Test
	public void method1() {
		String s="aaabbcdddf";	
		String result="";

		HashSet<Character> set = new HashSet();
		for(int i=0; i<s.length(); i++) {
			set.add(s.charAt(i));
		}

		for(Character ch:set) {
			int count =0;
			for(int i=0; i<s.length(); i++) {
				if(ch==s.charAt(i))
					count++;
			}
			result+=""+ch+count;
		}
		System.out.println(result);
	}


	@Test
	public void method2() {
		String s="aaabbcdddf";	
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();

		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			else
				map.put(s.charAt(i), 1);
		}
		System.out.println(map);

		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey()+""+entry.getValue());
			
		}
	}

}
