package HashMap1;

import java.util.HashMap;
import java.util.Map;


public class Main1 {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("shivam", "run");
		hm.put("radhika", "cook");
		hm.put("tigershroef", "dance");
		hm.put("Naveen", "travel");
		//System.out.println("hashmap value::::"+hm);
		//hm.clear();
		System.out.println("hashmap value::::"+hm +	hm.keySet()+hm.size()+hm.getOrDefault(hm, "12323"));
	System.out.println(hm.values());
	System.out.println(hm.clone());
	System.out.println(hm.toString());
	System.out.println(hm.hashCode());
	System.out.println(hm.isEmpty());
	System.out.println(hm.containsValue("cook"));
	System.out.println(hm.entrySet());
	System.out.println(hm.keySet());
	System.out.println(hm.get("shivam"));
	System.out.println(hm.putIfAbsent("alka", "abc"));
	HashMap<String,String> kpt = new HashMap<>();
	System.out.println(kpt.clone());
    kpt.putAll(hm);
    System.out.println(kpt);
    
    
		

		
	}
	
    


}
