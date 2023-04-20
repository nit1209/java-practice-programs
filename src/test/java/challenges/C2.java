package challenges;

public class C2 {

	public static void main(String[] args) {
		// {7,-3,0,2,1,-9}		without bbsort product of 1st max 3 values
	int a[]={12,-3,0,2,7,1,-9,10};
	int fmax=Integer.MIN_VALUE;
	int smax=Integer.MIN_VALUE;
	int tmax=Integer.MIN_VALUE;
	
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]>fmax)
		{
			smax=fmax;
			fmax=a[i];
		}
		else if(a[i]>smax&& a[i]!=fmax)
		{
			tmax=smax;
			smax=a[i];
		}
		else if(a[i]>tmax&& a[i]!=smax &&a[i]!=fmax)
		{
			tmax=a[i];
		}
	}
	System.out.println(fmax+" "+smax+" "+tmax);
	System.out.println("product:- "+fmax*smax*tmax);
	
	
	
	
	}

}
