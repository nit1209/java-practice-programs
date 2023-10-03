package challenges;

import java.util.LinkedHashSet;

public class C7 {

	public static void main(String[] args) {
		// 	i/p Malayalam		o/p m2:a3:l2:y1

		String st="Malayalam";
		String s=st.toLowerCase();
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0; i<s.length(); i++)
		{
			set.add(s.charAt(i));
		}

		for (Character character : set) {
			count=0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i))
				{
					count++;
				}
			}
			 System.out.print(character + "" + count);
			 if (character != set.toArray()[set.size() - 1]) {
			        System.out.print(":");
		}
	}
}


}