package Interface;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		Casio casio = new Casio();

		System.out.println(casio.sum(4, 2));
		System.out.println(casio.subtract(4, 2));
		System.out.println(casio.multiply(4, 2));
		System.out.println(casio.division(4, 2));

		int[] arr = { 7, 2, 4, 3, 6, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		BinarySearch search = new BinarySearch();
		System.out.println(search.Search(arr, 7)+ " search");
		
		
		Software software = new Software();
		System.out.println(software.sum(1, 2) + " sof");
		System.out.println(software.Search(arr, 3) + " sof");
	}
}
