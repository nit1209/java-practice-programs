package qsp1;

public class OccurenceOfCharacterInString {

	public static void main(String[] args) {
		//METHOD-1
		String s="niteesh";
		char c='e';
		int count=0;
		for (int i = 0; i < s.length(); i++) {

			if(c==s.charAt(i))
			{
				count++;
			}

		}
		System.out.println("this "+c+" is occured "+count+" in the string\n" );

	

	}

}
