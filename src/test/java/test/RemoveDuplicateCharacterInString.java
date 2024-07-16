package test;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicateCharacterInString {
	@Test
	public void method1() {
		String s = "kannada";
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			if (result.indexOf(s.charAt(i)) == -1) {
				result += s.charAt(i);
			}
		}
		System.out.println(result);
	}

	@Test
	public void method2() {
		String s = "kannada";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
