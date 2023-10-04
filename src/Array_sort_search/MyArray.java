package Array_sort_search;

import java.util.Arrays;

public class MyArray {

	public static int[] decrease(int[] arr) {
		Arrays.sort(arr); 
		
		int[] array = new int[arr.length]; 
		int index = 0;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			array[index] = arr[i]; 
			index++;
		}
		System.out.println(Arrays.toString(array)+ "ii");
		return array;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 2, 5, 4, 7, 6 };
		int[] numbers1 = new int[7];

		System.out.println("zero" + Arrays.toString(numbers));
		// sort: 1
		Arrays.sort(numbers);
		System.out.println("one" + Arrays.toString(numbers));

		System.out.println(Arrays.binarySearch(numbers, 7));

		Arrays.fill(numbers1, 7);
		System.out.println(Arrays.toString(numbers1));

		// sort: -1
		numbers = MyArray.decrease(numbers);
		System.out.println("decrease" + Arrays.toString(numbers));

	}
}
