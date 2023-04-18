package numberSystem;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	for(;;)
	{
		System.out.println("enter the number:-");
		Scanner sc = new Scanner(System.in);
		long n=sc.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

	}

}
