package qsp1;

import java.util.ArrayList;
import java.util.List;

public class Get_number_fromString_StoreInListOderWise {

	public static void main(String[] args) {
		String s="This is540 Mobile. Apilcation whicH 33. has same Feat4562ure.";
		int num=0;
		List<Integer> li=new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				num=(num*10)+s.charAt(i)-48;
			}
			else if(Character.isAlphabetic(s.charAt(i)) && num!=0)
//			else if(((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))&& num!=0)
			{
				li.add(num);
				num=0;
			}
		}
		System.out.println(li);
	}

}