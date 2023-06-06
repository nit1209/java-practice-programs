package interview;

import java.util.HashMap;
import java.util.Map.Entry;

public class UsingMapOccurenceOfWord {

	public static void main(String[] args) {
		String s= "syed syed naseer basheer pasha pasha";
		String[] st=s.split(" ");
		method1(st);
		method2(st);
		
	}
	
	public static void method1(String [] st)
	{
		HashMap<String , Integer> map= new HashMap<String,Integer>();
		for(String s1:st)
		{
			if(map.containsKey(s1)==false)
			{
				map.put(s1, 1);
			}
			else
			{
				Integer oldvalue = map.get(s1);
				Integer	newvalue= oldvalue+1;
				map.put(s1, newvalue);
			}
			
		}
		System.out.println(map);
	}

	public static void method2(String[] st)
	{
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		for(String s1:st)
		{
			if(map.containsKey(s1))
			{
				map.put(s1, map.get(s1)+1);
			}
			else
			{
				map.put(s1,1);
			}
		}
		System.out.println(map);
		for (Entry<String, Integer> en : map.entrySet()) {
			if(en.getValue()>1)
				System.out.println(en.getKey());
			
		}
				
	}
}
