package challenges;

import java.util.LinkedHashSet;

public class C1 {

	public static void main(String[] args) {
		// i/p :- aaabbcdddf		o/p:- a3b2c1d3f1

		String s="aaabbcdddf";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
	
		for (Character ch : set) {
			count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch.equals(s.charAt(i))) {
					count++;
				}
			}
			System.out.print(ch+""+count);
			
		}
		
	}

}
