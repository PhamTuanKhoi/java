package Array;

import java.util.Arrays;


public class MyClass {

	public static void main(String[] args) {
//		primitive : warning object -> array, object, function
		int[] arr = { 1, 2, 3 };

		int[] arr1 = arr;

		arr[0] = 100;

		System.out.println(Arrays.toString(arr));  // [100, 2, 3] was change value
		System.out.println(Arrays.toString(arr1)); // [100, 2, 3] change value
		
		
		int[] arr2 = arr.clone();
		arr2[0] = 50;
		System.out.println(Arrays.toString(arr2)); // [50, 2, 3] not change value
		
		
		int[] arr3 = new int[arr.length];
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		arr3[0] = 20;
		System.out.println(Arrays.toString(arr3));  // [20, 2, 3] not change value
		
		
		String[] code = { "a", "b" };
		
		String[] code1 = code;
		code1[0] = "err";
		System.out.println(Arrays.toString(code));   // [err, b]
		System.out.println(Arrays.toString(code1));  // [err, b]
		
		
//		primitive
		String test = "okay";
		String test1 = test;
		test1 = "let go";
		System.out.println(test);  // okay
		System.out.println(test1); // let go
		
	}

}
