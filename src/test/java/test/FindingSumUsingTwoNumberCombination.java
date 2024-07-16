package test;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class FindingSumUsingTwoNumberCombination {
@Test
public void method1() {
	int[] a = {1, 3, 5, 2, 8, 9, 10,11};
	int targetSum = 11;

	HashMap<Integer,Integer> map = new HashMap();
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]+a[j]==targetSum) {
				if(map.containsKey(a[i])==false&& map.containsKey(a[j])==false){
					map.put(a[i], a[j]);
				}
			}
		}
	}
	System.out.println(map);
	for(Entry<Integer,Integer> entry:map.entrySet()) {
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}
