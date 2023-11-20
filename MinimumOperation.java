package HashMap1;

import java.util.*;

public class MinimumOperation {

	public static int minOperation(int arr[], int n) {

		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++)
			if (hash.containsKey(arr[i]))
				hash.put(arr[i], hash.get(arr[i]) + 1);
			else
				hash.put(arr[i], 1);

		
		int count = 0;
		Set<Integer> s = hash.keySet();

		for (int i : s)
			if (count < hash.get(i))
				count = hash.get(i);

		return (n - count);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 1, 3, 2, 1 };
		int n = arr.length;
		System.out.print(minOperation(arr, n));

	}
}
