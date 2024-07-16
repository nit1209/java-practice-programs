package test;

import org.testng.annotations.Test;

public class MaximumSubstringInString {
	@Test
	public void method1() {
		String s="mynameisRaj";
		int count=0;
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i,j));
				count++;
			}
		}
		System.out.println(count);
	}
}
