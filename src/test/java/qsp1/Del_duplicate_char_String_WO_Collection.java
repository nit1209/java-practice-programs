package qsp1;

import java.util.ArrayList;

public class Del_duplicate_char_String_WO_Collection {

	public static void main(String[] args) {
		String s="success";
		char[] c=s.toCharArray();
		method1(c);
		method2(s);
	}
	//Method-1
	public static void method1(char[] c)
	{	String ns="";
	for (int i = 0; i < c.length; i++) 
	{
		int count=0;
		for (int j = i+1; j < c.length; j++) 
		{
			if(c[i]==c[j])
			{
				count++;
			}
		}
		if(!(count>=1))
			ns+=c[i];
	}
	System.out.println("Method-1 Ans:- "+ns);
	}

	//Method-2
	public static void method2(String s)
	{
		String s2="";
		for(int i=0; i<s.length(); i++)
		{
			if(s2.indexOf(s.charAt(i))==-1)
			{
				s2=s2+s.charAt(i);
			}
		}
		System.out.println("Method-2 Ans:- "+s2);
	}
}

