package HashMap1;

import java.util.HashMap;
import java.util.Map;

public class Part5 {
	static boolean isSubset(int arr1[] ,int arr2[]) {
		
        if(arr1.length < arr2.length) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr1) {
        	int countOfI = map.getOrDefault(i, 0) + 1;
        	map.put(i, countOfI);
        }
        for(int i : arr2) {
        	if(!map.containsKey(i)) return false;
        	if(map.get(i)==0) return false;
        	int countOfI = map.get(i);
        	map.put(i, countOfI -1);
        }


		return true;
		
	}
	public static void main(String[] args) {
		 int[] arr1 = {6,7,3,2,2};
	        int[] arr2 = {6,7,2,2};
		boolean ans = isSubset(arr1, arr2);
	        
	        if(ans) System.out.println("arr2 is a subset of arr1");
	        else System.out.println("arr2 is not a subset of arr1");
	}

}
