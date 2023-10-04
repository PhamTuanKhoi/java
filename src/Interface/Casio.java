package Interface;

public class Casio implements Calculator{

	@Override
	public double sum(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}
