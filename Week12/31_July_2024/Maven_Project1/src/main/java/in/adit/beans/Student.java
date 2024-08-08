package in.adit.beans;

public class Student {

	private String name;
	private int age;
	private String course;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void display() {
		System.out.println("\nName = " + name);
		System.out.println("Age = " + age);
		System.out.println("Course = " + course);
		System.out.println("Address = " + address);
	}

}