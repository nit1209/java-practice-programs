package test;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountCharAndAppendWithColan {
	// i/p Malayalam o/p m2:a4:l2:y1

	@Test
	public void method1() {
		String s = "Malayalam";
		int count = 0;

		LinkedHashSet<Character> set = new LinkedHashSet();
		int setlength = 0;

		// adds unique chars to set
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character ch : set) {
			count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i))
					count++;
			}

			// using this to avoid extra colon in the end
			setlength++;
			if (setlength != set.size()) {
				System.out.print(ch + "" + count + ":");
			} else {
				System.out.print(ch + "" + count);
				System.out.println();
			}

		}

	}
}
