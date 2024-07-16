package challenges;



public class C12 {

	public static void main(String[] args) {
		// "i love programming"		reverse and split 

		String s= "i love programming";
		String revs="";
		for(int i=s.length()-1; i>=0; i--)
		{
			revs=revs+s.charAt(i);
		}
		System.out.println(revs);
	
		String[] st=revs.split("i");
	for (int i = 0; i < st.length; i++) {
		System.out.print(st[i]+" ");
	}
	
	
	}

}
