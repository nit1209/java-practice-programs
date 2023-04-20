package challenges;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class C14 {

	public static void main(String[] args) {
		// "This is fun show"		"fun tv show"		o/p : "this is tv"
String s="This is fun show";
String[] st=s.split(" ");

String s1="fun tv show";
String [] st1=s1.split(" ");

	

	HashSet<String> set= new LinkedHashSet<String>();
	
	for(int i=0; i<st.length; i++)
	{
		set.add(st[i]);
		
	}
	
	for (int i = 0; i < st1.length; i++) {
		if(set.contains(st1[i]))
		{
			set.remove(st1[i]);
		}
		else
		{
			set.add(st1[i]);
		}
	}
	
	for (String string : set) {
		System.out.print(string+" ");
	}
	System.out.println("");
}
}