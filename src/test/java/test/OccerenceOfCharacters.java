package test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccerenceOfCharacters {
	// i/p:-" my name is rishav it contains ri and shav"
	
	@Test
	public void method1() {
		String s="my name is rishav it contains ri and shav";
		int count =0;
		LinkedHashSet<Character> set = new LinkedHashSet();
		for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)!=' ')
			set.add(s.charAt(i));
		}
		
		for(Character ch:set) {
			count=0;
			for(int i=0; i<s.length(); i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
	}
	
	@Test
	public void method2() {
		String s="my name is rishav it contains ri and shav";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=' ')
			if(map.containsKey(s.charAt(i))==false)
				map.put(s.charAt(i), 1);
			else
				map.put(s.charAt(i),map.get(s.charAt(i))+1 );
		}
	for(Entry<Character,Integer> entry:map.entrySet()) {
		if(entry.getValue()>1)
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	
	
	
	}
}
