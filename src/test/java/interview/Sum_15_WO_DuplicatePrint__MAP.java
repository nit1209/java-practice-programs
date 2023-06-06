package interview;

import java.util.HashMap;

public class Sum_15_WO_DuplicatePrint__MAP {

	public static void main(String[] args) {
		int a[]= {1,3,5,7,8,10,8,9,6,11,14,3,12};
		HashMap map = new HashMap();

for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if(a[i]+a[j]==15)
		{
			if(map.containsKey(a[i])==false && map.containsValue(a[i])==false)
			{
				map.put(a[i], a[j]);
			}
		}
	}
} 
		System.out.println(map);
		
		
	}

}
