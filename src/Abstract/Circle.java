package Abstract;
 
public class Circle extends Image {
	protected double r;

	public Circle(Coordinates coordinates, int r) {
		super(coordinates);
		this.r = r;
	}

	@Override
	public double area() { 
		return Math.PI*this.r*this.r;
	}
 

}
