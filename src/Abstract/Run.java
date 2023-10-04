package Abstract;

public class Run {
	public static void main(String[] args) {
		Coordinates coordinate1 = new Coordinates(7, 7);
		Coordinates coordinate2 = new Coordinates(7, 10);
		Coordinates coordinate3 = new Coordinates(9, 9);
		
		Point point = new Point(coordinate1);
		
		Circle circle = new Circle(coordinate2, 10);
		
		Rectangle rectangle = new Rectangle(coordinate3, 10, 5);
		
		
		System.out.println(point.area());
		System.out.println(circle.area());
		System.out.println(rectangle.area());
	}
}
