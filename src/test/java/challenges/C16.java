package challenges;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class C16 {

	public static void main(String[] args) {
		int a[]= {5,1,2,3,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("my string is:- 5 1 2 3 4");
		System.out.println("enter the key 1: to switch the 1st and last value");
		System.out.println("enter the key 2: to switch the 2nd and 2nd last value");
		System.out.println("enter the key 3: to switch the 3rd and 3rd last value");
		System.out.println("Enter the Key here :- ");
		int key = sc.nextInt();
		int temp=0,temp1=0;
		switch (key) {
		case 1:	
		
				temp=a[0];
				a[0]=a[a.length-1];
				a[a.length-1]=temp;
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i]+" ");
				}
				
				break;
				
		case 2:	
				temp=a[1];
				a[1]=a[a.length-2];
				a[a.length-2]=temp;
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i]+" ");
				}
				break;
		
		case 3:	
				temp=a[2];
				a[2]=a[a.length-3];
				a[a.length-3]=temp;
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i]+" ");
				}
				break;
		
		default: System.out.println("enter the correct key value");
			break;
		}
		
	}

}
