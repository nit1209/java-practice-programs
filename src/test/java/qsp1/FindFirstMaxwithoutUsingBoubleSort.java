package qsp1;

public class FindFirstMaxwithoutUsingBoubleSort {

	public static void main(String[] args) {
	int a[]= {5,6,3,1,0};
	int fmax=Integer.MIN_VALUE;
	for (int i = 0; i < a.length; i++) {
		if(fmax<a[i])
		{
			fmax=a[i];
		}
	}

	System.out.println(fmax);
	}

}
