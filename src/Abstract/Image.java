package Abstract;

public abstract class Image {

	protected Coordinates coordinates;

	public Image(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public Coordinates getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	
	public abstract double area();
}
