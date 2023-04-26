package test;

public class Cha2 {

	public static void main(String[] args) {
	String s="vowel";
	char[] ch= {'a','e','i','o','u'};
	int count =0;
	
	for (int i = 0; i < s.length(); i++) {
	for (int j = 0; j < ch.length; j++) {
		if(ch[j]==s.charAt(i))
		{
			count++;
		}
	}
	}
	System.out.println(count);
	
	
	
	}

}
