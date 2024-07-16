 package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class Extract_3_To_4_digits_FromString {
	
	
	@Test
	public void method1() {
		String s="Yesterday, I bought 456 apples and 89 oranges "
				+ "from the market. The total cost was $1234. "
				+ "I walked 2345 steps while carrying the groceries. "
				+ "My phone battery is at 78%.";

		Pattern pattern = Pattern.compile("\\b\\d{3,4}\\b");
		Matcher matcher = pattern.matcher(s);
		String digits="";

		while(matcher.find()) {
			digits=matcher.group();
			System.out.println(digits);
		}
/**
 * \\d{3,4}: Searches 3 to 4 digits in the string.
 **/
	}
	
	
	@Test
	public void method2() {
		
		    String s = "Yesterday, I bought 456 apples and 89 oranges "
		             + "from the market. The total cost was $1234.50. "
		             + "I walked 2345 steps while carrying the groceries. "
		             + "My phone battery is at 78%.";

		    Pattern pattern = Pattern.compile("\\b\\d{3,4}(\\.\\d{1,2})?\\b");
		    Matcher matcher = pattern.matcher(s);
		    String digits = "";

		    while (matcher.find()) {
		        digits = matcher.group();
		        System.out.println(digits);
		    }
		}
	
}
