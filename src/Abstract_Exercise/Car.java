package Abstract_Exercise;

public class Car extends Vehicel {
	private String fuel;
 
	public Car(String category, Manufacturer manufacturer, String fuel) {
		super(category, manufacturer);
		this.fuel = fuel;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	@Override
	public double speed() { 
		return 110;
	}
}
