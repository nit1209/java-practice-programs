package qsp1;

import java.util.LinkedHashSet;

public class OccurenceOfCharacterInStringUsingSet {

	public static void main(String[] args) {
		String s="Kannada";
		String st=s.toLowerCase();
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < st.length(); i++) {
			set.add(st.charAt(i));
		}
		
		for (Character c : set) {
			count=0;
			for (int i = 0; i < st.length(); i++) {
				if(c==st.charAt(i))
						{
					count++;
						}
			}
			System.out.println(c+" "+count );
		}
		
		
	}

}
