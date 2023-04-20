package patterns;

public class P14 {

	public static void main(String[] args) {
/*		A B C D E 
		F G H I J 
		K L M N O 
		P Q R S T 
		U V W X Y 	*/
		
		
		int n=5; char ch='A';
	for(int i=1; i<=n; i++)
	{
		for(int j=1; j<=n; j++)
		{
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println("");
	}

	}

}
