package in.sp.beans;

public class StudentClass {
	String name;
	String email;
	String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	public void show() {
		System.out.println(name + "----" + email +"----" + age);
	}
	
}
