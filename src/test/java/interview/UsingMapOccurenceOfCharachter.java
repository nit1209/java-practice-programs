package interview;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


public class UsingMapOccurenceOfCharachter {

	public static void main(String[] args) {
		String str="occurence";
		char[] ch=str.toCharArray();
		int count =0;
		LinkedHashMap <Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for(int i=0; i<ch.length; i++)
		{
			count=0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(map.containsKey(ch[i])==false)
			{
				map.put(ch[i], count);
			}

		}
		System.out.println(map);
		for(Entry<Character,Integer> en:map.entrySet())
		{
			if(en.getValue()>1)
			{
				System.out.println(en.getKey()+" "+en.getValue());
			}
		}

		/*		Set<Entry<Character,Integer>se = map.entrySet();
		for(Entry<Character,Integer> each:se)
		{
			System.out.println(each);
		}

		//only keys printing
		Set<Character>onlykeys=map.keySet();
		for(Character ok:onlykeys)
		{
			System.out.println(ok);
		}

		//only values printing
	Collection<Integer> onlyvalues = map.values();
		for(Integer ov:onlyvalues)
		{
			System.out.println(ov);
		}	*/

	}

}
