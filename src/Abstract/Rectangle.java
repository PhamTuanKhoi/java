package Abstract;

public class Rectangle extends Image{
    protected double length, width;

	public Rectangle(Coordinates coordinates, double length, double width) {
		super(coordinates);
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() { 
		return this.length*this.width;
	}
}
