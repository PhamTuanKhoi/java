package leetcode;

public class addTwoNumber {
	public static void main(String[] args) {
		int[] array1 = {2,4,3}; 
		int[] array2 = {5,6,4};  
		addTwoNumbers(array1, array2);
	}
	
    public static void addTwoNumbers(int[] l1, int[] l2) {
        String string1 = "";
        String string2 = "";
        for (int i = l1.length -1; i >= 0; i--) { 
			string1 = string1 + l1[i];
		}
        
        for (int i = l2.length -1; i >= 0; i--) { 
			string2 = string2 + l2[i];
		}
        
        int sum = Integer.parseInt(string1) + Integer.parseInt(string2);
        int[] l3 = Integer.toString(sum).chars().map(c -> c-'0').toArray();
        
        int j = 0;
        int[] array = new int[l3.length];
        for (int i = l3.length -1; i >= 0; i--) {    
   			array[j] = l3[i];
   			j++;
   		}
        
        System.out.println(array[1]);
    }
}
