package patterns;

public class P15 {

	public static void main(String[] args) {
/*		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 
		A B C D E 	*/
		
		int n=5; char ch='A';
		for(int i=1; i<=n; i++)
		{ch='A';
			for(int j=1; j<=n; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println("");
		}

	}

}
