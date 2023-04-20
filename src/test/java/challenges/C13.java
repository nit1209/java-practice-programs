package challenges;

import java.util.HashMap;

import java.util.Scanner;

public class C13 {

	public static void main(String[] args) {
		int a[]= {7,2,12,15};
		int result=9;
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			
			map.put(i, a[i]);
			
		}
		
	Scanner	sc=new Scanner(System.in);
	
	System.out.println("enter the 2 key values : -");
	int key1=sc.nextInt();
	int key2=sc.nextInt();
	int sum=map.get(key1)+map.get(key2);
	System.out.println(sum);
	}

}
