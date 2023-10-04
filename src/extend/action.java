package extend;

public class action {
	public static void main(String[] args) {
		dog mina = new dog();
		mina.getName();
		mina.eat();
		
		cat meo = new cat();
		meo.getName();
		meo.eat();
		meo.test();
		
//		dog dog = new animal("animal"); // cannot convert from animal to dog
//		animal animal = new animal("animal"); 
//		mina = animal // cannot convert from animal to dog
		
		animal dog =  new dog();
		dog.eat(); // -> dog eat
 
	}
}
