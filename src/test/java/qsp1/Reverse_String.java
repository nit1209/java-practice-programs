package qsp1;

public class Reverse_String {

	public static void main(String[] args) {
		String s="software";
		String srev="";
	//METHOD-1 --using empty stirng
		for (int i = s.length()-1; i >=0 ; i--) {
			srev=srev+s.charAt(i);		
		}
		System.out.println(srev);
		
		//METHOD-2	--using count variable 
		srev="";
		char[] sc = s.toCharArray();
		
		for (int i = sc.length-1; i >=0; i--) {
			System.out.print(sc[i]);
		}
		
		//METHOD-3	--starting loop with last index
		System.out.println();
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
		
		//METHOD-4 --using String builder
		System.out.println();
		String S1 = new StringBuilder("software").reverse().toString();
		System.out.println(S1); 
	}

}
