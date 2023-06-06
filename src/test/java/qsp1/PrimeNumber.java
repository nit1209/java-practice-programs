package qsp1;


public class PrimeNumber {

	public static void main(String[] args) {
		int a[]= {3,5,7,6,8,9,11};

		//use to pass the number from array and its constant for inner loop
		for(int i=0; i<a.length; i++)
		{	
			//resetting the count 
			int count=0;

			//prime number should not be 1
			if(a[i]>1)
			{
				//check the prime number logic
				for(int j=1; j<=a[i]; j++)
				{
					if(a[i]%j==0)
					//  8%1==0 t
					//	8%2==0 t
					//	8%3==1 f
					
					{
						count++;	//2
					}
				}
				if(count==2) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
