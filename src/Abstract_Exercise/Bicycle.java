package Abstract_Exercise;

public class Bicycle extends Vehicel {
 

	public Bicycle(String category, Manufacturer manufacturer) {
		super(category, manufacturer); 
	}

	@Override
	public double speed() { 
		return 30;
	}

}
