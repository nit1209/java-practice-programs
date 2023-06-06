package qsp1;

public class Rev_String_recursion {

	 
	public static void main(String[] args) {
		String s="testyantra";
		Rev_String_recursion a = new Rev_String_recursion();
		System.out.println(a.rev(s));
	

	}

	public String rev(String s)
	{
		String r="";
		if(s==null|| s.length()<=1)
		{
			return s;
		}
		 r=rev(s.substring(1))+s.charAt(0);
		 return r;
	}
	
}
