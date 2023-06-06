package qsp1;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;



class OccurenceOfCharWithMap {
	public static void main(String[] args) {
		String s="Kannada";
		String st=s.toLowerCase();
		method1(st);
		method2(st);
	}
	
	//Method-1
	public static void method1(String st)
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for(int i=0; i<st.length(); i++)	
		{
			int count =0;
			for (int j = 0; j < st.length(); j++) 
			{
				if(st.charAt(i)==st.charAt(j))	
				{
					count++;	
				}
			}
			if(map.containsKey(st.charAt(i))==false)
			{
				map.put(st.charAt(i), count);
			}
		}
		System.out.println(map);
	}

	//Method-2
	public static void method2(String s)
	{
		char [] c=s.toCharArray();
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
					//<we call these as Generic>
		for(int i=0; i<c.length; i++)
		{
			if(map.containsKey(c[i])==false)
			{
				map.put(c[i], 1);
			}
			else
			{
				Integer oldvalue = map.get(c[i]);
				Integer newvalue = oldvalue+1;
				map.put(c[i], newvalue);
			}
		}

		//if want to print it in a map array format ex:- [s=3,c=1,u=1.....]
		System.out.println(map);

		
	/*	if want to print it in only map format (we use entryset this will print in separate line by line key value map)
		ex:-	s=3
			  	u=1
			  	c=2			*/
		Set<Entry<Character, Integer>> eset = map.entrySet();
		for(Entry<Character,Integer> es:eset)
		{
			System.out.println(es);
		}

		//if u want to print only key which are unique 
		Set<Character> ks = map.keySet();
		for(Character kset:ks)
		{
			System.out.println(kset);
		}

		//if we want to print only key line by 
		Collection<Integer> val = map.values();		//here it returns collection
		for(Integer value:val)
		{
			System.out.println(value);
		}
	}

}
