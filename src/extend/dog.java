package extend;

public class dog extends animal {

	public dog() {
		super("dog"); 
	}

	@Override
	public void eat() {
		System.out.println("toi an xuong");
	}

}
