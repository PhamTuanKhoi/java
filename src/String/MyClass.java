package String;

public class MyClass {
	public static void main(String[] args) {
//		String name = "nevergiveup";
		
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println("position " + i + " char: " + name.charAt(i));
//		}
		
		String a = "hello";
		String b = "HELLO";
		String c = "hello";
		
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		
		String name1 = "Nguyen Van a";
		String name2 = "Nguyen Van B";
		String name3 = "Nguyen Van A";
		String name4 = "Nguyen Van";
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareTo(name4));
		System.out.println(name1.compareTo(name3));
		
		System.out.println(name1.compareToIgnoreCase(name2));
		System.out.println(name1.compareToIgnoreCase(name4));
		System.out.println(name1.compareToIgnoreCase(name3));
		
		
		String phone1 = "0939 876.jpg";
		String phone2 = "a 0939 123";
		
		System.out.println(phone1.regionMatches(0, phone2, 2, 4));
		System.out.println(phone2.startsWith("a 0"));
		System.out.println(phone1.endsWith("jpg"));
		
		
		String mi = "co co me";
		char key = 'm';
		System.out.println(mi.indexOf("co", 2));
		System.out.println(mi.indexOf(key));
		System.out.println(mi.lastIndexOf("co"));
		
	}
}
