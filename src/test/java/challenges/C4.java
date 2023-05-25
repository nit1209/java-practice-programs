package challenges;

import java.util.LinkedHashSet;

public class C4 {

	public static void main(String[] args) {
	String s= "my name is rishav it contains ri and shav";
	int count=0;
	LinkedHashSet<Character> set =new LinkedHashSet<Character>();
	
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)!=' ')
		{
		set.add(s.charAt(i));
		}
	}

	for (Character c : set) {
		count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
			
		}
		System.out.println(c+" "+count) ;
	}
	
	
	}

}
