package Compartto;

public class MyClass {
	public static void main(String[] args) {
		Student student = new Student("nguyen van Thanh", 0);
		Student student1 = new Student("Admam", 1);
		Student student2 = new Student("nguyen van Y", 2);
		
		System.out.println(student.compareTo(student2));
		System.out.println(student.compareTo(student1));
	}
}
