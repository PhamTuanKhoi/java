package Array_sort_search;

import java.util.Arrays;

public class MyArray_compartto {
	public static void main(String[] args) {
		Student student = new Student("nguyen van A", 0);
		Student student1 = new Student("nguyen van B", 1);
		Student student3 = new Student("nguyen van D", 3);
		Student student2 = new Student("nguyen van C", 2);

		Student[] array = new Student[] { student, student3, student1, student2 };

//		System.out.println(Arrays.toString(array)); 
//	    TODO	compartTo in Student was sort by name
		System.out.println(Arrays.binarySearch(array, student2));
	}
}
