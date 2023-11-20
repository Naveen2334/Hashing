package HashMap1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(12);
		s.add(13);
		s.add(14);
		System.out.println(s);
		if(s.contains(12)) {
			System.out.println("available");
		}
		else {
			System.out.println("sorry not available");
		}
		if(s.contains(23)) {
			System.out.println("available");
		}
		else {
			System.out.println("not available");
		}
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Ram");
		map.put(2, "love");
		map.put(3, "hero");
		System.out.println(map);
		if(map.containsKey(1)) {
			System.out.println("available");
		}
		else {
			System.out.println("not available");
		}
		System.out.println(s.isEmpty());
		TreeSet<Integer> k = new TreeSet<>();
		k.add(2);
		k.add(4);
		System.out.println(k);
	
	}

}
