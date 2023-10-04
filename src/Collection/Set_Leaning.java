package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Leaning {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("b");
		hashSet.add("m");
		hashSet.add("a");
		
		System.out.println(hashSet);
	    
		// not order
		Set<Integer> hashsetInteger = new HashSet<>();
	    hashsetInteger.add(41);
	    hashsetInteger.add(1);
	    hashsetInteger.add(0);
	    hashsetInteger.add(8);
	    hashsetInteger.add(1);
	    hashsetInteger.add(2);
	    hashsetInteger.add(10);
		
		System.out.println(hashsetInteger);	
		
		// order
		Set<Integer> treesetInteger = new TreeSet<>();
		treesetInteger.add(41);
		treesetInteger.add(1);
		treesetInteger.add(0);
		treesetInteger.add(8);
		treesetInteger.add(1);
	    treesetInteger.add(2);
		treesetInteger.add(10);
	    
		System.out.println(treesetInteger);
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(3);
		
		Set<Integer> treeSet = new TreeSet<>(list);
		
		System.out.println(treeSet);
	}
}
