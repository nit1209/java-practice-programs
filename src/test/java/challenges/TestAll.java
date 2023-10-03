package challenges;

import java.util.*;

import org.testng.annotations.Test;

public class TestAll {

	@Test
	public void countOfCharacter()
	{
		// i/p :- aaabbcdddf		o/p:- a3b2c1d3f1
		String ch="aaabbcdddf";
		String s1="";
		char[] c=ch.toCharArray();
		int count =0;

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();		
		for(int i=0; i<c.length; i++)
		{
			hs.add(c[i]);
		}

		for (Character cha : hs) {
			count=0;
			for(int i=0; i<c.length;i++)
			{
				if(cha.equals(c[i]))
				{
					count++;
				}
			}
			s1=s1+(cha+""+count);

		}
		System.out.println(s1);
	}
	
	@Test
	public void FirstThreeMaxNumbers()
	{
		// {7,-3,0,2,1,-9,4}		without bbsort product of 1st max 3 values
		int[] arr= {7,-3,0,2,1,-9,4};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>fmax)
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if (arr[i] > smax && arr[i] != fmax)
			{
				tmax=smax;
				smax=arr[i];
			}
			else if (arr[i] > tmax && arr[i] != smax && arr[i] != fmax)
			{
				tmax=arr[i];
			}
		}
		
		System.out.println(fmax+" "+smax+" "+tmax);
	}
	
	@Test
	public void OccurenceOfCharacter_1()
	{
		String s= " my name is rishav it contains ri and shav";
		
		LinkedHashSet<Character> Set = new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{ 
			if(s.charAt(i)!=' ')
			{
				Set.add(s.charAt(i));
			}
		}
	int count =0;
	for(Character cha:Set)
	{
		count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(cha==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(cha+" "+count);
	}
	
	}
	
	@Test
	public void CharCountAppendColan()
	{
//	 	i/p Malayalam		o/p m2:a3:l2:y1
		
		String s="Malayalam";
		String s1=s.toLowerCase();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		int count=0;
		for(int i=0; i<s1.length(); i++)
		{
			set.add(s1.charAt(i));
		}
		
		for(Character cha:set)
		{
			count =0;
			for(int i=0; i<s1.length(); i++)
			{
				if(cha==s1.charAt(i))
				{
					count++;
				}
			}
			 System.out.print(cha + "" + count);
			 if (cha != set.toArray()[set.size() - 1]) {
			        System.out.print(":");
		}
	}
		 System.out.println();
}
	
	@Test
	public void UniqueWordsInTwoStrings()
	{
		// "This is fun show"		"fun tv show"		o/p : "this is tv"
		String s="This is fun show";
		String s1="fun tv show";

		String[] sr=s.split(" ");
		String [] sr1=s1.split(" ");

		LinkedHashSet set = new LinkedHashSet();
		for (int i=0; i<sr.length; i++)
		{
			set.add(sr[i]);
		}
		
		for(int i=0; i<sr1.length; i++)
		{
			if(set.contains(sr1[i]))
			{
				set.remove(sr1[i]);
			}
			else
			{
				set.add(sr1[i]);
			}
		}
		System.out.println(set);
	}
	

}
