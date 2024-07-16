package challenges;

import java.util.HashMap;

public class C9 {

	public static void main(String[] args) {



		/*		int a[]= {1,3,5,2,8,9,10};
 		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==11)
				{
					System.out.println("combinations are : "+a[i]+" "+a[j]);
				}
			}

		}	*/



		//METHOD-2 
		int[] a = {1, 3, 5, 2, 8, 9, 10};
		int targetSum = 11;
		//findCombinations(a, targetSum);
		finding(a, targetSum);
	}

	public static void findCombinations(int[] a, int targetSum) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int sum = a[i];
			if (sum == targetSum) 
			{
				System.out.println("Combination found: " + a[i]);
			}
			for (int j = i+1; j < n; j++) 
			{
				sum += a[j];
				if (sum == targetSum)
				{
					System.out.print("Combination found: ");
					for (int k = i; k <= j; k++) 
					{
						System.out.print(a[k] + " ");
					}
					System.out.println();
				}
			}
		}

	}
	
	public static void finding(int []a,int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]+a[j]==sum) {
					if((map.containsKey(a[i])==false&&map.containsValue(a[j])==false)) {
						map.put(a[i], a[j]);
					}
				}
			}
		}
		System.out.println(map);
	}

}
