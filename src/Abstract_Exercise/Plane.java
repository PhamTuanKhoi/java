package Abstract_Exercise;

public class Plane extends Vehicel {


	private String fuel;
  
	public Plane(String category, Manufacturer manufacturer, String fuel) {
		super(category, manufacturer);
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public String taskoff() {
		return "bye....";
	}

	@Override
	public double speed() { 
		return 1900;
	}

	
}
