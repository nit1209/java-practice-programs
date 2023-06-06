package interview;

import java.util.HashMap;

public class Dummy {

	public static void main(String[] args) {

/*		String s="my name is prakash";
		String word="",sen="";
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i)!=' ')
		{
			word=word+s.charAt(i);
		}
		else
		{
			sen=word+" "+sen;
			word="";
		}
	}
	System.out.println(word+" "+sen); 
	}	*/
		String s= "syed syed naseer";
		String[] st=s.split(" ");
		
		HashMap<String , Integer> map= new HashMap<String,Integer>();
		for(String s1:st)
		{
			if(map.containsKey(s1))
			{
				map.put(s1, map.get(s1)+1);
				
			}
			else
			{
				map.put(s1, 1);
			}
			
		}
		System.out.println(map);
}
}