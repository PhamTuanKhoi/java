package Abstract_Exercise;

public class Run {
	public static void main(String[] args) {
		Manufacturer manufacturer1 = new Manufacturer("mercedes", "USA");
		Manufacturer manufacturer2 = new Manufacturer("Pland ->", "Japan");
		Manufacturer manufacturer3 = new Manufacturer("marteen", "Viet Nam");

		Vehicel mercedes = new Car("mer", manufacturer1, "gasoline");
//	TODO	get full object plane
		Plane plane = new Plane("pl", manufacturer2, "gasoline-pland");
		Vehicel bicycle = new Bicycle("teen", manufacturer3);

		System.out.println(plane.getMunufacturer());
		System.out.println(plane.speed());
		System.out.println(plane.taskoff());

		System.out.println(mercedes.getMunufacturer());
		System.out.println(mercedes.speed());

		System.out.println(bicycle.getMunufacturer());
		System.out.println(bicycle.speed());
	}
}
