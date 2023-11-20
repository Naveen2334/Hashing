package HashMap1;

import java.util.HashSet;
import java.util.Set;

public class SubsetHashset {
	public static void main(String[] args) {
		int arr1[] = {12,23,4,56,89};
		int arr2[] = {12,33};
		Set<Integer> s = new HashSet<>();
		for(int i = 0 ;i<arr1.length;i++) {
			s.add(arr1[i]);
		}
		for(int i = 0;i<arr2.length;i++) {
			if(!s.contains(arr2[i])) {
			System.out.println("arr2 is subset of arr1");
			return;
			}
			
		}
		System.out.println("arr2 is not subset");

	}

}
