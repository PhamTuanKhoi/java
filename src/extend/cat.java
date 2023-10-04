package extend;

public class cat extends animal {

	public cat() {
		super("cat"); 
	}

	@Override
	public void eat() { 
		System.out.println("toi an ca");
	}
	
	public void test() {
		System.out.println("toi an ca hoi tuoi song");
	}

}
