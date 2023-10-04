package overloading;

import java.util.Iterator;

public class math {
	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}
	
	public double sum(int[] a) {
		double sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum+=i;
		}
		return sum;
	}
}
