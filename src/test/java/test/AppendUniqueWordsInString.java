package test;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class AppendUniqueWordsInString {
	// "This is fun show"		"fun tv show"		o/p : "this is tv"
	@Test
	public void method1() {
		String s="This is fun show";
		String[] s_Split=s.split(" ");

		String s1="fun tv show";
		String[] s1_Split=s1.split(" ");


		LinkedHashSet<String> set = new LinkedHashSet();
		for(String str:s_Split) {
			set.add(str);
		}
		for(String str:s1_Split) {
			if(set.contains(str)) 
				set.remove(str);
			else
				set.add(str);
		}
		System.out.println(set);

	}
}
