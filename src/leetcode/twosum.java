package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class twosum {
	public static void main(String[] args) {
		int[] array = {3,2,4}; 
		int target = 6;
		sum2(array, target);
	}
	
	public static void sum(int[] array, int target) {
		int left = 0;
		int right = array.length -1; 
		while (left < right) {
		
			if(array[left] + array[right] == target) {
				System.out.println(left + " - " + right);
				return;
			}else if(array[left] + array[right] > target) {
				right--;
			}else { 
				left++;
			}
			
		}
	}
	
	public static void sum1(int[] array, int target) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] + array[j] == target) {
					System.out.println(i + " - " + j);
					return;
				}
			}
		}
	}
	
	public static void sum2(int[] array, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) { 
			Integer subtract = target - array[i]; 
			if(map.containsKey(subtract)) {
				System.out.println(map.get(subtract) + " - " + i);
				return;
			}
			map.put(array[i], i);
		}
	}
	
//	public static void sum3(int[] array, int target) {
//		HashSet<Integer> set = new HashSet();
//		for (int i = 0; i < array.length; i++) { 
//			Integer subtract = target - array[i]; 
//			if(set.contains(subtract)) {
//				System.out.println(map.get(subtract) + " - " + i);
//				return;
//			}
//			set.add(array[i]);
//		}
//	}
	
}
