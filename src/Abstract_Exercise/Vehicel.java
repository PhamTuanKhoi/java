package Abstract_Exercise;

public abstract class Vehicel {
	protected String category;
	protected Manufacturer manufacturer;

 

	public Vehicel(String category, Manufacturer manufacturer) {
		super();
		this.category = category;
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getMunufacturer() {
		return this.manufacturer.getName(); 
	}
	
	public abstract double speed();
	
}
