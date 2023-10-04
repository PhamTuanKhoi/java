package Compartto;

public class Student implements Comparable<Student> {
	private String fullname;
	private int s_no;

	public Student(String fullname, int s_no) {
		super();
		this.fullname = fullname;
		this.s_no = s_no;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getName() {
		String custom = this.fullname.trim();

		if (custom.indexOf(" ") != -1) {
			int position = custom.lastIndexOf(" ");

			String data = custom.substring(position + 1);
			System.out.println(data);

			return data;
		}
 
		return custom;
	}

	@Override
	public int compareTo(Student o) {
		String name = this.getName();
		String nameO = o.getName();

		return name.compareTo(nameO);
	}

}
