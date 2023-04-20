package challenges;

import java.util.LinkedHashSet;

public class C6 {

	public static void main(String[] args) {
		// awweeexxxxyyyyyy 			count the individual char
		String s="awweeexxxxyyyyyy";
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}

		for (Character character : set) {
			count=0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(character+" occured "+count+" times");
		}


	}

}
