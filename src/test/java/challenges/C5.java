package challenges;

public class C5 {

	public static void main(String[] args) {
		System.out.println("1 to 100 prime numbers are :- ");
		int count=0;
		
		for(int i=1; i<=100; i++)
		{count =0;
		for(int j=1; j<=i; j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.print(i+" ");
			}
		}
		

	}

}
