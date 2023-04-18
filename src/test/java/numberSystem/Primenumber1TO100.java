package numberSystem;

import java.util.Iterator;

public class Primenumber1TO100 {

	public static void main(String[] args) {
		System.out.println("prime number from 1-100 are :");
		int count=0;
		for (int i = 1; i <=100; i++) {
			count=0;
			for (int j = 1; j <=i; j++) {
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
