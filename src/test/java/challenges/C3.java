package challenges;

import java.util.ArrayList;

import org.apache.poi.hpsf.Array;
import org.testng.annotations.Test;

public class C3 {

	public static void main(String[] args) {
		//	i/p :- i am selenium 		o/p:- m ui nelesmai

			String s="i am selenium";
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
			{
				if(s.charAt(i)!=' ')
				{
					rev=rev+s.charAt(i);
				}
			}
			System.out.println(rev);
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					rev=rev.substring(0,i)+" "+rev.substring(i, rev.length());
				}
			}
			System.out.println(rev);
		}

	@Test
	public void method2() { 
		String s = "i am selenium";
    String[] words = s.split(" ");
    StringBuilder reversed = new StringBuilder();

    for (String word : words) {
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        reversed.append(reversedWord).append(" ");
    }

    System.out.println(reversed.toString().trim());}
	}


