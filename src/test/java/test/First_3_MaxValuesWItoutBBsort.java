package test;

import org.testng.annotations.Test;

public class First_3_MaxValuesWItoutBBsort {
	// {7,-3,0,2,1,-9}		without bbsort product of 1st max 3 values
	@Test
	public void method1() {
		int a[]= {7,-3,0,2,1,-9};
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int tmax=Integer.MIN_VALUE;

		for(int i=0; i<a.length; i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if (a[i]!=fmax&& a[i]>smax) {
				tmax=smax;
				smax=a[i];
			}			
			else if(a[i]!=smax &&a[i]!=fmax&&a[i]>tmax) {
				tmax=a[i];
			}
		}
		System.out.println(fmax+" "+ smax+" "+tmax);

	}
}