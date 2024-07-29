package in.sp.beans;

public class Employee {
	String name;
	String email;
	String phone;
	skill skill;
	
	//Constructor
//	public Employee(String name, String email, String phone, skill skill) {
//		super();
//		this.name = name;
//		this.email = email;
//		this.phone = phone;
//		this.skill = skill;
//	}

	//Getters and Setters
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

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public in.sp.beans.skill getSkill() {
		return skill;
	}

	public void setSkill(in.sp.beans.skill skill) {
		this.skill = skill;
	}
	
	public void interview() {
		System.out.println(name +" has been called for interview on, "+phone + "----" + email);
		System.out.println(skill);
	}
	
	
}
