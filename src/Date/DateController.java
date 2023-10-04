package Date;

public class DateController {
	public static void main(String[] args) { 
		MyDate date = new MyDate(1,3,2023);
		MyDate date1 = new MyDate(11,3,2023);
		MyDate date2 = new MyDate(1,3,2023);
		
		System.out.println(date.equals(date2)); 
		System.out.println(date.equals(date1)); 
		System.out.println(date.hashCode()); 
		System.out.println(date == date2); 
	} 
}
