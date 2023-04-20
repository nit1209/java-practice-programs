package patterns;

public class P8 {

	public static void main(String[] args) {
/*		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 
		1 2 3 4 5 	*/
		
		
		int a=1,n=5;
		for(int i=1; i<=n; i++)
		{ 		//a=1;
			for(int j=1; j<=n; j++)
			{
			/*	System.out.print(a+" ");
				a++;	*/
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}

}
