package Date;

import java.util.Objects;

public class MyDate {

//	object contructor
	private int day, month, year;

	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}

	public void getDay() {
		System.out.println(day);
	}

	public void getMonth() {
		System.out.println(month);
	}

	public void getYear() {
		System.out.println(year);
	}
	
//	@Override
	public String test() {
		return day + "/" + month + "/" + year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return day + "/" + month + "/" + year;
	}

}
