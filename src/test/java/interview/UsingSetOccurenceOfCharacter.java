package interview;

import java.util.LinkedHashSet;

public class UsingSetOccurenceOfCharacter {

	public static void main(String[] args) {
		String s="occurrence for my new";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		//storing the characters in the set
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}
		//checking the occurrence of each character 
		for(Character ch:set )
		{
			int count=0;
			for(int i=0; i<s.length(); i++)
			{
				if(ch==s.charAt(i)&& (ch!=' '))
				{
					count++;
				}
			}
			if(count>2)
			System.out.println(ch+" "+count);
		}
	}

}
