package test;

public class Cha1 {

	public static void main(String[] args) {
		String s="sachin is my name";
		String []st=s.split(" ");
		String temp;
		
		
			temp=st[0];
			st[0]=st[st.length-1];
			st[st.length-1]=temp;
		
			for(int i=0; i<st.length; i++)
			{
			System.out.print(st[i]+" ");
			}

	}

	
	
	
	
	
	
	
}
