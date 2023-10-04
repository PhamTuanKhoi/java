package overloading;

public class MyMath {
	public static void main(String[] args) {
		math sum = new math();
		
		System.out.println(sum.sum(1, 2));
		System.out.println(sum.sum(1.0, 2));
		
		int[] arr = new int[] {1,2,3,4};
		System.out.println(sum.sum(arr));
	}
}
