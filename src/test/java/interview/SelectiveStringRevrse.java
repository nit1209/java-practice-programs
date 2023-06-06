package interview;

public class SelectiveStringRevrse {

	public static void main(String[] args) {
		String s="My name is Sanjay Kumar Das";
		String[] ns=s.split(" ");
		String[] st = new String[3];
		
		 
	       for (int i = ns.length - 1, j = 0; j<3; i--, j++) {
	            st[j] = ns[i];
	        }
	       
			
		for(int i=0; i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}	
		
	/*	for(int i=ns.length-1; i>2;i--)
		{
			System.out.print(ns[i]+" ");
		}	*/
	}

}
