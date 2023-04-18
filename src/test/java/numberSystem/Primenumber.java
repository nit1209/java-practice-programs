package numberSystem;

public class Primenumber {

	public static void main(String[] args) {
		int a=24,i=1,count=0;
		while(i<=a)
		{
			if(a%i==0)
			{
			count++;
			}
			i++;
		}

		if(count==2)
		{
			System.out.println("its prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}

}
