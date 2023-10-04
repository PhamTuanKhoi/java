package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Lean {
	public	static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "okay1");
		hashMap.put(2, "okay2"); 
		hashMap.put(2, "okay3"); 
		
		System.out.println(hashMap + " map");
	
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("a", "A");
		linkedHashMap.put("b", "B");
		
		System.out.println(linkedHashMap.get("a"));
		
		Map<Double, String> treeMap = new TreeMap<>();
		
		treeMap.put(1.1, "yes");
		treeMap.put(1.2, "no");
		
		System.out.println(treeMap.get(1.1));
	} 
}
