package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class ExtractDateInAString {
	@Test
	public void method1() {
		String str = "my birthday is on 12-09-2020 nyc day";
		System.out.println(str.replaceAll("[a-z A-Z ]", ""));
	}

	// headache methods don't use this and its incomplete
	@Test
	public void method2() {
		String str = "my birthday is on 12-09-2020 nyc day";
		String date = "";

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				if (str.charAt(i) != ' ') {
					date += str.charAt(i);
				}
			}
		}
		System.out.println(date);
	}

	@Test
	public void method3() {
		String str = "my birthday is on 12-09-2020 nyc day";
		Pattern pattern = Pattern.compile("\\b\\d{2}-\\d{2}-\\d{4}\\b");
		Matcher matcher = pattern.matcher(str);
		String date = "";
		if (matcher.find()) {
			date = matcher.group();
			System.out.println(date);
		} else {
			System.out.println("no date found in string");
		}
		/**
		 * \\b Word boundary to ensure the number is a separate word.
		 * \\d{2} used to match 2 digits 
		 * 	- used for matching same date pattern if u had / then use / while compile
		 * \\d{4} ends with 4 digits  
		 */
	}
	
	//*********************IMP****************************************//
	//USE THIS METHOD IF THE MONTH IN THE DATE IN THE FORM OF STRING 	@Test
	@Test
	public void method4() {
		String str = "my birthday is on 12-Nov-2020 nyc day";
		Pattern pattern = Pattern.compile("\\b\\d{2}-[a-zA-Z]{3}-\\d{4}\\b");
		Matcher match = pattern.matcher(str);
	String date;
		if(match.find()) {
			date=match.group();
			System.out.println(date);
		}
		else {
			System.out.println("No date formats found in string");
		}
	}
	/**
	 * \\[a-zA-Z]{3} was used if we had string characters with 3 letters of 
	 * 	either Upper or Lower case.
	 */
}
