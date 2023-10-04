package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Leaning {
	public static void main(String args[]) {
		List<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		
		System.out.println(arrayList.get(0));
		
		List<String> linkedList = new LinkedList<String>();
		
		linkedList.add("a");
		linkedList.add("b");
		
		for(String item: linkedList) {
			System.out.println(item);			
		}
		
	}
}
