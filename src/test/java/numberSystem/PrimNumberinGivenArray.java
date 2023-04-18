package numberSystem;



public class PrimNumberinGivenArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,6,5,9,7};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count=0;
			for (int j = 1; j <=a[i]; j++) {
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(a[i]+" is a prime number");
			}
		}

	}

}
